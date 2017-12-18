package single;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // SingletonClass nowa=new SingletonClass();
        SingletonClass nowa=SingletonClass.getInstancja();
        nowa.setA(10);
        nowa.doit();
        SingletonClass nowa1=SingletonClass.getInstancja();
        nowa1.setA(15);
        nowa1.doit();
        nowa.doit();
    }
}
