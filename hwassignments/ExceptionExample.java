
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // Imagine sending a message
            String network = null; // no network available

            // This will throw NullPointerException
            System.out.println("Connecting to " + network.toUpperCase());
            
            System.out.println("Message sent successfully!");
        } catch (NullPointerException e) {
            // Handling the problem like a human
            System.out.println("Oops! No network. Please try again later.");
        } finally {
            // Always runs, like saying "done for now"
            System.out.println("Program finished.");
        }
    }
}

