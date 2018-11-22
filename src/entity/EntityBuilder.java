package entity;

import parser.SchedulingGrammarParser;
import parser.SchedulingGrammarParser.*;

import java.util.ArrayList;
import java.util.List;

public class EntityBuilder {
    private static final String KELAS_OJBECT = "KELAS";
    private static final String[] HARI = {
            "SENIN",
            "SELASA",
            "RABU",
            "KAMIS",
            "JUMAT"
    };

    public static Object build(SchedulingGrammarParser.EntitasContext entitas) {
        SchedulingGrammarParser.ObjekContext objek = entitas.objek();
        if (objek.getText().equals(KELAS_OJBECT)) {
            return buildKelas(entitas);
        }
        return buildRuang(entitas);
    }

    private static Kelas buildKelas(SchedulingGrammarParser.EntitasContext entitas) {
        KodeContext kode = entitas.kode();
        AtributContext atribut = entitas.atribut();
        KapasitasContext kapasitas = atribut.kapasitas(0);
        Meta_kebutuhanContext metaKebutuhan = atribut.meta_kebutuhan(0);
        List<KebutuhanContext> kebutuhan = metaKebutuhan.kebutuhan();
        PreferensiContext preferensi = atribut.preferensi(0);
        HariContext hari = preferensi.hari();
        JamContext jam = preferensi.jam();

        List<String> kebutuhanList = new ArrayList<>();
        for (KebutuhanContext context : kebutuhan) {
            kebutuhanList.add(context.getText());
        }

        int kapasitasInt = Integer.parseInt(kapasitas.getText());
        int hariInt = indexHariOf(hari.getText());
        int jamInt = Integer.parseInt(jam.getText());

        return new Kelas(kode.getText(), kebutuhanList, kapasitasInt, hariInt, jamInt);
    }

    private static Ruang buildRuang(SchedulingGrammarParser.EntitasContext entitas) {
        KodeContext kode = entitas.kode();
        AtributContext atribut = entitas.atribut();
        KapasitasContext kapasitas = atribut.kapasitas(0);
        Meta_fasilitasContext metaFasilitas = atribut.meta_fasilitas(0);
        List<FasilitasContext> fasilitas = metaFasilitas.fasilitas();

        List<String> fasilitasList = new ArrayList<>();
        for (FasilitasContext context : fasilitas) {
            fasilitasList.add(context.getText());
        }

        int kapasitasInt = Integer.parseInt(kapasitas.getText());

        return new Ruang(kode.getText(), kapasitasInt, fasilitasList);
    }

    private static int indexHariOf(String hariStr) {
        int index = 1;
        for (String str : HARI) {
            if (hariStr.equals(str)) {
                return index;
            }
            index++;
        }
        return -1;
    }
}

