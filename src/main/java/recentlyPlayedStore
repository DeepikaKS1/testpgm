import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RecentlyPlayedStore {

    private Map<String, List<String>> songUserMap;
    private int capacity;

    public RecentlyPlayedStore(int capacity) {
        this.songUserMap = new HashMap<>();
        this.capacity = capacity;
    }

    public void recordSong(String user, String song) {
        List<String> songList = songUserMap.get(user);
        if (songList == null) {
            songList = new LinkedList<>();
            songUserMap.put(user, songList);
        }
        songList.add(0, song);
        if (songList.size() > capacity) {
            songList.remove(capacity);
        }
    }

    public List<String> getRecentSongs(String user) {
        return songUserMap.get(user);
    }
}
