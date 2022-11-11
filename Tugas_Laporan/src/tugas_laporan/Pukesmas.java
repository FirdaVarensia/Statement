package tugas_laporan;

import java.util.Scanner;

public class Pukesmas {
    public static void main(String[] args){
        //Membuat Scanner
        Scanner input = new Scanner(System.in);
        
        //membuat variabel
        String nilaiA = "punya KIS";
        String nilaiB = "tidak punya KIS, warga setempat";
        String nilaiC = "tidak punya KIS, bukan warga setempat";
        
        System.out.println("============= CEK KESEHATAN ============");
        System.out.println("Apakah anda mempunyai KIS?");
        System.out.println("punya KIS");
        System.out.println("tidak punya KIS, warga setempat");
        System.out.println("tidak punya KIS, bukan warga setempat");
        
        System.out.println("================ JAWABAN ================");
        
        System.out.print("Jawab Disini sesuai pertanyaan: ");
        String kriteria = input.nextLine(); //Mendapatkan Input Dari User
        
        //Membuat Kondisi Menggunakan Statement if-else
        if(kriteria.equals(nilaiA)){
            System.out.println("total bayar Rp.0");
        }else if (kriteria.equals(nilaiB)){
            System.out.println("total bayar Rp.7500");
        } else {
            System.out.println("tidak boleh berobat");
        }
    }
}

