public class ex6_stringMethod {
    public static void main(String[] args) {
        String name1 = "Bank";
        String name2 = "Mergency";
        String name3 = "mergency";
        String city = new String("Bangkok");

        System.out.println(name1);
        System.out.println(city);

        //concatenation
        String result = name1 + city;
        System.out.println(name1 + city);
        System.out.println(result);
        System.out.println(result.concat(".com"));

        //lenght
        int count = result.length();
        System.out.println(result.length());
        System.out.println(count);

        //find a position
        System.out.println(result.charAt(2));
        
        //compare between String
        boolean result2 = name1.equals(name2);
        System.out.println(result2);
        boolean result3 = name2.equals(name3);
        boolean result4 = name2.equalsIgnoreCase(name3);
        System.out.println(result3);
        System.out.println(result4);

        //find a First and last word in sentence
        String fullname = "Bank Mergency";
        boolean x = fullname.startsWith("Bank");
        boolean y = fullname.endsWith("c");
        System.out.println(x);
        if(x){
            System.out.println("Has");
        } else System.out.println("dont has");

        System.out.println(y);
        if(y){
            System.out.println("Has");
        } else System.out.println("dont has");

        //index of 
        System.out.println(fullname.indexOf("nk"));
    }
}
