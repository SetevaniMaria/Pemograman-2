/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas9_1;
import java.io.FileInputStream;
public class Tugas2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("Addresbook.dat");
            int Book;
            while ((Book = in.read()) != -1) {
                System.out.print((char)Book);

            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
