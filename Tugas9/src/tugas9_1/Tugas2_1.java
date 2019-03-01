/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas9_1;

import java.io.FileOutputStream;
import java.util.Scanner;
public class Tugas2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner a = new Scanner (System.in);
        System.out.println("Nama : Stevani Maria Ningsih");
        System.out.println("NPM  : 1841003");
        System.out.println("Kelas : SI-Z\n");
        
        System.out.print("Nama :");
        String Nama = a.nextLine()+"\n";
        System.out.print("Alamat :");
        String Alamat = a.nextLine()+"\n";
        System.out.print("Nomor Telepon :");
        String Notlp = a.nextLine()+"\n";
        
            
        
        try {
            FileOutputStream output = new
                FileOutputStream ("Addresbook.dat");
      
            output.write(Nama.getBytes());
            output.write(Alamat.getBytes());
            output.write(Notlp.getBytes());
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
}
