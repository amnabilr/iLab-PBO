package tugas.minggu.ke.pkg4;

import java.util.Scanner;

public class kotak {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int panjang, lebar, tinggi, volume;

        System.out.print("Masukan Panjang      : ");
        panjang=input.nextInt();
        System.out.print("Masukan Lebar        : ");
        lebar=input.nextInt();
        System.out.print("Masukan Tinggi       : ");
        tinggi=input.nextInt();
        
        volume=panjang*lebar*tinggi;

        System.out.println("Luas Persegi Panjang : "+volume);
    }  
}
