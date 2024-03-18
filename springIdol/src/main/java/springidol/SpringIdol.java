package springidol;

public class SpringIdol implements TalentCompetition {
	private Performer[] performers;
	private Encore encore;

	public Encore getEncore() {
		return encore;
	}

	public void setEncore(Encore encore) {
		this.encore = encore;
	}

	public SpringIdol() {
	}
	
	public Performer[] getPerformers() {
		return performers;
	}

	public void setPerformers(Performer[] performers) {
		this.performers = performers;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < performers.length; i++) {
			System.out.println("Performance #" + (i+1));
			Performer performer = performers[i];
			performer.perform();
			System.out.println("-----------------------");
		}

		System.out.println("Encore Performance");
		encore.execute();

	}
}
