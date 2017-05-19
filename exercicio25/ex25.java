package exercicio25;

public class ex25 {

    public static void main(String[] args) {
        System.out.println(calcuarResultado(5, 5));
        System.out.println(calcuarResultado(1, 8));
        System.out.println(calcuarResultado(10, 10));
        System.out.println(calcuarResultado(5, 8));
        System.out.println(calcuarResultado(4, 10));
    }

    public static String calcuarResultado(double nota1, double nota2) {
        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
            return "Uma das notas está inválida!";
        }
        double media = (nota1 + nota2) / 2;
        if (media <= 3) {
            return "Deu ruim, precisa estudar MUITO mais!";
        } else {
            if (media <= 5) {
                return "Super mediano";
            } else {
                if (media <= 7) {
                    return "Bom aluno";
                } else {
                    if (media <= 9) {
                        return "Aluno muito bom";
                    } else {
                        return "Aluno fora de série";
                    }
                }
            }
        }
    }
}
