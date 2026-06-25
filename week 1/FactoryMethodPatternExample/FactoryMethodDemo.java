public class FactoryMethodDemo {
    public static void main(String[] args) {
        DocumentFactory pdfFactory=new PdfDocumentFactory(); 
        pdfFactory.displayDocument();
        DocumentFactory wordFactory=new WordDocumentFactory();
        wordFactory.displayDocument();
        DocumentFactory excelFactory=new ExcelDocumentFactory();
        excelFactory.displayDocument();
    }
}
