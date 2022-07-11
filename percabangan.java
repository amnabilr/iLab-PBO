package tugas.kelompok; 

public class percabangan {
    public static void main (String[] args){
                
        int a = 9; // inisialisasi nilai awal
        System.out.println("Nilai = " + a); // mencetak nilai dari variabel a
        
        // percabangan dimulai 
        if (a == 10){
            System.out.println("Mantap, ini merupakan jalur yang benar"); // mencetak apabila nilai true
        } else { // lain nya
            System.out.println("Maaf, anda salah memilih jalur"); // mencetak nilai false
        }
    }
}
