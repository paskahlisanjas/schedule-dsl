package translator;

import entity.Kelas;
import entity.Ruang;
import parser.SchedulingGrammarParser;
import parser.SchedulingGrammarParser.*;

import java.util.ArrayList;
import java.util.List;

public class EntityBuilder {

    private static final String[] HARI = {
            "SENIN",
            "SELASA",
            "RABU",
            "KAMIS",
            "JUMAT"
    };

    private static final String[] KETERSEDIAAN = {
            "TIDAK",
            "YA"
    };

    static Kelas buildKelas(SchedulingGrammarParser.EntitasContext entitas) {
        Kelas kelas = new Kelas();

        KodeContext kode = entitas.kode();
        AtributContext atribut = entitas.atribut();
        KapasitasContext kapasitas = atribut.kapasitas(0);
        Meta_kebutuhanContext metaKebutuhan = atribut.meta_kebutuhan(0);

        List<KebutuhanContext> kebutuhan = metaKebutuhan.kebutuhan();
        List<String> kebutuhanList = new ArrayList<>();
        for (KebutuhanContext context : kebutuhan) {
            kebutuhanList.add(context.getText());
        }

        int kapasitasInt = Integer.parseInt(kapasitas.getText());

        try {
            PreferensiContext preferensi = atribut.preferensi(0);
            HariContext hari = preferensi.hari();
            JamContext jam = preferensi.jam();

            int hariInt = indexOf(hari.getText(), HARI);
            int jamInt = Integer.parseInt(jam.getText());

            kelas = new Kelas(kode.getText(), kebutuhanList, kapasitasInt, hariInt, jamInt - 7, true);
        } catch (Exception e) {
            kelas = new Kelas(kode.getText(), kebutuhanList, kapasitasInt, true);
        }

        try {
            KetersediaanContext ketersediaan = atribut.ketersediaan(0);
            kelas.isAvailable = indexOf(ketersediaan.getText(), KETERSEDIAAN) == 1;
        } catch (Exception ignored) {
        }

        return kelas;
    }

    static Ruang buildRuang(SchedulingGrammarParser.EntitasContext entitas) {
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

    private static int indexOf(String input, String[] list) {
        int index = 0;
        for (String str : list) {
            if (input.equals(str)) {
                return index;
            }
            index++;
        }
        return -1;
    }
}

