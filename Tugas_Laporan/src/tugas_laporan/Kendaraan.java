package tugas_laporan;

import java.util.Scanner;

public class Kendaraan {
    public static void main(String[] args) {
        //membuat variabel dan Scanner
        String kendaraan;
        Scanner orang = new Scanner(System.in);
        
        //menampilkan output ke user
        System.out.println("Masukkan jumlah orang ");
        kendaraan = orang.nextLine();
        
        //membuat kondisi
        switch(kendaraan){
            case "1" :
                System.out.println("Orang naik sepeda");
                break;
                
            case "2" :
                System.out.println("Orang naik motor");
                break;
                
            case "3" :
                System.out.println("Orang naik becak");
                break;
                
            case "4" :
                System.out.println("Orang naik mobil");
                break;    
                
            default: 
                System.out.println("Orang naik bus");
        }
    }
}
