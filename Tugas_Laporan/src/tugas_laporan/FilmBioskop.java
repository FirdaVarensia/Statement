package tugas_laporan;

import java.util.Scanner;

public class FilmBioskop {
        public static void main(String[] args) {
        //membuat variabel dan Scanner
        String umur;
        Scanner bioskop = new Scanner(System.in);
        
        //menampilkan output ke user
        System.out.println("Masukkan umur ");
        umur = bioskop.nextLine();
        
        //membuat kondisi
        switch(umur){
            case "3" :
                System.out.println("Menonton Film Frozen ");
                break;
            
            case "7" :
                System.out.println("Menonton Film Keluarga Cemara");
                break;
                
            case "9" :
                System.out.println("Menonton Film Miinions ");
                break;
                
            case "15" :
                System.out.println("Menonton Film KKN Desa Penari");
                break;
                
            case "18" :
                System.out.println("Menonton Film Dilan 1990");
                break;
                 
            case "20" :
                System.out.println("Menonton Film Titanic");
                break;
                
            default: 
                System.out.println("Menonton Film Zootopia ");
        }
    }
}
