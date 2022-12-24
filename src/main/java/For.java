import java.util.ArrayList;

public class For {
    public static void main(String[] args) {
        // 60점이 넘으면 합격, 그렇지 않으면 불합격
        int[] marks = {90, 25, 67, 45, 80};
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 60) {
                System.out.println((i + 1) + "번 학생 합격입니다.");
            } else {
                System.out.println((i + 1) + "번 학생 불합격입니다.");
            }
        }

        System.out.println("-------------------------------");

        // continue : for문 처음으로~
        int[] score = {90, 25, 67, 45, 80};
        for (int i = 0; i < score.length; i++) {
            if (score[i] < 60) {
                continue;
            }
            System.out.println((i + 1) + "번 학생 축하합니다. 합격입니다.");
        }

        System.out.println("-------------------------------");


        // 이중 for문으로 구구단 만들기
        for(int i=2; i<10; i++) {
            for(int j=1; j<10; j++) {
                System.out.print(i*j+" "); // 여기서 println로 출력하면 하나씩 뽑음
            }
            System.out.println("");  // 줄 바꿈
        }
    }
}
