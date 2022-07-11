package tugas.kelompok;

public class manipulasistrring {
    public static void main(String[] args) {

        // contoh string yang dipakai
        String kalimat = "Agis suka makan nasi padang"; 

        // operasi substring
        String kata = kalimat.substring(10,20);
        System.out.println(kata);

        // operasi concatenation (concat)
        String kalimatke2 = kata + "pake rendang";
        System.out.println(kalimatke2);  

        // operasi lowercase dan uppercase
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());
       
    }
}
