package springidol;

public class Song {
    private String title;
    private String artist; /*Song은 제목과 원곡자 이름을 속성으로 갖는다.*/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
