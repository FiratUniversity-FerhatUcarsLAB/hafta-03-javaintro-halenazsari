}package gorev3geometrikhesaplamalar;

public class DaireHesap {
    public static void main(String[] args) {
        double r = 5.5 ;
        double pi = 3.14 ;

        // Alan Hesaplama
        double alan = pi * r * r ;

        // Cevre Hesaplama
        double cevre = 2 * pi * r ;

        // Sonuclari Yazdirma
        System.out.println("Yaricap: " + r);
        System.out.println("Dairenin Alani: " + alan);
        System.out.println("Dairenin Cevresi: " + cevre);
    }


}
