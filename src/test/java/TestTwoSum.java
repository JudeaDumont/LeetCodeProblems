import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.example.Main.specialArray;
import static org.example.Main.twoSum;

public class TestTwoSum {
    @Test
    void testTwoSum(){
        String i = Arrays.toString(twoSum(new int[]{3, 5}, 8));
        Assertions.assertEquals("[0, 1]", i);
    }
    @Test
    void testTwoSum2(){
        String i = Arrays.toString(twoSum(new int[]{3, 5, 2}, 5));
        Assertions.assertEquals("[0, 2]", i);
    }
    @Test
    void testTwoSum3(){
        String i = Arrays.toString(twoSum(new int[]{3, 2, 1}, 3));
        Assertions.assertEquals("[1, 2]", i);
    }
}
