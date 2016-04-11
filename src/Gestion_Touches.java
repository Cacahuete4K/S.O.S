import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class Gestion_Touches implements EventHandler<KeyEvent> {
	private Terrain terrain;
	
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
	}

}
