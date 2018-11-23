package test;

import static org.junit.Assert.assertEquals;

import entity.Kelas;
import entity.Penjadwalan;
import entity.Ruang;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import translator.Translator;

public class PenjadwalanTest {
  Penjadwalan jadwal = new Penjadwalan();
  List<Kelas> listKelas = new ArrayList<>();
  List<Ruang> listRuang = new ArrayList<>();

  @Rule
  public ResourceFile testcase00 = new ResourceFile("testcase00.txt");
  public ResourceFile testcase01 = new ResourceFile("testcase01.txt");
  public ResourceFile testcase02 = new ResourceFile("testcase02.txt");

  @Before
  public void initObject() throws IOException {
    jadwal = new Penjadwalan();
    listKelas = new ArrayList<>();
    listRuang = new ArrayList<>();
  }

  private void InitializeTestCaseData(ResourceFile res){
    Translator translator = new Translator(listKelas, listRuang);
    List<String> queries = new ArrayList<>();

    try {
      BufferedReader br = new BufferedReader(new FileReader(res.getFile()));
      try {
        String line = br.readLine();
        System.out.println("hey: " + line);

        while (line != null) {
          queries.add(line);
          line = br.readLine();
        }
      } finally {
        br.close();
      }
    } catch (IOException e) {
      System.out.println("ERROR: " + e.getMessage());
    }

    for (String query: queries) {
      translator.translate(query);
      translator.runCommand();
    }
  }

  @Test
  public void kelasTest() {

    InitializeTestCaseData(testcase00);

    Kelas kelas = listKelas.get(0);
    assertEquals("IF2323", kelas.kode);
    assertEquals(30, kelas.jumlahMhs);
    assertEquals("AC",kelas.kebutuhan.get(0));
    assertEquals("PROYEKTOR",kelas.kebutuhan.get(1));
    assertEquals(1, kelas.hariPref);
    assertEquals(5, kelas.jamPref);
  }

  @Test
  public void ruangTest() {

    InitializeTestCaseData(testcase00);

    Ruang ruang = listRuang.get(0);
    assertEquals("R7602", ruang.kode);
    assertEquals(40,ruang.kapasitas);
    assertEquals("PROYEKTOR", ruang.fasilitas.get(0));
    assertEquals("KURSI", ruang.fasilitas.get(1));
  }

  @Test
  public void testCase01() {
    InitializeTestCaseData(testcase01);

    assertEquals("Belum dibuat",listKelas.get(0).kode);
  }

  @Test
  public void testCase02() {
    InitializeTestCaseData(testcase02);

    assertEquals("Belum dibuat",listKelas.get(0).kode);
  }
}