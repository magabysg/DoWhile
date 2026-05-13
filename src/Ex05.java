import java.util.Scanner;

public class Ex05 {

    void main(){
        Scanner sc = new Scanner(System.in);

        int escolha;
        int menu1 = 1, menu2 = 2, menu3 = 3;
        do {
            IO.println("\nEscolha entre as opções abaixo do nosso menu: ");
            IO.println("------MENU------" + "\n1- Olá!!" + "\n2- Blabluble" + "\n3- Sair");
            escolha = sc.nextInt();

            if (escolha == menu1) {
                IO.println("Olá galerinha!!!");

            } else if (escolha == menu2) {
                IO.println("Mensagem secreta..............Blabluble!!!!");

            } else if (escolha == menu3) {
                IO.println("Menu finalizado.");

            } else {
                IO.println("Digite o número correto de cada opção.");
            }
        } while (escolha != menu3);
    }
}