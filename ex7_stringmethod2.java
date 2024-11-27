public class ex7_stringmethod2 {
    public static void main(String[] args) {

        //Replace message
        String message = "Happy birth day 2020 | Happy new year 2020";
        System.out.println("Before : " + message);
        String message2 = message.replace("2020", "2022");
        System.out.println("After : " + message2);
        String message3 = message.replaceFirst("2020", "2022");
        System.out.println("After : " + message3);

        //Convert String => Array
        String data = "mango,straw-berry,coconut";
        String[] fruit = data.split(",");
        System.out.println(fruit[1]);
        for (String ch : fruit) {
            System.out.println(ch);
        }

        String word = "mergency";
        String[] letter = word.split("");
        for (String ch : letter) {
            System.out.println(ch);
        }
        String reversedWord = new StringBuilder(word).reverse().toString();
        System.out.println("Reversed word: " + reversedWord);

        //SubString(start reading at position's 0 then final position's -1  )
        String name = "Bankydog";
        String word2 = name.substring(0,4);
        System.out.println(word2);
        String word3 = name.substring(4); // no endIndex 
        System.out.println(word3);

        char[] aphabet = name.toCharArray(); // convert String => Array Character
        System.out.println(aphabet[5]);

        char[] items1 = {'a', 'e', 'i', 'o', 'u'};
        String result = String.copyValueOf(items1); //convert Array Character => String
        System.out.println(result);

        String item2 = "    mergency    ";
        System.out.println("before trim : " + item2.length());
        item2 = item2.trim();
        System.out.println("after trim : " + item2.length()); //terminate space in sentence

        int numbers = 999999;
        double numbers2 = 99.99;
        String item3 = String.valueOf(numbers);
        System.out.println("convert Integer to String : " + item3);
        String item4 = String.valueOf(numbers2);
        System.out.println("convert Integer to String : " + item4);
    }
}
