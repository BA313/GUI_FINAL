import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
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
	
	//about section text
	static final String aboutSec1 = "All of our Aluminum or Wrought Iron Gates, or Fences are designed and manufactured to withstand a range of outdoor conditions. Our\r\n" + 
			"commitment to our customers and dedication to produce quality gates has earned us thousands of satisfied customers.";
	static final String aboutSec2 = "Although we offer a wide selection or Ornamental Designs or Decorative Designs, we can design and manufacture any style in aluminum or\r\n" + 
			"wrought iron metals. L. A. Ornamental & Rack Corp also offers Fences, Garden or Walk Thru Gates to match your driveway  gates. With over\r\n" + 
			"thirty five years of experience in manufacturing and designing elegant, custom, or exotic Aluminum Driveway Gates and Fences, our past and\r\n" + 
			"future customers can have peace of mind that they are receiving quality workmanship.  We are a Fence Company that gives our customers\r\n" + 
			"110% of dedication to manufacture quality driveway gates and fences.\r\n" + 
			"For a quote please send an e-mail to LAOrnamental@aol.com";
	static final String aboutSec3 = "";
	
	//reasons to buy section
	static final String reasonsSec1 = "Why our Custom Made Aluminum Driveway Gates are Awsome looking, stronger, better material and workmanship is just part of our success";
	static final String reasonsSec2 = "Aluminum driveway gates are becoming more and more popular because of how strong and durable they are. The wide choices for design and style is also\r\n" + 
			"another reason why this type of gate is preferred by many people over wooden or iron gates.\r\n" + 
			"\r\n" + 
			"Here are the reasons why a lot of homeowners choose to put up custom made gates made of aluminum.\r\n" + 
			"\r\n" + 
			"1. Cost : Aluminum gates are less costly than steel gates at least nowadays as 10 years ago they were allot more expensive than Steel gates. If you like an\r\n" + 
			"elaborate and very decorative gate, the cost of wrought steel would be more, but with aluminum, the same design can be within your allotted budget.\r\n" + 
			"\r\n" + 
			"2. Weight: Aluminum custom made gates are very light compare to Steel gates, making them a lot easier to open compared to those made of iron. This may be\r\n" + 
			"just as important point when it comes to automatic gates, aluminum only lets minimal tear and ware on the rollers and hinges sliding gates. Because materials\r\n" + 
			"are not heavy, the automated opening system will surely stay in good condition for a longer time period and in some cases extending the life of the gate\r\n" + 
			"openers by 50%.\r\n" + 
			"\r\n" + 
			"3. Durability:Since aluminum is not damaged by rust or corrosion, your gate can serve you well for many years. All our gates designs are made from solid plate\r\n" + 
			"aluminum that is ½ to 1\" inch thick. A gate made of solid aluminum rods are a bit heavier but way lighter and so we are able to use thick material which makes\r\n" + 
			"our work stand out.\r\n" + 
			"\r\n" + 
			"4. Appearance and Options. When talking about sheer beauty, Our aluminum gate are so elegant as the materials that we use in most cases are TWICE thick than\r\n" + 
			"a metal gate . You also have a wide choice in terms of colors as we offer one of the largest select of Powder Coat Oven Baked in the net, larger selection\r\n" + 
			"styles, and custom sizes.\r\n" + 
			"\r\n" + 
			"5. Maintenance: Maintenance is out of the question Aluminum is the way to go, since it does not corrode, unlike with wrought Iron ( steel ), you are not required\r\n" + 
			"the Maintenance to up keep your gate no sanding,priming,re-painting for many ,many,many years to come. With aluminum custom made gates, you can save\r\n" + 
			"time, money, and effort in maintenance This gates are capable of enduring different types of elements without flaking, chipping, or cracking.";
	
	//Gate and Fence Descriptions
	static final String openAndOpsDes =  "We offer a large selection of  Gate Openers and Gate Operators for Residential Driveway Gates, Light or Heavy Commercial Gates, or industrial\r\n" + 
			"locations. If your not sure the style or size of the Gate opener / gate operator  you need, please e-mail or contact us so we can gladly help guide\r\n" + 
			"you to the correct choice. We offer all type of Gate Openers / Gate Operator, Sliding Gate Openers / Gate Operator, Swing Gate Openers / Gate\r\n" + 
			"Operator, Hydraulic Gate Openers / Gate Operator. We also have a wide selection of replacement Main Circuit Boards for all brands, and\r\n" + 
			"Remote Controls  for Visors or Keychains.";
	static final String railingsDes = "Railings - L. A. Ornamental Rack Corp offers top quality Balcony Railings, Front Porch Railings, Deck Railings in Metal, Aluminum, or Wrought\r\n" + 
			"Iron Steel.  We offer rails for residential or commercial locations for either Interior or Exterior locations. We also offer Custom Made Railings,\r\n" + 
			"Decorative Railings, or HandRails that are powder coated paint for low maintenance and long last Balcony Rails, Porch Rails, or Deck Rails";
	static final String gardenDes = "Garden Gates or Walk Gates can be designed to match any existing or ordered driveway gate.  Customers can choose between wrought iron\r\n" + 
			"or aluminum as material  and choose from our wide selection of powder coated colors.  Garden or Walk Gates are custom made that can give\r\n" + 
			"your home that special and elegant look.";
	
	//Brand Name Section
	static final String nameBrandSec1 = "Top Brands of Gate Openers and Operators, Commercial, Residential, Industrial, Swing, Slide, Rack & Pinion, Barrier";
	static final String nameBrandSec2 = "BFT Gate Openers\r\n" + 
			"PowerMaster Gate Openers\r\n" + 
			"Eagle Gate Operators\r\n" + 
			"Elite Gate Openers\r\n" + 
			"Ramset Gate Operators\r\n" + 
			"Doorking Gate Openers\r\n" + 
			"Viking Gate Operators\r\n" + 
			"OSCO Linear Gate Openers\r\n" + 
			"Liftmaster Gate Openers\r\n" + 
			"Allstar Gate Operators\r\n" + 
			"SEA Gate Openers\r\n" + 
			"FAAC Gate Operators\r\n" + 
			"Apollo Gate Openers\r\n" + 
			"Hysecurity Barriers / Risers  Swing  Slides\r\n" + 
			"\r\n" + 
			"Residential Sliding Gate Openers\r\n" + 
			"\r\n" + 
			"Barrier Gate Vehicle Barrier Gate, Parking\r\n" + 
			"Gate, Barrier\r\n" + 
			"\r\n" + 
			"Ditek Surge Protector  -- Transformers\r\n" + 
			"Revere\r\n" + 
			"Aiphone Intercom";
	
	
	//Gate and Fence Images
	static final Image AlFence1 = new Image("AluminumFence1.jpg");
	static final Image AlFence2 = new Image("AluminumFence2.jpg");
	
	static final Image AlGate1 = new Image("AluminumGate1.jpg");
	static final Image AlGate2 = new Image("AluminumGate2.jpg");
	static final Image AlGate3 = new Image("AluminumGate3.jpg");
	
	static final Image GardGate1 = new Image("GardenGate1.jpg");
	static final Image GardGate2 = new Image("GardenGate2.jpg");
	static final Image GardGate3 = new Image("GardenGate3.jpg");
	
	static final Image Railings1 = new Image("Ralings1.jpg");
	static final Image Railings2 = new Image("Ralings2.jpg");

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
