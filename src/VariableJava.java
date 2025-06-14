// - Variable adalah tempat untuk menyimpan data
// - Java adalah bahasa static type, sehingga sebuah variable hanya bisa digunakan untuk menyimpan tipe data yang sama, tidak bisa berubah-ubah tipe data seperti
// di bahasa pemrograman PHP atau JavaScript
// - Untuk membuat variable di Java kita bisa menggunakan nama tipe data lalu diikuti dengan nama variable nya
// - Nama variable tidak boleh mengandung whitespace (spasi, enter, tab), dan tidak boleh seluruhnya number
public class VariableJava {
    public static void main(String[] args) {

        String name;
        name = "Carles Marvin";

        int age = 17;
        String address = "Indonesia";

        String Fulladrees = name + " " + age + " " + address;

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(Fulladrees);


//       bisa kita ubah jug variable namenya karna java di running dari
//       atas ke bawah contoh

        name = "BudionoSiregar";
        System.out.println(name);
    }
}
