package tugas.kelompok;

public class arrayduadimensi {
    public static void main(String[] args) {
        
        // mendeklarasikan array bernama data dengan tipe data sring
        String[][] data = {{"Agis Suryana", "10119272"}, {"Akmal Zhagy Ismawan", "10119394"}, {"Andi Mohammad Nabil Ramadan", "10119723"}, 
                                {"Luthfiyah Afra Mawardi", "13119464"}, {"Rima Herliana", "15119580"}, {"Verdyan Rachmad Wirathama", "16119478"}};
        
        // melakukan inisialisasi, kemudian data akan terus melakukan perulangan sampai kondisi nya berada pada array yang terakhir 
        for (int i = 0; i < data.length; i++){ 
            System.out.println("Nama Lengkap: " + data[i][0]); // mencetak Nama beserta data yang telah diisikan pada array
            System.out.println("NPM: " + data[i][1]); // mencetak NPM beserta data yang telah diisikan pada array
            System.out.println("************************"); // mencetak asterisk sebagai pembatas pada perulangan array
        }
    } 
}
