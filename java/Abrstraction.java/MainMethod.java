abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("zzzzz");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("Pig oinks oinks");
    }
}

class MainMethod {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}