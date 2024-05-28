import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.TreeSet;

public class TestTreeSet {
    @Test
    void testTreeSet(){
        TreeSet<Integer> t = new TreeSet<>();
        t.add(6);
        t.add(7);
        t.add(5);
        t.add(4);
        t.add(2);
        t.add(3);
        t.add(0);
        t.add(1);

        Integer i = t.first();
        Assertions.assertEquals(i, 0);

        Integer i2 = t.last();
        Assertions.assertEquals(i2, 7);

        t.remove(7);
        Integer i3 = t.last();
        Assertions.assertEquals(i3, 6);

        t.remove(0);
        Integer i4 = t.first();
        Assertions.assertEquals(i4, 1);

    }
}
