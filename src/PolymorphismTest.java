public class PolymorphismTest {
//    public void feed(Tiger tiger){
//        System.out.println("feed tiger");
//    }
//
//    public void feed(Lion lion){
//        System.out.println("feed lion");
//    }

    public void feed(Animal animal) {
        System.out.println("feed animal");
        System.out.println("feed " + animal.getAnimalName());
    }

    public void feed(InterfaceForAnimal animal) {
        System.out.println("feed " + animal.getAnimalName());
    }

    public static void main(String[] args) {
        PolymorphismTest pt = new PolymorphismTest();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
//        pt.feed(tiger);
//        pt.feed(lion);
        pt.feed(tiger);
        pt.feed(lion);

        Bird bird = new Bird();
        Rabbit rabbit = new Rabbit();
        pt.feed(bird);
        pt.feed(rabbit);
    }
}

class Animal {
    public String getAnimalName() {
        return "name";
    }
}

class Tiger extends Animal {
    public String getAnimalName() {
        return "tiger";
    }
}

class Lion extends Animal {
    public String getAnimalName() {
        return "lion";
    }
}

interface InterfaceForAnimal {
    String getAnimalName();
}

class Bird implements InterfaceForAnimal {
    public String getAnimalName() {
        return "bird";
    }
}

class Rabbit implements InterfaceForAnimal {
    public String getAnimalName() {
        return "rabbit";
    }
}

