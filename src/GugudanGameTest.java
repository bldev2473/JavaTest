
public class GugudanGameTest {
    public static void main(String[] args) {
        GugudanGame gg = new GugudanGame();
        System.out.println(gg.getRan1() + " * " + gg.getRan2() + " = ?");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String inputStr;
        do {
            inputStr = sc.nextLine();
            gg.setUser(inputStr);
            if (gg.getAnswer() == gg.getUser()) {
                System.out.println("정답입니다.");
                break;
            } else {
                System.out.println("틀렸습니다.");
                continue;
            }
        } while (true);
    }
}
