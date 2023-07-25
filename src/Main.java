import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String sentence = "Hello, Hello world,Java one, two, three, Hello Java, Hello";
        String[] words = sentence.split(" ");

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String word : words) {
            if (hashMap.containsKey(word)) {
                int count = hashMap.get(word);
                count++;
                hashMap.put(word, count);
            } else {
                hashMap.put(word, 1);
            }
        }
        System.out.println(hashMap);
    }
}