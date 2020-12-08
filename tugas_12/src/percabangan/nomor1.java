package percabangan;
//mengimpor scanner ke program
import java.util.Scanner;
public class nomor1 {
    public static void main(String[] args){
        //deklarasi variabel
        int nilai;
        
        //membuat objek scanner
        Scanner masukan = new Scanner(System.in);
        
        //menampilkan output
        System.out.print("Masukkan nilai => ");
        //menggunkana scanner dan menyimpan apa yang diketik ke variabel nilai
        nilai = masukan.nextInt();
        
        //percabangan
        if(nilai < 70){
            //kondisi apabila nilai < 70
            System.out.println("Anda remidi");
        }else{
            //kondisi apabila nilai > 70
            System.out.println("Anda tidak remidi");
        }
    }
}
