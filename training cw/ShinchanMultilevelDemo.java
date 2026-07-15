// Base class (Level 1)
class Hiroshi {
    void work() {
        System.out.println("Hiroshi goes to the office.");
    }
}

// Derived class (Level 2)
class Shinchan extends Hiroshi {
    void mischief() {
        System.out.println("Shinchan makes everyone laugh with his mischief!");
    }
}

// Derived class (Level 3)
class Himawari extends Shinchan {
    void cuteSmile() {
        System.out.println("Himawari charms everyone with her cute smile!");
    }
}

// Main class to run the program
public class ShinchanMultilevelDemo {
    public static void main(String[] args) {
        Himawari baby = new Himawari();

        // Access abilities from all levels
        baby.work();       // From Hiroshi (Dad)
        baby.mischief();   // From Shinchan (Brother)
        baby.cuteSmile();  // From Himawari (Baby)
    }
}
