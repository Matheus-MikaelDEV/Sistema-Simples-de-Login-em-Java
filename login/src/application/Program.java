package application;

import entities.User;
import util.LoginUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("----Sistema de login----");

        List<User> users = new ArrayList<>();

        do {
            System.out.println("Escolha uma opção:");
            System.out.print("[1] - Cadastrar usuário\n[2] - Login\n[3] - Listar usuários\n[4] - Sair\nOpção: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Digite o nome do usuário: ");
                    String username = sc.next();
                    System.out.print("Digite o email do usuário: ");
                    String email = sc.next();
                    System.out.print("Digite a senha do usuário: ");
                    String password = sc.next();

                    if (LoginUtil.register(users, username, email, password)) {
                        System.out.println("Usuário cadastrado com sucesso!");
                    } else {
                        System.out.println("Usuário ou email já cadastrado!");
                    }
                    break;
                case 2:
                    System.out.print("Digite o nome do usuário ou email: ");
                    String loginUsernameOrEmail = sc.next();
                    System.out.print("Digite a senha do usuário: ");
                    String loginPassword = sc.next();

                    if (LoginUtil.login(users, loginUsernameOrEmail, loginPassword)) {
                        User loggedInUser = LoginUtil.getUsername(users, loginUsernameOrEmail);
                        System.out.println("Login realizado com sucesso!");
                        System.out.printf("Bem vindo(a), %s!\n", loggedInUser.getUsername());
                    } else {
                        System.out.println("Usuário ou senha inválidos!");
                    }
                    break;
                case 3:
                    if (users.isEmpty()) {
                        System.out.println("Nenhum usuário cadastrado.");
                    } else {
                        System.out.println("----Lista de usuários----");
                        for (User user : users) {
                            System.out.printf("Usuário: %s\n", user.getUsername());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    sc.close();
                    return;
            }
        } while (true);
    }
}