import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExcelSheetColumnNumberTest {

    private ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();

    @Test
    public void test() {
        assertEquals(1, excelSheetColumnNumber.titleToNumber("A"));
        assertEquals(28, excelSheetColumnNumber.titleToNumber("AB"));
        assertEquals(701, excelSheetColumnNumber.titleToNumber("ZY"));
    }
}
