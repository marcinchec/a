package builder;

public class Director {
    private FileBuilder filebuilder;

    public Director(FileBuilder filebuilder) {
        this.filebuilder = filebuilder;
    }

    public String wygeneruj_napis(int[] tab)
    {
        String napis="";

        napis+=filebuilder.budujNaglowek();
        napis+="\n";

        napis+=filebuilder.budujTagi();
        napis+="\n";

        napis+=filebuilder.budujBody(tab);
        napis+="\n";

        return napis;
    }
}
