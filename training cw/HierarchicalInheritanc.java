// Parent class
class GameCharacter {
    void spawn() {
        System.out.println("A new character has entered the game!");
    }
}

// Child class 1
class Wizard extends GameCharacter {
    void castSpell() {
        System.out.println("Wizard casts a fireball spell!");
    }
}

// Child class 2
class Warrior extends GameCharacter {
    void attack() {
        System.out.println("Warrior swings a mighty sword!");
    }
}

// Child class 3
class Archer extends GameCharacter {
    void shootArrow() {
        System.out.println("Archer shoots a precise arrow!");
    }
}

// Main class
public class HierarchicalInheritanc{
    public static void main(String[] args) {
        Wizard w = new Wizard();
        Warrior wa = new Warrior();
        Archer a = new Archer();

        w.spawn();
        w.castSpell();

        wa.spawn();
        wa.attack();

        a.spawn();
        a.shootArrow();
    }
}
