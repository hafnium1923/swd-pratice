package springidol;

public class Encore {
    private Singer singer;

    public Encore(Singer singer) {
        this.singer =singer;
    }

    public void execute() {
        char quotes = '"';
        System.out.println(singer.getName() + " is singing a song " + quotes+ singer.getSong().getTitle() + quotes+" by " +singer.getSong().getArtist());
    }
}
