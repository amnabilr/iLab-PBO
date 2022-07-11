import java.util.Scanner;
public class ATM
{
    public static void main(String[] args)
    {
        int percobaan,pin;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan PIN Anda: ");
        pin = keyboard.nextInt();
        
        if (pin == 1234)
        {
            System.out.println("PIN yang Anda masukkan benar.");
        }
        else 
        {
            System.out.println("PIN yang Anda masukkan salah.");
            System.out.print("Masukkan kembali PIN Anda: ");
            pin = keyboard.nextInt();
            if (pin != 1234)
            {
                System.out.println("PIN yang Anda masukkan salah.");
                System.out.print("Masukkan kembali PIN Anda: ");
                pin = keyboard.nextInt();
                if (pin == 1234)
                {
                    System.out.println("PIN yang Anda masukkan benar.");
                }
                else 
                {
                    System.out.println("PIN yang Anda masukkan salah.");
                    System.out.println("Kartu ATM Anda terblokir.");
                }
            }
            else
            {
                System.out.println("PIN yang Anda masukkan benar.");
            }
        }


    }
}

* BeDA **
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class TagihanInternet 
{
    public static void main(String[] args)
    {
       double tagihan;
       double jam;
       char  paket;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan paket [A,B,C]: ");
        paket = keyboard.next().charAt(0);

        System.out.print("Masukkan jam pemakaian: ");
        jam = keyboard.nextDouble();
        
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        
        formatRp.setCurrencySymbol("Rp.");
        formatRp.setMonetaryDecimalSeparator('.');
        formatRp.setGroupingSeparator(',');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        switch (paket)
{
    case 'A':
        if (jam<=20)
        {
            tagihan=100000;
            System.out.printf("Total tagihan = " + "%s %n", kursIndonesia.format(tagihan));
        }
        else if (jam>20)
        {
            tagihan=100000+(5000*Math.floor(jam-20));
            System.out.printf("Total tagihan = " + "%s %n", kursIndonesia.format(tagihan));
        }
        break;
        
    case 'B':
        if (jam<=50)
        {
            tagihan=200000;
            System.out.printf("Total tagihan = " + "%s %n", kursIndonesia.format(tagihan));
        }
         else if (jam>50)
        {
            tagihan=200000+(5000*Math.floor(jam-50));
            System.out.printf("Total tagihan = " + "%s %n", kursIndonesia.format(tagihan));
        }
        break;
        
    case 'C':
        tagihan=350000;
        System.out.printf("Total tagihan = " + "%s %n", kursIndonesia.format(tagihan));
        break;
        
    default:
        System.out.println("Salah input! Jenis paket hanya A, B, atau C.");
        break;
}     
        
    }
    
}

* Beda *
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class TarifPengiriman
{
    public static void main(String[] args)
    {
        double berat,tarif,jarak;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan berat paket Anda (kg): ");
        berat = keyboard.nextDouble();
        
        System.out.print("Masukkan jarak pengiriman (km): ");
        jarak = keyboard.nextDouble();
        
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        
        formatRp.setCurrencySymbol("Rp.");
        formatRp.setMonetaryDecimalSeparator('.');
        formatRp.setGroupingSeparator(',');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        if (berat <= 2)
        {
            if (jarak == 1)
            {
                tarif = 1500;
                System.out.printf("%s %n", kursIndonesia.format(tarif));
            }
            else if (jarak > 1)
            {
                tarif = 1500 * Math.floor(jarak);
                System.out.printf("Tarif Pengiriman = " + "%s %n", kursIndonesia.format(tarif));
            }
            else
            {
                System.out.print("error");
            }
        }
        else if (berat > 2 && berat <= 6)
        {
            if (jarak == 1)
            {
                tarif = 3000;
                System.out.printf("%s %n", kursIndonesia.format(tarif));
            }
            else if (jarak > 1)
            {
                tarif = 3000 * Math.floor(jarak);
                System.out.printf("Tarif Pengiriman = " + "%s %n", kursIndonesia.format(tarif));
            }
            else
            {
                System.out.print("error");
            }
        }
        else if (berat > 6 && berat <= 10)
        {
            if (jarak == 1)
            {
                tarif = 5000;
                System.out.printf("%s %n", kursIndonesia.format(tarif));
            }
            else if (jarak > 1)
            {
                tarif = 5000 * Math.floor(jarak);
                System.out.printf("Tarif Pengiriman = " + "%s %n", kursIndonesia.format(tarif));
            }
            else
            {
                System.out.print("error");
            }
        }
        else if (berat > 10)
        {
            if (jarak == 1)
            {
                tarif = 5500;
                System.out.printf("%s %n", kursIndonesia.format(tarif));
            }
            else if (jarak > 1)
            {
                tarif = 5500 * Math.floor(jarak);
                System.out.printf("Tarif Pengiriman = " + "%s %n", kursIndonesia.format(tarif));
            }
            else
            {
                System.out.print("error");
            }
        }
        else 
        {
            System.out.print("error");
        }
    }
}

* Beda *

import java.util.Scanner;

public class PersamaanKuadrat
{
    public static void main(String[] args)
    {
        int a,b,c;

        double x1,x2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        a = keyboard.nextInt();

        System.out.print("Masukkan nilai b: ");
        b = keyboard.nextInt();

        System.out.print("Masukkan nilai c: ");
        c = keyboard.nextInt();
        
        if (b*b - 4*a*c < 0)
        {
            System.out.print("Akar-akar dari persamaan kuadrat adalah imajiner.");
        }
        else 
        {
        x1 = ((-b+Math.sqrt(b*b-4*a*c))/(2*a));
        System.out.printf("x1 = " + "%.2f",x1);

        x2 = ((-b-Math.sqrt(b*b-4*a*c))/(2*a));
        System.out.printf("\nx2 = " + "%.2f",x2);
        }
        
    }
}
