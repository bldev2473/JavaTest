import java.lang.System;

class InheritanceTest {
    public static void main(String[] args) {
        InheritanceTopClass tc = new InheritanceTopClass(1, 2);
        InheritanceSubClass sc = new InheritanceSubClass(3, 4);

        System.out.println(tc.getTopInt1());
        System.out.println(tc.getTopInt2());
        System.out.println(sc.getTopInt1());
        System.out.println(sc.getTopInt2());

        InheritanceTopClass tc1 = new InheritanceSubClass(5, 6);
        System.out.println(tc1.getTopInt1());
        System.out.println(tc1.getTopInt2());

//        InheritanceSubClass sc1 = (InheritanceSubClass)tc;
//        System.out.println(sc1.getTopInt1());
//        System.out.println(sc1.getTopInt2());

        InheritanceSubClass sc2 = (InheritanceSubClass) tc1;
        System.out.println(sc2.getTopInt1());
        System.out.println(sc2.getTopInt2());
    }
}

class InheritanceSubClass extends InheritanceSuperClass {
    int subInt1;
    int subInt2;

    InheritanceSubClass(int subInt1, int subInt2) {
        super(subInt1, subInt2);
        System.out.println("InheritanceSubClass Constructor Called");
        this.subInt1 = subInt1;
        this.subInt2 = subInt2;
    }
}

class InheritanceSuperClass extends InheritanceTopClass {
    int superInt1;
    int superInt2;

    InheritanceSuperClass(int superInt1, int superInt2) {
        super(superInt1, superInt2);
        System.out.println("InheritanceSuperClass Constructor Called");
        this.superInt1 = superInt1;
        this.superInt2 = superInt2;
    }
}

class InheritanceTopClass {
    int topInt1;
    int topInt2;

    public int getTopInt1() {
        return topInt1;
    }

    public void setTopInt1(int topInt1) {
        this.topInt1 = topInt1;
    }

    public int getTopInt2() {
        return topInt2;
    }

    public void setTopInt2(int topInt2) {
        this.topInt2 = topInt2;
    }

    InheritanceTopClass(int topInt1, int topInt2) {
        System.out.println("InheritanceTopClass Constructor Called");
        this.topInt1 = topInt1;
        this.topInt2 = topInt2;
    }
}


