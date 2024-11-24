import java.util.Scanner;
public class ex3_method {
    public static void main(String[] args) {
        ex3_method obj = new ex3_method();
        Scanner input = new Scanner(System.in);

        // call method and Lambda Expression
        geeting();
        obj.hi.run();
        obj.bye.run();
        test.run();
        String message = showMessage(input);
        System.out.println("Your message: " + message);

         // calculator
        System.out.println("Calculaotr");
        System.out.print("enter first number : ");
        int x = input.nextInt();
        System.out.print("enter second number : ");
        int y = input.nextInt();
        int sum = add(x, y);
        System.out.println(sum);

        input.close();
    }

    // calculator method
    static int add(int x , int y){
        return x + y ;
    };

    //geeting method
    static void geeting(){
        System.out.println("Tell your wolrd!!");
    }

    // Show message method
    static String showMessage(Scanner input) {
        System.out.print("Enter a message: ");
        return input.next();
    }

    // Lambda Expression
    Runnable hi = () -> {
        System.out.println("I Love U");
    };
    Runnable bye = () -> {
        System.out.println("BYE BYE");
    };

    static Runnable test = () -> {
        System.out.println("test");
    };

}
