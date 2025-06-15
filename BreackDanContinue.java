// pada switch statement kita sudah mengena; kata kunci break yaitu untuk
// memberhentikan case dari switch
//  sama dengan pada perulangan, break juga digunakan untuk memberhentikan perulangan
// namun berbeda dengan continue continue digunankan untuk mengehentikan perulangan saat ini lalu melajnjutkan ke perulangan
// selanjutnya


public class BreackDanContinue {
    public static void main(String[] args) {
        // Break
        var counter = 1;
        while (true) {
            System.out.println("Perulangan ke-" + counter);
            counter++;

            if (counter > 10) {
                // Jika counter lebih dari 10, hentikan perulangan
                break; // Menghentikan perulangan
            }
        }



        // Continue
        for (var i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                // Jika i adalah bilangan genap, lewati iterasi ini
                continue; // Melanjutkan ke iterasi berikutnya
            }
            System.out.println("Bilangan ganjil: " + i);
        }
        
    }
}
