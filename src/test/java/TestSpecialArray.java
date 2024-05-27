import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.Main.specialArray;

public class TestSpecialArray {
    @Test
    void testspecialArray(){
        int i = specialArray(new int[]{3, 5});
        Assertions.assertEquals(2, i);
    }
}
