public class FinalTest {
    public static void main(String[] args) {
        FinalSubClass2 fsub = new FinalSubClass2();
//        fsub.setCONSTANT_VAR(1);
        fsub.method(1, 2);
        fsub.finalMethod(1, 2);
    }
}

final class FinalSuperClass1 {

}

class FinalSuperClass2 {
    final int CONSTANT_VAR = 1;
    int result;

//    public void setCONSTANT_VAR(int i) {
//        this.CONSTANT_VAR = i;
//    }

    public int getCONSTANT_VAR() {
        return CONSTANT_VAR;
    }

    public void method(int i, int j) {
        result = i + j;
    }

    public final void finalMethod(int i, int j) {
        result = i + j;
    }
}

//class FinalSubClass1 extends FinalSuperClass1 {
//
//}

class FinalSubClass2 extends FinalSuperClass2 {
    public void method(int i, int j) {
        result = i * j;
    }

//    public void finalMethod(int i, int j) {
//        result = i * j;
//    }
}