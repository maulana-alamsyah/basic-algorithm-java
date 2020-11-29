package input_output;
//mengimpor scanner ke program
import java.util.Scanner;
public class input_output {
    public static void main(String[] args){
        //Deklarasi variabel
        String jenisBeras;
        int hargaBeras, beliBeras, total;
        
        //membuat objek scanner
        Scanner masukan = new Scanner(System.in);
        
        //tampilkan output ke user
        System.out.println("Masukkan jenis beras ");
        //Menggunakan scanner dan menyimpan apa yang diketik di variabel jenisBeras
        jenisBeras = masukan.nextLine();
        //tampilkan output ke user
        System.out.println("Masukkan harga beras per KG ");
        //Menggunakan scanner dan menyimpan apa yang diketik di variabel hargaBeras
        hargaBeras = masukan.nextInt();
        //tampilkan output ke user
        System.out.println("Masukkan KG beras yang di beli ");
        //Menggunakan scanner dan menyimpan apa yang diketik di variabel beliBeras
        beliBeras = masukan.nextInt();
        
        //menutup objek scanner
        masukan.close();
        
        //Menghitung nilai beliBeras * hargaBeras dan disimpan pada variabel total
        total = beliBeras * hargaBeras;
        
        //menampilkan apa yang sudah disimpan di variabel
        System.out.println("Total pembayaran = " + total);
    }
}
