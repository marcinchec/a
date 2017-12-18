package obserwator;

import java.util.ArrayList;
import java.util.List;

public class Totolotek {
    private int[] liczby;
    private List<Obserwator> media;

    public Totolotek(int[] liczby) {
        this.liczby = liczby;
        this.media = new ArrayList<>();
    }

    public void dodajObserwatora(Obserwator nowy)
    {
        media.add(nowy);
    }

    public void usunObserwatora(Obserwator usun)
    {
        int index=media.indexOf(usun);
        media.remove(index);
    }

    public void powiadomObserwatorow()
    {
        for(Obserwator m : media)
        {
            m.update();
        }
    }

    public void setLiczby(int[] nowa)
    {
        this.liczby=nowa;
        powiadomObserwatorow();
    }

    public int[] getLiczby() {
        return liczby;
    }
}
