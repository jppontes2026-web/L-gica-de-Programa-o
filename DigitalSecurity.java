import java.util.Scanner;

public class DigitalSecurity {

    public static void main(String[] args) {

        System.out.println("\n****** BEM-VINDO AO CURSO DE SEGURANÇA DIGITAL ******");
        System.out.println("*** APRENDEREMOS AS MELHORES PRÁTICAS CONTRA HACKERS ***");

        int option = -1;
        Scanner sc = new Scanner(System.in);

        while (option != 0) {

            System.out.println("\n========== MENU PRINCIPAL ==========");
            System.out.println("1 - Chagas Barros (Criação de Senhas Seguras)");
            System.out.println("2 - João Pedro (Privacidade na Internet)");
            System.out.println("3 - Marcos Vinicios (Perfis Falsos no WhatsApp)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            option = sc.nextInt();

            switch (option) {

                case 1 -> createStrongPassword(sc);

                case 2 -> privacidade(sc);

                case 3 -> detectarPerfilFalso(sc);

                case 0 -> System.out.println("\nSaindo do curso...");

                default -> System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }

    // ==========================
    // SENHAS SEGURAS
    // ==========================

    public static void createStrongPassword(Scanner sc) {

        System.out.println("\n===== CRIAÇÃO DE SENHA SEGURA =====");

        boolean validPassword = false;
        String password;

        while (!validPassword) {

            System.out.print("\nDigite uma senha para testarmos: ");
            password = sc.next();

            if (password.length() < 8) {
                System.out.println("A senha deve conter pelo menos 8 caracteres.");
            }

            else if (!password.matches(".*[A-Z].*")) {
                System.out.println("A senha deve conter pelo menos uma letra maiúscula.");
            }

            else if (!password.matches(".*[a-z].*")) {
                System.out.println("A senha deve conter pelo menos uma letra minúscula.");
            }

            else if (!password.matches(".*\\d.*")) {
                System.out.println("A senha deve conter pelo menos um número.");
            }

            else if (!password.matches(".*[!@#$%^&*()].*")) {
                System.out.println("A senha deve conter pelo menos um caractere especial.");
            }

            else {
                validPassword = true;
                System.out.println("SENHA CRIADA COM SUCESSO!");
            }
        }
    }

    // ==========================
    // PRIVACIDADE
    // ==========================

    public static void privacidade(Scanner sc) {

        int opcao = -1;
        while (opcao != 0) {

	 System.out.println("\n===== PRIVACIDADE NA INTERNET ====="); 
       
        System.out.println("1 - Senhas");
        System.out.println("2 - Autenticação");
        System.out.println("3 - Compartilhamento");
        System.out.println("4 - Atualização de software");
        System.out.println("0 - Voltar");

		opcao = sc.nextInt();
		sc.nextLine();

        switch (opcao) {

            case 1 -> {
                System.out.println("\nUse senhas diferentes para cada conta.");
                System.out.println("\naperte ENTER para voltar....");
                        sc.nextLine();}

            case 2 -> {
                System.out.println("\nAtive a autenticação em dois fatores.");
                System.out.println("\naperte ENTER para voltar....");
                        sc.nextLine();}
            case 3 -> {
                System.out.println("\nEvite compartilhar informações pessoais.");
                System.out.println("\naperte ENTER para voltar....");
                        sc.nextLine();}
            case 4 -> {
                System.out.println("\nAtualize seus aplicativos regularmente.");
                System.out.println("\naperte ENTER para voltar....");
                        sc.nextLine();}
            case 0 -> System.out.println("\nVoltando ao menu principal...");
            default -> {System.out.println("\nOpção Inválida");
            System.out.println("\naperte ENTER para voltar....");
                        sc.nextLine();}
        }
}
	}

       


    // ==========================
    // PERFIL FALSO NO WHATSAPP
    // ==========================

    public static void detectarPerfilFalso(Scanner sc) {

        System.out.println("\n===== DETECTOR DE PERFIL FALSO =====");
        System.out.println("Responda as perguntas com SIM ou NAO.");

        int pontos = 0;

        System.out.print("\nO perfil possui foto? ");
        String foto = sc.next();

        if (foto.equalsIgnoreCase("nao")) {
            pontos += 2;
        }

        System.out.print("A pessoa pede dinheiro? ");
        String dinheiro = sc.next();

        if (dinheiro.equalsIgnoreCase("sim")) {
            pontos += 4;
        }

        System.out.print("A mensagem possui links suspeitos? ");
        String link = sc.next();

        if (link.equalsIgnoreCase("sim")) {
            pontos += 4;
        }

        System.out.print("A pessoa pediu senha ou código? ");
        String senha = sc.next();

        if (senha.equalsIgnoreCase("sim")) {
            pontos += 5;
        }

        System.out.print("O número é desconhecido? ");
        String numero = sc.next();

        if (numero.equalsIgnoreCase("sim")) {
            pontos += 2;
        }

        System.out.println("\n===== RESULTADO =====");

        if (pontos >= 10) {

            System.out.println("ALERTA MÁXIMO!");
            System.out.println("Grande chance de perfil falso ou golpe.");
        }

        else if (pontos >= 5) {

            System.out.println("CUIDADO!");
            System.out.println("O perfil apresenta sinais suspeitos.");
        }

        else {

            System.out.println("Perfil aparentemente seguro.");
        }

        System.out.println("Pontuação de risco: " + pontos);

        voltar(sc);
    }

    // ==========================
    // VOLTAR
    // ==========================

    public static void voltar(Scanner sc) {

        String comando = "";

        while (!comando.equals("0")) {

            System.out.print("\nDigite 0 para voltar: ");
            comando = sc.next();

            if (!comando.equals("0")) {
                System.out.println("Comando incorreto.");
            }
        }
    }
}
