package CS2450_Final;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

/** Nate C/Ben A
 *  CS2450
 *  Final Project
 */
public class FinalProject extends Application {

    //window size
    private static final double WIDTH = 1100.0, HEIGHT = 1800.0, TEXT_WIDTH = 1000.0;

    //greeting header
    private static final String HEADER = "Welcome To: Gates N Fences";
    private static final String SUBHEADER = "Enhance the entry of your home with"
            + " custom, decorative gates and fences!";
    //Enhance the entry of your home with custom, decorative gates and fences!
    
    //Cut down on the text cause this site says so much fucking information
    
    //business info
    private static final String BUSINESS_INFO = "L.A. Ornamental Corp\r\n"
            + "3708 N.W. 82nd Street\r\n"
            + "Miami, Florida 33147\r\n"
            + "Phone: 305-696-0419\r\n"
            + "LAOrnamental@Aol.com";

    //about section text
    private static final String ABOUT_SEC1 = "All of our aluminum or wrought iron "
            + "gates or fences are designed and manufactured to withstand a"
            + " range of outdoor conditions. Our commitment to our "
            + "customers and dedication to produce quality gates has earned"
            + " us thousands of satisfied customers.";
    private static final String ABOUT_SEC2 = "We offer a wide selection of decorative"
            + " designs in either aluminum or wrought iron. With over "
            + "35 years of experience, we seek to provide the highest quality and"
            + " service to our customers.";
    //We offer a wide selection of decorative designs in either aluminum or wrought iron.\r\n We have over 35 years of experience and seek to provide the highest quality and service to our customers.
    
//    private static final String ABOUT_SEC3 = "If your looking For Privacy with "
//            + "your Driveway Gates ,Garden Gates, or Walk Thru Gates, we offer "
//            + "a Solid Backing with your choice of\r\n"
//            + "Aluminium, Steel, Plexiglas or Plastic.  All solid backing are"
//            + " offered in many different colors to choose from. Privacy Gates";
//    //This section might be unecessary

    //reasons to buy section
    private static final String REASONS_SEC1 = "Take a look at some of our custom"
            + " driveway gates and fences!\r\n ";
    //Take a look at some of our custom driveway gates and fences!\r\n 
    
    private static final String REASONS_SEC2 = "Aluminum driveway gates are "
            + "becoming more and more popular because of how strong and durable "
            + "they are. The wide choices for design and style is also"
            + "another reason why this type of gate is preferred by many people "
            + "over wooden or iron gates."
            + "\r\n" +
            // 
            
//            + "Here are the reasons why a lot of homeowners choose to put up "
//            + "custom made gates made of aluminum.\r\n"
//            + "\r\n"
            "Here are some reasons why our customers choose us for their "
             + "aluminum gates!\r\n" +
            
//            + "1. Cost : Aluminum gates are less costly than steel gates at"
//            + " least nowadays as 10 years ago they were allot more expensive "
//            + "than Steel gates. If you like an\r\n"
//            + "elaborate and very decorative gate, the cost of wrought steel "
//            + "would be more, but with aluminum, the same design can be within "
//            + "your allotted budget.\r\n"
//            + "\r\n"
            "1. Aluminum gates are much more cost effective than steel gates.\r\n "
            + "Save money while still having a beautiful gate for your driveway!\r\n" +
            
//            + "2. Weight: Aluminum custom made gates are very light compare to "
//            + "Steel gates, making them a lot easier to open compared to those "
//            + "made of iron. This may be\r\n"
//            + "just as important point when it comes to automatic gates, "
//            + "aluminum only lets minimal tear and ware on the rollers and "
//            + "hinges sliding gates. Because materials\r\n"
//            + "are not heavy, the automated opening system will surely stay in "
//            + "good condition for a longer time period and in some cases "
//            + "extending the life of the gate\r\n"
//            + "openers by 50%.\r\n"
//            + "\r\n"
            "2. Aluminum gates weigh less compared to steel gates and the rollers"
            + " and hinges will receive less wear and tear.\r\n" +
            
//            + "3. Durability:Since aluminum is not damaged by rust or corrosion,"
//            + " your gate can serve you well for many years. All our gates "
//            + "designs are made from solid plate\r\n"
//            + "aluminum that is 1/2 to 1\" inch thick. A gate made of solid "
//            + "aluminum rods are a bit heavier but way lighter and so we are able"
//            + " to use thick material which makes\r\n"
//            + "our work stand out.\r\n"
//            + "\r\n"
            "3. Our aluminum fences and gates will withstand rust or corrosion "
            + "and are very durable. Our gates are made with 1/2 to 1 inch "
            + "thick aluminum plating.\r\n" +
            
//            + "4. Appearance and Options. When talking about sheer beauty, Our "
//            + "aluminum gate are so elegant as the materials that we use in most"
//            + " cases are TWICE thick than\r\n"
//            + "a metal gate . You also have a wide choice in terms of colors as "
//            + "we offer one of the largest select of Powder Coat Oven Baked in the net, larger selection\r\n"
//            + "styles, and custom sizes.\r\n"
//            + "\r\n"
            "4. We offer a wide variety of styles, sizes, and paint colors for "
            + "our gates or fences. We promise that your home will standout from"
            + " the rest.\r\n" +
            
//            + "5. Maintenance: Maintenance is out of the question Aluminum is "
//            + "the way to go, since it does not corrode, unlike with wrought "
//            + "Iron ( steel ), you are not required\r\n"
//            + "the Maintenance to up keep your gate no sanding,priming,re-painting"
//            + " for many ,many,many years to come. With aluminum custom made gates,"
//            + " you can save\r\n"
//            + "time, money, and effort in maintenance This gates are capable of "
//            + "enduring different types of elements without flaking, chipping, or cracking.";
            "5. Aluminum gates need almost no maintenance when compared to a steel"
            + " gate. Our gates and fences will last for years without any "
            + "flaking or cracking.\r\n";
    
    //Gate and Fence Descriptions
    private static final String OPEN_AND_OPS_DES = 
//            "We offer a large selection of "
//            + " Gate Openers and Gate Operators for Residential Driveway Gates, "
//            + "Light or Heavy Commercial Gates, or industrial\r\n"
//            + "locations. If your not sure the style or size of the Gate opener"
//            + " / gate operator  you need, please e-mail or contact us so we can"
//            + " gladly help guide\r\n"
//            + "you to the correct choice. We offer all type of Gate Openers / "
//            + "Gate Operator, Sliding Gate Openers / Gate Operator, Swing Gate "
//            + "Openers / Gate\r\n"
//            + "Operator, Hydraulic Gate Openers / Gate Operator. We also have a "
//            + "wide selection of replacement Main Circuit Boards for all brands, and\r\n"
//            + "Remote Controls  for Visors or Keychains.";
            "We offer a large selection of gate openers and operators in many "
            + "styles and sizes. If you need circuit boards or remote controls,"
            + " we have got you covered!\r\n";
    
    private static final String RAILING_DES = 
//            "Railings - L. A. Ornamental Rack "
//            + "Corp offers top quality Balcony Railings, Front Porch Railings, "
//            + "Deck Railings in Metal, Aluminum, or Wrought\r\n"
//            + "Iron Steel.  We offer rails for residential or commercial "
//            + "locations for either Interior or Exterior locations. We also "
//            + "offer Custom Made Railings,\r\n"
//            + "Decorative Railings, or HandRails that are powder coated paint "
//            + "for low maintenance and long last Balcony Rails, Porch Rails, "
//            + "or Deck Rails";
            "If you need railings then look no further. We have a range of "
            + "railings for all your needs: interior/exterior, "
            + "residential/commerical, aluminum/wrought iron.\r\n"; 
    
    private static final String GARDEN_DES = 
//            "Garden Gates or Walk Gates can be"
//            + " designed to match any existing or ordered driveway gate.  "
//            + "Customers can choose between wrought iron\r\n"
//            + "or aluminum as material  and choose from our wide selection"
//            + " of powder coated colors.  Garden or Walk Gates are custom made "
//            + "that can give\r\n your home that special and elegant look.";
            "Our garden gates and walkway gates are custom made to match the "
            + "look of your home. We can match any preexisting gates you have "
            + "and we have a variety of powder coated colors. These gates will "
            + "really give your home that elegant look.\r\n";

    //Brand Name Section
    private static final String NAME_BRAND_SEC1 = 
//            "Top Brands of Gate Openers "
//            + "and Operators, Commercial, Residential, Industrial, Swing, Slide,"
//            + " Rack & Pinion, Barrier";
            "Here are some of our top brands!\r\n";
    
    private static final String NAME_BRAND_SEC2 = "BFT Gate Openers\r\n"
            + "PowerMaster Gate Openers\r\n"
            + "Eagle Gate Operators\r\n"
            + "Elite Gate Openers\r\n"
            + "Ramset Gate Operators\r\n"
            + "Doorking Gate Openers\r\n"
            + "Viking Gate Operators\r\n"
            + "OSCO Linear Gate Openers\r\n"
            + "Liftmaster Gate Openers\r\n"
            + "Allstar Gate Operators\r\n"
            + "SEA Gate Openers\r\n"
            + "FAAC Gate Operators\r\n"
            + "Apollo Gate Openers\r\n"
            + "Hysecurity Barriers / Risers  Swing  Slides\r\n"
            + "\r\n"
            + "Residential Sliding Gate Openers\r\n"
            + "\r\n"
            + "Barrier Gate Vehicle Barrier Gate, Parking\r\n"
            + "Gate, Barrier\r\n"
            + "\r\n"
            + "Ditek Surge Protector  -- Transformers\r\n"
            + "Revere\r\n"
            + "Aiphone Intercom";
            //clean this up a bit/shorter the list

    //final about section and legal information
    //probably remove doesnt change effectiveness of website/presentation
    static final String ADDITIONAL_INFO = "|  About Us  |   Contact Us   |   "
            + "Our Policies   |   FAQ   |   Manufactures   |   Links   |   \n"
            + "Copyright Protected 2004-2008 - L. A. Ornamental & Rack Corp.  "
            + "All rights reserved. No part of this site can be reproduced in "
            + "any form or by any means,"
            + "electronic, mechanical, photocopying, or otherwise without prior "
            + "written consent of L. A. Ornamental & Rack Corp."
            + "3708 NW 82nd Street  Miami  Florida  33147, Office: 305-696-0419 "
            + " Fax: 305-696-0461 E-Mail: LAOrnamental@Aol.com\n\n\n\n";
    
    static final String ABOUT_PAGE = "Aluminum The Material of choice\r\n" + 
    		"Aluminum: Aluminium is a soft and lightweight metal with a dull silver-gray appearance.  Aluminium is about one-third as dense as steel or copper is\r\n" + 
    		"malleable ductile, and easily machined and cast; and has excellent corrosion resistance and durability due to the protective oxide layer. It is also\r\n" + 
    		"nonmagnetic and nonsparking and is the second most malleable metal (most being gold) and the sixth most ductile. Whether measured in terms of\r\n" + 
    		"quantity or value, the use of aluminium exceeds that of any other metal except iron and it is important in virtually all segments of the world economy.\r\n" + 
    		"Aluminium alloys form vital components of aircrafts and rockets as a result of their high strength to weight ratio. Aluminium was selected as the material\r\n" + 
    		"to be used for the apex of the Washington Monument, at a time when one ounce cost twice the daily wages of a labourer.\r\n" + 
    		"\r\n" + 
    		"Aluminium was, when it was first discovered, extremely difficult to separate from the rocks it was part of. Since the whole of Earth's aluminium was\r\n" + 
    		"bound up in the form of compounds, it was the most difficult metal on earth to get, despite the fact that it is one of the planet's most common. The reason\r\n" + 
    		"is that aluminium is oxidized very rapidly and that its oxide is an extremely stable compound that, unlike rust on steel, does not flake off. The very reason\r\n" + 
    		"for which aluminium is used in many applications is why it is so hard to produce.\r\n" + 
    		"\r\n" + 
    		"Recovery of this metal from scrap (via recycling) has become an important component of the aluminium industry. Recycling involves simply melting the\r\n" + 
    		"metal, which is far less expensive than creating it from ore. Refining aluminium requires enormous amounts of electricity; recycling it requires only 5% of\r\n" + 
    		"the energy to produce it. A common practice since the early 1900's, aluminium recycling is not new. It was, however, a low-profile activity until the late\r\n" + 
    		"1960's when the exploding popularity of aluminium beverage can finally placed recycling into the public consciousness.\r\n" + 
    		"\r\n" + 
    		"Electric power represents about 20 to 40% of the cost of producing aluminium, depending on the location of the aluminium smelter. Smelters tend to be\r\n" + 
    		"located where electric power is plentiful and inexpensive, China is currently (2004) the top world producer of aluminium.\r\n" + 
    		"\r\n" + 
    		"After peaking in popularity in the lavish homes of the 1920s then nearly disappearing from new construction during the whimsical vinyl-sided cottage era,\r\n" + 
    		"Wrought Aluminum is making a phenomenal come back over wrought iron, now that Aluminum is cheaper to produce and the new techniques available\r\n" + 
    		"to make it look like wrought iron with the benefit of maintenance free .\r\n" + 
    		"Designers and builders attribute the re-surging demand to current trends in architecture featuring Mediterranean, Southwestern, and French country\r\n" + 
    		"style homes. Also credited are improved production methods that render the metal applications more durable\r\n" + 
    		"\r\n" + 
    		"The topic of gating is increasing. The blur between the public space and the private realm of the homeowners' association and its management is\r\n" + 
    		"surfacing. However, land developers are very aware that gating is assumed to favor increased property values, and the town officials are aware of the\r\n" + 
    		"associated increases in the town's property tax base.\r\n" + 
    		"\r\n" + 
    		"There are more than seven million households (about 6 percent of the national total) behind fences or walls, according to the Census Bureau's 2001\r\n" + 
    		"American Housing Survey. The Census Bureau estimated the percentage of people living in gated communities had shot up by 11 percent in the West.\r\n" + 
    		"The homes behind the walls, the survey revealed, were \"upscale,\" and \"mostly white developments.\"\r\n" + 
    		"\r\n" + 
    		"Built in the early 1930s, the first gated communities in Los Angeles were upper-scale developments in Rolling Hills and Bradbury. Now, gated\r\n" + 
    		"communities represent almost 50 percent of the market in the desert resort areas near Palm Springs.\r\n" + 
    		"\r\n" + 
    		"\"As real-estate commodities, they are tailored to fit to specific prospective buyers. Gated communities are located within every kind of middle class and\r\n" + 
    		"upper-class neighborhoods, and are now available for every market segment continuing to increase.";

    //Gate and Fence Images
    static final Image Header = new Image("PageHeader.jpg");
    
    static final Image AlFence1 = new Image("AluminumFence1.jpg");
    static final Image AlFence2 = new Image("AluminumFence2.jpg");
    
    static final Image AlGate1 = new Image("AluminumGate1.jpg");
    static final Image AlGate2 = new Image("AluminumGate2.jpg");
    static final Image AlGate3 = new Image("AluminumGate3.jpg");

    static final Image GardGate1 = new Image("GardenGate1.jpg");
    static final Image GardGate2 = new Image("GardenGate2.jpg");
    static final Image GardGate3 = new Image("GardenGate3.jpg");
    //railings don't load in for some reason
    static final Image Railings1 = new Image("Railings1.jpg");
    static final Image Railings2 = new Image("Railings2.jpg");
    
    static final Image PageNotFound = new Image("PageNotFound.jpg");
    
    //holds All different Vboxes to display
    static VBox mainVbox;
    
    //Holds Home Screen Attributes
    static VBox BodyVbox;
    
    //Vbox to fill page we didnt make
    static VBox NoPageVbox;
    
    //VBoxes for all bottom of page Links
    static VBox AboutVbox;
    static VBox ContactVbox;
    static VBox PoliciesVbox;
    static VBox FAQVbox;
    static VBox ManufacturesVbox;
    static VBox LinksVbox;

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        /**
         * Create buttons for all the main links. Cut down on the buttons and
         * simplify into categories Maybe provide a short description label??
         *
         * Button drivewayBtn = new Button("Driveway Gates"); Button gardenBtn =
         * new Button("Garden Gates"); Button fenceBtn = new Button("Fencing");
         * Button railBtn = new Button("Railings"); Button openerBtn = new
         * Button("Openers - Operators"); Button mainCtrlBtn = new Button("Main
         * Control Boards"); Button remoteBtn = new Button("Remote Controls");
         * Button receiverBtn = new Button("Receivers"); Button telephoneBtn =
         * new Button("Telephone Entry"); Button safetyBtn = new Button("Safety
         * Equipment"); Button accessoryBtn = new Button("Gate Accessories");
         * Button partsBtn = new Button("Gate Operator Parts");
         */
        Button searchBtn = new Button("Search");
        Button homeBtn = new Button("Home");
        
        ImageView HeaderHolder = new ImageView(Header);
        HeaderHolder.setPreserveRatio(true);
        HeaderHolder.setFitWidth(700);
        HeaderHolder.setFitHeight(300);
        
        
        //imageviews for pictures
        ImageView AF1View = new ImageView(AlFence1);
        AF1View.setPreserveRatio(true);
        AF1View.setFitWidth(250);
        AF1View.setFitHeight(250);
        
        ImageView AF2View = new ImageView(AlFence2);
        AF2View.setPreserveRatio(true);
        AF2View.setFitWidth(250);
        AF2View.setFitHeight(250);
        
        ImageView AG1View = new ImageView(AlGate1);
        AG1View.setPreserveRatio(true);
        AG1View.setFitWidth(250);
        AG1View.setFitHeight(250);
        
        ImageView AG2View = new ImageView(AlGate2);
        AG2View.setPreserveRatio(true);
        AG2View.setFitWidth(250);
        AG2View.setFitHeight(250);
        
        ImageView AG3View = new ImageView(AlGate3);
        AG3View.setPreserveRatio(true);
        AG3View.setFitWidth(250);
        AG3View.setFitHeight(250);
        
        ImageView GG1View = new ImageView(GardGate1);
        GG1View.setPreserveRatio(true);
        GG1View.setFitWidth(250);
        GG1View.setFitHeight(250);
        
        ImageView GG2View = new ImageView(GardGate2);
        GG2View.setPreserveRatio(true);
        GG2View.setFitWidth(250);
        GG2View.setFitHeight(250);
        
        ImageView GG3View = new ImageView(GardGate3);
        GG3View.setPreserveRatio(true);
        GG3View.setFitWidth(250);
        GG3View.setFitHeight(250);
        
        ImageView R1View = new ImageView(Railings1);
        R1View.setPreserveRatio(true);
        R1View.setFitWidth(250);
        R1View.setFitHeight(250);
        
        ImageView R2View = new ImageView(Railings2);
        R2View.setPreserveRatio(true);
        R2View.setFitWidth(250);
        R2View.setFitHeight(250);
        
        ImageView PageNotFoundView = new ImageView(PageNotFound);
        R2View.setPreserveRatio(true);
        R2View.setFitWidth(900);
        R2View.setFitHeight(900);

        Label subLabel = new Label(SUBHEADER);
        subLabel.setFont(Font.font("Cambria, 12"));
        
        
        Label locationLabel = new Label(BUSINESS_INFO);
        locationLabel.setStyle("-fx-font-size: 15pt");
        locationLabel.setWrapText(true);

        Label businessLabel = new Label(ABOUT_SEC1 + "\n" + ABOUT_SEC2);
        businessLabel.setWrapText(true);
        businessLabel.setMaxWidth(750);
        businessLabel.setPadding(new Insets(0,10,0,10));
        businessLabel.setTextAlignment(TextAlignment.JUSTIFY);
        
        Label reasonsLabel = new Label(REASONS_SEC1 + "\n" + REASONS_SEC2);
        reasonsLabel.setWrapText(true);
        reasonsLabel.setMaxWidth(TEXT_WIDTH);
        reasonsLabel.setTextAlignment(TextAlignment.JUSTIFY);
        
        Label typesLabel = new Label(OPEN_AND_OPS_DES + RAILING_DES + GARDEN_DES);
        typesLabel.setWrapText(true);
        typesLabel.setMaxWidth(TEXT_WIDTH);
        typesLabel.setTextAlignment(TextAlignment.CENTER);
        
        Label brandsLabel = new Label(NAME_BRAND_SEC1 + NAME_BRAND_SEC2);
        brandsLabel.setMaxWidth(950);
        brandsLabel.setTextAlignment(TextAlignment.JUSTIFY);
        
        Hyperlink hyperlink;
        
        TextFlow addtInfoTextFlow = new TextFlow();
        for (String word : ADDITIONAL_INFO.split("\\|")) {
            //make some words hyperlinks:
            if (word.length() < 20) {
            	String temp = word;
            	switch(word) {
            		case "  About Us  ":
            			addtInfoTextFlow.getChildren().add(new Text("|"));
            			hyperlink = new Hyperlink(word);
		                hyperlink.setOnAction(new HyperLinkClickHandler("About"));
		                addtInfoTextFlow.getChildren().add(hyperlink);
            		break;
            		case "   Contact Us   ":
            			addtInfoTextFlow.getChildren().add(new Text("|"));
            			Hyperlink hyperlink2 = new Hyperlink(word);
		                hyperlink2.setOnAction(new HyperLinkClickHandler("Contact"));
		                addtInfoTextFlow.getChildren().add(hyperlink2);
            		break;
            		case "   Our Policies   ":
            			addtInfoTextFlow.getChildren().add(new Text("|"));
            			Hyperlink hyperlink3 = new Hyperlink(word);
		                hyperlink3.setOnAction(new HyperLinkClickHandler("Policies"));
		                addtInfoTextFlow.getChildren().add(hyperlink3);
            		break;
            		case "   FAQ   ":
            			addtInfoTextFlow.getChildren().add(new Text("|"));
            			Hyperlink hyperlink4 = new Hyperlink(word);
		                hyperlink4.setOnAction(new HyperLinkClickHandler("FAQ"));
		                addtInfoTextFlow.getChildren().add(hyperlink4);
            		break;
            		case "   Manufactures   ":
            			addtInfoTextFlow.getChildren().add(new Text("|"));
            			Hyperlink hyperlink5 = new Hyperlink(word);
		                hyperlink5.setOnAction(new HyperLinkClickHandler("Manufactures"));
		                addtInfoTextFlow.getChildren().add(hyperlink5);
            		break;
            		case "   Links   ":
            			addtInfoTextFlow.getChildren().add(new Text("|"));
            			Hyperlink hyperlink6 = new Hyperlink(word);
		                hyperlink6.setOnAction(new HyperLinkClickHandler("Links"));
		                addtInfoTextFlow.getChildren().add(hyperlink6);
            		break;
            		
            		
            	}
                
            } else {
            	addtInfoTextFlow.getChildren().add(new Text("|"+word));
            }
        }
        addtInfoTextFlow.setMaxWidth(TEXT_WIDTH);
        addtInfoTextFlow.setMaxWidth(TEXT_WIDTH);
        addtInfoTextFlow.setTextAlignment(TextAlignment.CENTER);
        addtInfoTextFlow.setStyle("-fx-font-size: 8pt");
        
        Label aboutLabel = new Label(ABOUT_PAGE);
        aboutLabel.setWrapText(true);
        aboutLabel.setMaxWidth(TEXT_WIDTH);
        aboutLabel.setTextAlignment(TextAlignment.JUSTIFY);

        //ComboBox or Listview will probably look better than a string of buttons
        ComboBox<String> linksComboBox = new ComboBox<>();
        linksComboBox.getItems().addAll("SELECT PAGE","Driveway Gates", "Garden Gates", "Fencing",
                "Railings", "Openers - Operators", "Main Control Boards",
                "Remote Controls", "Receivers", "Telephone Entry",
                "Safety Equipment", "Gate Accessories", "Gate Operator Parts");
        linksComboBox.setValue("SELECT PAGE");

        //Search bar text field, make it larger and more prominent than original website
        TextArea searchBar = new TextArea();
        searchBar.setMaxSize(500, 40);
        searchBar.setPrefRowCount(1);
        
        //search on Enter Key Pressed
        searchBar.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent ke) {
                if (ke.getCode().equals(KeyCode.ENTER)) {
                    searchBar.setText("");
                    ke.consume(); 
                }
            }
        });
        
        VBox headerVBox = new VBox(10, HeaderHolder, subLabel);
        
        //hbox for the header and initial information
        HBox headerHbox = new HBox(20, headerVBox, locationLabel);
        headerHbox.setAlignment(Pos.TOP_CENTER);
        headerHbox.setPadding(new Insets(10));
        
        //hbox for the links
        HBox linksHbox = new HBox(10, homeBtn, linksComboBox, searchBar, searchBtn);
        linksHbox.setAlignment(Pos.TOP_CENTER);
        linksHbox.setPadding(new Insets(10));

        //hbox with business desciption text and gate picture
        HBox descriptionHbox = new HBox(10, businessLabel, AF1View);
        descriptionHbox.setAlignment(Pos.TOP_CENTER);
        
        //hbox for reasons for use
        HBox reasonsHbox = new HBox(10, reasonsLabel);
        reasonsHbox.setAlignment(Pos.BOTTOM_CENTER);
        reasonsHbox.setPadding(new Insets(0,10,0,10));
        
        HBox imagesHbox = new HBox(10, AF2View, AG1View, AG2View, AG3View);
        imagesHbox.setAlignment(Pos.TOP_CENTER);
        
        HBox imagesHbox2 = new HBox(10, GG1View, GG2View, GG3View,R1View,R2View);
        imagesHbox2.setAlignment(Pos.TOP_CENTER);
        
        //hbox for gate types
        HBox typesHbox = new HBox(10, typesLabel);
        typesHbox.setAlignment(Pos.BOTTOM_CENTER);
        typesHbox.setPadding(new Insets(0,10,0,10));
        
        //hbox for brand links
        HBox brandsHbox = new HBox(10, brandsLabel);
        brandsHbox.setAlignment(Pos.BOTTOM_CENTER);
        brandsHbox.setPadding(new Insets(0,10,0,10));
        
        //hbox for additional site bs
        HBox infoHbox = new HBox(10, addtInfoTextFlow);
        infoHbox.setAlignment(Pos.BOTTOM_CENTER);
        infoHbox.setPadding(new Insets(0,10,0,10));
        
        HBox aboutHbox = new HBox(10, aboutLabel);
        aboutHbox.setAlignment(Pos.TOP_CENTER);
        aboutHbox.setPadding(new Insets(0,10,0,10));
        
        HBox NoPageHbox = new HBox(10, PageNotFoundView);
        NoPageHbox.setAlignment(Pos.TOP_CENTER);
        
        VBox headerVbox = new VBox(10,headerHbox, linksHbox);
        BodyVbox = new VBox(10,descriptionHbox, reasonsHbox, 
        		imagesHbox,typesHbox);
        AboutVbox = new VBox(10, aboutHbox);
        NoPageVbox = new VBox(10, NoPageHbox);
        //vbox to order everything vertically
        mainVbox = new VBox(10,headerVbox, BodyVbox, infoHbox);
        
        
        //Code to change what Vbox Shows when button is pressed
        homeBtn.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent event) {
    			mainVbox.getChildren().set(1, BodyVbox);
            }
 		});
        
        linksComboBox.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent event) {
    			switch(linksComboBox.getValue().toString()) {
    			case "SELECT PAGE":
    				mainVbox.getChildren().set(1, BodyVbox);
    				break;
    			default:
					mainVbox.getChildren().set(1, NoPageVbox);
					break;
           }
            }
 		});
        
        //added a scroll bar in case its too long, restyle later
        ScrollPane scrollPane = new ScrollPane(mainVbox);
        scrollPane.setPadding(new Insets(10));
        scrollPane.setBackground(new Background(new BackgroundFill(Color.BLANCHEDALMOND, CornerRadii.EMPTY, Insets.EMPTY)));
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollPane.setFitToWidth(true);
        BorderPane root = new BorderPane(scrollPane);
        root.setBackground(new Background(new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setPadding(new Insets(10));
        
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        scene.getStylesheets().add("Style.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    class HyperLinkClickHandler implements EventHandler<ActionEvent>{
    	
    	private String type;

		public HyperLinkClickHandler(String string) {
			type = string;
		}

		@Override
		public void handle(ActionEvent event) {
			switch(type) {
				case "About":
					mainVbox.getChildren().set(1, AboutVbox);
					break;
				case "Contact":
					mainVbox.getChildren().set(1, ContactVbox);
					break;
				case "Policies":
					mainVbox.getChildren().set(1, PoliciesVbox);
					break;
				case "FAQ":
					mainVbox.getChildren().set(1, FAQVbox);
					break;
				case "Manufactures":
					mainVbox.getChildren().set(1, ManufacturesVbox);
					break;
				case "Links":
					mainVbox.getChildren().set(1, LinksVbox);
					break;
				default:
					mainVbox.getChildren().set(1, NoPageVbox);
					break;
			}
		}
		
	}

}
