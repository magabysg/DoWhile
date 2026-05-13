import java.util.Scanner;

public class Ex06 {

    void main(){
        Scanner sc = new Scanner(System.in);

        int opção1 = 1, opção2 = 2, opção3 = 3, opção4 = 4, opção5 = 5;
        int escolha;

        do {
            IO.println("\nDigite dois numeros e escolha a operação desejada: ");
            int numero1 = sc.nextInt(), numero2 = sc.nextInt();

            IO.println("1- Somar" + "\n2- Subtrair" + "\n3- Multiplicar" + "\n4- Dividir" + "\n5- Sair");
            escolha = sc.nextInt();

            if (escolha == opção1) {
                int soma = numero1 + numero2;
                IO.println("Resultado: " + numero1 + " + " + numero2 + " = " + soma);

            } else if (escolha == opção2) {
                int sub = numero1 - numero2;
                IO.println("Resultado: " + numero1 + " - " + numero2 + " = " + sub);

            } else if (escolha == opção3) {
                int mult = numero1 * numero2;
                IO.println("Resultado: " + numero1 + " x " + numero2 + " = " + mult);

            } else if (escolha == opção4) {
                int dividir = numero1 / numero2;
                IO.println("Resultado: " + numero1 + " / " + numero2 + " = " + dividir);

            } else {
                IO.println("Operação/operações finalizada(s).");
            }
        } while (escolha != opção5);
    }
}