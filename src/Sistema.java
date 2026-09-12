public class Sistema {
    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double primeiraNota = 8;
        double segundaNota = 7;

        double media = calcularMedia(primeiraNota, segundaNota);
        String situacao = verificaSituacaoAluno(media);
        
        mostrarResultado(nomeAluno, media, situacao);
    }

    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public static String verificaSituacaoAluno(double media) {
        if (media >= 6) {
            return "Aprovado";
        }

        return "Reprovado";
    }

    public static void mostrarResultado(String nomeAluno, double media, String situacao) {
        System.out.println("Aluno: " + nomeAluno + "\nMedia: " + media + "\nSituacao: " + situacao);
    }
}