package dev.modul411.sortiergruppenarbeit;

import dev.modul411.sortiergruppenarbeit.importexport.ExportFile;
import dev.modul411.sortiergruppenarbeit.importexport.ImportFile;
import dev.modul411.sortiergruppenarbeit.sortingalgorithm.Bubblesort;
import dev.modul411.sortiergruppenarbeit.sortingalgorithm.Quicksort;

/**
 * Main Class
 *
 * @author Magnus Götz, Moritz Gasbichler
 * @version 1.0
 * @since 2022-01-04
 */
public class Main {
    private final String pathPrefix = "src/main/resources/importfiels/";
    private int[] tenDigits;
    private int[] hundredDigits;
    private int[] thousandDigits;

    public Main() {
        ImportFile importFile = new ImportFile();
        tenDigits = importFile.readLinesFromFile(pathPrefix + "10Digits.dat");
        hundredDigits = importFile.readLinesFromFile(pathPrefix + "100Digits.dat");
        thousandDigits = importFile.readLinesFromFile(pathPrefix + "1000Digits.dat");
        compareSortingAlgorithm();
        ExportFile exportFile = new ExportFile("exportFile.csv", new String[]{"Bubblesort", "5GB", "100000", "5s"},new String[]{"Mergesort", "10MB", "120000", "5ms"},new String[]{"Quicksort", "10Byte", "50000", "2ms"});
        exportFile.writeInCsvFile();

    }

    public void compareSortingAlgorithm() {
        //TODO sort the values using the three arrays read from the files
        int[] unsortedArray = {432324, 234234, 235, 32523, 534, 643, 6, 3256, 3476, 5346356, 4235, 6};
        Bubblesort b = new Bubblesort();
        long[] arr = b.run(thousandDigits);
    }


    public static void main(String[] args) {
        new Main();
    }
}
