class Document {
    void open() {
        System.out.println("Opening document");
    }
}

class PDFDocument extends Document {
    void compress() {
        System.out.println("Compressing PDF");
    }
}

public class error {
    public static void main(String[] args) {

        Document doc = new PDFDocument();

        doc.compress();   // ERROR
    }
}
/*
This code gives an error because it tries to call a child class method (compress()) using a parent class reference.
doc is a Document reference.
The Document class does not have a compress() method. */