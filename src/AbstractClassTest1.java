public class AbstractClassTest1 {
    public static void main(String[] args) {
        AbstractSubClass1 asub1 = new AbstractSubClass1();
        asub1.abstractMethod();
        asub1.nonAbstractMethod(1, 2);
        AbstractSubClass2 asub2 = new AbstractClassTest2();
        asub2.abstractMethod();
        asub2.abstractMethodInSub();
    }
}

class AbstractClassTest2 extends AbstractSubClass2 {
    public void abstractMethod() {
        System.out.println("Overridden Abstract Method In AbstractSuperClass is Called");
    }

    public void abstractMethodInSub() {
        System.out.println("Overridden Abstract Method In AbstractSubClass is Called");
    }
}

abstract class AbstractSuperClass1 {
    // Abstract Method Declaration
    public abstract void abstractMethod();

    // Non-abstract Method Declaration
    // public void nonAbstractMethod();
    public void nonAbstractMethod(int i, int j) {
        System.out.println(i + j);
    }
}

abstract class AbstractSuperClass2 {
    // Non-abstract Method Declaration
    public void nonAbstractMethod(int i, int j) {
        System.out.println(i + j);
    }
}

class AbstractSubClass1 extends AbstractSuperClass1 {
    // Abstract Method Overriding
    public void abstractMethod() {
        System.out.println("Overridden Abstract Method is Called");
    }

    // Non-abstract Method Overriding
    public void nonAbstractMethod(int i, int j) {
        super.nonAbstractMethod(1, 2);
        System.out.println(i * j);
    }
}

abstract class AbstractSubClass2 extends AbstractSuperClass1 {
//    // Abstract Method Overriding
//    public void abstractMethod(){
//        System.out.println("Overridden Abstract Method is Called");
//    }

    // Abstract Method Declaration
    public abstract void abstractMethodInSub();

    public void nonAbstractMethod() {

    }
}
