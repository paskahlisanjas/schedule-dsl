package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import entity.Kelas;
import entity.Penjadwalan;
import entity.Ruang;
import entity.Slot;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
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
  public ResourceFile testcase03 = new ResourceFile("testcase03.txt");
  public ResourceFile testcase04 = new ResourceFile("testcase04.txt");
  public ResourceFile testcase05 = new ResourceFile("testcase05.txt");

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
  public void parseKelasTest() {

    InitializeTestCaseData(testcase00);

    Kelas kelas = listKelas.get(0);
    assertEquals("IF2323", kelas.kode);
    assertEquals(30, kelas.jumlahMhs);
    assertEquals("AC",kelas.kebutuhan.get(0));
    assertEquals("PROYEKTOR",kelas.kebutuhan.get(1));
    assertEquals(0, kelas.hariPref);
    assertEquals(4, kelas.jamPref);
  }

  @Test
  public void parseRuangTest() {

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


    jadwal.jadwalkan(listKelas,listRuang);

    Slot checkedSlot;
    //IF4072 di 7604 Selasa Jam 15
    checkedSlot = jadwal.jadwalKelas.get(1).get(8).get(0);
    assertNotNull(checkedSlot);
    assertEquals("IF4072", checkedSlot.kelas.kode);
    assertEquals("R7604", checkedSlot.ruang.kode);
    //IF2110 di 7602 Senin jam 13
    checkedSlot = jadwal.jadwalKelas.get(0).get(6).get(0);
    assertNotNull(checkedSlot);
    assertEquals("IF2110", checkedSlot.kelas.kode);
    assertEquals("R7602", checkedSlot.ruang.kode);
    //IF3110 di 7602 Senin jam 7
    checkedSlot = jadwal.jadwalKelas.get(0).get(0).get(0);
    assertNotNull(checkedSlot);
    assertEquals("IF3110", checkedSlot.kelas.kode);
    assertEquals("R7602", checkedSlot.ruang.kode);
  }

  @Test
  public void testCase02() {
    InitializeTestCaseData(testcase02);

    jadwal.jadwalkan(listKelas,listRuang);

    List<Slot> listSlot;
    Slot checkedSlot;

    //IF4072 di 7604 Senin Jam 7
    listSlot = jadwal.jadwalKelas.get(0).get(0);
    assertFalse(listSlot.isEmpty());
    checkedSlot = listSlot.get(0);
    assertNotNull(checkedSlot);
    assertEquals("IF4072", checkedSlot.kelas.kode);
    assertEquals("R7604", checkedSlot.ruang.kode);

    //IF2110 di 7602 Senin jam 13
    listSlot = jadwal.jadwalKelas.get(0).get(6);
    assertFalse(listSlot.isEmpty());
    checkedSlot = listSlot.get(0);
    assertNotNull(checkedSlot);
    assertEquals("IF2110", checkedSlot.kelas.kode);
    assertEquals("R7602", checkedSlot.ruang.kode);

    //IF3110 di 7602 Senin jam 7
    listSlot = jadwal.jadwalKelas.get(0).get(0);
    assertFalse(listSlot.isEmpty());
    checkedSlot = listSlot.get(1);
    assertNotNull(checkedSlot);
    assertEquals("IF3110", checkedSlot.kelas.kode);
    assertEquals("R7602", checkedSlot.ruang.kode);
  }

  @Test
  public void testCase03() {
    InitializeTestCaseData(testcase03);

    jadwal.jadwalkan(listKelas,listRuang);

    List<Slot> listSlot;
    Slot checkedSlot;

    //IF4072 di 7604 Selasa Jam 15
    listSlot = jadwal.jadwalKelas.get(1).get(8);
    assertFalse(listSlot.isEmpty());
    checkedSlot = listSlot.get(0);
    assertNotNull(checkedSlot);
    assertEquals("IF4072", checkedSlot.kelas.kode);
    assertEquals("R7604", checkedSlot.ruang.kode);

    //IF2110 di 7602 Senin jam 13
    listSlot = jadwal.jadwalKelas.get(0).get(6);
    assertFalse(listSlot.isEmpty());
    checkedSlot = listSlot.get(0);
    assertNotNull(checkedSlot);
    assertEquals("IF2110", checkedSlot.kelas.kode);
    assertEquals("R7602", checkedSlot.ruang.kode);

    //IF2120 di 7602 Senin jam 14
    listSlot = jadwal.jadwalKelas.get(0).get(7);
    assertFalse(listSlot.isEmpty());
    checkedSlot = listSlot.get(0);
    assertNotNull(checkedSlot);
    assertEquals("IF2120", checkedSlot.kelas.kode);
    assertEquals("R7602", checkedSlot.ruang.kode);

    //IF3110 di 7602 Senin jam 7
    listSlot = jadwal.jadwalKelas.get(0).get(0);
    assertFalse(listSlot.isEmpty());
    checkedSlot = listSlot.get(0);
    assertNotNull(checkedSlot);
    assertEquals("IF3110", checkedSlot.kelas.kode);
    assertEquals("R7602", checkedSlot.ruang.kode);
  }

  @Test
  public void testCase04() {
    InitializeTestCaseData(testcase04);

    jadwal.jadwalkan(listKelas,listRuang);

    List<Slot> listSlot;
    Slot checkedSlot;

    //IF4072 di 7604 Selasa Jam 15
    listSlot = jadwal.jadwalKelas.get(1).get(8);
    assertFalse(listSlot.isEmpty());
    checkedSlot = listSlot.get(0);
    assertNotNull(checkedSlot);
    assertEquals("IF4072", checkedSlot.kelas.kode);
    assertEquals("R7604", checkedSlot.ruang.kode);

    //IF3110 di 7602 Senin jam 7
    listSlot = jadwal.jadwalKelas.get(0).get(0);
    assertFalse(listSlot.isEmpty());
    checkedSlot = listSlot.get(0);
    assertNotNull(checkedSlot);
    assertEquals("IF3110", checkedSlot.kelas.kode);
    assertEquals("R7602", checkedSlot.ruang.kode);
  }

  @Test
  public void testCase05() {
    InitializeTestCaseData(testcase05);

    jadwal.jadwalkan(listKelas,listRuang);

    List<Slot> listSlot;
    Slot checkedSlot;

    //IF4072 di 7604 Selasa Jam 15
    listSlot = jadwal.jadwalKelas.get(1).get(8);
    assertFalse(listSlot.isEmpty());
    checkedSlot = listSlot.get(0);
    assertNotNull(checkedSlot);
    assertEquals("IF4072", checkedSlot.kelas.kode);
    assertEquals("R7604", checkedSlot.ruang.kode);

    //IF2110 di 7602 Senin jam 13
    listSlot = jadwal.jadwalKelas.get(0).get(6);
    assertFalse(listSlot.isEmpty());
    checkedSlot = listSlot.get(0);
    assertNotNull(checkedSlot);
    assertEquals("IF2110", checkedSlot.kelas.kode);
    assertEquals("R7602", checkedSlot.ruang.kode);
  }

  @After
  public void printJadwal() {
    System.out.println();
    System.out.println("Jadwal yang benar : ");
    jadwal.printJadwal();
  }
}