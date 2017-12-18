package derek_komenda;

public class PodglosnijUrzadzenie implements Command {
    private Urzadzenie urzadzenie;

    public PodglosnijUrzadzenie(Urzadzenie urzadzenie) {
        this.urzadzenie = urzadzenie;
    }

    @Override
    public void execute() {
        urzadzenie.podglosnij();
    }
}
