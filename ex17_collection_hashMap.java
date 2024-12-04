import java.util.*;

public class ex17_collection_hashMap {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();
        countries.put("th", "Thailand");
        countries.put("jp", "Japan");
        countries.put("cn", "China");
        System.out.println(countries);
        System.out.println(countries.get("th"));
        System.out.println("size of arrays is : " + countries.size());

        countries.remove("cn"); // remove key
        System.out.println(countries);
        System.out.println(countries.containsKey("th")); // find a value
    }
}
