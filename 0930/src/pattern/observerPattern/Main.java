import pattern.observerPattern.NewsPublisher;
import pattern.observerPattern.Subscriber;


public class Main {
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();

        // 구독자 추가
        Subscriber s1 = new Subscriber("Alice");
        Subscriber s2 = new Subscriber("Bob");
        publisher.addObserver(s1);
        publisher.addObserver(s2);

        // 뉴스 발행
        publisher.notifyObservers("속보: 자바 옵저버 패턴 출시!");
        publisher.notifyObservers("공지: 내일은 휴간입니다.");

        // 구독자 해지
        publisher.removeObserver(s1);

        // 다시 뉴스 발행
        publisher.notifyObservers("속보: Bob만 이 뉴스를 받습니다.");

    }
}