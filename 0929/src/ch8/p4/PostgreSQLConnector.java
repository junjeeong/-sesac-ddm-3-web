package ch8.p4;

public class PostgreSQLConnector implements DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("PostgreSQL 데이터베이스에 연결되었습니다.");
    }
    @Override
    public void disconnect() {
        System.out.println("PostgreSQL 연결을 해제했습니다.");
    }
    @Override
    public void executeQuery(String sql) {
        System.out.printf("쿼리 실행: %s\n", sql);
    }
}
