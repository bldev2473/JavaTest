public class OverloadingAndOverridingTest {
    public static void main(String[] args) {
        OOSubClass oosub = new OOSubClass();
        oosub.sum(1, 2);
        oosub.cal(1, 2);
        oosub.cal(1, 2, 3);
        oosub.cal(1, 5);
        oosub.cal(1, 2, 5);
    }
}

class OOSuperClass {
    int i;
    int j;
    int k;
    int result;

    public void calculator(int i, int j) {
        result = i + j;
        System.out.println(result);
    }

    public void calculator(int i, int j, int k) {
        result = i + j + k;
        System.out.println(result);
    }
}

class OOSubClass extends OOSuperClass {
    int i;
    int j;
    int k;
    int result;

    public void sum(int i, int j) {
        result = i + j;
        System.out.println(result);
    }

    public void calculator(int i, int j) {
        result = i * j;
        System.out.println(result);
    }

    public void calculator(int i, int j, int k) {
        result = i * j * k;
        System.out.println(result);
    }

    public void cal(int i, int j) {
        if (j >= 5) {
            this.calculator(i, j);
        } else {
            super.calculator(i, j);
        }
    }

    public void cal(int i, int j, int k) {
        if (k >= 5) {
            this.calculator(i, j, k);
        } else {
            super.calculator(i, j, k);
        }
    }
}

//class OverloadingDemo {
//    void A() {
//        System.out.println("void A method without parameter Called");
//    }
//
//    int A() {
//        System.out.println("int A method without parameter Called");
//        return 1;
//    }
//
//    void A(int arg1) {
//        System.out.println("void A method with parameter Called");
//    }
//
//    int A(int arg1) {
//        System.out.println("int A method with parameter Called");
//        return arg1;
//    }
//
//    String A(String arg1) {
//        return arg1;
//    }
//
//    public static void main(String[] args) {
//        OverloadingDemo od = new OverloadingDemo();
//        od.A();
//        int arg1 = od.A(1);
//        System.out.println(arg1);
//        String arg2 = od.A("A");
//        System.out.println(arg2);
//    }
//}

