import java.util.Scanner;

public class Ex01exemplo {

    void main(){

        Scanner sc = new Scanner(System.in);

        int senha;
        do {
            IO.println("\nDigite a senha corretamente: ");
            senha = sc.nextInt();
            if (senha != 1234){
                IO.println("Senha incorreta! Tente novamente.");
            }
        }
        while (senha != 1234);
            IO.println("Senha correta!!! Celular desbloqueado! ");
    }
}