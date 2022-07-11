import java.util.Scanner;
public class FaktorPrima{
    public static void main(String[] args){
        Scanner A=new Scanner(System.in);
        int a,t=1,b=0;;
    
        System.out.print("Masukkan sebuah bilangan asli: ");
        a=A.nextInt();
    
        while (a % 2 == 0){
            System.out.println(2);
            a = a/2;
        }
        for (int i = 3; i <= Math.sqrt(a); i = i + 2) {
            while (a % i == 0){
                System.out.println(i);
                a = a/i;
            }
        }
        if (a > 2){
            System.out.println(a);
        }
    }
}
