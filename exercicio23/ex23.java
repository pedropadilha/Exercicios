package exercicio23;

public class ex23 {

    public static void main(String[] args) {
        System.out.println(somar(1, 2));
        System.out.println(somar(34345676, 87587));
        System.out.println(somar(346, 430958));
        System.out.println(dividir(1234, 321));
        System.out.println(dividir(76543456, 0));
        System.out.println(dividir(987654321, 123456789));
    }

    public static double somar(double d1, double d2) {
        return d1 + d2;
    }

    public static double dividir(double d1, double d2) {
        if (d2 == 0) {
            return 0;
        }
        return d1 / d2;
    }
}
