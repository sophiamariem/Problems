import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class RandomizedSetTest {

    @Test
    public void test() {
        RandomizedSet obj = new RandomizedSet();
        assertTrue(obj.insert(5));
        assertTrue(obj.insert(7));
        assertTrue(obj.insert(8));

        assertTrue(obj.remove(5));
        assertThat(obj.getRandom(), Matchers.anyOf(Matchers.is(7), Matchers.is(8)));
    }
}
