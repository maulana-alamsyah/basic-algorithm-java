package array;
public class nomor4 {
    public static void main(String[] args){
        //membuat array multidimensi dengan tipe data string
        String[] [] multidimensi = {{"Susanti", "90", "A"}, {"Budi", "80", "B"}};
        
        //perulangan untuk baris
        for(int i = 0; i < multidimensi.length; i++){
            //perulangan untuk kolom
            for(int j = 0; j < multidimensi[i].length; j++){
                //menampilkan output baris dan kolom
                System.out.println(multidimensi[i][j]);
            }
            //menampilkan output
            System.out.println("-------------------");
        }
    }
}
