/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan17programtunjangan;

import java.util.Scanner;
/**
 *
 * @author user
 * Nama : Satyaning Andaru Bawalaksana
 * Nim : 10118058
 * Kelas : If-2
 */
public class PBO210118058Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     * Nama : Satyaning Andaru Bawalaksana
     * NIM : 10118058
     * Kelas : IF-2
     */
    public static void main(String[] args) {
        Double tunjangan = 0.0;
        // TODO code application logic here
        Scanner UserInput = new Scanner(System.in);
        
        System.out.println("==========Program Tunjangan===========");
        System.out.print("Berapa Gaji Anda Perbulan \t: Rp. ");
        Double Gapok = UserInput.nextDouble();
        System.out.println("Status anda?(menikah/belum)\t:");
        String Status = UserInput.next();
        
        
        System.out.println("===========Hasil perhitungan Gaji=================");
       
        System.out.println("Gaji Pokok = " +Gapok);
        
         
         if(Status.equalsIgnoreCase("menikah")){
            tunjangan = (Double) (0.35*Gapok);                        
        } else{
            tunjangan = 0.0;             
        }
         System.out.println("Tunjangan = "+tunjangan);
         System.out.println("Total Gaji = "+(Gapok + tunjangan));
         System.out.println("Directed By Satyaning andaru Bawalaksana");
    }    
}
