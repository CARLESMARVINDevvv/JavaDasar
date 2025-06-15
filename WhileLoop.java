// While loop adalah versi perulangan yang lebih sederhana dibandingkan for loop
// Di while loop hanya terdapat kondisi perulangan tanpa adanya inning statement dan post statement

public class WhileLoop {
    public static void main(String[] args) {

        var counter = 1;

        while( counter <= 15) {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        }
    }
}
