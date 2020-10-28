package Easy;

import org.junit.jupiter.api.Test;

public class ExcelSheetColumnTitleTest {
    @Test
    public void convertToTitle() throws Exception {
        ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
        System.out.println(excelSheetColumnTitle.convertToTitle(28));
    }

}