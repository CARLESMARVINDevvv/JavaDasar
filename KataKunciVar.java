// - Sejak versi Java 10, Java membolehkan pembuatan variabel tanpa harus menyebutkan tipe datanya.
// - Namun perlu diingat, saat kita menggunakan kata kunci var untuk membuat variabel, variabel tersebut harus langsung diinisialisasi atau diberi nilai awal.
public class KataKunciVar {
    public static void main(String[] args) {

        var name = "Carles Marvin";
        var age  = 17;
        var adress = "Jl.Bukit Indah No 1";

        System.out.println(name + ", " + age + ", " + adress);



    }
}
