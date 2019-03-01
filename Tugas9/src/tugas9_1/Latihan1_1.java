/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas9_1;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Latihan1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.println("Nama : Stevani Maria Ningsih");
        System.out.println("NPM  : 1841003");
        System.out.println("Kelas : SI-Z");
        try {
            FileOutputStream output = new
                FileOutputStream ("Latihan1.dat");
            String data = a.next();
            output.write(data.getBytes());
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
