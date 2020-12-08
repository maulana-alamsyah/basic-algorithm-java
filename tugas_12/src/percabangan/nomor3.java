package percabangan;
//mengimpor scanner ke program
import java.util.Scanner;
public class nomor3 {
    public static void main(String[] args){
        //deklarasi variabel
        int nomor;
        //membuat objek scanner
        Scanner masukan = new Scanner(System.in);
        //menampilkan output
        System.out.print("Masukkan nomor => ");
        //menggunakan scanner dan menyimpan apa yang diketik divariabel nomor
        nomor = masukan.nextInt();
        //percabangan switch menggunakana variabel nomor
        switch(nomor){
            case 1:
                //kondisi ketika nilai nomor = 1
                System.out.println("Teknik Informatika");
                break;
            case 2:
                //kondisi ketika nilai nomor = 2
                System.out.println("Teknik Komputer");
                break;
            case 3:
                //kondisi ketika nilai nomor = 3
                System.out.println("Sistem Informasi");
                break;
            case 4:
                //kondisi ketika nilai nomor = 4
                System.out.println("Data Sains");
                break;
            default:
                //kondisi ketika nilai nomor selain 1,2,3,4
                System.out.println("Bukan merupakan jurusan rumpun IT");
                break;
        }
    }
}
