package ch8.p4;

public class Main {
    public static void main(String[] args) {
        MySQLConnector mySQL = new MySQLConnector();
        PostgreSQLConnector postgreSQL = new PostgreSQLConnector();

        System.out.printf("DB 드라이버 버전: %s\n", DatabaseConnector.getDriverVersion());
        DatabaseConnector.validateConnection("jdbc:mysql://localhost:3306/testdb");
        mySQL.connect();
        mySQL.executeQuery("SELETE * FROM users");
        mySQL.disconnect();

        System.out.println();

        DatabaseConnector.validateConnection("jdbc:postgresql://localhost:5432/testdb");
        postgreSQL.connect();
        postgreSQL.executeQuery("SELETE * FROM products");
        postgreSQL.disconnect();

    }
}
