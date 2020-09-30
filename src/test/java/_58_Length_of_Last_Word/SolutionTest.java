package _58_Length_of_Last_Word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testLengthOfLastWord(){
        Solution s = new Solution();
        assertEquals(5, s.lengthOfLastWord("Hello World"));
    }
}