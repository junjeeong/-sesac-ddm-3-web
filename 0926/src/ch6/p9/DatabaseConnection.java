package ch6.p9;

public class DatabaseConnection {
    static boolean isConnected = false;

    private DatabaseConnection(){
    }

    static void connect(){
        System.out.println("데이터베이스에 연결되었습니다.");
        isConnected = true;
    }

    static void disconnect(){
        System.out.println("데이터베이스 연결이 해제되었습니다.");
        isConnected = false;
    }

    public static boolean isConnected(){
        return isConnected;
    }
}
