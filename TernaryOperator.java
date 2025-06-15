// ternary operator adalah operator sederhana dari if statement
// ternary operator terdiri dari kondisi yang di evaluasi jika mengasilkan true maka nilai pertama di ambil,jika false maka nilai kedua di ambil

public class TernaryOperator {
    public static void main(String[] args) {
        // tanpa ternary operator
        var nilai = 80;
        
        if (nilai >= 75) {
            System.out.println("Anda lulus");
        } else {
            System.out.println("Anda tidak lulus");
        }


        // tanpa ternary operator
        var nilai2 = 40;
        String Ucapan;

        if (nilai2 >= 75) {
           Ucapan = "Selamat Anda Lulus";
        } else {
           Ucapan = "Maaf Anda Tidak Lulus";
        }
        System.out.println(Ucapan);


        // dengan ternary operator
        var nilai3 = 80;
        String ucapan = nilai3 >= 78 ? "selamat anda lulus" : "anda gagal";

        System.out.println(ucapan);
    }
}
