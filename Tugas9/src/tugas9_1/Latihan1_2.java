/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas9_1;

import java.io.FileInputStream;

public class Latihan1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("Liriklagu.txt");
            int Data;
            while ((Data = in.read()) != -1) {
                if ((char)Data == ' ') {
                    System.out.print("_");
                } else {
                    System.out.print((char) Data);
                }

            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
