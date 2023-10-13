import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("subscriber - 1");
        stringList.add("subscriber - 2");
        stringList.add("subscriber - 4");
        stringList.add("subscriber - 5");

        String target = "subscriber - 1";

        int occurrence = ListLines.countOccurrence(stringList, target);
        System.out.println("1. Method countOccurrence : ");
        System.out.println("Occurrences of '" + target + "': " + occurrence);

        Integer[] array = {1, 2, 3};
        List<Integer> integerList = ListUtils.toList(array);

        System.out.println("Was List from Array: " + integerList);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        List<Integer> uniqueNumbers = NumberUtils.findUnique(numbers);
        System.out.println("After List unique numbers: " + uniqueNumbers);
        System.out.println("**********************************************************");

        Integer[] array1 = {1, 2, 3, 4};
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> numbersOne = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> list = toList(array1);
        List<Integer> intList = toList(intArray);
        System.out.println("2. Method toList : 1 version ");
        System.out.println(list);
        System.out.println("2. Method toList : 2 version ");
        System.out.println("Array : " + Arrays.toString(intArray));
        System.out.println("List :  " + intList);
        System.out.println("**********************************************************");
        System.out.println("3. Method findUnique :  ");
        List<Integer> uniqueNumbersOne = NumberUtils.findUnique(numbersOne);
        System.out.println("Original List : " + numbersOne);
        System.out.println("Unique List : " + uniqueNumbersOne);
        System.out.println("**********************************************************");
        System.out.println("4**. Method calcOccurrence :  ");
        List<String> wordList = new ArrayList<>();
        wordList.add("bird");
        wordList.add("fox");
        wordList.add("cat");
        wordList.add("bird");
        wordList.add("fox");
        wordList.add("cat");
        wordList.add("bird");
        calcOccurrence(wordList);
        System.out.println("**********************************************************");
        System.out.println("4***. Method calcOccurrence :  ");
        List<String> textList = new ArrayList<>();
        textList.add("bird");
        textList.add("cat");
        textList.add("fox");
        textList.add("bird");
        textList.add("cat");
        List<WordOccurrence> occurrences = findOccurrence(textList);
        System.out.println("The result of calculating word occurrences : ");
        for (WordOccurrence occurrenceOne : occurrences) {
            System.out.println(" name : " + occurrenceOne.getName() + " , occurrence : " + occurrenceOne.getOccurrence());
        }
    }

    private static List<Integer> toList(Integer[] array1) {
        return List.of(array1);
    }
    public static void calcOccurrence(List<String> wordList) {
        List<String> uniqueWords = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();
        for (String word : wordList) {
            if (uniqueWords.contains(word)) {
                int index = uniqueWords.indexOf(word);
                int count = counts.get(index);
                counts.set(index, count + 1);
            } else {
                uniqueWords.add(word);
                counts.add(1);
            }
        }
        System.out.println("The result of calculating word occurrences : ");
        for (int i = 0; i < uniqueWords.size(); i++) {
            System.out.println(uniqueWords.get(i) + ": " + counts.get(i));
        }
    }

    public static List<WordOccurrence> findOccurrence(List<String> textList) {
        List<WordOccurrence> occurrences = new ArrayList<>();
        for (String text : textList) {
            boolean found = false;
            for (WordOccurrence occurrenceOne : occurrences) {
                if (occurrenceOne.getName().equals(text)) {
                    occurrenceOne.incrementOccurrence(1);
                    found = true;
                    break;
                }
            }
            if (!found) {
                occurrences.add(new WordOccurrence(text, 1));
            }
        }
        return occurrences;
    }

}

class WordOccurrence {
    private String name;
    private int occurrence2;

    public WordOccurrence(String name, int occurrence2) {
        this.name = name;
        this.occurrence2 = 1;
    }

    public String getName() {
        return name;
    }

    public int getOccurrence() {
        return occurrence2;
    }

    public void incrementOccurrence(int occurrenceOn) {
        occurrence2++;
    }
//

    public static List<Integer> toList(Integer[] numbers) {
        return List.of(numbers);
    }

}

