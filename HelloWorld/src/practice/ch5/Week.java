package practice.ch5;

public enum Week {
    MONDAY("월요일", false, 8),
    TUESDAY("화요일", false, 8),
    WEDNESDAY("수요일", false, 8),
    THURSDAY("목요일", false, 8),
    FRIDAY("금요일", false, 8),
    SATURDAY("토요일", true, 0),
    SUNDAY("일요일", true, 0);

    private final String koreanName;
    private final boolean isWeekend;
    private final int workHour;

    Week(String koreanName, boolean isWeekend, int workHour){
        this.koreanName = koreanName;
        this.isWeekend = isWeekend;
        this.workHour = workHour;
    }

    public String getKoreanName(){
        return koreanName;
    }

    public boolean isWeekend(){
        return isWeekend;
    }

    public int getWorkHour(){
        return workHour;
    }
}


