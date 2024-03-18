package springidol;

public class Singer implements Performer{
    private  String name;
    private Song song; /*이름과 지정곡 정보를 갖는다. 지정곡은 Song 클래스 객체를 참조한다.*/
    private  Instrument instrument; /*가수 B는 악기도 연주한다*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*SpEl을 이용한 DI를 위한 getter&setter*/
    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public Singer(String name, Song song) {
        this.name = name;
        this.song = song;
    }

    /*가수 B를 위한 생성자*/
    public Singer(String name, Song song, Instrument instrument) {
        this.name = name;
        this.song = song;
        this.instrument = instrument;
    }
    @Override
    public void perform() throws PerformanceException {
        char quotes = '"';
        System.out.println(name +" is Singing a song "+ quotes + song.getTitle() + quotes + " by " + song.getArtist());
    if(instrument != null) {
        System.out.print("while playing piano ");
        instrument.play();
    }
    }
}
