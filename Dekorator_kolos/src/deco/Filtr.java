package deco;



import java.util.List;

public abstract class Filtr extends BaseClass {
    protected BaseClass base;

    public Filtr(BaseClass base) {
        this.base = base;
    }

    public abstract List<Osoba> czytaj();
}
