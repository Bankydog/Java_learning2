public class ex14_geneticMethod {
    public class Data {
        static <T> void showArray(T[] arr) {
            for (T element : arr) {
                System.out.println(element);
            }
            System.out.println("============");
        }
    }

    public static void main(String[] args) {
        Data.showArray(new Integer[] { 1, 2, 3, 4 });
        Data.showArray(new Double[] { 1.2, 2.3, 3.4, 4.5 });
        Data.showArray(new String[] { "Bank", "Bow", "Belle" });
    }
}
