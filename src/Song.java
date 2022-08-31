public class Song {
    String title;
    double duration;

    public Song(String title, double duration){
        this.title = title;
        this.duration = duration;
    }

    public String getTitle(){
        return this.title;
    }

    public String toString(){
        return this.title + ": " + duration;
    }
}
