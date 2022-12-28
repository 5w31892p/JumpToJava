package practicequestions.quiz06;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz06 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        // 두 숫자를 입력 받아 그 합을 출력
        System.out.println("더할 숫자 2개를 입력해주세요.");
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + "번째 숫자");
            int j = sc.nextInt();
            sum += j;
        }
        System.out.println("입력해주신 두 수의 합은 " + sum + "입니다.");

        // 소문자를 입력 받아 대문자로 출력
        // 단, 사용자가 "END"라는 문자열 입력 전까지 반복
        while (true) {
            System.out.println("대문자로 변경할 소문자 영단어를 입력해주세요.");
            String str = sc.nextLine();
            if (str.equals("END")) break;
            String result = str.toUpperCase();
            System.out.println(result);
        }

        // 오류 수정하기
        // 파일에 "Write once, run anywhere" 문자열을 저장한 후 다시 그 파일을 읽어서 출력
        // 파일을 쓰거나 읽은 후에는 반드시 close 메서드로 파일처리를 종료

        FileWriter fw = new FileWriter("sample.txt");
        fw.write("Write once, run anywhere\r\n");
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String line = br.readLine();
        System.out.println(line);
        br.close();

        // 입력 받아 파일에 저장하기
        // 단 프로그램을 다시 실행하더라도 기존에 작성한 내용을 유지하고 새로 입력한 내용을 추가되도록
        PrintWriter pw = new PrintWriter(new FileWriter("sample.txt", true));
        System.out.println("파일에 남길 글을 적어주세요.");
        pw.println(sc.nextLine());
        pw.close();


        // 내용 바꾸어 저장히기
        // python -> java로
        ArrayList<String> data = new ArrayList<>();
        BufferedReader brs = new BufferedReader(new FileReader("samples.txt"));
        while (true) {
            String lines = brs.readLine();
            if (lines == null) break;
            data.add(lines);
        }
        brs.close();

        // 줄 단위로 읽으면 줄바꿈 문자가 없어지므로 줄바꿈 문자를 포함한다.
        String text = String.join("\n", data);

        // python 이라는 단어를 java로 변경한다.
        text = text.replaceAll("python", "java");

        // 변경된 내용을 다시 파일에 적는다.
        FileWriter fw2 = new FileWriter("samples.txt");
        fw2.write(text);
        fw2.close();
    }
}
