import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter your name, password and balance");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

        SBIAccount tanyaAcc = new SBIAccount(name,balance,password);

        System.out.println("Your account has been created with account number: " + tanyaAcc.getAccountNo());

        //getBalance
        System.out.println("Your current balance is: " + tanyaAcc.getBalance());

        //deposit money
        System.out.println(tanyaAcc.depositMoney(500));

        System.out.println("New Balance is: " + tanyaAcc.getBalance());

        //withdraw
        System.out.println("Enter amount to be withdrawn: " );
        int amount = sc.nextInt();
        System.out.println("Enter your password: ");
        String enteredPassword = sc.next();

        System.out.println(tanyaAcc.withdraw(amount,enteredPassword));

        System.out.println("Interest on current balance: " + tanyaAcc.getBalance() + " is " + tanyaAcc.calculateInterest(4));

    }
}