import java.util.Iterator;

public class TreeIteratorTest implements TreeIterator {

    public Forest forest = Proxy.forest;

    @Override
    public Iterator createIterator() {

        return forest.trees.iterator();
    }


}
