package iter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Repo rep = new Repo();
        for(Iterator iter=rep.getIterator();iter.hasNext();)
        {
            String element= (String) iter.next();
            System.out.println(element);
        }
    }
}
