public class Sistema {
    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double primeiraNota = 8;
        double segundaNota = 7;
        double media = (primeiraNota + segundaNota) / 2;

        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Media: " + media);

        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}