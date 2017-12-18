package factory2;

public class FabrykaDni {

    DzienTygodnia getDzien(int numer_dnia)
    {
        switch (numer_dnia)
        {
            case 2:
                return new Poniedzialek();
            case 3:
                return new Wtorek();
            case 4:
                return new Sroda();
            case 5:
                return new Czwartek();
            case 6:
                return new Piatek();
            case 7:
            case 1:
                return new NullObject();
        }
        return new NullObject();
    }
}
