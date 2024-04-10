import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cesar cifraCesar = new Cesar();
        Morse morse = new Morse();

        System.out.println("Bem-vindo! Escolha o tipo de criptografia:");
        System.out.println("1 - Cifra de César");
        System.out.println("2 - Código Morse");
        int escolhaCriptografia = input.nextInt();

        input.nextLine(); // Consumir a nova linha

        System.out.println("Escolha a operação:");
        System.out.println("1 - Criptografar");
        System.out.println("2 - Descriptografar");
        int escolhaOperacao = input.nextInt();

        input.nextLine(); // Consumir a nova linha

        if (escolhaCriptografia == 1) {
            System.out.println("Digite o texto:");
            String texto = input.nextLine().toLowerCase();
            if (escolhaOperacao == 1) {
                cifraCesar.criptografa(texto);
            } else if (escolhaOperacao == 2) {
                cifraCesar.descriptografa(texto);
            }
        } else if (escolhaCriptografia == 2) {
            System.out.println("Digite o texto:");
            String texto = input.nextLine().toLowerCase();
            if (escolhaOperacao == 1) {
                morse.criptografa(texto);
            } else if (escolhaOperacao == 2) {
                morse.descriptografa(texto);
            }
        } else {
            System.out.println("Escolha de criptografia inválida.");
        }

        input.close();
    }
}
