package strategiaIsingleton;

public class PodatekProgresywny implements Podatek {
    @Override
    public double licz(double kwota) {
        if(kwota<=10000)
        {
            return kwota*0.82;
        }
        else
        {
            double podatek=10000*0.82;
            podatek+=(kwota-10000)*0.68;
            return podatek;
        }
    }
}
