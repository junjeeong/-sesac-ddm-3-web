package caculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Caculator {
    List<String> calculationHistory = new ArrayList<>();
    String[] temp = null;

    void calculate(String expression) {
        calculationHistory.add(expression);
        temp = expression.trim().split(" ");  // 공백 기준으로 나눔: ["10", "+", "20", "*", "30"]

            // 곱하기 처리
            for(int i=0;i<temp.length;i++){
                if(temp[i].equals("*")) {
                    String result = String.valueOf(
                            Integer.parseInt(temp[i - 1]) * Integer.parseInt(temp[i + 1])
                    );
                    temp = rebuild(temp, i, result); // 새 배열 구성
                    i = -1; // 다시 처음부터 검사 (배열 길이가 변했으므로)
                }
            }

            // 나눗셈 처리
            for(int i=0;i<temp.length;i++){
                if (temp[i].equals("/")) {
                    String result = String.valueOf(
                            Integer.parseInt(temp[i - 1]) / Integer.parseInt(temp[i + 1])
                    );
                    temp = rebuild(temp, i, result);
                    i = -1;
                }
            }

            // 더하기 및 나눈셈 처리
            for (int i = 0; i < temp.length; i++) {
                if (temp[i].equals("+")) {
                    String result = String.valueOf(
                            Integer.parseInt(temp[i - 1]) + Integer.parseInt(temp[i + 1])
                    );
                    temp = rebuild(temp, i, result);
                    i = -1;
                }
                else if (temp[i].equals("-")) {
                    String result = String.valueOf(
                            Integer.parseInt(temp[i - 1]) - Integer.parseInt(temp[i + 1])
                    );
                    temp = rebuild(temp, i, result);
                    i = -1;
                }
            }

        System.out.println("결과: " + temp[0]);
    }

    private String[] rebuild(String[] arr, int opIndex, String result) {
        List<String> list = new ArrayList<>(Arrays.asList(arr));

        // i-1(좌항), i(연산자), i+1(우항) 제거
        list.remove(opIndex + 1); // 우항 제거
        list.remove(opIndex);     // 연산자 제거
        list.remove(opIndex - 1); // 좌항 제거

        // 연산 결과 삽입
        list.add(opIndex - 1, result);

        return list.toArray(new String[0]);
    }

    void printHistory() {
        if(calculationHistory.isEmpty()) {
            System.out.println("연산 내역이 없습니다.");
        }

        else {
            for(String calculation : calculationHistory) {
                System.out.println(calculation);
            }
        }
    }
}
