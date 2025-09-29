package ch9.p4;

public class Button {
    String type;
    EventListener listener;

    Button(String type) {
        this.type = type;
    }

    void setListener(EventListener listener) {
        this.listener = listener;
    };

    void click() {
        System.out.println(String.format("%s 버튼이 클릭되었습니다.", type));
        this.listener.onClick();
    }
}
