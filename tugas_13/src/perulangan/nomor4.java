package perulangan;
public class nomor4 {
    public static void main(String[] args){
        //perulangan for untuk banyak baris 
        for(int x = 1; x <= 6; x++){
            //menampilkan output
            System.out.println("");
            //perulangan for untuk banyak kolom sebanyak nilai x
            for(int y = 1; y <= x; y++){
                //menampilkan output
                System.out.print("* ");
            }
        }
    }
}
