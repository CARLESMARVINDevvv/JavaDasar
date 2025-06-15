import java.util.Date;
public class ExpressionStatementdanBlock {
    public static void main(String[] args) {
        // expression 
        // expression adalah kontruksi dari variable,operator dan pemanggilan method yg mengevaluasi menjadi sebuah single value
        //  expression adalah core component dari statement
        int a = 10;
        int Value = 100;
        System.out.println(Value = 200);
        System.out.println(a + Value);

        // Statement
        // statement bisa dibilang adalah kalimat lengkap dalam bahasa.
        // sebuah statement berisikan execution komplit biasanya diakhiri dengan titik koma
        // ad beberapa jenis statement dalam java
        //  - assignment statement
        //  - penggunaan ++ dan --
        //  - method invocation 
        //  - object creation statement

        // assignment statement
        double aValue = 8933.234;
        // increment statement
        aValue++;
        // method invocation statement
        System.out.println("Hello World");
        // object creation statement
        Date date = new Date();

        // block
        // block adala kumpulan statement yg terdiri dari nol atau lebih statement
        // block diawali dan di akhiri dengan kurung kurawal{}

        
    }
}
