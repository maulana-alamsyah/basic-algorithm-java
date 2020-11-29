package operator;
public class operator_aritmatika {
    public static void main(String[] args){
        int a = 2; //Deklarasi variabel a dengan tipe data integer dan nilainya 2
        int b = 1; //Deklarasi variabel b dengan tipe data integer dan nilainya 1
        
        //Deklarasi variabel tambah, kurang, kali, bagi, sisaBagi
        int tambah, kurang, kali, bagi, sisaBagi;
        
        tambah = a + b; //menghitung a+b dan menyimpannya pada variabel tambah
        kurang = a - b; //menghitung a-b dan menyimpannya pada variabel kurang
        kali = a * b; //menghitung a*b dan menyimpannya pada variabel kali
        bagi = a / b; //menghitung a/b dan menyimpannya pada variabel bagi
        sisaBagi = a % b; //menghitung a%b dan menyimpannya pada variabel sisaBagi
        
        //menampilkan apa yang sudah disimpan di variabel
        System.out.println("a + b = " + tambah);
        System.out.println("a - b = " + kurang);
        System.out.println("a * b = " + kali);
        System.out.println("a / b = " + bagi);
        System.out.println("a % b = " + sisaBagi);
    }
}
