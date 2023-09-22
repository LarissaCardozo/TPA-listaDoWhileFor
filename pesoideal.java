package tpaExercicios;
import java.util.Scanner;

public class pesoideal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite o sexo, M para masculino, F para feminino: ");
            char sexo = scanner.next().charAt(0);
            System.out.print("Digite o peso em kg: ");
            double peso = scanner.nextDouble();
            System.out.print("Digite a altura em cm: ");
            double altura = scanner.nextDouble();
            
            if (sexo == 'M') {
                double pesoIdeal = 52 + (0.75 * (altura - 152.4));
                System.out.println("O peso ideal é: " + pesoIdeal + " kg");
            } else if (sexo == 'F') {
                double pesoIdeal = 52 + (0.67 * (altura - 152.4));
                System.out.println("O peso ideal é: " + pesoIdeal + " kg");
            } else {
                System.out.println("Opção inválida");
            }

            System.out.print("Deseja continuar a execução? (1- para SIM  ou 2- para NAO): ");
            continuar = scanner.next().charAt(0);

        } while (continuar == '1');
        
        System.out.println("Programa encerrado");
        scanner.close();
    }
}

