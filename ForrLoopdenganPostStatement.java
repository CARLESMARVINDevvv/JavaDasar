public class ForrLoopdenganPostStatement {
    public static void main(String[] args) {
        // for dengan post statement
        for (var counter = 1; counter <= 10; counter++) {
            System.out.println("Perulangan ke-" + counter);
        }
        // Perulangan dengan post statement ini akan mengeksekusi statement increment di akhir setiap iterasi
        // Sehingga nilai counter akan bertambah setelah setiap iterasi selesai
    }
}
