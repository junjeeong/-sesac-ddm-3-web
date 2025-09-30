package observerPattern;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news){
        System.out.printf("%s님이 뉴스 알림을 받았습니다.:%s\n", this.name, news);
    }

}
