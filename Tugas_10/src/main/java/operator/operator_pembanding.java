package operator;
public class operator_pembanding {
    public static void main(String[] args){
        //Deklarasi variabel nilaiA dengan tipe data integer dan nilainya 5
        int nilaiA = 5;
        //Deklarasi variabel nilaiB dengan tipe data integer dan nilainya 10
        int nilaiB = 10;
        
        //Deklarasi variabel
        boolean lebihBesar, lebihKecil, samaDengan, tidakSamaDengan, lebihBesarSamaDengan,
                lebihKecilSamaDengan;
        
        //Membandingkan apakah nilaiA lebih besar dari nilaiB
        lebihBesar = nilaiA > nilaiB;
        //Membandingkan apakah nilaiA lebih kecil dari nilaiB
        lebihKecil = nilaiA < nilaiB;
        //Membandingkan apakah nilaiA sama dengan nilaiB
        samaDengan = nilaiA == nilaiB;
        //Membandingkan apakah nilaiA tidak sama dengan nilaiB
        tidakSamaDengan = nilaiA != nilaiB;
        //Membandingkan apakah nilaiA lebih besar sama dengan nilaiB
        lebihBesarSamaDengan = nilaiA >= nilaiB;
        //Membandingkan apakah nilaiA lebih kecil sama dengan nilaiB
        lebihKecilSamaDengan = nilaiA <= nilaiB;
        
        //Menampilkan apa yang sudah disimpan di variabel
        System.out.println("nilaiA > nilaiB = " + lebihBesar);
        System.out.println("nilaiA < nilaiB = " + lebihKecil);
        System.out.println("nilaiA == nilaiB = " + samaDengan);
        System.out.println("nilaiA != nilaiB = " + tidakSamaDengan);
        System.out.println("nilaiA >= nilaiB = " + lebihBesarSamaDengan);
        System.out.println("nilaiA <= nilaiB = " + lebihKecilSamaDengan);
    }
}
