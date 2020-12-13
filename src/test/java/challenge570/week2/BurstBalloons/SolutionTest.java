package challenge570.week2.BurstBalloons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void maxCoinsTest(){

        var input = new int[]{3,1,5,8};

        Solution s = new Solution();
        assertEquals(167, s.maxCoins(input));
    }
}
