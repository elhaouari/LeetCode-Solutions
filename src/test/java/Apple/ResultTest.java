package Apple;

import org.junit.jupiter.api.Test;

import java.util.List;

class ResultTest {

    @Test
    public void test(){
        var r = Result.minTime(List.of(10, 20), List.of(2,3,1,2,5,8,4,3));
        System.out.println(r);
    }
}