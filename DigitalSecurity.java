import java.util.Scanner;

public class DigitalSecurity {
    public static void main(String[] args) {
        System.out.println("\n******BEM VINDO, AO CURSO DE SEGURANÇA DIGITAL!******");
        System.out.println("***APRENDEREMOS AS MELHORES PRÁTICAS CONTRA OS HACKERS***");

        int option = -1;
        Scanner sc = new Scanner(System.in);

        while (option != 0) {
            System.out.println("\n**TEMOS OS MELHORES INSTRUTORES PARA TE ENSINAR!**");
            System.out.println("\nDigite: 1 - Chagas Barros (Criação de Senhas Seguras)");
            System.out.println("Digite: 2 - João Pedro (Privacidade na Internet)");
            System.out.println("Digite: 3 - Marcos Vinicios (vai escolher o tema)");
            System.out.println("Digite: 0 - Sair");
            System.out.print("Escolha uma opção: ");
            option = sc.nextInt();

            switch (option) {
                case 1 -> createStrongPassword(sc);
                case 2 -> privacidade(sc);
                case 3 -> System.out.println("\nOLÁ EU SOU O MARCOS VINICIOS, E VOU TE ENSINAR SEGURANÇA");
                case 0 -> System.out.println("\nSaindo do curso...");
                default -> System.out.println("Opção inválida, por favor escolha uma opção válida.");             
            }
        }
        sc.close();
    }
    public static void createStrongPassword(Scanner sc) {

        System.out.println("\nVAMOS CRIAR UMA SENHA SEGURA!");
        Boolean validPassword = false;
        String password;

        while (!validPassword) {
            System.out.print("\nPasso 1: Digite uma senha para testarmos: ");
            password = sc.next();

            if (password.length() < 8) {
                System.out.println("A senha deve conter pelo menos 8 caracteres.");
            } else if (!password.matches(".*[A-Z].*")) {
                System.out.println("A senha deve conter pelo menos uma letra maiúscula.");
            } else if (!password.matches(".*[a-z].*")) {
                System.out.println("A senha deve conter pelo menos uma letra minúscula.");
            } else if (!password.matches(".*\\d.*")) {
                System.out.println("A senha deve conter pelo menos um número.");
            } else if (!password.matches(".*[!@#$%^&*()].*")) {
                System.out.println("A senha deve conter pelo menos um caractere especial (!@#$%^&*()).");
            } else {
                validPassword = true;
                System.out.println("SENHA CRIADA COM SUCESSO!");
            }
        }
    }

public static void privacidade(Scanner sc) {
    System.out.println("\nPrivacidade na internet é o controle sobre suas informações.");
    boolean sairPrivacidade = false;

    while (!sairPrivacidade) {
        System.out.println("\n--- MENU DE DICAS ---");
        System.out.println("1 - Senhas");
        System.out.println("2 - Autenticação");
         System.out.println("3 - Compartilhamento");
         System.out.println("4 - atualização de software");
        System.out.println("0 - Voltar ao Menu Principal");
        System.out.print("Escolha uma dica: ");
        
        String opcao = sc.next();

        if (opcao.equals("1")) {
            System.out.println("\n[DICA 1]: Use senhas complexas e não as repita em outros sites.");
            voltar(sc); // Chama a função que espera o "0"
        } 
        else if (opcao.equals("2")) {
            System.out.println("\n[DICA 2]: O 2FA (Dois Fatores) impede acessos mesmo se descobrirem sua senha.");
            voltar(sc);
        } 
        else if (opcao.equals("3")) {
            System.out.println("\n[DICA 3]: Cuidado com o que compartilha, informações pessoais podem ser usadas contra você.");
            voltar(sc);
        }
        else if (opcao.equals("4")) {
            System.out.println("\n[DICA 4]: Mantenha seu software atualizado para proteger-se contra vulnerabilidades conhecidas.");
            voltar(sc);
        }
        else if (opcao.equals("0")) {
            sairPrivacidade = true;
            System.out.println("Saindo das dicas...");
        } 
        else {
            System.out.println("Opção inválida!");
        }
    }
}

public static void voltar(Scanner sc) {
    String comando = "";
    while (!comando.equals("0")) {
        System.out.print("\nDigite '0' para voltar ao menu de dicas: ");
        comando = sc.next();
        if (!comando.equals("0")) {
            System.out.println("Comando incorreto.");
        }
    }
}

}
