
import java.util.ArrayList;
import java.util.List;

public class Forest {
    public static List<Tree> trees = new ArrayList<>();
    public static List<Bush> bushes = new ArrayList<>();
    Object obj;

    public void plantTree() {
        obj = TreeFactory.getTree();

//        if (trees.add((Tree) obj)) throw new Exception("sdasd");
//        else if (bushes.add((Bush) obj)) throw new Exception("sadasd");
//        else {
//            try {
//            } catch (Exception e) {
//                System.out.println("this object doesn't belong to the Forest");
//            }
//        }



//
        try {
            trees.add((Tree) obj);
            return;
        } catch (Exception e) {}

        try {
            bushes.add((Bush) obj);
        } catch (Exception e) {
            System.out.println("this object doesn't belong to this Forest");
        }
    }

}


