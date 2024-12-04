import java.util.ArrayList;
import java.util.List;

public class ex15_collection_arrayList {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Java");
        data.add("JavaScript");
        data.add("PHP");
        data.add(1, "Python");
        System.out.println(data);
        System.out.println(data.size());

        data.remove(2); // remove index(i)

        System.out.println("After removing index 2: " + data);
        System.out.println("Size of the ArrayList: " + data.size());

        data.clear(); // remove all index

        System.out.println("After clearing: " + data);
        System.out.println("Size of the ArrayList: " + data.size());

        ArrayList newData = new ArrayList<>(List.of("C", "C++", "C#"));
        data.addAll(newData); // add all data
        System.out.println(data); // add all data and insert index
        data.addAll(0, newData);
        System.out.println(data);
        data.set(0, "Mongo"); // set value of index
        System.out.println("after set index 0 : " + data);
        System.out.println("has C : " + data.contains("C")); // find data in array
        System.out.println("find C# at index is : " + data.indexOf("C#")); // find data in array and index
    }
}
