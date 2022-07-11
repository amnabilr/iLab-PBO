package tugas.minggu.ke.pkg3;

// memasukkan paket scanner
import java.util.Scanner;

public class Inputoutput{
    
public static void main (String [] args){
  
  Scanner masuk = new Scanner(System.in);
  // membuat variabel
  String nama, npm, kls, jpi ;
  
  // menginput data
  System.out.print("Masukkan Nama                   = ");
  nama = masuk.nextLine(); // menginput nilai string
  System.out.print("Masukkan NPM                    = ");
  npm = masuk.nextLine(); // menginput nilai string
  System.out.print("Masukkan Kelas                  = ");
  kls = masuk.nextLine(); // menginput nilai string
  System.out.print("Masukkan Judul Penulisan Ilmiah = ");
  jpi = masuk.nextLine(); // menginput nilai string
  
  // mencetak hasil inputan data
  System.out.println("\nNama                        = "+nama);
  System.out.println("NPM                           = "+npm);
  System.out.println("Kelas                         = "+kls);
  System.out.println("Judul Penulisan Ilmiah        = "+jpi);
 }
}
