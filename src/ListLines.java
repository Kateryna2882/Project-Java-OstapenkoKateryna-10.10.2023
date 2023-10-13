import java.util.List;

public class ListLines {
        public static int countOccurrence(List<String> stringList, String target) {
            int count = 0;
            for (String line : stringList) {
                if (line.equals(target)) {
                    count++;
                }
            }
            return count;
        }
    }


