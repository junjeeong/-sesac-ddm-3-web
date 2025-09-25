package practice.ch5;

import java.util.Scanner;

public class p9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Week monday = Week.MONDAY;
        Week tuesday = Week.TUESDAY;
        Week wednesday = Week.WEDNESDAY;
        Week thursday = Week.THURSDAY;
        Week friday = Week.FRIDAY;
        Week saturday = Week.SATURDAY;
        Week sunday = Week.SUNDAY;

        System.out.println("=== 요일별 정보 ===");
        System.out.printf("%s: %s, 근무시간 %d시간\n", monday.getKoreanName(), monday.isWeekend() ? "주말": "평일", monday.getWorkHour());
        System.out.printf("%s: %s, 근무시간 %d시간\n", tuesday.getKoreanName(), tuesday.isWeekend() ? "주말": "평일", tuesday.getWorkHour());
        System.out.printf("%s: %s, 근무시간 %d시간\n", wednesday.getKoreanName(), wednesday.isWeekend() ? "주말": "평일", wednesday.getWorkHour());
        System.out.printf("%s: %s, 근무시간 %d시간\n", thursday.getKoreanName(), thursday.isWeekend() ? "주말": "평일", thursday.getWorkHour());
        System.out.printf("%s: %s, 근무시간 %d시간\n", friday.getKoreanName(), friday.isWeekend() ? "주말": "평일", friday.getWorkHour());
        System.out.printf("%s: %s, 근무시간 %d시간\n", saturday.getKoreanName(), saturday.isWeekend() ? "주말": "평일", saturday.getWorkHour());
        System.out.printf("%s: %s, 근무시간 %d시간\n", sunday.getKoreanName(), sunday.isWeekend() ? "주말": "평일", sunday.getWorkHour());

        String today = sc.nextLine();
        int dynamicWorkHour = 0;
        for(Week day : Week.values()){
            if(day.getKoreanName().equals(today)){
                dynamicWorkHour = day.getWorkHour();
            }
        }

        System.out.printf("오늘은 %s입니다.\n", today);
        System.out.printf("%s이므로 %d시간 근무해야 합니다.", today, dynamicWorkHour);
    }
}
