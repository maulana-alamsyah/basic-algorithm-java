package rekursif;
//mengimpor scanner ke program
import java.util.Scanner;
public class nomor1 {
    //membuat fungsi faktorial dengan parameter angka
    static int faktorial(int angka){
        if(angka == 1){
            //kondisi ketika angka == 1
            return 1;
        }else{
            //kondisi ketika angka selain 1
            //akan menghitung angka dikali fungsi faktorial dengan parameter
            //angka dikurangi 1
            return angka * faktorial(angka -1);
        }
    }
    public static void main(String[] args){
        //membuat objek scanner
        Scanner masukan = new Scanner(System.in);
        
        //menampilkan output
        System.out.print("Masukkan angka => ");
        //meminta masukan keyboard dan menyimpannya pada variabel angka
        int angka = masukan.nextInt();
        
        //menampilkan output dan memanggil fungsi faktorial
        System.out.print("Hasil faktorial = " + faktorial(angka) + "\n");
    }
}
