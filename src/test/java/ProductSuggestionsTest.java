import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class ProductSuggestionsTest {

    private ProductSuggestions productSuggestions = new ProductSuggestions();

    @Test
    public void testOne() {
        String[] input = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};

        List<List<String>> result = new ArrayList();
        result.add(Arrays.asList("mobile", "moneypot", "monitor"));
        result.add(Arrays.asList("mobile", "moneypot", "monitor"));
        result.add(Arrays.asList("mouse", "mousepad"));
        result.add(Arrays.asList("mouse", "mousepad"));
        result.add(Arrays.asList("mouse", "mousepad"));

        assertEquals(result, productSuggestions.suggestedProducts(input, "mouse"));
    }

    @Test
    public void testTwo() {
        String[] input = {"havana"};

        List<List<String>> result = new ArrayList();
        result.add(Arrays.asList("havana"));
        result.add(Arrays.asList("havana"));
        result.add(Arrays.asList("havana"));
        result.add(Arrays.asList("havana"));
        result.add(Arrays.asList("havana"));
        result.add(Arrays.asList("havana"));

        assertEquals(result, productSuggestions.suggestedProducts(input, "havana"));
    }

    @Test
    public void testThree() {
        String[] input = {"bags", "baggage", "banner", "box", "cloths"};

        List<List<String>> result = new ArrayList();
        result.add(Arrays.asList("baggage", "bags", "banner"));
        result.add(Arrays.asList("baggage", "bags", "banner"));
        result.add(Arrays.asList("baggage", "bags"));
        result.add(Arrays.asList("bags"));

        assertEquals(result, productSuggestions.suggestedProducts(input, "bags"));
    }

    @Test
    public void testFour() {
        String[] input = {"havana"};

        List<List<String>> result = new ArrayList();
        result.add(Collections.emptyList());
        result.add(Collections.emptyList());
        result.add(Collections.emptyList());
        result.add(Collections.emptyList());
        result.add(Collections.emptyList());
        result.add(Collections.emptyList());
        result.add(Collections.emptyList());

        assertEquals(result, productSuggestions.suggestedProducts(input, "tatiana"));
    }

    @Test
    public void testSix() {
        String[] input = {"apple", "bags", "map"};

        List<List<String>> result = new ArrayList();
        result.add(Arrays.asList("apple"));
        result.add(Arrays.asList("apple"));
        result.add(Arrays.asList("apple"));
        result.add(Arrays.asList("apple"));
        result.add(Arrays.asList("apple"));

        assertEquals(result, productSuggestions.suggestedProducts(input, "apple"));
    }

    @Test
    public void testSeven() {
        String[] input = {"bat", "hat", "cat"};

        List<List<String>> result = new ArrayList();
        result.add(Arrays.asList("hat"));
        result.add(Arrays.asList("hat"));
        result.add(Arrays.asList("hat"));

        assertEquals(result, productSuggestions.suggestedProducts(input, "hat"));
    }

    @Test
    public void testEight() {
        String[] input = {"mobile", "mouse", "monitor"};

        List<List<String>> result = new ArrayList();
        result.add(Arrays.asList("mobile", "monitor", "mouse"));
        result.add(Arrays.asList("mobile", "monitor", "mouse"));
        result.add(Arrays.asList("mouse"));
        result.add(Arrays.asList("mouse"));
        result.add(Arrays.asList("mouse"));
        result.add(Collections.emptyList());
        result.add(Collections.emptyList());
        result.add(Collections.emptyList());

        assertEquals(result, productSuggestions.suggestedProducts(input, "mousepad"));
    }

    @Test
    public void testSimpleOne() {
        String[] input = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};

        List<List<String>> result = new ArrayList();
        result.add(Arrays.asList("mobile", "moneypot", "monitor"));
        result.add(Arrays.asList("mobile", "moneypot", "monitor"));
        result.add(Arrays.asList("mouse", "mousepad"));
        result.add(Arrays.asList("mouse", "mousepad"));
        result.add(Arrays.asList("mouse", "mousepad"));

        assertEquals(result, productSuggestions.suggestedProductsSimple(input, "mouse"));
    }
}
