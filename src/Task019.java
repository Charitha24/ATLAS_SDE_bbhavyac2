import java.util.Map;
import java.util.HashMap;

public class Task019 {
    public static void main(String[] args) {
        System.out.println("Elements in the periodic table:");

        for (Element element : Element.values()) {
            System.out.println("Name: " + element.label
                    + ", Atomic Number: " + element.atomicNumber
                    + ", Atomic Weight: " + element.atomicWeight);
        }

        // Demonstrating retrieval methods
        System.out.println("\nRetrieving elements:");
        System.out.println("By Label (Helium): " + Element.valueOfLabel("Helium"));
        System.out.println("By Atomic Number (2): " + Element.valueOfAtomicNumber(2));
        System.out.println("By Atomic Weight (20.180): " + Element.valueOfAtomicWeight(20.180f));
    }
}
