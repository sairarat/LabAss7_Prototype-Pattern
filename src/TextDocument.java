public class TextDocument implements Document {
    private String filePath;
    private String encoding;
    private int wordCount;

    public TextDocument() {
        System.out.println("Creating a Text Document prototype. //Executed in the constructor");
    }

    public void setProperties(String filePath, String encoding, int wordCount) {
        this.filePath = filePath;
        this.encoding = encoding;
        this.wordCount = wordCount;
    }

    @Override
    public Document clone() {
        try {
            return (TextDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone failed for Text", e);
        }
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document: " + filePath + " with encoding: " + encoding + " (" + wordCount + " words)");
        System.out.println("Type: " + getType() + ", Path: " + filePath + ", Encoding: " + encoding + ", Words: " + wordCount);
    }

    @Override
    public String getType() { return "Text"; }
}