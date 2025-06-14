// array adalah sekumpulan data yang memiliki tipe data yang sama
// jumlah data di array tidak bisa berubah setelah pertama kali di buat
public class Array {
    public static void main(String[] args) {
        // membuat array []

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
        
    }
}
