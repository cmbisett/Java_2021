import java.util.Date;

public class AlfredQuotes {
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name, String dayPeriod) {
        return name + " " + dayPeriod;
    }

    public String dateAnnouncement() {
        return "todays date is " + new Date();
    }

    public String respondedBeforeAlexis(String conversation) {
        int a = conversation.indexOf("Alexis");
        int b = conversation.indexOf("Alfred");
        
        if(a > -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (b > -1) {
            return "At your service, As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }

    }
}