package Belajar Java Dasar.src;

public class ArrayInitializer {
    public static void main(String[] args) {
         String[] arrayString;
        // inisialisasi array
        arrayString = new String[4];
        // mengisi array
        arrayString[0] = "Carles";
        arrayString[1] = "Marvin";
        arrayString[2] = "Siregar";
        arrayString[3] = "Progammer";
        // mencetak array
        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);
        System.out.println(arrayString[3]);
        // mencetak panjang array
        System.out.println("Panjang array: " + arrayString.length);

        // kalo mau di persingkat
        String[] namaNama = {
            "Carles",
            "Marvin",
            "Siregar",
            "Progammer"
        };

        // atau
        int[] arrayInt  = new int[] {
            1, 2, 3, 4, 5
        };

        // atau
        long[] arrayLong = { 
            10L, 20L, 30L
        };
    }
}
