package ch8.p2;

public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        phone.call("010-1234-5678");
        phone.sendMessage("안녕", "홍길동");
        phone.connectWifi("HomeWIFI");
        phone.endCall();
        phone.disconnectWifi();
    }
}
