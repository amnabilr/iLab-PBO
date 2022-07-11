import java.util.Scanner;
public class JarakTempuh{ 
public static void main(String[] args){
    Scanner A=new Scanner(System.in);
    int k,w,j;
    
    System.out.print("Masukkan kecepatan kendaraan (km/jam): ");
    k=A.nextInt();
    
    while(k<0){
        System.out.println("Kecepatan tidak bisa negatif. Masukkan kembali kecepatan.");
        System.out.print("Masukkan kecepatan kendaraan (km/jam): ");
        k=A.nextInt();
    }
    
    System.out.print("Masukkan waktu tempuh (jam): ");
    w=A.nextInt();
    
    while(w<1){
        System.out.println("Waktu tempuh harus lebih besar dari atau sama dengan 1 jam. Masukkan kembali waktu tempuh.");
        System.out.print("Masukkan waktu tempuh (jam): ");
        w=A.nextInt();
    }
    
    System.out.println("Waktu (jam)\tJarak (km)");
    for(int i=1;i<=w;i++){
        j=k*i;
        System.out.print(i+"          \t");
        System.out.printf("%6d\n",j);
    }
}
}
