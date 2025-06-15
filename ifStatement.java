// dalam java if adalah salah satu kunci yg digunakan untuk membuat percabangan
// percabangan artinya kita bisa mengksekusi kode progam tertentu ketika suatu kondisi terpenuhi
// hampir di smua bahasa pemrograman ada konsep if ini
public class ifStatement {
    public static void main(String[] args) {
        var nilaiAkhir = 55;


        if (nilaiAkhir >= 75) {
            System.out.println("Selamat Anda Lulus");
        } else if (nilaiAkhir >= 60) {
            System.out.println("Anda Harus Remedial"); {}
        } else if (nilaiAkhir >= 50) {
            System.out.println("Anda Harus Mengulang");
        } else {
            System.out.println("Maaf Anda Tidak Lulus");
        }
    }
}
