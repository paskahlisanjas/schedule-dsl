package entity;

import parser.SchedulingGrammarParser;
import parser.SchedulingGrammarParser.*;

import java.util.ArrayList;
import java.util.List;

public class EntityBuilder {
    private static final String KELAS_OJBECT = "KELAS";

    public static Object build(SchedulingGrammarParser.EntitasContext entitas) {
        SchedulingGrammarParser.ObjekContext objek = entitas.objek();
        if (objek.getText().equals(KELAS_OJBECT)) {
            return buildKelas(entitas);
        }
        return buildRuang(entitas);
    }

    private static Kelas buildKelas(SchedulingGrammarParser.EntitasContext entitas) {

        String kode = entitas.kode().getText();
        AtributContext atribut = entitas.atribut();

        List<KapasitasContext> kapasitas = atribut.kapasitas();


        System.out.println(kode);

        return null;
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

        return new Ruang(kode.getText(), kapasitas.getText(), fasilitasList);
    }
}

