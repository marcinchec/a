package builder;

import java.io.File;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[]tab={12,24,54,64,13,86,13,53};

        FileBuilder filebuild = new Mp3Builder();

        Director director = new Director(filebuild);
        System.out.println(director.wygeneruj_napis(tab));
    }
}
