public class InterfaceTest {
}

class InterfaceClass1 implements Interface1{
    public void method1(){
        System.out.println("Method1 Called");
    }
}

class InterfaceClass2 implements Interface2{
    public void method2(){
        System.out.println("Method2 Called");
    }
}

class InterfaceClass3 implements Interface1, Interface2{
    public void method1(){

    }

    public void method2(){

    }
}

interface Interface1 {
    int i = 1;
    public void method1();
}

interface Interface2 {
    public void method2();
}

interface Interface3 {
    public void method3();
}