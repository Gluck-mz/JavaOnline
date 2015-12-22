public class Conversion {
    public static void main(String[] args){

        double t1;
        double t2;

        Celsius celsius = new Celsius(36.6d);
        Fahrenheit fahrenheit = new Fahrenheit(100f);

        t1 = celsius.getTemperatureCel() * (9/5) + 32;
        t2 = (fahrenheit.getTemperatureFahr() - 32) * (5/9);

        System.out.println("36.6 Celsius in Fahrenheit = " + t1);
        System.out.println();
        System.out.println("100 Fahrenheit in Celsius = " + t2);
    }
}
