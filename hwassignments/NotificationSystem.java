// Step 1: Define the interface
interface Notifier {
    void send(String message);
}

// Step 2: Implement different notification types
class EmailNotifier implements Notifier {
    public void send(String message) {
        System.out.println("[Email] " + message);
    }
}

class SMSNotifier implements Notifier {
    public void send(String message) {
        System.out.println("[SMS] " + message);
    }
}

class PushNotifier implements Notifier {
    public void send(String message) {
        System.out.println("[Push] " + message);
    }
}

// Step 3: Main program
public class NotificationSystem {
    public static void main(String[] args) {
        // Create different notifiers
        Notifier email = new EmailNotifier();
        Notifier sms = new SMSNotifier();
        Notifier push = new PushNotifier();

        // Send notifications directly
        email.send("Meeting at 10 AM tomorrow.");
        sms.send("Your OTP is 123456.");
        push.send("You have a new friend request.");
    }
}
