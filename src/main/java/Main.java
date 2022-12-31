public class Main {
    public static void main(String[] args) {
        WordCount wordCount = new WordCount();
        String test = "Test 1, Test 1, Test 1. test 1, test1";
        String test1 = "Andrii, Andrii, Andrii, Andrii, Andrii - learn Java";
        wordCount.countWordInText(test);
        wordCount.countWordInText(test1);
    }
}
