package factory;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LogState state=LogState.WARNING;
        LogerFactory factory = new LogerFactory(state);

        Loger loger=factory.getState();

        loger.dodajKomunikat(state,"trololo");
    }
}
