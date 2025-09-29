package ch8.p4;

public interface DatabaseConnector {
    final String DB_DRIVER_VERSION = "2.1.0";

    public void connect();
    public void disconnect();
    public void executeQuery(String sql);

    public static void validateConnection(String url) {
        System.out.printf("URL 유효성 검사: %s\n", url);
    }

    public static String getDriverVersion(){
        return DB_DRIVER_VERSION;
    }

}
