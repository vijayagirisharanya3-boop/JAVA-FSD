import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }
;
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    public void addProduct(Product product) {
        items.add(product);
    }

    public void showCart() {
        System.out.println("Shopping Cart:");
        for (Product product : items) {
            System.out.println(product);
        }
    }

    // main method to test everything
    public static void main(String[] args) {
        // Test ShoppingCart
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Laptop"));
        cart.addProduct(new Product("Phone"));
        cart.showCart();

        System.out.println("\n--- Course Demo ---");
        // Test Course operations
        Course course = new Course();
        course.demoOperations();
    }
}

class Course {
    private List<String> students = new ArrayList<>();

    public void demoOperations() {
        // adding elements
        students.add("alice");

        // adding at specific index
        students.add(1, "bob");

        // adding all elements from another collection
        List<String> otherStudents = new ArrayList<>();
        otherStudents.add("charlie");
        otherStudents.add("david");
        students.addAll(otherStudents);

        // accessing elements
        String firstStudent = students.get(0);
        System.out.println("First student: " + firstStudent);

        // removing elements
        students.remove(1); // removes element at index 1
        students.remove("alice"); // removes first occurrence of "alice"
        System.out.println("After removing: " + students);

        // remove all elements matching a condition
        students.removeIf(student -> student.startsWith("c"));
        System.out.println("After removeIf: " + students);

        // checking contents
        boolean hasAlice = students.contains("alice");
        boolean hasBob = students.contains("bob");
        System.out.println("Contains alice: " + hasAlice);
        System.out.println("Contains bob: " + hasBob);

        int index = students.indexOf("charlie");
        System.out.println("Index of charlie: " + index);

        // size and capacity
        int size = students.size();
        boolean empty = students.isEmpty();
        System.out.println("Size: " + size + ", Is Empty: " + empty);

        // iteration multiple ways
        System.out.println("\n---for-each loop (modern)---");
        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("\n---for loop (traditional)---");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out.println("\n---iterator---");
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n---lambda foreach---");
        students.forEach(student -> System.out.println(student));

        // clearing the list
        students.clear();
        System.out.println("After clearing: " + students);
        System.out.println("Is empty after clearing: " + students.isEmpty());
    }
}
