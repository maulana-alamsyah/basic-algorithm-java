package array;
public class nomor1 {
    public static void main(String[] args){
        //membuat array dengan tipe data string
        String[] mahasiswa = {"Nila", "Jingga", "Reinan", "Odena", "Geanno"};
        //memnbuat array dengan tipe data integer
        int[] nilai = {90, 100, 95, 98, 92};
        
        //mencetak output
        System.out.println("nama ketiga adalah " + mahasiswa[2] + " memiliki nilai " + 
                nilai[2]);
        System.out.println("nama terakhir adalah " + mahasiswa[mahasiswa.length-1] + 
                " memiliki nilai " + nilai[nilai.length-1]);
    }
}
