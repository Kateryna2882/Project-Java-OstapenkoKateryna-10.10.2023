import java.util.ArrayList;
import java.util.List;

public class NumberUtils {
    public static List<Integer> findUnique(List<Integer> numbers) {
        List<Integer> uniqueNumbersOne = new ArrayList<>();
        for (Integer number : numbers) {
            if (!uniqueNumbersOne.contains(number)) {
                uniqueNumbersOne.add(number);
            }
        }
        return uniqueNumbersOne;
    }

}
