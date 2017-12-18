package strategiaIsingleton;

public class Podatekliniowy implements Podatek {
    @Override
    public double licz(double kwota) {
        return kwota*0.81;
    }
}
