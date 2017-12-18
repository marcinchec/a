package derek_komenda;

public class WylaczUrzadzenie implements Command {
    private Urzadzenie urzadzenie;

    public WylaczUrzadzenie(Urzadzenie urzadzenie) {
        this.urzadzenie = urzadzenie;
    }

    @Override
    public void execute() {
        urzadzenie.wylacz();
    }
}
