import java.util.Scanner;

public class Ex07 {

    void main(){
        Scanner sc = new Scanner(System.in);

        int secreto = 2604, numero;
        do {
            IO.println("\nAdivinhe o numero secreto: ");
            numero = sc.nextInt();

            if (numero != secreto) {
                IO.println("Número secreto errado! Tente novamente.");

            } else {
                IO.println("Você acertou o número secreto!!!");
            }

        } while (numero != secreto);
    }
}
