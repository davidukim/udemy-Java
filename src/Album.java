import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private List<Song> songs;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new LinkedList<Song>();
    }

    public boolean addSong(String title, double duration){
        if (findSong(title) == null){
            songs.add(new Song(title, duration));
            return true;
        } else{
            System.out.println("Failed to add a song. Song already exists");
            return false;
        }
    }

    private Song findSong(String title){
        int i = 0;
        Iterator songsIterator = songs.iterator();
        if (songs.size() == 0){
            return null;
        }

        while (songsIterator.hasNext()){
            if ( songs.get(i) != null && (songs.get(i).title).equals(title) && !songs.get(i).title.equals("") ){
                return songs.get(i);
            }
            i++;
            if (i >= songs.size()){
                break;
            }
        }
        return null; // returns null if song was not found
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){

        // 트랙넘버 -> 나의 플레이리스트

        // 1) 이 앨범( song list )에서 트랙넘버에 해당하는 음악을 가져온다 (get)
        // 트랙넘버에 해당하는 음악이 없으면 리턴 폴스

        // 2) 트랙넘버에 해당하는 음악을 플레이리스트에 추가한다 (add)

        // 3) 리턴 트루..

        if (trackNumber-1 > songs.size() || songs.get(trackNumber-1) == null){
            return false;
        } else {
            playList.add(songs.get(trackNumber-1));
            return true;
        }
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        // 타이 -> 나의 플레이리스트

        // 1) 이 앨범( song list )에서 타이 해당하는 음악을 가져온다 (get)
        // 타이 해당하는 음악이 없으면 리턴 폴스

        // 2) 타이 해당하는 음악을 플레이리스트에 추가한다 (add)

        // 3) 리턴 트루
        if (songs.size() == 0) return false; // if album has no songs, fails to add a song to the list
        int i = 0;
        while ( i < songs.size()){
            if ( (songs.get(i).getTitle()).equals(title) ){
                playList.add(songs.get(i));
                return true;
            }
            i++;
        }
        return false;
    }
}
