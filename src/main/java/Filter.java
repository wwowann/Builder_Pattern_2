import java.util.ArrayList;
import java.util.List;

public class Filter {

    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> sourse) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer integerList : sourse) {
            if (integerList > treshold) {
                result.add(integerList);
                logger.log("Элемент " + integerList + " подходит");
            } else logger.log("Элемент " + integerList + " не подходит");
        }
        return result;
    }
}
