package iter;

import java.awt.*;

public class Repo implements Kontener {
    private String[] lista = {"sadsad","asdgghhhh","saaaaaa","bbbbbbbb"};

    @Override
    public Iterator getIterator() {
        return new RepoIterator();
    }
    private class RepoIterator implements Iterator{
        int index=0;
        @Override
        public boolean hasNext() {
            if(index<lista.length)
                return true;
            else return false;
        }

        @Override
        public Object next() {
            if(this.hasNext())
            {
                return lista[index++];
            }
            return null;
        }
    }
}
