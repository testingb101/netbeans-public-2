/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.one.histogram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author UserN
 */
public class PracticalOneHistogram {

    static String star = "";
    static String star2 = "";
    static String star3 = "";
    static String star4 = "";
    static String star5 = "";
    static String star6 = "";
    static String star7 = "";
    static String star8 = "";
    static String star9 = "";
    static String star10 = "";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader bufferreader = null;
        try {
            // TODO code application logic here
            bufferreader = new BufferedReader(new FileReader("grades.txt"));
            bufferreader.readLine();
            String line = bufferreader.readLine();
            int[] array = new int[99];
            int i = 0;
            while (line != null) {
                String[] read = new String[4];
                read = line.split(",");
                array[i] = Integer.parseInt(read[0]);
                line = bufferreader.readLine();
                i++;
            }
            for (int x = 0; x < array.length; x++) {

                if (array[x] > 0 && array[x] <= 10) {
                    star = star.concat("*");
                } else if (array[x] > 10 && array[x] <= 20) {
                    star2 = star2.concat("*");
                } else if (array[x] > 20 && array[x] <= 30) {
                    star3 = star3.concat("*");
                } else if (array[x] > 30 && array[x] <= 40) {
                    star4 = star4.concat("*");
                } else if (array[x] > 40 && array[x] <= 50) {
                    star5 = star5.concat("*");
                } else if (array[x] > 50 && array[x] <= 60) {
                    star6 = star6.concat("*");
                } else if (array[x] > 60 && array[x] <= 70) {
                    star7 = star7.concat("*");
                } else if (array[x] > 70 && array[x] <= 80) {
                    star8 = star8.concat("*");
                } else if (array[x] > 80 && array[x] <= 90) {
                    star9 = star9.concat("*");
                } else if (array[x] > 90 && array[x] <= 100) {
                    star10 = star10.concat("*");
                }
                
            }
            System.out.println("Histogram");
            System.out.println("-----------------------------");
            System.out.println(" 1  - 10  | " + star);
            System.out.println("11  - 20  | " + star2);
            System.out.println("21  - 30  | " + star3);
            System.out.println("31  - 40  | " + star4);
            System.out.println("41  - 50  | " + star5);
            System.out.println("51  - 60  | " + star6);
            System.out.println("61  - 70  | " + star7);
            System.out.println("71  - 80  | " + star8);
            System.out.println("81  - 90  | " + star9);
            System.out.println("91  - 100 | " + star10);
            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(PracticalOneHistogram.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bufferreader.close();
            } catch (IOException ex) {
                Logger.getLogger(PracticalOneHistogram.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
