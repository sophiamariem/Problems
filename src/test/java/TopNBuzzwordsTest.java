import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TopNBuzzwordsTest {

    private TopNBuzzwords topNBuzzwords = new TopNBuzzwords();

    //  elmo - 4
    //  elsa - 4
    //  "elmo" should be placed before "elsa" in the result because "elmo" appears in 3 different quotes and
    //  "elsa" appears in 2 different quotes.
    @Test
    public void testOne() {
        String[] toys = new String[]{"elmo", "elsa", "lego", "drone", "tablet", "warcraft"};
        String[] quotes = new String[]{
                "Elmo is the hottest of the season! Elmo will be on every kid's wishlist!",
                "The new Elmo dolls are super high quality",
                "Expect the Elsa dolls to be very popular this year, Elsa!",
                "Elsa and Elmo are the toys I'll be buying for my kids, Elsa is good",
                "For parents of older kids, look into buying them a drone",
                "Warcraft is slowly rising in popularity ahead of the holiday season"
        };

        List<String> expected = new ArrayList(Arrays.asList("elmo", "elsa"));
        assertEquals(expected, topNBuzzwords.topToys(6, 2, toys, 6, quotes));
    }

    @Test
    public void testTwo() {
        String[] toys = new String[]{"elmo", "elsa", "lego", "drone", "tablet", "warcraft"};
        String[] quotes = new String[]{
                "Expect the Elsa dolls to be very popular this year!",
                "Elsa and Elmo are the toys I'll be buying for my kids. Elmo is great",
                "For parents of older kids, look into buying them a drone",
                "Warcraft is slowly rising in popularity ahead of the holiday season"
        };

        List<String> expected = new ArrayList(Arrays.asList("elsa", "elmo"));
        assertEquals(expected, topNBuzzwords.topToys(6, 2, toys, 4, quotes));
    }

    @Test
    public void testThree() {
        String[] toys = new String[]{"elmo", "elsa", "lego", "drone", "tablet", "warcraft"};
        String[] quotes = new String[]{"Elsa and Elmo are the toys I'll be buying for my kids"};

        List<String> expected = new ArrayList(Arrays.asList("elmo", "elsa"));
        assertEquals(expected, topNBuzzwords.topToys(6, 2, toys, 1, quotes));
    }

    // If the value of topToys is more than the number of toys
    // return the names of only the toys mentioned in the quotes
    @Test
    public void testFour() {
        String[] toys = new String[]{"elmo", "elsa", "drone", "warcraft"};
        String[] quotes = new String[]{
                "Elmo is the hottest of the season! Elmo will be on every kid's wishlist!",
                "The new Elmo dolls are super high quality",
                "Expect the Elsa dolls to be very popular this year, Elsa!",
                "Elsa and Elmo are the toys I'll be buying for my kids, Elsa is good",
                "Warcraft is slowly rising in popularity ahead of the holiday season"
        };

        List<String> expected = new ArrayList(Arrays.asList("elmo", "elsa", "warcraft"));
        assertEquals(expected, topNBuzzwords.topToys(4, 5, toys, 1, quotes));
    }
}
