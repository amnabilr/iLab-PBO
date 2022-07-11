import java.util.Scanner;

public class SegitigaSikuTerbalik
{
public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int n;
        System.out.print("Masukkan nilai n: ");
        n = keyboard.nextInt();
        
        for(int as = n; as > 0; as--){
            for(int asd=as; asd>0; asd--){
        
            System.out.print("*");
            
            }
            
            System.out.println("");
        }
    }
}
