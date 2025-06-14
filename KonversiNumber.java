//Konfersi tipe data Dengan java:

//Widening Casting(otomatis): byte -> short -> int -> long -> float -> double
//Narrowing Casting(manual) : double -> float -> long -> int -> char -> short -> byte

public class KonversiNumber {
    public static void main(String[] args) {

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        int iniInt2 = 10000;
        byte iniByte2 = (byte) iniInt2;
    }
}
