package irek;

public class ZapiszLitery implements Command {
    ZapiszDoPliku zapiszlitery;
    int godz=20;
    int min=20;

    public ZapiszLitery(ZapiszDoPliku zapiszlitery) {
        this.zapiszlitery = zapiszlitery;
    }

    @Override
    public void execute(String path, int godz, int min) {
        zapiszlitery.zapisz();
    }
}
