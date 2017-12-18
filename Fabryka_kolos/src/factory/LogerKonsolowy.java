package factory;

public class LogerKonsolowy implements Loger {

    @Override
    public void dodajKomunikat(LogState status, String komunikat) {
        String skrot = String.valueOf(status);
        System.out.println(skrot.substring(0,3)+" "+komunikat);
    }
}
