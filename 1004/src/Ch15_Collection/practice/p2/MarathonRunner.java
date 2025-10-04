package Ch15_Collection.practice.p2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarathonRunner {

    public String solution(String[] participant, String[] completion) {
        // TODO: 이 곳에 코드를 구현하세요.
        String result = "없음";
        Map<String, Integer> completionMap =  new HashMap<>();

        // HashMap<참가한 선수 이름(중복x), completion에 나온 횟수>
        for(String part : participant){
            for(String comp : completion){
                if(part.equals(comp)) {
                    completionMap.put(part, completionMap.get(part)  == null ? 1 : completionMap.get(part) + 1);
                }
            }
        }

        for(String part : participant){
            if(!(completionMap.get(part) == 1)) result = part;
        }

        return result;
    }

    public static void main(String[] args) {
        MarathonRunner solver = new MarathonRunner();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        String result = solver.solution(participant, completion);
        System.out.println("Did not finish: " + result); // 예상 출력: "mislav"
    }
}