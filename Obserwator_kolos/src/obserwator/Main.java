package obserwator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] l = new int[]{21,23,45,23,65,64};
        Totolotek totolotek = new Totolotek(l);

        new Internet(totolotek);
        TV tv=new TV(totolotek);
        totolotek.powiadomObserwatorow();
        totolotek.usunObserwatora(tv);
        l=new int[]{24,12,32,32,436,433};
        totolotek.setLiczby(l);
    }
}
