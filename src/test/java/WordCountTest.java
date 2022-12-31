import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class WordCountTest {
    WordCount wordCount = mock(WordCount.class);
    String test = "Test 1, Test 1, Test 1. test1";

    @Test
    void countWordInTextTest() {
        doCallRealMethod().when(wordCount).countWordInText(test);
        verify(wordCount, times(2));
    }
}