import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Faça um Programa que peça as 4 notas bimestrais e mostre a média.

        Scanner scanner = new Scanner(System.in);
 
        double primeiraNotaAluno, segundaNotaAluno, terceiraNotaAluno, quartaNotaAluno, mediaNotasAluno;

        System.out.println("Informe a primeira nota: ");
        primeiraNotaAluno = scanner.nextDouble();

        System.out.println("Informe a segunda nota: ");
        segundaNotaAluno = scanner.nextDouble();

        System.out.println("Informe a terceira nota: ");
        terceiraNotaAluno = scanner.nextDouble();

        System.out.println("Informe a quarta nota: ");
        quartaNotaAluno = scanner.nextDouble();

        mediaNotasAluno = (primeiraNotaAluno + segundaNotaAluno + terceiraNotaAluno + quartaNotaAluno) / 4;

        System.out.println("A média das notas do aluno é " + mediaNotasAluno);
    }
}
