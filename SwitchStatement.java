public class SwitchStatement {
    public static void main(String[] args) {
        // Switch statement adalah salah satu cara untuk membuat percabangan dalam Java
        // Switch statement digunakan untuk memilih salah satu dari beberapa blok kode yang akan dieksekusi
        // Berdasarkan nilai dari sebuah variabel atau ekspresi

        var nilai = "70";

        switch (nilai) {
            case "90":
                System.out.println("Anda mendapatkan nilai A");
                break;
            case "80":
                System.out.println("Anda mendapatkan nilai B");
                break;
            case "70":
                System.out.println("Anda mendapatkan nilai C");
                break;
            default:
                System.out.println("anda tidak lulus");
                break;
        }
    }
    
}
