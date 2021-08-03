import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> songList = new HashMap<String, String>();
        songList.put("Song 1", "AHHHHH Lyrcis");
        songList.put("Song 2", "Yaaaaaaa Lyrcis");
        songList.put("Song 3", "EEEEEEE Lyrcis");
        songList.put("Song 4", "Wow super cool Lyrcis");

        String oneSong = songList.get("Song 2");
        System.out.println(oneSong);

        Set<String> keys = songList.keySet();
        for(String key : keys) {
            System.out.println("Title:" + key);
            System.out.println("Lyrics:" + songList.get(key));
        }

    }
}