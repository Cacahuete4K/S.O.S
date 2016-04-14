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
	

	// each 0,016 second do this:
	public void handle(long now) {
		
		this.terrain.mvtir();
	
	
	}

}
