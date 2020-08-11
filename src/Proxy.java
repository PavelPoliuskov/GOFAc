import java.util.Iterator;

public class Proxy implements CreateForest {

    static int nrOfTrees;
    static TreeIteratorTest treeCollection = new TreeIteratorTest();
    public static Forest forest = new Forest();

    @Override
    public Forest createForest() {

            for (int i = 0; i < nrOfTrees; i++) {
                forest.plantTree();
            }
            return forest;
    }


    @Override
    public int setNrOfTrees(int nrOfTrees) {
        this.nrOfTrees = nrOfTrees;
        return nrOfTrees;
    }

    public void treeCollectionTest() {
        int j = 0;
        for (Iterator iter = treeCollection.createIterator(); iter.hasNext(); ) {
            String tree = Forest.trees.get(j).name;
            iter.next();
            System.out.println("Tree : " + tree);
            j++;
        }
    }
}