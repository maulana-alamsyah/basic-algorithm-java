package percabangan;
//mengimpor scanner ke program
import java.util.Scanner;
public class nomor2 {
    public static void main(String[] args){
        //deklarasi variabel
        int r;
        double luasLingkaran;
        
        //membuat objek scanner
        Scanner masukan = new Scanner(System.in);
        
        //menampilkan output
        System.out.print("Masukkan jari jari => ");
        
        //menggunakan scanner dan  menyimpan apa yang diketik di variabel r
        r = masukan.nextInt();
        
        //menghitung luasLingkaran
        luasLingkaran = 3.14 * r * r;
        
        //mencetak string dan mengubah tipe data luasLingkaran menjadi integer dan mencetaknya
        System.out.println("Luas Lingkaran = " + (int)luasLingkaran);
        
        //percabangan
        if(luasLingkaran > 314){
            //kondisi apabila luasLingkaran > 314
            System.out.println("Lingkaran ini besar");
        }else{
            //kondisi apabila luasLingkaran < 314
            System.out.println("Lingkaran ini kecil");
        }
    }
}
