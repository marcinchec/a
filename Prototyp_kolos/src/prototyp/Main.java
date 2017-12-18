package prototyp;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sheep owca = new Sheep();
        Sheep klon = (Sheep) owca.makecopy();

        System.out.println(System.identityHashCode(owca));
        System.out.println(System.identityHashCode(klon));
    }
}
