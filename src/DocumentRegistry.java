public class DocumentRegistry {
    private final PdfDocument pdfPrototype = new PdfDocument();
    private final TextDocument textPrototype = new TextDocument();
    private final SpreadsheetDocument spreadsheetPrototype = new SpreadsheetDocument();

    public Document getPdfPrototype() {
        return pdfPrototype.clone();
    }

    public Document getTextPrototype() {
        return textPrototype.clone();
    }

    public Document getSpreadsheetPrototype() {
        return spreadsheetPrototype.clone();
    }
}