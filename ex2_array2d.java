public class ex2_array2d {
    public static void main(String[] args) {
        //Array-2d
        String[][] product = {
            {"chair", "table", "lamp"},
            {"keyboard", "mouse", "monitor"},
            {"lipstick", "hair old", "sun block"}
        };
        System.out.println(product[0][2]);
        System.out.println(product[1][0]);
        System.out.println(product[2][1]);

        //re-assign value in [0][2]
        System.out.println("before [0][0] : " + product[0][0]);
        product[0][0] = "door";
        System.out.println("after [0][0] : " + product[0][0]);

        //access value with for-loop
        for(int row = 0; row < product.length; row++){
            for(int column = 0; column < product.length; column++){
                System.out.println("roll is : " + row + " colmun is :" + column + " product is : " + product[row][column]);
            }
        };
    }
}
