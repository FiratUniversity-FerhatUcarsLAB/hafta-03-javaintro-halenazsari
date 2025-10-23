public class IkıIslemSonucu {
    public static void main(String[] args) {
        // Pay Hesaplama
        double pay = (9.5*4.5) - (2.5*3);

        // Payda Hesaplama
        double payda = 45.5 -3.5;

        // Bolme yap
        double sonuc = pay / payda;

        // Formatla ve yazdir
        System.out.printf("%.6f\n", sonuc);
    }
    
}

