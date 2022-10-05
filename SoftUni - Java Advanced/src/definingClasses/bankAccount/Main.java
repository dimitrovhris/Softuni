package definingClasses.bankAccount;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<BankAccount> bankAccounts = new ArrayList<>();
        while (!input.equals("End")) {
            String[] data = input.split(" ");
            switch (data[0]) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    bankAccounts.add(bankAccount);
                    System.out.printf("Account ID%d created%n", bankAccount.getId());
                    break;
                case "Deposit":
                    int id = Integer.parseInt(data[1]);
                    if (id > bankAccounts.size()) {
                        System.out.println("Account does not exist");
                        input = sc.nextLine();
                        continue;
                    }
                    bankAccounts.get(id - 1).deposit(Double.parseDouble(data[2]));
                    System.out.printf("Deposited %s to ID%d%n", data[2], id);
                    break;
                case "SetInterest":
                    double newInterest = Double.parseDouble(data[1]);
                    BankAccount.setInterestRate(newInterest);
                    break;
                case "GetInterest":
                    int iD = Integer.parseInt(data[1]);
                    if (iD > bankAccounts.size()) {
                        System.out.println("Account does not exist");
                        input = sc.nextLine();
                        continue;
                    }
                    int years = Integer.parseInt(data[2]);
                    System.out.printf("%.2f%n", bankAccounts.get(iD - 1).getInterestRate(years));
                    break;
            }
            input = sc.nextLine();
        }
    }
}