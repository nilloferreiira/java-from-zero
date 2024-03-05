package nilloferreiira.bank;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank santander = new Bank("0001");
        // criar uma conta(agencia, conta, nome)
        while (true) {
            System.out.println("Digite: \n 1. Cadastrar uma conta \n 2. Sair");
            String choice = input.nextLine();
            if (choice.equals("1")) {
                System.out.println("Digite seu nome:");
                String name = input.nextLine();

                Account account = santander.generAccount(name);
                santander.insertAccount(account);

                operateAccount(account);
            } else if (choice.equals("2")) {
                break;
            } else {
                System.out.println("Digite uma operação valida!");
            }
        }
        input.close();

        List<Account> accountList = santander.generAccounts();
        for(Account cc: accountList){
            System.out.println(cc);
        };
    }

     // Escolha da operação
    static void operateAccount(Account account) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Qual operação deseja fazer? \n 1. Saque \n 2. Deposito \n 0. Sair");
            String choice = input.nextLine();

            // Depositar
            if (choice.equals("2")) {
                System.out.println("Digite o valor deseja depositar:");
                String value = input.nextLine();
                account.deposit(Double.parseDouble(value));
            }
            // Sacar
            else if (choice.equals("1")) {
                System.out.println("Digite o valor que deseja sacar:");
                String value = input.nextLine();
                account.withdraw(Double.parseDouble(value));
            }

            else {
                System.out.println(account.toString());
                break;
            }
        }
    }
}