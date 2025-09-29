package ch8.p2;

public class SmartPhone implements Callable, Connectable, Messageable{
    @Override
    public void call(String number) {
        System.out.println(String.format("%s로 전화를 겁니다.", number));
    }
    @Override
    public void endCall() {
        System.out.println("통화를 종료합니다.");
    }
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println(String.format("안녕하세요 %s를 %s에게 전송했습니다.", message, recipient));
    }
    @Override
    public void connectWifi(String network) {
        System.out.println(String.format("%s 네트워크에 연결되었습니다.",  network));
    }

    @Override
    public void disconnectWifi(){
        System.out.println("WIFI 연결을 해제했습니다.");
    }
}
