
package soalpertama;
 import java.util.Scanner ;
public class Main {
static int jarak;
         Scanner s;
         
         Lingkaran C1 = new Lingkaran ();
         Lingkaran C2 = new Lingkaran ();
         String [] jumlah1 ;
         String [] jumlah2;
         
         
    public Main (){
             this.s = new Scanner (System.in);
             
         }
    public void C1 (){
        System.out.println("Masukkan Nilai R1,X1,Y1 : ");
        jumlah1 = s.next().split(",",3);
        
        C1.setR1(Integer.parseInt(jumlah1[0]));
        C1.setX1(Integer.parseInt(jumlah1[1]));
        C1.setY1(Integer.parseInt(jumlah1[2]));
         }  
      public void C2 (){
          System.out.println("Masukkan Nilai R2,X2,Y2 : ");
          
          jumlah2 = s.next().split (",",3);
          
          C2.setR2(Integer.parseInt(jumlah2[0]));
          C2.setX2(Integer.parseInt(jumlah2[1]));
          C2.setY2(Integer.parseInt(jumlah2[2]));
        }
      
      public void Operasi_hitung(){
            jarak = (int) Math.sqrt(Math.pow((C1.getX1()- C2.getX2()), 2) + Math.pow((C1.getY1()- C2.getY2()), 2));
        if (jarak >= (C1.getR1()+ C2.getR2())) {
            System.out.println("");
            System.out.println("Deskripsi : ");
            System.out.println("C1 dan C2 Saling Lepas");
            System.out.println("Anda Berhasil");
        } else if (jarak < (C1.getR1() + C2.getR2())) {
        if ((C1.getR1() < C2.getR2()) && (((C1.getX1() + C1.getR1() < C2.getX2() + C2.getR2()) && (C1.getX1() - C1.getR1() > C2.getX2() - C2.getR2()) && (C1.getY1() + C1.getR1() < C2.getY2() + C2.getR2()) && (C1.getY1() - C1.getR1() > C2.getY2() - C2.getR2())))) {
                System.out.println("");
                System.out.println("Deskripsi : ");
                System.out.println("C1 ada di dalam C2");
                System.out.println("Anda Berhasil");
        } else if ((C1.getR1() > C2.getR2()) && (((C1.getX1() + C1.getR1() > C2.getX2() + C2.getR2()) && (C1.getX1() - C1.getR1() < C2.getX2() - C2.getR2()) && (C1.getY1() + C1.getR1() > C2.getY2() + C2.getR2()) && (C1.getY1() - C1.getR1() < C2.getY2() - C2.getR2())))) {
                System.out.println("");
                System.out.println("Deskripsi : ");
                System.out.println("C2 ada di dalam C1");
                System.out.println("Anda berhasil");
        } else {
                System.out.println("");
                System.out.println("Deskripsi : ");
                System.out.println("C1 dan C2 saling beririsan");
                System.out.println("Anda Berhasil");
        }}}
         public static void main(String[] args) {
             System.out.println("Mari Menghitung jarak antar Lingkaran :-)");

             Main a = new Main();

        try {
            a.C1();
        } catch (Exception x) {
        }
        try {
            a.C2();
        } catch (Exception y) {
        }a.Operasi_hitung();
        }}
    

