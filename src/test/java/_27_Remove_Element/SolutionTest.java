package _27_Remove_Element;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void removeElementTestExample1(){
        Solution s = new Solution();
        int[] arr = new int[]{0,1,2,2,3,0,4,2};
        assertEquals(5, s.removeElement(arr, 2 ));
        assertArrayEquals(new int[]{0,1,3,0,4,0,4,2}, arr);
    }
}