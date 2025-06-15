
public class ForEach {

    public static void main(String[] args) {
        String[] array = {
            "Eko", "Kurniawan", "Khannedy",
            "Programmer", "Zaman", "Now"
        };


        // Menggunakan Foreach
        for (String value : array) {
            System.out.println(value);
        }
        System.out.println("=====================================");

        // tanpa Foreach
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
