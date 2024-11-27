public class ex8_exception {
    public static void main(String[] args) {
        try {
            int[] x = {1, 2, 3};
            int a =10 , b =20;
            int c = add(a,b);
            System.out.println(x[1]);
            System.out.println(c);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }

    public static int add(int x, int y){
        try {
            return x + y;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return 0;
        } finally {
            System.out.println("Execution of add method completed.");
        }
        
    }
}
