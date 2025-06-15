// For adalah salah satu kunci yang bisa digunakan untuk melakukan perulangan
// Blok kode yang terdapat di dalam fork akan selalu diulang selama kondisi for terpenuhi

// Sintaks perulangan For:
// for(init statement; kondisil post statement) {
// block perluangan
// }

// Init statement akan dieksekusi hanya sekali di awal sebelum perulangan
// Kondisi akan dilakukan pengecekan dalam setiap perulangan jika truk perulangan akan dilakukan jika false kekurangan akan berhenti
// Post statement akan eksekusi setiap kali di akhir perulangan
// Init statement kondisi dan pos statement tidak wajib diisi jika kondisi tidak diisi berarti kondisi selalu bernilai true 
public class ForLoop {
    public static void main(String[] args) {
        // foor loop g berenti
        //     for(;;) {
        //         System.out.println("perulangan");
        //     }
        // }

        // for dengan kondisi
        var counter = 1;
         for (; counter <= 12;) {
            System.out.println("Perulangan " + counter);
            counter++;
        }
    }
}