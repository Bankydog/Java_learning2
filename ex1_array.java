public class ex1_array {
    public static void main(String[] args) {
        
        // Creating a member-specific array
        int[] number = {1, 2, 3, 4, 2, 3, 4, 2, 3, 4, 2, 3, 4, 2, 3, 4};
        System.out.println("a number in position 3 is : " + number[2]);
        number[2] = 100;
        System.out.println("change a number in position 3 is : " + number[2]);
        System.err.println("size of array is : " + number.length);
        for(int i = 0; i < number.length; i++){
            System.out.println("position : " + i +" value = "+ number[i]);
        }
        //find sum of number by for-loop
        int sum = 0;
        for(int item : number){
            sum += item ;
        };
        System.out.println("sum of number-array is : " + sum);

        // Creating a fixed-size array
        int[] number2 = new int[4];
        number2[0] = 10;
        number2[1] = 20;
        number2[2] = 30;
        number2[3] = 40;
        System.out.println("a number2 in position 3 is : " + number2[2]);

        //Creating a String array
        String[] pets = {"rabbit", "turtle", "bird", "godzilla"};
        for(String data : pets){
            System.out.println("pets have " + data);
        };
        
    }
}