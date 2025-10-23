package JavaLab3.gorev5ciktiformatlari;

public class CarpimTablosu {
    public static void main(String[] args) {
        
        int carpilacakSayi = 2;

        System.out.println("-------------------------");
        System.out.printf("| %-20s |\n", carpilacakSayi + "'nin Çarpım Tablosu");
        System.out.println("-------------------------");
        System.out.printf("| %-5s | %-10s |\n", "İşlem", "Sonuç");
        System.out.println("-------------------------");

        
        for (int i = 1; i <= 10; i++) {
            
            int sonuc = carpilacakSayi * i;

            
            String islemMetni = carpilacakSayi + " x " + i;

            
            System.out.printf("| %-5s | %-10d |\n", islemMetni, sonuc);
        }

        
        System.out.println("-------------------------");
    }
}
}
