import java.util.Scanner;

public class Ex03 {

    void main(){
        Scanner sc = new Scanner(System.in);

        int digite = 0;
        int soma = 0;

        do {
            IO.println("Digite um numero: ");
            soma = sc.nextInt();

            digite = digite + soma;

        } while (soma != 0);
        IO.println(digite);
    }
}
