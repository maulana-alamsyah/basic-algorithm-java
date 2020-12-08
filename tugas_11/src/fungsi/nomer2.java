package fungsi;
public class nomer2 {
    //membuat fungsi luasPP dengan parameter p dan l tipe data integer
    static int luasPP(int p, int l){
        //menghitung luas
        int luas = p * l;
        //mengembalikan nilai luas
        return luas;
    }
    
    //fungsi utama saat program dijalankan
    public static void main(String[] args){
        //deklarasi variabel
        int p1, l1, p2, l2, luas1, luas2;
        
        //memberi nilai pada variabel
        p1 = 5;
        l1 = 10;
        p2= 100;
        l2= 50;
        
        //memanggil fungsi dan disimpan pada variabel
        luas1 = luasPP(p1, l1);
        luas2 = luasPP(p2, l2);
        
        //menampilkan apa yang sudah disimpan divariabel
        System.out.println("Luas Persegi Panjang = " + luas1);
        System.out.println("Luas Persegi Panjang ke-2 = " + luas2);
    }
}
