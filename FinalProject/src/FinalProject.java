import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FinalProject extends Application{
	
	/*Final Project layout for CS2450 Class
	 * Rewrite of the the website
	 * http://www.gatesnfences.com/
	 * to make improvements to appearance
	 * */
	
	//window size
	static final double WIDTH = 1000.0, HEIGHT = 1500.0;
	
	static final String aboutSec1 = "All of our Aluminum or Wrought Iron Gates, or Fences are designed and manufactured to withstand a range of outdoor conditions. Our\r\n" + 
			"commitment to our customers and dedication to produce quality gates has earned us thousands of satisfied customers.";
	static final String aboutSec2 = "Although we offer a wide selection or Ornamental Designs or Decorative Designs, we can design and manufacture any style in aluminum or\r\n" + 
			"wrought iron metals. L. A. Ornamental & Rack Corp also offers Fences, Garden or Walk Thru Gates to match your driveway  gates. With over\r\n" + 
			"thirty five years of experience in manufacturing and designing elegant, custom, or exotic Aluminum Driveway Gates and Fences, our past and\r\n" + 
			"future customers can have peace of mind that they are receiving quality workmanship.  We are a Fence Company that gives our customers\r\n" + 
			"110% of dedication to manufacture quality driveway gates and fences.\r\n" + 
			"For a quote please send an e-mail to LAOrnamental@aol.com";
	static final String aboutSec3 = "";

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		VBox vbox = new VBox();
		
		// Create a Scene and display it.
		Scene scene = new Scene(vbox, WIDTH, HEIGHT);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
