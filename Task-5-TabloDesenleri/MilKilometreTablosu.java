package JavaLab3.gorev5ciktiformatlari;

public class DonusumTablosu {
    public static void main(String[] args) {
        
        final double MIL_TO_KM = 1.609;

        int[] milDegerleri = {1, 5, 10, 20, 50};

        System.out.println("------------------------------------");
        System.out.printf("| %-10s | %-15s |\n", "Mil", "Kilometre");
        System.out.println("------------------------------------");

        for (int mil : milDegerleri) {
            
            double kilometre = mil * MIL_TO_KM;

            
            System.out.printf("| %-10d | %-15.3f |\n", mil, kilometre);
        }

        System.out.println("------------------------------------");
    }
    
}
