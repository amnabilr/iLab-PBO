public class TabelPerkalian
{
    public static void main(String[] args)
    {
    final int kolom = 10;
    final int baris = 10;
    // Loop tersarang untuk mencetak tabel pemangkatan
    for (int x = 1; x <= baris; x++)
    {
        for (int n = 1; n <= kolom; n++) 
        {
        int hasil = x * n ;
        if (hasil < 10) System.out.print(" ");
        if (hasil < 100) System.out.print(" ");
        System.out.print(hasil + "  ");
        }
    System.out.println();
    }
}

}
