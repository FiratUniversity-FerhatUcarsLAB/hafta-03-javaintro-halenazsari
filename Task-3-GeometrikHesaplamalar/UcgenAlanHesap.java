package gorev3geometrikhesaplamalar;

public class UcgenHesap {
    public static void main(String[] args) {
        double a = 3.0 ;
        double b = 4.0 ;
        double c = 5.0 ;
        double s = (a + b + c) / 2 ;
        // Alan Hesaplama (Heron Formulu)
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c)) ;
        System.out.println("Ucgenin Alani: " + alan);

    
}
}
