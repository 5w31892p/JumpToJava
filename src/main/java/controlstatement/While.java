package controlstatement;

import java.util.Arrays;

public class While {
    public static void main(String[] args) {
        int treeHit = 0;
        while (treeHit < 10) {
            treeHit++;
            System.out.println("나무를 " + treeHit + "번 찍었습니다.");
            if (treeHit == 10) {
                System.out.println("나무 넘어갑니다.");
            }
        }

        // break : while문 빠져나갈 때 사용
        int coffe = 10;
        int money = 18000;
        while (money > 0) {
            coffe--;
            System.out.println("남은 커피는 " + coffe + "개 입니다.");
            if (coffe == 0) {
                System.out.println("커피 다 떨어졌습니다.\n판매를 종료합니다.");
                break;
            }
        }

        // continue : while문 맨 처음으로 돌아가기
        int a = 0;
        while (a < 10) {
            a++;
            if (a % 2 == 0) {
                continue;
            }
            System.out.println(a);
        }
    }
}
