package _22_Generate_Parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testGenerateParenthesis(){

        Solution s = new Solution();
        assertEquals("[((())), (()()), (())(), ()(()), ()()()]",s.generateParenthesis(3).toString());
    }
}