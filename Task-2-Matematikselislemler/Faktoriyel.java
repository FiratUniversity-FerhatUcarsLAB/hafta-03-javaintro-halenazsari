public class Faktoriyel {
    public static void main(String[] args) {
        int sayi = 5;
        int faktoriyel = 1;
        
        for(int i = 1; i <= sayi; i++) {
            faktoriyel = faktoriyel * i;
        }
        
        System.out.println(sayi + "! = " + faktoriyel);
    }
}


    
