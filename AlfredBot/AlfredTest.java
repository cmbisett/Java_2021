public class AlfredTest {
    public static void main(String[] args) {
        AlfredQuotes alfredbot = new AlfredQuotes();

        String testGreeting = alfredbot.basicGreeting();
        String testGuestGreeting = alfredbot.guestGreeting("Beth Kane", "evening");
        String testDateAnnouncement = alfredbot.dateAnnouncement();

        String alexisTest = alfredbot.respondedBeforeAlexis(
            "Alexis! PLay some low-fi beats."
        );
        String alfredTest = alfredbot.respondedBeforeAlexis(
            "I can't find my yo-yo. Maybe Alfred will know where it is."
        );
        String notReleventTest = alfredbot.respondedBeforeAlexis(
            "Maybe that's what Batman is about. Not winning. But failing.."
        );

        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notReleventTest);

    }
}