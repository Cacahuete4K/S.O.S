import javafx.animation.AnimationTimer;


public class Animation extends AnimationTimer {
	
	private Terrain terrain;
	private double startAt;
	private int previousSecond;
	
	public Animation(Terrain terrain) {
		this.terrain = terrain;
		this.startAt = System.nanoTime();
		this.previousSecond = 0;
	}
	

	public void handle(long now) {
		this.terrain.mvtir();
		this.terrain.rmvtir();
		// each 0,016 second do this:
		int currentSecond = (int) ((now-this.startAt) / 1_000_000_000); 
		// check if one second has passed	
				if (currentSecond > this.previousSecond) {
					// each second do this:
					this.previousSecond++;
				}
	}

}
