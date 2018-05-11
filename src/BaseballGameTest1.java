import java.util.Scanner;

public class BaseballGameTest1 {
    public static void main(String[] args) {
        int strike = 0;
        int ball = 0;
        System.out.println("숫자 야구 게임!");
        System.out.println("1부터 9사이의 수 중 세 개를 입력하세요.");

        Scanner sc = new Scanner(System.in);

        BaseballGameUser1 bu = new BaseballGameUser1();
        BaseballGameCom1 bc = new BaseballGameCom1();

        do {
//          if (sc.nextLine().equals("y")) {
//              break;
//          }

            if (sc.hasNext()) {
                for (int i = 0; i < 3; i++) {
                    bu.setUserInput(i, sc.next());
                }
            }

            for (int i = 0; i < 3; i++) {
                System.out.println(bu.getInput(i));
            }

            for (int i = 0; i < bu.getInputArr().length; i++) {
                if (bu.getInput(i) == bc.getInput(i)) {
                    strike++;
                }
                for (int j = 0; j < bc.getInputArr().length; j++) {
                    if (i == j)
                        continue;
                    if (bu.getInput(i) == bc.getInput(j)) {
                        ball++;
                    }
                }
            }
            if (strike == 3) {
                System.out.println("정답입니다.");
                break;
            } else {
                System.out.println("스트라이크 : " + strike);
                System.out.println("볼 : " + ball);
                strike = 0;
                ball = 0;
                continue;
            }
        } while (true);
    }
}

class BaseballGameUser1 extends BaseballGameAbstractClass{
    public int[] getInputArr(){
        return inputArr;
    }

    public int getInput(int i){
        return inputArr[i];
    }

    public void setUserInput(int i, String inputStr) {
        inputArr[i] = Integer.parseInt(inputStr);
    }
}

class BaseballGameCom1 extends BaseballGameAbstractClass {
    public int[] getInputArr(){
        return inputArr;
    }

    public int getInput(int i){
        return inputArr[i];
    }

    BaseballGameCom1() {
        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = (int) (Math.random() * 9) + 1;
            for (int j = 0; j < i; j++) {
                if (inputArr[i] == inputArr[j]) {
                    i--;
                    break;
                }
            }
        }
    }
}

abstract class BaseballGameAbstractClass {
    int[] inputArr = new int[3];
    public abstract int[] getInputArr();
    public abstract int getInput(int i);
}


