import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ex16_collection_hashSet {
    public static void main(String[] args) {
        HashSet<String> data = new HashSet<>();
        data.add("JAVA");
        data.add("C#");
        data.add("CSS");
        data.add("HTmL");
        data.add("JAVA");
        data.add("C++");
        data.add("Python");
        System.out.println(data);
        System.out.println(data.size());

        // LinkHashSet sort by first-in
        LinkedHashSet<String> data2 = new LinkedHashSet<>();
        data2.add("JAVA");
        data2.add("C#");
        data2.add("CSS");
        data2.add("HTmL");
        data2.add("JAVA");
        data2.add("C++");
        data2.add("Python");
        System.out.println("sort by First-in : " + data2);

        // TreeSet sort by charecter
        TreeSet<String> data3 = new TreeSet<>();
        data3.add("JAVA");
        data3.add("C#");
        data3.add("CSS");
        data3.add("HTmL");
        data3.add("JAVA");
        data3.add("C++");
        data3.add("Python");
        System.out.println("sort by charecter : " + data3);

    }

}
