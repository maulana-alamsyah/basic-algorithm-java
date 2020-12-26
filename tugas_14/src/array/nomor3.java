package array;
//mengimpor scanner ke program
import java.util.Scanner;
public class nomor3 {
    public static void main(String[] args){
        //membuat objek scanner
        Scanner masukan = new Scanner(System.in);
        //membuat array kota dengan jumlah data 5
        String[] kota = new String[5];
        //perulangan
        for(int i = 0; i < kota.length; i++){
            //menampilkan output
            System.out.print("indeks ke-" + i + ": ");
            //meminta masukkan keyboard dan menyimpannya pada array indeks ke i
            kota[i] = masukan.nextLine();
        }
        
        //menampilkan output
        System.out.println("-----------------------");
        
        //perulangan menampilkan isi array kota
        for(String b: kota){
            //menampilkan output
            System.out.println(b);
        }
    }
}
