// Beberapa operasi boolean dalam Java
//  &&(AND) = Dan
//  ||(OR) = Atau
//  !(NOT) = Bukan


// Operasi &&
// Nilai 1      operator  Nilai 2      Hasil
// true         &&        true         true
// true         &&        false        false
// false        &&        true         false
// false        &&        false        false

// Operasi ||
// Nilai 1      operator  Nilai 2      Hasil
// true         ||        true         true
// true         ||        false        true
// false        ||        true         true
// false        ||        false        false

// Operasi !
// Nilai 1      operator  Hasil
// true         !         false
// false        !         true

public class OperasiBoolean {
    public static void main(String[] args) {

        // Program sederhana untuk operasi boolean
        var nilai = 80;
        var nilaiAkhir = 90;

        boolean lulusNilai = nilai >=  75;
        boolean lulusAkhir = nilaiAkhir <= 75;

        boolean lulus = lulusNilai && lulusAkhir;

        System.out.println("Lulus dari nilai pertama: " + lulusNilai);
        System.out.println("Lulus dari nilai akhir: " + lulusAkhir);
        System.out.println("Lulus keseluruhan: " + lulus);
    }
}


