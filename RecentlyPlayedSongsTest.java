import java.util.List;

public class RecentlyPlayedSongsTest {
    public static void main(String[] args) {
        RecentlyPlayedStore store = new RecentlyPlayedStore(3);

        // Record some songs for user1
        store.recordSong("user1", "song1");
        store.recordSong("user1", "song2");
        store.recordSong("user1", "song3");
        store.recordSong("user1", "song4");

        // Record some songs for user2
        store.recordSong("user2", "song5");
        store.recordSong("user2", "song6");
        store.recordSong("user2", "song7");

        // Get recently played songs for user1
        List<String> user1Songs = store.getRecentSongs("user1");
        System.out.println("Recently played songs for user1:");
        for (String song : user1Songs) {
            System.out.println(song);
        }

        // Get recently played songs for user2
        List<String> user2Songs = store.getRecentSongs("user2");
        System.out.println("Recently played songs for user2:");
        for (String song : user2Songs) {
            System.out.println(song);
        }
    }

}
