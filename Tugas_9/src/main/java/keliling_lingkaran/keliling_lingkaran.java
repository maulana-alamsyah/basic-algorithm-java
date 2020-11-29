package keliling_lingkaran;
public class keliling_lingkaran {
    public static void main(String[] args){
        int r; //Deklarasi variabel r dengan tipe data integer
        double phi, keliling; //Deklarasi variabel phi dan keliling dengan tipe data double
        
        r = 50; //memberi nilai 50 pada variabel r
        phi = 3.14; //memberi nilai 3.14 pada variabel phi
        
        //menghitung 2 x phi x r dan menyimpannya pada variabel keliling
        keliling = 2 * phi * r;
        
        //mencetak string dan mengubah tipe data variabel keliling menjadi integer kemudian mencetaknya
        System.out.println("Keliling Lingkaran sama dengan " + (int)keliling);
    }
}
