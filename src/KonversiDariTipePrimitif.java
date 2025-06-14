// Tipe data non-primitif punya method seperti shortValue(), longValue(), dll.
package Belajar.Java.Dasar.src;

public class KonversiDariTipePrimitif {
    public static void main(String[] args) {
        int iniInt = 100;

        // Autoboxing: konversi otomatis dari int ke Integer
        Integer iniObject = iniInt;

        // Menggunakan method-method dari class Integer
        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        // Wrapper class Long juga punya method konversi
        Long amount = 100_000L;
        short s = amount.shortValue();
        int i = amount.intValue();
        float f = amount.floatValue();

        // Cetak hasil
        System.out.println("Integer object: " + iniObject);
        System.out.println("Short from Integer: " + iniShort);
        System.out.println("Long from Integer: " + iniLong2);
        System.out.println("Float from Integer: " + iniFloat);
        System.out.println("Short from Long: " + s);
        System.out.println("Int from Long: " + i);
        System.out.println("Float from Long: " + f);
    }
}
