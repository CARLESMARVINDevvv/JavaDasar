//Tipe data primitif adalah tipe bawaan di dalam bahasa pemrograman. Tipe data primitif tidak bisa diubah lagi.
//Tipe data number, char, boolean adalah tipe data primitif. Tipe data primitif memiliki default value.
//Tipe data String bukan tipe data primitif, tipe data bukan primitif tidak memiliki default value dan bisa bernilai null.
//Tipe data bukan primitif bisa memiliki method/function
//Di Java, semua tipe data primitif memiliki representasi tipe data bukan primitifnya.
//Representasi Tipe Data Primitif
//Tipe Data Primitif:(default valuenya 0)
//byte
//short
//int
//long
//float
//double
//char
//boollean

//Tipe Data Bukan Primitif(default valuenya nul)/(Object)
//Byte
//Short
//Integer
//Long
//Float
//Double
//Character
//Boolean


public class TipeDataBukanPrimitif {
    public static void main(String[] args) {


        Integer iniInteger = 100;
        Long iniLong = 1000L;

        Byte iniByte = null;
//        iniByte = 100;

        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

//      konfersi otomatis
        int iniInt = 100;
        Integer iniInteger2 = iniInt;
    }
}
