package dev.modul411.sortiergruppenarbeit.importexport;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReadFileTest {

    @Test
    public void getLinesAsIntTest() {
        ImportFile rf = new ImportFile();
        int[] inputs = rf.readLinesFromFile("src/main/resources/importfiels/10Digits.dat");
        Assertions.assertArrayEquals(inputs, new int[]{899, 15, 33, 69, 87, 44, 58, 99, 102, 325});
    }
}