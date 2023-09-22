package tpaExercicios;

public class numerosPares {
    public static void main(String[] args) {
        int numero = 0;

        System.out.println("Esses são os números pares de 0 a 500:");

        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        } while (numero <= 500);
    }
}

