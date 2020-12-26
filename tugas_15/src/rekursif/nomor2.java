package rekursif;
public class nomor2 {
    //membuat fungsi fibonacci dengan parameter x tipe data integer
    static int fibonacci(int x){
        if(x == 0 || x ==1){
            //kondisi apabila x = 0 atau x = 1 maka akan mereturn nilai x
            return x;
        }else{
            //kondisi apabila x selain 0 atau 1 maka akan menghitung dan memanggil 
            //fungsi fibonacci
            return (fibonacci(x-1)+fibonacci(x-2));
        }
    }
    public static void main(String[] args){
        //membuat variabel x dengan tipe data integer
        int x = 0;
        //perulangan
        for(int i=0; i<=10; i++){
            //menampilkan output dan memanggil fungsi fibonacci
            System.out.print(fibonacci(x)+", ");
            //increment variabel x
            x++;
        }
    }
}
