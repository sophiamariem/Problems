import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoatLatinTest {

    private GoatLatin goatLatin = new GoatLatin();

    @Test
    public void test() {
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa",
                goatLatin.toGoatLatin("I speak Goat Latin"));
        assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa",
                goatLatin.toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }

    @Test
    public void testBoolArr() {
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa",
                goatLatin.toGoatLatinBoolArr("I speak Goat Latin"));
        assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa",
                goatLatin.toGoatLatinBoolArr("The quick brown fox jumped over the lazy dog"));
    }

    @Test
    public void test2() {
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa",
                goatLatin.toGoatLatinHelp("I speak Goat Latin"));
        assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa",
                goatLatin.toGoatLatinHelp("The quick brown fox jumped over the lazy dog"));
    }
}