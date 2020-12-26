package array;
public class nomor2 {
    public static void main(String[] args){
        //membuat array dengan tipe data string
        String[] karyawan = {"Arya", "Beni", "Charlie", "Donald", "Erlan", "Fera", 
            "Gerry", "Hilman", "Inne", "Jalu", "Keano", "Liam", "Mark", "Nana", "Odsen"};
        
        //melakukan perulangan sebanyak jumlah dari isi variabel karyawan
        for(int i = 0; i < karyawan.length; i++){
            //menampilkan output, mengambil indeks array menggunakan variabel i
            System.out.println("Indeks ke " + i + " = " + karyawan[i]);
        }
    }
}
