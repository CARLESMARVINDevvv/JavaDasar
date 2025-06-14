// lebih ringkasnya/Mempersingkat dalam operasi matematila sama spseri operasi matematika umumnya 
// contoh seperti ini
// Tentu, ini dia:
// a = a + 10 ->  a += 10 (dalam bentuk Augmented Assignment)

// a = a - 10 ->  a -= 10

// a = a * 10 ->  a *= 10

// a = a / 10 ->  a /= 10

// a = a % 10 ->  a %= 10

public class AugmentedAssigments {
    public static void main(String[] args) {
        // contoh
        int a = 10;

        // Augmented Assignment
        a += 10; // sama dengan a = a + 10
        System.out.println("Hasil a += 10: " + a); // 20

        a -= 5; // sama dengan a = a - 5
        System.out.println("Hasil a -= 5: " + a); // 15

        a *= 2; // sama dengan a = a * 2
        System.out.println("Hasil a *= 2: " + a); // 30

        a /= 3; // sama dengan a = a / 3
        System.out.println("Hasil a /= 3: " + a); // 10


        a %= 4; // sama dengan a = a % 4
        System.out.println("Hasil a %= 4: " + a); // 2
    }
}
