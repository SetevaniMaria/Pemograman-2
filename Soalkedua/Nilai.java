package Soalkedua;
public class Nilai {
public static void main(String[] args) {
    System.out.println("nilai : 1 2 20 15 7 8 9");
     int [] nilai = { 1, 2, 20, 15, 7, 8 ,9 }  ;
     int max1 =0;
     int max2 = 10;
     int max3 = 5;
      for (int i = 0; i < nilai.length; i++) {
          if (nilai [i]>max1){
              max1 = nilai [i];
          }else if (nilai [i] > max2 ){
               max2 = nilai[i];
          }else if (nilai [i] > max3){
               max3 = nilai [i];
                      }
                      }
      System.out.println("Nilai Tertinggi 1 : "+max1);
      System.out.println("Nilai Tertinggi 2 : "+max2);
      System.out.println("Nilai Tertinggi 3 : "+max3);
          }
        
    }
   
    

