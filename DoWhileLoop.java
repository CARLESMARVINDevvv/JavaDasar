// Do while loop adalah perulangan yang mirip dengan whlile
// Perbedaannya hanya pada pengecekan kondisi
// Pengecekan kondisi di while loop dilakukan di awal sebelum perulangan dilakukan sedangkan di do while lop dilakukan setelah perulangan dilakukan
// Oleh karena itu dalam do whileloop 
// minimal pasti sekali perolehan dilakukan walaupun kondisi tidak bernilai true

public class DoWhileLoop {
    public static void main(String[] args) {
        var counter = 1000;
        do {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        } while (counter <= 10);
    }
}
