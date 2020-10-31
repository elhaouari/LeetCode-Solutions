package _17_Letter_Combinations_of_a_Phone_Number;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test(){
        var expected = new ArrayList<>(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));

        Solution s = new Solution();
        var actual = s.letterCombinations("23");
        Collections.sort(actual);
        Collections.sort(expected);

        assertEquals(expected, actual);
    }
}