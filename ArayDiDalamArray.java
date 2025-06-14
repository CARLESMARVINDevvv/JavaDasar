// Array 2 dimensi
public class ArayDiDalamArray {
    public static void main(String[] args) {
        String[][] group = {
            {"Budi", "Siti", "Joko"},
            {"Ani", "Dewi", "Rudi"},
            {"Tono", "Sari", "Beni"}
        };

        System.out.println(group[0][1]); // siti
        System.out.println(group[1][2]); // Rudi
        System.out.println(group[2][0]); // Tono


        // lebih gampangnya pake for-each
        // int i = 1;
        // for (String[] grup : group) {
        //     System.out.println("Group " + i + ":");
        //     for (String nama : grup) {
        //         System.out.println(" - " + nama);
        //     }
        //     System.out.println(); // baris kosong antar grup
        //     i++;
        // }
    }
}

