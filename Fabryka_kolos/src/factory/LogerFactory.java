package factory;


public class LogerFactory {
    private LogState state;
    public LogerFactory(LogState state) {
        this.state=state;
    }

    public Loger getState() {
        switch (this.state)
        {
            case INFO:
                return new LogerKonsolowy();
            case ERROR:
                return new LogerPlikowy("src/factory/plik.txt");
            case WARNING:
                return new LogerSieciowy("124.122.3.1",400);

        }
        if (state==null)
        {
            System.out.println("null");
        }
        return null;
    }
}
