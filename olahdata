import java.util.Scanner;
public class OlahData {
    public static void main(String[] args){
        Scanner A=new Scanner(System.in);
        double a=0,j=0,n=0,s,t=500,max=0,min=0;
        
        System.out.print("Masukkan angka floating point positif (-1 untuk mengakhiri): ");
        a=A.nextDouble();
        while(a!=-1){
            while(a>0){
                n++;
                j+=a;
                if(a>=max){
                    max=a;
                }
                if(a<=t){
                    min=a;
                }
                t=min;
                System.out.print("Masukkan angka floating point positif (-1 untuk mengakhiri): ");
                a=A.nextDouble();
            }
            s=max-min;
            System.out.println("Rata-rata = "+j/n);
            System.out.println("Maksimum = "+max);
            System.out.println("Minimum = "+min);
            System.out.println("Selisih Maks dan Min = "+s);
        }
        
    }
}
