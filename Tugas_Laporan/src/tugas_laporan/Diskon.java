package tugas_laporan;

import java.util.Scanner;

public class Diskon {
    public static void main(String args[]){
      //membuat variabel
    int total_belanja;
    double harga_akhir;
        
     
    //membuat Scanner baru
    Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program Kartu Diskon Potongan Harga ##");
    System.out.println("========================================");
    System.out.println();
     
    System.out.print("Total Belanja: Rp.");
    total_belanja = input.nextInt();
    System.out.println();
     
    //membuat kondisi
    if (total_belanja >= 100000 && total_belanja < 149000 ) {
        harga_akhir = total_belanja - 10000;
        System.out.println("Selamat, anda mendapat diskon 10000");
        System.out.println("Total pembayaran anda Rp."+harga_akhir);
        } else if (total_belanja >= 150000 && total_belanja < 299000) {
            harga_akhir = total_belanja - 20000;
            System.out.println("Selamat, anda mendapat diskon 20000");
            System.out.println("Total pembayaran anda Rp."+harga_akhir);
        }
        else if (total_belanja >= 300000 && total_belanja < 499000) {
            harga_akhir = total_belanja - 50000;
            System.out.println("Selamat, anda mendapat diskon 50000");
            System.out.println("Total pembayaran anda Rp."+harga_akhir);
        } else if (total_belanja >= 500000){
            harga_akhir = total_belanja - 75000;
            System.out.println("Selamat, anda mendapat diskon 75000");
            System.out.println("Total pembayaran anda Rp."+harga_akhir);
        }
        else {
            harga_akhir = total_belanja;
        }
 
  }
}
