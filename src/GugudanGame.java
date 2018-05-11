import java.util.Random;

public class GugudanGame {
    int ran1;
    int ran2;
    int user;

    public int getRan1() {
        return ran1;
    }

    public void setRan1(int ran1) {
        this.ran1 = ran1;
    }

    public int getRan2() {
        return ran2;
    }

    public void setRan2(int ran2) {
        this.ran2 = ran2;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    String inputStr;
    int inputInt;
    int answer;
    Random r = new Random();

    GugudanGame() {
        this.ran1 = Math.abs(r.nextInt() % 9) + 1;
        this.ran2 = Math.abs(r.nextInt() % 9) + 1;
    }

    public void setUser(String user) {
        this.user = new Integer(user).intValue();
        // Integer i = new Integer(user);
        // this.user = i.intValue();
    }

    public int getAnswer() {
        return ran1 * ran2;
    }
}
