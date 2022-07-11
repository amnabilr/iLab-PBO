import java.util.Scanner;
public class JumlahBilanganAsli 
{
        public static void main(String[] args)
    {
        int angka1, jumlah;

        jumlah = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan n: ");
        angka1 = keyboard.nextInt();
        
            for(int i = 1; i <=angka1; i++){
                jumlah = jumlah + i ;
                //System.out.print(jumlah+ " ");
            }
     System.out.println("Jumlah bilangan asli dari 1 s.d " + angka1 + " = " + jumlah);
    }  
}
