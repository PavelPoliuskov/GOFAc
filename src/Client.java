
public class Client {


    public static void main(String[] args) {

        Proxy forest = new Proxy();

        forest.setNrOfTrees(10);
        forest.createForest();
        forest.treeCollectionTest();
    }
}