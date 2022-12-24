package practicequestions;

public class Quiz04 {
    public static void main(String[] args) {

        // 눈으로 해석하고 풀기
        String a = "write once, run anywhere";
        if (a.contains("wife")) { // a가 wife 포함한다면
            System.out.println("wife"); // wife 출력
        } else if (a.contains("once") && !a.contains("run")) { // 그게 아니면  a가 once 포함하고, run을 포함 안하면
            System.out.println("once"); // once 출력
        } else if (!a.contains("everywhere")) { // 그것도 아니면 a가 everywhere 포함하지 않으면
            System.out.println("everywhere"); // everywhere 출력
        } else if (a.contains("anywhere")) { // 그것도 아니면 a가 anywhere 포함한다면
            System.out.println("anywhere"); // anywhere 출력
        } else { // 모두 아니라면
            System.out.println("none"); // none 출력
        }

        System.out.println("---------------");

        // 3의 배수의 합
        // while문으로 1부터 1000까지 자연수 중 3의 배수 합

        int multiple = 1;
        int sum = 0;
        while (multiple <= 1000) {
            if (multiple % 3 == 0) {
                sum += multiple;
            }
            multiple++;
        }
        System.out.println(sum);

        // 별표시하기 ㅜㅜ
        // * \n ** \n *** \n **** \n *****
        int star = 0;
        while (true) {
            star++; //1씩 더해라
            if (star > 5) { // 5보다 크면
                break; // 나가!!
            }
            for (int i = 0; i < star; i++) { // star 수 만큼
                System.out.print("*"); // * 출력
            }
            System.out.println(""); // 출력 후 줄바꿈꿈
        }

        // 1부터 100까지 출력하기
        // for문 사용
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        // 평균 점수
        // for each문 사용

        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int average = 0;
        for (int mark : marks) {
            average += mark;
        }
        System.out.println((float) average/marks.length);
//        float total = (float) average / marks.length;
//        System.out.println(total);
    }
}
