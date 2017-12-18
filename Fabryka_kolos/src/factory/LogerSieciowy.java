package factory;

public class LogerSieciowy implements Loger {
    private String ip;
    private int port;

    public LogerSieciowy(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    @Override
    public void dodajKomunikat(LogState status, String komunikat) {
        System.out.println(ip+" "+port);
        System.out.println(status+" "+komunikat);
    }
}
