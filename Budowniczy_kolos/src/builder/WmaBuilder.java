package builder;

public class WmaBuilder implements FileBuilder {
    private Wma wma;

    public WmaBuilder() {
        this.wma = new Wma();
    }

    @Override
    public String budujNaglowek() {
        wma.setNaglowek("WmaHeader");
        return "WmaHeader";
    }

    @Override
    public String budujTagi() {
        wma.setTags("WmaTags");
        return "WmaTags";
    }

    @Override
    public String budujBody(int[] tablica) {
        String napis="";
        for(int i=0;i<tablica.length;i++)
        {
            if(tablica[i]>100)
            {
                napis+=String.valueOf(100);
                napis+=",";
            }
            else if(tablica[i]<-100)
            {
                napis+=String.valueOf(-100);
                napis+=",";
            }
            else
            {
                napis+=String.valueOf(tablica[i]);
                napis+=",";
            }
        }
        wma.setBody(napis);
        return napis;
    }
}
