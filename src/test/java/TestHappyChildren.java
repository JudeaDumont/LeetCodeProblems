import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.Main.maximumHappinessSumSLOWER;
import static org.example.Main.maximumHappinessSumSLOW;

public class TestHappyChildren {
    @Test
    void testMaximumHappinessSumSLOW(){
        Long i = maximumHappinessSumSLOW(new int[]{1, 1, 1, 1}, 2);
        Assertions.assertEquals(1, i);

        Long i2 = maximumHappinessSumSLOW(new int[]{10, 47, 47}, 3);
        Assertions.assertEquals(101, i2);
    }
    @Test
    void testMaximumHappinessSum(){
        Long i = maximumHappinessSumSLOWER(new int[]{1, 1, 1, 1}, 2);
        Assertions.assertEquals(1, i);

        Long i2 = maximumHappinessSumSLOWER(new int[]{10, 47, 47}, 3);
        Assertions.assertEquals(101, i2);

        Long i3 = maximumHappinessSumSLOWER(new int[]{12, 1, 42}, 3);
        Assertions.assertEquals(53, i3);
    }
}
