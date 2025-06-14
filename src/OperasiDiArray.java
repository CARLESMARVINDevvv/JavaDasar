
public class OperasiDiArray {
    public static void main(String[] args) {
        long[] arrayLong = { 
            10L, 20L, 30L
        };
        // Kita ubah misal data 10 jadi 40
        arrayLong[0] = 40L;
        // Kita ubah data 20 jadi 50
        arrayLong[1] = 50L;
        // Kita ubah data 30 jadi 60
        arrayLong[2] = 60L;
        // Mencetak semua data di array
        System.out.println("Data di arrayLong setelah diubah:" + arrayLong[0] + ", " + arrayLong[1] + ", " + arrayLong[2]);
        System.out.println("Panjang arrayLong: " + arrayLong.length);
    }
    
}
