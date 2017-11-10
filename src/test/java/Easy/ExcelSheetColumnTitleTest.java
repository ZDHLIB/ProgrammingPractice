package Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExcelSheetColumnTitleTest {
    @Test
    public void convertToTitle() throws Exception {
        ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
        System.out.println(excelSheetColumnTitle.convertToTitle(28));
    }

}