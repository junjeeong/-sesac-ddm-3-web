package Ch15_Collection.practice.p1;

import java.util.*;

public class RemoveDuplicates {

    public List<Integer> solution(int[] arr) {
        // TODO: 이 곳에 코드를 구현하세요.
        Set<Integer> set = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();

        // 기존 arr에서 중복 요소 제거 -> set에 담음
        for(int el:arr){
            set.add(el);
        }

        // set -> List로
        return (List<Integer>)set;
    }

    public static void main(String[] args) {
        RemoveDuplicates solver = new RemoveDuplicates();
        int[] arr = {1, 2, 5, 2, 4, 5, 1, 6};
        System.out.println("Original Array: " + Arrays.toString(arr));
        List<Integer> result = solver.solution(arr);
        System.out.println("Unique List: " + result); // 예상 출력: [1, 2, 4, 5, 6] (순서는 다를 수 있음)
    }
}
