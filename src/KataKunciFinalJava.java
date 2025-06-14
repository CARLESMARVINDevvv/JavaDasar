// Secara default, variable di Java bisa diubah-ubah nilainya.
// Jika kita ingin membuat sebuah variable yang datanya tidak boleh diubah setelah pertama kali dibuat, kita bisa menggunakan kata kunci final.
// Istilah variabel seperti ini, banyak juga yang menyebutnya konstanta.


public class KataKunciFinalJava {
    public static void main(String[] args) {
        final String name = "Carles Marvin";
        var age = 17;
        var adress = "Jl.Bukit Indah";

//    kalo gini eror name = "Nama Di ubah";

        System.out.println(name + " " + age + " " + adress );
    }
}
