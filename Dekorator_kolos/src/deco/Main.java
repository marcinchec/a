package deco;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BaseClass base=new BaseClass();

        Filtr filtr = new FiltrPelnoletnosci(new FiltrKobiet(base));

        for(Osoba o : filtr.czytaj())
        {
            System.out.println(o.getImie()+" "+o.getWiek());
        }
    }
}
