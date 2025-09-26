package ch6.p9;

public class p9 {
        public static void main(String[] args) {
            System.out.println("데이터베이스 연결 인스턴스 생성");

            DatabaseConnection.connect();

            System.out.println("연결 상태: " + DatabaseConnection.isConnected);

            DatabaseConnection.disconnect();

            System.out.println("연결 상태: " + DatabaseConnection.isConnected);
        }
}
