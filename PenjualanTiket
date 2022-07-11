import java.util.Scanner;
public class PenjualanTiket{
    public static void main(String[] args) {
    Scanner A=new Scanner(System.in);
    int a,t=10,n=0;
    
    while(t>0){
        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        a=A.nextInt();
        if(a>t){
            System.out.println("Maaf, sisa tiket yang tersisa adalah "+t+" tiket.");
        }else if(a<=4){
            t-=a;
            System.out.println("Anda membeli sebanyak "+a+" tiket.");
            n++;
            if(t!=0){
            System.out.println("Sisa tiket yang tersedia: "+t);
            }
        }else{
            System.out.println("Anda tidak bisa membeli lebih dari 4 tiket.");
        }
    }
    System.out.println("Semua tiket telah terjual kepada "+n+" pembeli.");
}
}
