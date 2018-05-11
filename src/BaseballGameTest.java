import java.util.*;

public class BaseballGameTest {
    public static void main(String[] args) {
        int strike = 0;
        int ball = 0;
        System.out.println("숫자야구 게임!");
        System.out.println("1부터 9사이의 수 중 세 개를 입력하세요.");

        Scanner sc = new Scanner(System.in);

        BaseballGameUser bu = new BaseballGameUser();
        BaseballGameCom bc = new BaseballGameCom();

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
                System.out.println(bu.getUserInput(i));
            }

            for (int i = 0; i < bu.getUserInputArr().length; i++) {
                if (bu.getUserInput(i) == bc.getComInput(i)) {
                    strike++;
                }
                for (int j = 0; j < bc.getComInputArr().length; j++) {
                    if (i == j)
                        continue;
                    if (bu.getUserInput(i) == bc.getComInput(j)) {
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

class BaseballGameUser {
    int[] userInputArr = new int[3];

    public int[] getUserInputArr() {
        return userInputArr;
    }

    public void setUserInputArr(int[] userInputArr) {
        this.userInputArr = userInputArr;
    }

    public int getUserInput(int i) {
        return userInputArr[i];
    }

    public void setUserInput(int i, String inputStr) {
        userInputArr[i] = Integer.parseInt(inputStr);
    }
}


class BaseballGameCom {
    int[] comInputArr = new int[3];

    public int[] getComInputArr() {
        return comInputArr;
    }

    public void setComInputArr(int[] comInputArr) {
        this.comInputArr = comInputArr;
    }

    BaseballGameCom() {
        for (int i = 0; i < comInputArr.length; i++) {
            comInputArr[i] = (int) (Math.random() * 9) + 1;
            for (int j = 0; j < i; j++) {
                if (comInputArr[i] == comInputArr[j]) {
                    i--;
                    break;
                }
            }
        }
    }

    public int getComInput(int i) {
        return comInputArr[i];
    }
}


