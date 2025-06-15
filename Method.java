public class Method {

    public static void main(String[] args) {
        // Memanggil method tanpa parameter
        sayHello();

        // Memanggil method dengan parameter
        sayHello("Eko");
        sayHello("Budi", "Siti");

        // Memanggil method dengan return value
        var result = sum(10, 20);
        System.out.println("Hasil penjumlahan: " + result);
    }

    // Method tanpa parameter
    static void sayHello() {
        System.out.println("Halo, selamat datang!");
    }

    // Method dengan satu parameter
    static void sayHello(String name) {
        System.out.println("Halo " + name);
    }

    // Method dengan dua parameter
    static void sayHello(String name1, String name2) {
        System.out.println("Halo " + name1 + " dan " + name2);
    }

    // Method dengan return value
    static int sum(int a, int b) {
        return a + b;
    }
}
