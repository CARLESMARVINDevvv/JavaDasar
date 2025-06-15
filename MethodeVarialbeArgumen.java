public class MethodeVarialbeArgumen {
    // Tanpa Variable Argumen
    public static void main(String[] args) {

        int[] values = {70, 87, 78, 50, 95};
        sayCongrats("Carles", values);

        sayCongrats("budi", 80, 90, 75, 85, 95);
    }
    
    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValur = total / values.length;

        if( finalValur >= 75) {
            System.out.println("Selamat " + name + ", Anda lulus dengan nilai rata-rata: " + finalValur);
        } else {
            System.out.println("Maaf " + name + ", Anda tidak lulus dengan nilai rata-rata: " + finalValur);
        }
        
    }
}
