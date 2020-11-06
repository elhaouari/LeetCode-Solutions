package _121_BestTimeToBuyAndSellStock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test(){
        Solution s = new Solution();
        assertEquals(5, s.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}