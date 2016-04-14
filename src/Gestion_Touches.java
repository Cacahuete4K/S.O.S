import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class Gestion_Touches implements EventHandler<KeyEvent> {
	private Terrain terrain;
	private long shotTime;
	public Gestion_Touches(Terrain terrain){
		this.terrain = terrain;	
	}
	public void handle(KeyEvent event) {
		if(event.getCode().equals(KeyCode.LEFT)){
			this.terrain.mvgauche();
		}
		if(event.getCode().equals(KeyCode.RIGHT)){
			this.terrain.mvdroite();
		}
		if(event.getCode().equals(KeyCode.SPACE) && shotTime+1500000000< System.nanoTime()){
			this.terrain.tir();
			shotTime=System.nanoTime();
		}
	}

}
