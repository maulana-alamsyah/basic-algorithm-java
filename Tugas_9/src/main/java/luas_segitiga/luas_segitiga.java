package luas_segitiga;
public class luas_segitiga {
    public static void main(String[] args){
        //Deklarasi variabel alas, tinggi, dan luas dengan tipe data integer
        int alas, tinggi, luas;

        alas = 10; //memberi nilai 10 pada variabel alas
        tinggi = 20; //memberi nilai 20 pada variabel tinggi
        
        //menghitung alas * tinggi / 2 dan menyimpannya pada variabel luas
        luas = alas * tinggi / 2;
        
        //mencetak string dan isi dari variabel luas
        System.out.println("Luas Segitiga sama dengan " + luas);
    }
}
