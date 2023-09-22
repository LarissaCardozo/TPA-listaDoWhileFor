package tpaExercicios;
import java.util.Scanner;
import java.util.Scanner;

public class calculoIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anoAtual;
        int anoNascimento;
        int idade;
        int idadeMaisVelho = -1;
        int idadeMaisNovo = -1;

        System.out.print("Digite o ano atual: ");
        anoAtual = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o ano de nascimento do usuário " + i + ": ");
            anoNascimento = scanner.nextInt();
            
            idade = anoAtual - anoNascimento;
            System.out.println("A idade do usuário " + i + " é: " + idade + " anos");

            if (idadeMaisVelho == -1 || idade > idadeMaisVelho) {
                idadeMaisVelho = idade;
            }
            else if (idadeMaisNovo == -1 || idade < idadeMaisNovo) {
                idadeMaisNovo = idade;
            }
        }
        System.out.println("A idade do mais velho é: " + idadeMaisVelho + " anos");
        System.out.println("A idade do mais novo é: " + idadeMaisNovo + " anos");

        scanner.close();
    }
}
