package tugas_laporan;

import java.util.Scanner;

public class Kelulusan {
         public static void main(String[] args) {
        //membuat variabel
        int nilai;
        String nama;
        
        //membuat Scanner
        Scanner kelulusan = new Scanner(System.in);
        
        //mengambil input
        System.out.println("Masukkan nama anda ");
        nama = kelulusan.nextLine();//nextLine digunakan untuk String
        
        System.out.println("Berapa nilai anda ? ");
        nilai = kelulusan.nextInt(); //nextInt untuk int
        
        //membuat kondisi
         if (nilai >= 0 && nilai <= 60) {
             System.out.println("Maaf "+ nama +" anda tidak lulus");
             System.out.println("Dengan nilai E");
         } else if (nilai >= 61 && nilai <= 70) {
             System.out.println("Maaf "+ nama +" anda tidak lulus");
             System.out.println("Dengan nilai D");
         } else if (nilai >= 71 && nilai <= 80) {
            System.out.println("Selamat "+ nama + " anda lulus");
            System.out.println("Dengan nilai C");
         } else if(nilai >= 81 && nilai <= 90){
            System.out.println("Selamat "+ nama + " anda lulus");
            System.out.println("Dengan nilai B");
         } else {
             System.out.println("Selamat "+ nama + " anda lulus");
            System.out.println("Dengan nilai A");
         }
    }
}
