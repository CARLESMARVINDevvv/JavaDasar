public class TipeDataNumber {
    public static void main(String[] args) {

        // Integer Number
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 10_000_000;
        long iniLong = 1_000_000_000L;

        // Floating Point Number
        float iniFloat = 10.10f;
        double iniDouble = 10.10;

        // Kode Literals
        int decimalInt = 34;
        int hexaDecimal = 0xFFFFFF;   // Hexadecimal literal
        int binaryDecimal = 0b10101010; // Binary literal

        // Kode dengan underscore (mempermudah pembacaan angka besar)
        long amount = 1_000_000_000;

        // Cetak semua nilai ke konsol
        System.out.println("Byte: " + iniByte);
        System.out.println("Short: " + iniShort);
        System.out.println("Int: " + iniInt);
        System.out.println("Long: " + iniLong);
        System.out.println("Float: " + iniFloat);
        System.out.println("Double: " + iniDouble);
        System.out.println("Decimal Int: " + decimalInt);
        System.out.println("Hexa Decimal: " + hexaDecimal);
        System.out.println("Binary Decimal: " + binaryDecimal);
        System.out.println("Amount (with underscore): " + amount);
    }
}
