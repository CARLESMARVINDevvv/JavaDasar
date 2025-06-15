public class SwitchLamda {
    public static void main(String[] args) {
        // Switch statement dengan lambda expression
        // Switch statement ini digunakan untuk memilih salah satu dari beberapa blok kode yang akan dieksekusi
        // Berdasarkan nilai dari sebuah variabel atau ekspresi dan lebih di simpelkan di bandingkan switch case biasa

        var nilai = "70";

        switch (nilai) {
            case "90" -> System.out.println("Anda mendapatkan nilai A");
            case "80" -> System.out.println("Anda mendapatkan nilai B");
            case "70" -> System.out.println("Anda mendapatkan nilai C");
            default   -> System.out.println("anda tidak lulus");
        }
    }
}
