import java.util.Scanner;
public class ex9_throw {
    static int balance = 20000;

    public static void main(String[] args) {
        try {
            // simple withdraw money
            Scanner input = new Scanner(System.in);
            System.out.print("Withdraw = ");
            int number = input.nextInt();
            withDraw(number);
            input.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void withDraw(int amount) throws Exception{
            if(amount <= 0){
                throw new Exception("You must enter a positive integer number.");
            } if (amount > balance) {
                throw new Exception("There is not enough money in the account.");
            }balance -= amount;
            System.out.println("Balance : " + balance + " bath");
            System.out.println("You're getting : " + amount + " bath");
    }
}
