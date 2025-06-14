// - Tipe data String adalah tipe data yang berisikan data kumpulan karakter atau sederhananya
// text

// - di java tipe data string di represitasikan dengan kata kunci string

// - untuk membuat  string di java kita menggunakan karakter("") seblum dan setelah textnya

// - untuk nilai default nya di java ialah untuk string adalah Null

public class TipeDataStriing {
    public static void main(String[] args) {

        String FirstName = "Carles";
        String LastName = "Marvin";

        System.out.println(FirstName);
        System.out.println(LastName);

//      menggabungkan String
        String FullName = FirstName + " " + LastName;
        System.out.println(FullName);
    }
}
