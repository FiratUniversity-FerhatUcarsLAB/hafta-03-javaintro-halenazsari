package JavaLab3.gorev4metinvestring;

public class HesapOzeti {
    public static void main(String[] args) {

        String[] urunler = {"Ekmek", "Süt", "Yumurta", "Peynir"};
        double[] fiyatlar = {2.5, 3.0, 1.5, 4.0};
        int[] miktarlar = {2, 1, 12, 1};


        System.out.println("---------------------------------------------");
        System.out.printf("| %-15s | %-8s | %-8s |\n", "Ürün", "Miktar", "Fiyat (TL)");
        System.out.println("---------------------------------------------");


        for (int i = 0; i < urunler.length; i++) {
            System.out.printf("| %-15s | %-8d | %-8.2f |\n", urunler[i], miktarlar[i], fiyatlar[i]);
        }
        System.out.println("---------------------------------------------");
    }
}
}
