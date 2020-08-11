import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tree {


    public List<String> colorList = Arrays.asList("Red", "Yellow", "Green", "White");
    private int r = new Random().nextInt(colorList.size());
    public String color = colorList.get(r);

    private List<String> sizeList = Arrays.asList("Big", "Medium", "Small");
    public int s = new Random().nextInt(sizeList.size());
    public String size = sizeList.get(s);

    public String name;


    public Tree() {
        this.name = color + size;
//        System.out.println(name);
    }

}

