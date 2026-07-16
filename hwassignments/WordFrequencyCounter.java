import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take sentence input
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Step 2: Normalize text (lowercase) and split into words
        String[] words = sentence.toLowerCase().split("\\W+");

        // Step 3: Use HashMap to count frequencies
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        // Step 4: Print results
        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        scanner.close();
    }
}
