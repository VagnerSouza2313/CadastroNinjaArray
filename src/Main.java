import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ninjas = 0;
        String[] ninjasCadastrados = null;
        char opc;

        do {
            System.out.println("=====SISTEMA CADASTRO DE NINJAS=====");
            System.out.println("(C)adastrar\n(V)er Cadastrados\n(S)air");
            opc = Character.toUpperCase(scanner.next().charAt(0));

            switch (opc) {

                case 'C':
                    System.out.println("Quantos ninjas deseja cadastrar: ");
                    ninjas = scanner.nextInt();
                    scanner.nextLine(); // limpar enter

                    ninjasCadastrados = new String[ninjas];

                    for (int i = 0; i < ninjas; i++) {
                        System.out.print("Digite o nome do ninja " + (i + 1) + ": ");
                        ninjasCadastrados[i] = scanner.nextLine();
                    }
                    break;

                case 'V':
                    if (ninjasCadastrados == null) {
                        System.out.println("Nenhum ninja cadastrado ainda!");
                    } else {
                        System.out.println("=====LISTA DE CADASTRADOS=====");
                        for (int i = 0; i < ninjas; i++) {
                            System.out.println(ninjasCadastrados[i]);
                        }
                    }
                    break;

                case 'S':
                    System.out.println("SAINDO...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opc != 'S');

        scanner.close();
    }
}
