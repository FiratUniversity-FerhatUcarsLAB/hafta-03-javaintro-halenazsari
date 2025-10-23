package gorev3geometrikhesaplamalar;

public class DikdortgenHesap {
    public static void main(String[] args) {
        double uzunluk = 7.0 ;
        double genislik = 4.0 ;

        // Alan Hesaplama
        double alan = uzunluk * genislik ;

        // Cevre Hesaplama
        double cevre = 2 * (uzunluk + genislik) ;

        // Sonuclari Yazdirma
        System.out.println("Uzunluk: " + uzunluk);
        System.out.println("Genislik: " + genislik);
        System.out.println("Dikdortgenin Alani: " + alan);
        System.out.println("Dikdortgenin Cevresi: " + cevre);
    }
    
}
