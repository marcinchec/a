package single;

public class SingletonClass {
    int a;
    private SingletonClass(){}

    private static SingletonClass instancja=null;

    public static SingletonClass getInstancja() {
        if(instancja==null)
            instancja=new SingletonClass();
        return instancja;
    }

    public void doit()
    {
        System.out.println("inst1 "+ a);
    }
    public void setA(int a){
        this.a=a;
    }
}
