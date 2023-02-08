import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //SBI Bank
        System.out.print("Enter your name for SBI Account: ");
        String name = sc.next();
        System.out.print("Enter your password: ");
        String password = sc.next();
        System.out.print("Enter your balance: ");
        int balance = sc.nextInt();

        SBIAccount tanyaAcc = new SBIAccount(name,balance,password);

        System.out.println("Your account has been created with account number: " + tanyaAcc.getAccountNo());

        //getBalance
        System.out.println("Your current balance is: " + tanyaAcc.getBalance());

        //deposit money
        System.out.println(tanyaAcc.depositMoney(500));

        System.out.println("New Balance is: " + tanyaAcc.getBalance());

        //withdraw
        System.out.print("Enter amount to be withdrawn: " );
        int amount = sc.nextInt();
        System.out.print("Enter your password: ");
        String enteredPassword = sc.next();

        System.out.println(tanyaAcc.withdraw(amount,enteredPassword));

        System.out.println("Interest on current balance: " + tanyaAcc.getBalance() + " is " + tanyaAcc.calculateInterest(4));

        //HDFC Bank
        System.out.print("Enter your name for HDFC Account: ");
        String name1 = sc.next();
        System.out.print("Enter your password: ");
        String password1 = sc.next();
        System.out.print("Enter your balance: ");
        int balance1 = sc.nextInt();

        HDFCAccount tanyaAcc1 = new HDFCAccount(name1,balance1,password1);

        System.out.println("Your account has been created with account number: " + tanyaAcc1.getAccountNo());

        //getBalance
        System.out.println("Your current balance is: " + tanyaAcc1.getBalance());

        //deposit money
        System.out.println(tanyaAcc1.depositMoney(5000));

        System.out.println("New Balance is: " + tanyaAcc1.getBalance());

        //withdraw
        System.out.print("Enter amount to be withdrawn: " );
        int amount1 = sc.nextInt();
        System.out.print("Enter your password: ");
        String enteredPassword1 = sc.next();

        System.out.println(tanyaAcc.withdraw(amount1,enteredPassword1));

        System.out.println("Interest on current balance: " + tanyaAcc1.getBalance() + " is " + tanyaAcc1.calculateInterest(6));

    }
}