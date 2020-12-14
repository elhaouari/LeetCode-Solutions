package challenge570.week2.PalindromePartitioning;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void test(){
        Solution s = new Solution();
        var actual = s.partition("aabcb");

        var expected = List.of(
                List.of("a","a","b","c","b"),
                List.of("a","a","bcb"),
                List.of("aa","b","c","b"),
                List.of("aa","bcb")
        );

        assertEquals(expected.size(), actual.size());
        assertTrue(expected.containsAll(actual));
        assertTrue(actual.containsAll(expected));
    }
}
