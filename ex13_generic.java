public class ex13_generic {
    public static class Item<T> {
        T data;

        public Item(T value) {
            data = value;
        }
    }

    // Extends Type parameter
    public static class Item2<T extends Integer> {
        T data;

        public Item2(T value) {
            data = value;
        }
    }

    // Multiple Type parameter
    public static class Item3<T, U> {
        T data1;
        U data2;

        public Item3(T value1, U value2) {
            data1 = value1;
            data2 = value2;
        }
    }

    // people data
    public static class Person<T extends String, U extends Integer> {
        T name;
        U ages;

        public Person(T name, U ages) {
            this.name = name;
            this.ages = ages;
        }
    }

    public static void main(String[] args) {
        // ex1
        Item<Integer> obj1 = new Item<>(10);
        System.out.println("value is : " + obj1.data);
        Item<Double> obj2 = new Item<>(10.02222);
        System.out.println("value is : " + obj2.data);
        Item<String> obj3 = new Item<>("Hellow");
        System.out.println("value is : " + obj3.data);

        // ex2
        Item3<Integer, Boolean> obj4 = new Item3<>(5, true);
        System.out.println("value1 is : " + obj4.data1 + ", value2 is : " + obj4.data2);

        // ex3
        Person<String, Integer> person = new Person<>("Bank", 36);
        System.err.println("Name : " + person.name + ", age : " + person.ages);
    }
}
