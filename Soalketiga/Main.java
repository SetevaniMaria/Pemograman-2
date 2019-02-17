/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soalketiga;

/**
 *
 * @author asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("PT.KARYA ABADI");
        Manager a = new Manager (250000,"Denisep Parmenas","Ujung Berung",3500000);
        System.out.println("Nama Manager : "+a.getName());
        System.out.println("Alamat : "+a.getAdress());
        System.out.println("Gaji : "+a.getSalary());
        
        Employee staff1 = new Staff ("Dika","Cibiru",2500000);
        System.out.println("Nama : "+staff1.getName());
        System.out.println("Alamat :"+staff1.getAdress());
        System.out.println("Gaji :"+staff1.getSalary());
        
        Employee staff2 = new Staff ("Dani", "Cangkuang",2500000);
        System.out.println("Nama : "+staff2.getName());
        System.out.println("Alamat : "+staff2.getAdress());
        System.out.println("Gaji : "+staff2.getSalary());
}
}