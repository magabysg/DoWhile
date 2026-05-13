import java.util.Scanner;

public class Ex08 {

    void main(){
        Scanner sc = new Scanner(System.in);

        String nomes, sair = "Sair";
        int contador = 0;
        do {
        IO.println("Digite um nome e para sair digite sair: ");
        nomes = sc.nextLine();
        contador++;

        if (nomes == sair){
            IO.println("Finalizado.");
        }

        } while (nomes != sair);
    }
}
