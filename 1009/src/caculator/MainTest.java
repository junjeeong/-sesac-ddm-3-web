package caculator;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class MainTest {
    public static void main(String[] args) {

        // 사용자의 콘솔 입력(Scanner 입력)을 시뮬레이션
        String simulatedInput =
                "2\n" +           // 계산 선택
                        "1 + 2\n" +       // 결과: 3
                        "2\n" +           // 계산 선택
                        "1 + 2 * 3\n" +   // 결과: 7
                        "2\n" +           // 계산 선택
                        "3 - 2 * 2\n" +   // 결과: -1
                        "1\n" +           // 조회
                        "q\n";            // 종료

        // System.in에 우리가 만든 문자열 입력을 연결
        InputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(in);

        // 이제 네 Main 실행 (사용자가 친 것처럼 동작함)
        Main.main(null);
    }
}