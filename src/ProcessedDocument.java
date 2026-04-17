public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();
        System.out.println();

        // Clone and configure PDF Document
        PdfDocument pdf1 = (PdfDocument) registry.getPdfPrototype();
        pdf1.setProperties("annual_report_2024.pdf", "Acme Corp", 150);
        pdf1.open();
        System.out.println();

        // Clone and configure Text Document
        TextDocument text1 = (TextDocument) registry.getTextPrototype();
        text1.setProperties("meeting_notes.txt", "UTF-8", 250);
        text1.open();
        System.out.println();

        // Clone and configure Spreadsheet Document
        SpreadsheetDocument sheet1 = (SpreadsheetDocument) registry.getSpreadsheetPrototype();
        sheet1.setProperties("sales_data_q1.xlsx", 1000, 20);
        sheet1.open();
        System.out.println();

        // Clone and configure PDF 2 Document
        PdfDocument pdf2 = (PdfDocument) registry.getPdfPrototype();
        pdf2.setProperties("summary_report.pdf", "Acme Corp", 30);
        pdf2.open();
    }
}