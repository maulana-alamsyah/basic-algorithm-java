package fungsi;
public class fungsiparam {
    public static void main(String[] args){
        int luasPer = luasPersegi(6);
        int luasKub = luasKubus(6);
        int luasPer2 = luasPersegi(7);
        int luasKub2 = luasKubus(7);
        
        System.out.println("Luas Persegi = " + luasPer);
        System.out.println("Luas Kubus = " + luasKub);
        System.out.println("Luas Persegi S2 = " + luasPer2);
        System.out.println("Luas Kubus S2 = " + luasKub2);
    }
    
    static int luasPersegi(int sisi){
        int luas = sisi * sisi;
        return luas;
    }
    
    static int luasKubus(int sisi){
        return 6 * luasPersegi(sisi);
    }
}
