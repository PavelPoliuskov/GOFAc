import java.util.HashMap;
import java.util.Random;

public class TreeFactory {
    public static final HashMap<String, Tree> treeMap = new HashMap<>();

    public static Object getTree() {

        int i = new Random().nextInt(2);
        if (i % 2 == 0) {
            Tree theTree = new Tree();
            String key = theTree.name;

            Tree tree = treeMap.get(key);
            if (tree == null) {
                tree = theTree;
                treeMap.put(key, tree);
                System.out.println(key + " added to the list");
            } else {
                System.out.println(key + " taken from the list");
                return tree;
            }
            return tree;

        } else if (i % 2 == 1){
            Bush bush = new Bush();
            System.out.println("Bush created");
            return bush;
        }

        return null;
    }

}