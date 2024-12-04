package ex18_Package;

import ex18_Package.MyClass.Geet;
import ex18_Package.generic.*;

public class test {
    public static void main(String[] args) {
        Geet.showText("Sawaaade Krub");

        Box<String> stringBox = new Box<>();
        stringBox.setValue("BANK");
        System.out.println("String Value: " + stringBox.getValue());
    }
}
