package CS2450_Final;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
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
    private static final double WIDTH = 1100.0, HEIGHT = 1800.0,
    		TEXT_WIDTH = 1000.0, TEXT_FIELD_WIDTH = 600.0;
    
    //greeting header
    private static final String HEADER = "Welcome To: Gates N Fences";
    private static final String SUBHEADER = "Enhance the entry of your home with"
            + " custom, decorative gates and fences!";
    
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
            
            "1. Aluminum gates are much more cost effective than steel gates.\r\n "
            + "Save money while still having a beautiful gate for your driveway!\r\n" +
            
            "2. Aluminum gates weigh less compared to steel gates and the rollers"
            + " and hinges will receive less wear and tear.\r\n" +
            
            "3. Our aluminum fences and gates will withstand rust or corrosion "
            + "and are very durable. Our gates are made with 1/2 to 1 inch "
            + "thick aluminum plating.\r\n" +
            
            "4. We offer a wide variety of styles, sizes, and paint colors for "
            + "our gates or fences. We promise that your home will standout from"
            + " the rest.\r\n" +
            
            "5. Aluminum gates need almost no maintenance when compared to a steel"
            + " gate. Our gates and fences will last for years without any "
            + "flaking or cracking.\r\n";
    
    //Gate and Fence Descriptions
    private static final String OPEN_AND_OPS_DES = "We offer a large selection "
            + "of gate openers and operators in many styles and sizes. If you need"
            + " circuit boards or remote controls, we have got you covered!\r\n";
    
    private static final String RAILING_DES = "If you need railings then look no"
            + " further. We have a range of railings for all your needs: "
            + "interior/exterior, residential/commerical, aluminum/wrought iron.\r\n"; 
    
    private static final String GARDEN_DES = "Our garden gates and walkway gates"
            + " are custom made to match the look of your home. We can match any"
            + " preexisting gates you have and we have a variety of powder coated"
            + " colors. These gates will really give your home that elegant look.\r\n";

    //Brand Name Section
    private static final String NAME_BRAND_SEC1 = "Here are some of our top brands!\r\n";
    
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
    
    //About Section 
    static final String ABOUT_HEADER = "A Brief History of Aluminum and Gating";
    
    static final String ABOUT_PAGE = "Aluminum The Material of choice\r\n" + 
    		"Aluminum: Aluminium is a soft and lightweight metal with a dull silver-gray appearance.  Aluminium is about one-third as dense as steel or copper is " + 
    		"malleable ductile, and easily machined and cast; and has excellent corrosion resistance and durability due to the protective oxide layer. It is also " + 
    		"nonmagnetic and nonsparking and is the second most malleable metal (most being gold) and the sixth most ductile. Whether measured in terms of " + 
    		"quantity or value, the use of aluminium exceeds that of any other metal except iron and it is important in virtually all segments of the world economy. " + 
    		"Aluminium alloys form vital components of aircrafts and rockets as a result of their high strength to weight ratio. Aluminium was selected as the material " + 
    		"to be used for the apex of the Washington Monument, at a time when one ounce cost twice the daily wages of a labourer." + 
    		"\r\n" +
    		"After peaking in popularity in the lavish homes of the 1920s then nearly disappearing from new construction during the whimsical vinyl-sided cottage era, " + 
    		"Wrought Aluminum is making a phenomenal come back over wrought iron, now that Aluminum is cheaper to produce and the new techniques available " + 
    		"to make it look like wrought iron with the benefit of maintenance free . " + 
    		"Designers and builders attribute the re-surging demand to current trends in architecture featuring Mediterranean, Southwestern, and French country " + 
    		"style homes. Also credited are improved production methods that render the metal applications more durable " + 
    		"\r\n" + 
    		"The topic of gating is increasing. The blur between the public space and the private realm of the homeowners' association and its management is " + 
    		"surfacing. However, land developers are very aware that gating is assumed to favor increased property values, and the town officials are aware of the " + 
    		"associated increases in the town's property tax base. " + 
    		"\r\n" + 
    		"There are more than seven million households (about 6 percent of the national total) behind fences or walls, according to the Census Bureau's 2001 " + 
    		"American Housing Survey. The Census Bureau estimated the percentage of people living in gated communities had shot up by 11 percent in the West. " + 
    		"The homes behind the walls, the survey revealed, were \"upscale,\" and \"mostly white developments.\" " + 
    		"\r\n" + 
    		"Built in the early 1930s, the first gated communities in Los Angeles were upper-scale developments in Rolling Hills and Bradbury. Now, gated " + 
    		"communities represent almost 50 percent of the market in the desert resort areas near Palm Springs. " + 
    		"\r\n" + 
    		"\"As real-estate commodities, they are tailored to fit to specific prospective buyers. Gated communities are located within every kind of middle class and " + 
    		"upper-class neighborhoods, and are now available for every market segment continuing to increase.";

    //Contact Section
    static final String CONTACT_HEADER = "Contact Us! For all your Fence and Gate Needs";
    static final String CONTACT_PRIVACYHEADER = "Privacy Statement:";
    static final String CONTACT_PRIVACYSTATEMENT = "In the process of placing an order we collect customer e-mail and home address. This is strictly used for"
    		+ " billing, shipping, and newsletter purposes (see opt out option below). We do not sell, distribute, or share that information with anyone. "
    		+ "Your information is held in a secure file in our main office.";
    static final String CONTACT_PRIVACYDISCLAIMER = "All required sections are marked with a *. Please fill out all these sections to help us with your inquiry.";
    
    //Gate and Fence Images
    static final Image Header = new Image("PageHeader.jpg");
    
    static final Image PageNotFound = new Image("PageNotFound.jpg");
    
    static final Image AlFence1 = new Image("AluminumFence.jpg");
    static final Image AlFence2 = new Image("AluminumFence2.jpg");
    static final Image AlFence3 = new Image("AluminumFence3.jpg");
    static final Image AlFence4 = new Image("AluminumFence4.jpg");
    static final Image AlFence5 = new Image("AluminumFence5.jpg");
    static final Image AlFence6 = new Image("AluminumFence6.jpg");
    
    static final Image AlGate1 = new Image("AluminumGate1.jpg");
    static final Image AlGate2 = new Image("AluminumGate2.jpg");
    static final Image AlGate3 = new Image("AluminumGate3.jpg");

    static final Image GardGate1 = new Image("GardenGate1.jfif");
    static final Image GardGate2 = new Image("GardenGate2.jpg");
    static final Image GardGate3 = new Image("GardenGate3.jpg");
    static final Image GardGate4 = new Image("GardenGate4.jfif");
    static final Image GardGate5 = new Image("GardenGate5.jpg");
    static final Image GardGate6 = new Image("GardenGate6.jfif");
    

    static final Image Railings1 = new Image("Railings1.jpg");
    static final Image Railings2 = new Image("Railings2.jpg");
    
    static final Image DrivewayGate1 = new Image("Drivewaygate1.jfif");
    static final Image DrivewayGate2 = new Image("Drivewaygate2.jpg");
    static final Image DrivewayGate3 = new Image("Drivewaygate3.jpg");
    static final Image DrivewayGate4 = new Image("Drivewaygate4.jfif");
    static final Image DrivewayGate5 = new Image("Drivewaygate5.jpg");
    static final Image DrivewayGate6 = new Image("Drivewaygate6.jpg");
    
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
        
        Button searchBtn = new Button("Search");
        Button homeBtn = new Button("Home");
        
        ImageView HeaderHolder = new ImageView(Header);
        HeaderHolder.setPreserveRatio(true);
        HeaderHolder.setFitWidth(700);
        HeaderHolder.setFitHeight(300);
        
        ImageView PageNotFoundView = new ImageView(PageNotFound);
        PageNotFoundView.setPreserveRatio(true);
        PageNotFoundView.setFitWidth(950);
        PageNotFoundView.setFitHeight(950);
        
        //imageviews for pictures
        ImageView AF1View = new ImageView(AlFence1);
        AF1View.setPreserveRatio(true);
        AF1View.setFitWidth(300);
        AF1View.setFitHeight(250);
        
        ImageView AF2View = new ImageView(AlFence2);
        AF2View.setPreserveRatio(true);
        AF2View.setFitWidth(300);
        AF2View.setFitHeight(250);
        
        ImageView AF3View = new ImageView(AlFence3);
        AF3View.setPreserveRatio(true);
        AF3View.setFitWidth(300);
        AF3View.setFitHeight(250);
        
        ImageView AF4View = new ImageView(AlFence4);
        AF4View.setPreserveRatio(true);
        AF4View.setFitWidth(300);
        AF4View.setFitHeight(250);
        
        ImageView AF5View = new ImageView(AlFence5);
        AF5View.setPreserveRatio(true);
        AF5View.setFitWidth(300);
        AF5View.setFitHeight(250);
        
        ImageView AF6View = new ImageView(AlFence6);
        AF6View.setPreserveRatio(true);
        AF6View.setFitWidth(300);
        AF6View.setFitHeight(250);
        
        ImageView AG1View = new ImageView(AlGate1);
        AG1View.setPreserveRatio(true);
        AG1View.setFitWidth(300);
        AG1View.setFitHeight(250);
        
        ImageView AG2View = new ImageView(AlGate2);
        AG2View.setPreserveRatio(true);
        AG2View.setFitWidth(300);
        AG2View.setFitHeight(250);
        
        ImageView AG3View = new ImageView(AlGate3);
        AG3View.setPreserveRatio(true);
        AG3View.setFitWidth(300);
        AG3View.setFitHeight(250);
        
        ImageView GG1View = new ImageView(GardGate1);
        GG1View.setPreserveRatio(true);
        GG1View.setFitWidth(300);
        GG1View.setFitHeight(250);
        
        ImageView GG2View = new ImageView(GardGate2);
        GG2View.setPreserveRatio(true);
        GG2View.setFitWidth(300);
        GG2View.setFitHeight(250);
        
        ImageView GG3View = new ImageView(GardGate3);
        GG3View.setPreserveRatio(true);
        GG3View.setFitWidth(250);
        GG3View.setFitHeight(250);
        
        ImageView GG4View = new ImageView(GardGate4);
        GG4View.setPreserveRatio(true);
        GG4View.setFitWidth(300);
        GG4View.setFitHeight(250);
        
        ImageView GG5View = new ImageView(GardGate5);
        GG5View.setPreserveRatio(true);
        GG5View.setFitWidth(300);
        GG5View.setFitHeight(250);
        
        ImageView GG6View = new ImageView(GardGate6);
        GG6View.setPreserveRatio(true);
        GG6View.setFitWidth(300);
        GG6View.setFitHeight(250);
        
        ImageView R1View = new ImageView(Railings1);
        R1View.setPreserveRatio(true);
        R1View.setFitWidth(250);
        R1View.setFitHeight(250);
        
        ImageView R2View = new ImageView(Railings2);
        R2View.setPreserveRatio(true);
        R2View.setFitWidth(250);
        R2View.setFitHeight(250);
        
       
        ImageView DG1View = new ImageView(DrivewayGate1);
        DG1View.setFitWidth(300);
        DG1View.setFitHeight(250);
        
        ImageView DG2View = new ImageView(DrivewayGate2);
        DG2View.setFitWidth(300);
        DG2View.setFitHeight(250);

        ImageView DG3View = new ImageView(DrivewayGate3);
        DG3View.setFitWidth(300);
        DG3View.setFitHeight(250);

        ImageView DG4View = new ImageView(DrivewayGate4);
        DG4View.setFitWidth(300);
        DG4View.setFitHeight(250);
        
        ImageView DG5View = new ImageView(DrivewayGate5);
        DG5View.setFitWidth(300);
        DG5View.setFitHeight(250);
        
        ImageView DG6View = new ImageView(DrivewayGate6);
        DG6View.setFitWidth(300);
        DG6View.setFitHeight(250);
        
        Label subLabel = new Label(SUBHEADER);
        subLabel.setFont(Font.font("Cambria, 12"));
        
        Label locationLabel = new Label(BUSINESS_INFO);
        locationLabel.setStyle("-fx-font-size: 15pt");
        locationLabel.setWrapText(true);

        Label businessLabel = new Label(ABOUT_SEC1 + "\n" + ABOUT_SEC2);
        businessLabel.setWrapText(true);
        businessLabel.setMaxWidth(650);
        businessLabel.setPadding(new Insets(0,10,0,10));
        businessLabel.setTextAlignment(TextAlignment.JUSTIFY);
        
        Label reasonsLabel = new Label(REASONS_SEC1 + "\n" + REASONS_SEC2);
        reasonsLabel.setWrapText(true);
        reasonsLabel.setMaxWidth(TEXT_WIDTH);
        reasonsLabel.setTextAlignment(TextAlignment.JUSTIFY);
        
        Label typesLabel = new Label(OPEN_AND_OPS_DES + RAILING_DES + GARDEN_DES);
        typesLabel.setWrapText(true);
        typesLabel.setMaxWidth(TEXT_WIDTH);
        typesLabel.setTextAlignment(TextAlignment.JUSTIFY);
        
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
        
        //ComboBox or Listview will probably look better than a string of buttons
        ComboBox<String> linksComboBox = new ComboBox<>();
        linksComboBox.getItems().addAll("SELECT PAGE","Driveway Gates", "Garden Gates", "Fencing",
                "Railings", "Openers - Operators", "Main Control Boards",
                "Remote Controls", "Receivers", "Telephone Entry",
                "Safety Equipment", "Gate Accessories", "Gate Operator Parts");
        linksComboBox.setValue("SELECT PAGE");

        //Search bar text field, make it larger and more prominent than original website
        TextArea searchBar = new TextArea();
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
        
        VBox subHeaderVBox = new VBox(10, HeaderHolder, subLabel);
        
        //hbox for the header and initial information
        HBox headerHbox = new HBox(20, subHeaderVBox, locationLabel);
        headerHbox.setAlignment(Pos.TOP_CENTER);
        headerHbox.setPadding(new Insets(10));
        
        //hbox for the links
        HBox linksHbox = new HBox(10, homeBtn, linksComboBox, searchBar, searchBtn);
        linksHbox.setAlignment(Pos.TOP_CENTER);
        linksHbox.setPadding(new Insets(10));

        //hbox with business desciption text and gate picture
        HBox descriptionHbox = new HBox(10, businessLabel, AF1View);
        descriptionHbox.setAlignment(Pos.TOP_CENTER);
        descriptionHbox.setPadding(new Insets(10,0,0,0));
        
        //hbox for reasons for use
        HBox reasonsHbox = new HBox(10, reasonsLabel);
        reasonsHbox.setAlignment(Pos.BOTTOM_CENTER);
        reasonsHbox.setPadding(new Insets(0,10,0,10));
        
        HBox imagesHbox = new HBox(75, AG1View, GG1View, R1View);
        imagesHbox.setAlignment(Pos.TOP_CENTER);
        
        
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
        
        VBox headerVbox = new VBox(10,headerHbox, linksHbox);
        
        //about section labels
        Label aboutHeaderLabel = new Label(ABOUT_HEADER);
        aboutHeaderLabel.setStyle("-fx-font-size: 15pt");
        aboutHeaderLabel.setWrapText(true);
        
        Label aboutLabel = new Label(ABOUT_PAGE);
        aboutLabel.setWrapText(true);
        aboutLabel.setMaxWidth(TEXT_WIDTH);
        aboutLabel.setTextAlignment(TextAlignment.JUSTIFY);
        
        //About Page Holders
        HBox aboutHbox = new HBox(10, aboutHeaderLabel);
        aboutHbox.setAlignment(Pos.TOP_CENTER);
        aboutHbox.setPadding(new Insets(0,10,0,10));
        
        HBox aboutHbox2 = new HBox(10, aboutLabel);
        aboutHbox2.setAlignment(Pos.TOP_CENTER);
        aboutHbox2.setPadding(new Insets(0,10,0,10));
        
        //contact section labels
        Label contactHeaderLabel = new Label(CONTACT_HEADER);
        contactHeaderLabel.setWrapText(true);
        contactHeaderLabel.setTextAlignment(TextAlignment.CENTER);
        contactHeaderLabel.setId("contactHeader");
        
        Label contactPrivHeadLabel = new Label(CONTACT_PRIVACYHEADER);
        contactPrivHeadLabel.setTextAlignment(TextAlignment.LEFT);
        contactPrivHeadLabel.setId("contactPriv");
        
        Label contactPrivStateLabel = new Label(CONTACT_PRIVACYSTATEMENT);
        contactPrivStateLabel.setWrapText(true);
        contactPrivStateLabel.setTextAlignment(TextAlignment.JUSTIFY);
        contactPrivStateLabel.setMaxWidth(TEXT_WIDTH);
        
        Label contactPrivDisclaimLabel = new Label(CONTACT_PRIVACYDISCLAIMER);
        contactPrivDisclaimLabel.setWrapText(true);
        contactPrivDisclaimLabel.setTextAlignment(TextAlignment.JUSTIFY);
        contactPrivDisclaimLabel.setMaxWidth(TEXT_WIDTH);
        
        Label contactFirstLabel = new Label("*First Name: ");
        contactFirstLabel.setPrefWidth(300);
        Label contactLastLabel = new Label("*Last Name: ");
        Label contactAddressLabel = new Label("*Street Address: ");
        Label contactCityLabel = new Label("*City: ");
        Label contactStateLabel = new Label("*State: ");
        Label contactZipCodeLabel = new Label("*Zip Code: ");
        Label contactEmailLabel = new Label("*Email Address: ");
        Label contactPhoneLabel = new Label("*Phone Number: ");
        
        
        TextField contactFirstTextField = new TextField();
        contactFirstTextField.addEventFilter(KeyEvent.ANY,new RequirementHandler(contactFirstLabel, contactFirstTextField));
        contactFirstTextField.setPrefWidth(600);
        TextField contactLastTextField = new TextField();
        contactLastTextField.addEventFilter(KeyEvent.ANY, new RequirementHandler(contactLastLabel, contactLastTextField));
        TextField contactAddressTextField = new TextField();
        contactAddressTextField.addEventFilter(KeyEvent.ANY, new RequirementHandler(contactAddressLabel, contactAddressTextField));
        TextField contactCityTextField = new TextField();
        contactCityTextField.addEventFilter(KeyEvent.ANY, new RequirementHandler(contactCityLabel, contactCityTextField));
        TextField contactZipCodeTextField = new TextField();
        contactZipCodeTextField.addEventFilter(KeyEvent.ANY, new RequirementHandler(contactZipCodeLabel, contactZipCodeTextField));
        
        ComboBox<String> statesComboBox = new ComboBox<>();
        statesComboBox.getItems().addAll("SELECT STATE","Alabama", "Alaska", "Arizona", "Arkansas", "California"
        		, "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho"
        		, "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine"
        		, "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri"
        		, "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York"
        		, "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania" 
        		, "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah"
        		, "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming");
        statesComboBox.setValue("SELECT STATE");
        statesComboBox.setPrefWidth(600);
        statesComboBox.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent event) {
    			if(statesComboBox.getValue().toString() == "SELECT STATE" && !star(contactStateLabel)) {
    				addStar(contactStateLabel);
    			}else if(!(statesComboBox.getValue().toString() == "SELECT STATE") && star(contactStateLabel)) {
    				subStar(contactStateLabel);
    			}
            }
 		});

        
        TextField contactEmailTextField = new TextField();
        contactEmailTextField.addEventFilter(KeyEvent.ANY, new RequirementHandler(contactEmailLabel, contactEmailTextField));
        TextField contactPhoneTextField = new TextField();
        contactPhoneTextField.addEventFilter(KeyEvent.ANY, new RequirementHandler(contactPhoneLabel, contactPhoneTextField));
        
        Label contactQuoteLabel = new Label ("Please Select every option you want a Quote for.");
        contactQuoteLabel.setWrapText(true);
        contactQuoteLabel.setMaxWidth(300);
        
        Label contactGateLabel = new Label("Gate");
        CheckBox contactGateCheckBox = new CheckBox();
        
        Label contactFenceLabel = new Label("Fence");
        CheckBox contactFenceCheckBox = new CheckBox();
        
        Label contactRailingLabel = new Label("Railing");
        CheckBox contactRailingCheckBox = new CheckBox();
        
        Label contactOpenerLabel = new Label("Opener");
        CheckBox contactOpenerCheckBox = new CheckBox();
        
        Label contactOtherLabel = new Label("Other");
        CheckBox contactOtherCheckBox = new CheckBox();
        
        Label contactYes = new Label("Yes");
        Label contactNo = new Label("No");
        Label contactIdk = new Label("Do not Know");
        contactIdk.setWrapText(true);
        
        Label contactGatePostLabel = new Label("Will your Gates require Posts?");
        Label contactFencePostLabel = new Label("Will your Fence require Posts?");
        Label contactGardenGateLabel = new Label("Need matching Garden Gates?");
        Label contactMatchFenceLabel = new Label("Need matching Fence?");
        
        //Gate Options
        ToggleGroup contactGateGroup = new ToggleGroup();

        RadioButton contactGateYesRB = new RadioButton();
        contactGateYesRB.setToggleGroup(contactGateGroup);

        RadioButton contactGateNoRB = new RadioButton();
        contactGateNoRB.setToggleGroup(contactGateGroup);
         
        RadioButton contactGateIdkRB = new RadioButton();
        contactGateIdkRB.setToggleGroup(contactGateGroup);
        
        
        //Fence Options
        ToggleGroup contactFenceGroup = new ToggleGroup();

        RadioButton contactFenceYesRB = new RadioButton();
        contactFenceYesRB.setToggleGroup(contactFenceGroup);

        RadioButton contactFenceNoRB = new RadioButton();
        contactFenceNoRB.setToggleGroup(contactFenceGroup);
         
        RadioButton contactFenceIdkRB = new RadioButton();
        contactFenceIdkRB.setToggleGroup(contactFenceGroup);
        
        //Garden Options
        ToggleGroup contactGardenGateGroup = new ToggleGroup();

        RadioButton contactGardenGateYesRB = new RadioButton();
        contactGardenGateYesRB.setToggleGroup(contactGardenGateGroup);

        RadioButton contactGardenGateNoRB = new RadioButton();
        contactGardenGateNoRB.setToggleGroup(contactGardenGateGroup);
        
        //Matching Fence Option
        ToggleGroup contactMatchFenceGroup = new ToggleGroup();

        RadioButton contactMatchFenceYesRB = new RadioButton();
        contactMatchFenceYesRB.setToggleGroup(contactMatchFenceGroup);

        RadioButton contactMatchFenceNoRB = new RadioButton();
        contactMatchFenceNoRB.setToggleGroup(contactMatchFenceGroup);
        
        
        Label contactGateSSLabel = new Label("Gate Single Swing");
        CheckBox contactGateSSCheckBox = new CheckBox();
        contactGateSSCheckBox.setDisable(true);
        
        Label contactGateDSLabel = new Label("Gate Double Swing");
        CheckBox contactGateDSCheckBox = new CheckBox();
        contactGateDSCheckBox.setDisable(true);
        
        Label contactGateSSLLabel = new Label("Gate Single Slide");
        CheckBox contactGateSSLCheckBox = new CheckBox();
        contactGateSSLCheckBox.setDisable(true);
        
        Label contactGateDSLLabel = new Label("Gate Double Slide");
        CheckBox contactGateDSLCheckBox = new CheckBox();
        contactGateDSLCheckBox.setDisable(true);
        
        Label contactColorsLabel = new Label("Include Some Colors ");
        contactColorsLabel.setPrefWidth(300);
        Label contactSHeightLabel = new Label("Start Height");
        contactSHeightLabel.setPrefWidth(250);
        Label contactFHeightLabel = new Label("Finish Height");
        contactFHeightLabel.setPrefWidth(250);
        Label contactAdditonalLabel = new Label("Additional Fence or Gate Specifications and any other Inquiries");
        contactAdditonalLabel.setWrapText(true);
        contactAdditonalLabel.setPrefWidth(300);
        
        TextField contactColorsTextField = new TextField();
        contactColorsTextField.setPrefWidth(600);
        contactColorsTextField.setDisable(true);
        
        ComboBox<String> startComboBox = new ComboBox<>();
        startComboBox.getItems().addAll("3ft", "4ft", "5ft", "6ft");
        startComboBox.setValue("SELECT HEIGHT");
        startComboBox.setPrefWidth(250);
        startComboBox.setDisable(true);
        
        ComboBox<String> finishComboBox = new ComboBox<>();
        finishComboBox.getItems().addAll("5ft", "6ft", "7ft", "8ft");
        finishComboBox.setValue("SELECT HEIGHT");
        finishComboBox.setPrefWidth(250);
        finishComboBox.setDisable(true);
        
        TextArea contactAdditioalTextArea = new TextArea();
        contactAdditioalTextArea.setPrefColumnCount(4);
        contactAdditioalTextArea.setPrefHeight(100);
        
        Label contactGateOpenLabel = new Label("Gate Opener Info");
        contactGateOpenLabel.setTextAlignment(TextAlignment.CENTER);
        contactGateOpenLabel.setId("contactOpener");
        
        Label contactCommercialLabel = new Label("Is this for Commercial use?");
        contactCommercialLabel.setPrefWidth(500);
        CheckBox contactCommercialCheckBox = new CheckBox();
        contactCommercialCheckBox.setDisable(true);
        Label contactResidentialLabel = new Label("Is this for Residential use?");
        contactResidentialLabel.setPrefWidth(500);
        CheckBox contactResidentialCheckBox = new CheckBox();
        contactResidentialCheckBox.setDisable(true);
        
        Label contactBrandLabel = new Label("Which Brand of Opener do you want?");
        contactBrandLabel.setPrefWidth(400);
        
        ComboBox<String> brandComboBox = new ComboBox<>();
        brandComboBox.getItems().addAll("SELECT BRAND","Power Master", "Eagle", "Elite", "Door King", "RamSet"
        		, "SEA", "OSCO");
        brandComboBox.setValue("SELECT BRAND");
        brandComboBox.setPrefWidth(600);
        brandComboBox.setDisable(true);
        
        Label contactTypeLabel = new Label("How would you like to open the gate?");
        contactTypeLabel.setWrapText(true);
        
        Label contactRemoteLabel = new Label("Remote Control");
        CheckBox contactRemoteCheckBox = new CheckBox();
        contactRemoteCheckBox.setDisable(true);
        
        Label contactKeypadLabel = new Label("Keypad");
        CheckBox contactKeypadCheckBox = new CheckBox();
        contactKeypadCheckBox.setDisable(true);
        
        Label contactCardReaderLabel = new Label("Card Reader");
        CheckBox contactCardReaderCheckBox = new CheckBox();
        contactCardReaderCheckBox.setDisable(true);
        
        Label contactBarCodelLabel = new Label("Bar-Code Reader");
        CheckBox contactBarCodeCheckBox = new CheckBox();
        contactBarCodeCheckBox.setDisable(true);
        
        Label contactPhoneEntryLabel = new Label("Phone Entry");
        CheckBox contactPhoneEntryCheckBox = new CheckBox();
        contactPhoneEntryCheckBox.setDisable(true);
        
        Label contactIntercomLabel = new Label("Intercom");
        CheckBox contactIntercomCheckBox = new CheckBox();
        contactIntercomCheckBox.setDisable(true);
        
        Label contactOpenLabel = new Label("About how many time will this gate be opened daily?");
        contactOpenLabel.setPrefWidth(500);
        contactOpenLabel.setWrapText(true);
        Label contactDistanceLabel = new Label("About how far is your home from the gate?");
        contactDistanceLabel.setPrefWidth(500);
        
        TextField contactOpenTextField = new TextField();
        contactOpenTextField.setPrefWidth(500);
        contactOpenTextField.setDisable(true);
        TextField contactDistanceTextField = new TextField();
        contactDistanceTextField.setPrefWidth(500);
        contactDistanceTextField.setDisable(true);
        
        Button contactSubmit = new Button("Submit");
        Button contactReset = new Button("Reset");
        
        //TODO work on contact us page
        //TODO write a clear function for all contact us inputs
        
        //handles enabling and disabling radio groups on check box clicks
        disableGroup(contactGateGroup);
        contactGateCheckBox.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
	               if(contactGateCheckBox.isSelected()) {
	            	   enableGroup(contactGateGroup);
	            	   enableGroup(contactGardenGateGroup);
	                   enableGroup(contactMatchFenceGroup);
	                   contactGateSSCheckBox.setDisable(false);
	            	   contactGateDSCheckBox.setDisable(false);
	            	   contactGateSSLCheckBox.setDisable(false);
	            	   contactGateDSLCheckBox.setDisable(false);
	            	   contactColorsTextField.setDisable(false);
	            	   startComboBox.setDisable(false);
	            	   finishComboBox.setDisable(false);
	               }else {
	            	   disableGroup(contactGateGroup);
	            	   disableGroup(contactMatchFenceGroup);
	            	   fullDisable(contactGateSSCheckBox);
	            	   fullDisable(contactGateDSCheckBox);
	            	   fullDisable(contactGateSSLCheckBox);
	            	   fullDisable(contactGateDSLCheckBox);
	            	   
	            	   if(!contactFenceCheckBox.isSelected()) {
	            		   disableGroup(contactGardenGateGroup);
	            		   contactColorsTextField.setDisable(true);
	            		   contactColorsTextField.setText("");
		            	   startComboBox.setDisable(true);
		            	   startComboBox.setValue("SELECT HEIGHT");
		            	   finishComboBox.setDisable(true);
		            	   finishComboBox.setValue("SELECT HEIGHT");
	            	   }
	               }
	            }
			});
        
        disableGroup(contactFenceGroup);
        contactFenceCheckBox.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
	               if(contactFenceCheckBox.isSelected()) {
	            	   enableGroup(contactFenceGroup);
	            	   enableGroup(contactGardenGateGroup);
	            	   contactColorsTextField.setDisable(false);
	            	   startComboBox.setDisable(false);
	            	   finishComboBox.setDisable(false);
	               }else {
	            	   disableGroup(contactFenceGroup);
	            	   if(!contactGateCheckBox.isSelected()) {
	            		   disableGroup(contactGardenGateGroup);
		            	   disableGroup(contactMatchFenceGroup);
		            	   contactColorsTextField.setDisable(true);
		            	   contactColorsTextField.setText("");
		            	   startComboBox.setDisable(true);
		            	   startComboBox.setValue("SELECT HEIGHT");
		            	   finishComboBox.setDisable(true);
		            	   finishComboBox.setValue("SELECT HEIGHT");
	            	   }
	               }
	            }
			});
        disableGroup(contactGardenGateGroup);
        disableGroup(contactMatchFenceGroup);
        
        contactOpenerCheckBox.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
	               if(contactOpenerCheckBox.isSelected()) {
	                   contactCommercialCheckBox.setDisable(false);
	                   contactResidentialCheckBox.setDisable(false);
	                   brandComboBox.setDisable(false);
	                   contactRemoteCheckBox.setDisable(false);
	                   contactKeypadCheckBox.setDisable(false);
	                   contactCardReaderCheckBox.setDisable(false);
	                   contactBarCodeCheckBox.setDisable(false);
	                   contactPhoneEntryCheckBox.setDisable(false);
	                   contactIntercomCheckBox.setDisable(false);
	                   contactOpenTextField.setDisable(false);
	                   contactDistanceTextField.setDisable(false);
	               }else {
	            	   brandComboBox.setDisable(true);
	            	   brandComboBox.setValue("SELECT BRAND");
	            	   fullDisable(contactCommercialCheckBox);
	            	   fullDisable(contactResidentialCheckBox);
	            	   fullDisable(contactRemoteCheckBox);
	            	   fullDisable(contactKeypadCheckBox);
	            	   fullDisable(contactCardReaderCheckBox);
	            	   fullDisable(contactBarCodeCheckBox);
	            	   fullDisable(contactPhoneEntryCheckBox);
	            	   fullDisable(contactIntercomCheckBox);
	            	   contactOpenTextField.setText("");
	            	   contactOpenTextField.setDisable(true);
	            	   contactDistanceTextField.setText("");
	            	   contactDistanceTextField.setDisable(true);
	               }
	            }
			});
        
        contactReset.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				contactGateCheckBox.setSelected(false);
				contactGateCheckBox.fireEvent(new ActionEvent());
				contactFenceCheckBox.setSelected(false);
				contactFenceCheckBox.fireEvent(new ActionEvent());
				contactOpenerCheckBox.setSelected(false);
				contactOpenerCheckBox.fireEvent(new ActionEvent());
				contactRailingCheckBox.setSelected(false);
				
				statesComboBox.setValue("SELECT_STATE");
				contactFirstTextField.setText("");
				contactFirstTextField.fireEvent(new ActionEvent());
				contactLastTextField.setText("");
				contactLastTextField.fireEvent(new ActionEvent());
				contactAddressTextField.setText("");
				contactAddressTextField.fireEvent(new ActionEvent());
				contactCityTextField.setText("");
				contactCityTextField.fireEvent(new ActionEvent());
				contactZipCodeTextField.setText("");
				contactZipCodeTextField.fireEvent(new ActionEvent());
				contactEmailTextField.setText("");
				contactEmailTextField.fireEvent(new ActionEvent());
				contactPhoneTextField.setText("");
				contactPhoneTextField.fireEvent(new ActionEvent());
				
			}
        	
        });
        
        //Contact Page Holders
        HBox contactQuoteHeadHbox = new HBox(10,contactQuoteLabel);
        contactQuoteHeadHbox.setAlignment(Pos.TOP_CENTER);
        contactQuoteHeadHbox.setPadding(new Insets(10));
        
        HBox contactGateRailingHbox = new HBox(10, contactGateLabel, contactGateCheckBox, contactRailingLabel, contactRailingCheckBox);
        contactGateRailingHbox.setAlignment(Pos.TOP_CENTER);
        contactGateRailingHbox.setPadding(new Insets(10));
        
        HBox contactFenceOpenerHbox = new HBox(10, contactFenceLabel, contactFenceCheckBox, contactOpenerLabel, contactOpenerCheckBox);
        contactFenceOpenerHbox.setAlignment(Pos.TOP_CENTER);
        contactFenceOpenerHbox.setPadding(new Insets(10));
        
        HBox contactOtherHbox = new HBox(10, contactOtherLabel, contactOtherCheckBox);
        contactOtherHbox.setAlignment(Pos.BOTTOM_CENTER);
        contactOtherHbox.setPadding(new Insets(10));
        
        VBox contactHeaderVbox = new VBox(10, contactHeaderLabel, contactPrivHeadLabel, contactPrivStateLabel, contactPrivDisclaimLabel);
        contactHeaderVbox.setAlignment(Pos.TOP_CENTER);
        
        VBox contactQuoteVbox = new VBox(10, contactQuoteHeadHbox, contactGateRailingHbox, contactFenceOpenerHbox, contactOtherHbox);
        contactQuoteVbox.setAlignment(Pos.TOP_LEFT);
        
        //Gridpane for Contact Information
        GridPane contactGridPane = new GridPane();
        contactGridPane.setPadding(new Insets(10));
        contactGridPane.setAlignment(Pos.TOP_CENTER);
        contactGridPane.setVgap(10);
        contactGridPane.setHgap(10);
        contactGridPane.add(contactFirstLabel, 0, 0, 3, 1);
        contactGridPane.add(contactFirstTextField, 4,0,7,1);
        contactGridPane.add(contactLastLabel, 0, 1, 3, 1);
        contactGridPane.add(contactLastTextField, 4,1,7,1);
        contactGridPane.add(contactAddressLabel, 0, 2, 3, 1);
        contactGridPane.add(contactAddressTextField, 4,2,7,1);
        contactGridPane.add(contactCityLabel, 0, 3, 3, 1);
        contactGridPane.add(contactCityTextField, 4,3,7,1);
        contactGridPane.add(contactStateLabel, 0, 4, 3, 1);
        contactGridPane.add(statesComboBox, 4,4,7,1);
        contactGridPane.add(contactEmailLabel, 0, 5, 3, 1);
        contactGridPane.add(contactEmailTextField, 4,5,7,1);
        contactGridPane.add(contactPhoneLabel, 0, 6, 3, 1);
        contactGridPane.add(contactPhoneTextField, 4,6,7,1);
        
        GridPane contactOptionsGridPane = new GridPane();
        contactOptionsGridPane.setPrefWidth(600);
        contactOptionsGridPane.setPadding(new Insets(10));
        contactOptionsGridPane.setAlignment(Pos.TOP_CENTER);
        contactOptionsGridPane.setVgap(10);
        contactOptionsGridPane.setHgap(10);
        contactOptionsGridPane.add(contactYes, 4,0,1,2);
        contactOptionsGridPane.add(contactNo, 5,0,1,2);
        contactOptionsGridPane.add(contactIdk, 6,0,4,2);
        contactOptionsGridPane.add(contactGatePostLabel, 0,2,3,1);
        contactOptionsGridPane.add(contactGateYesRB, 4,2,1,1);
        contactOptionsGridPane.add(contactGateNoRB, 5,2,1,1);
        contactOptionsGridPane.add(contactGateIdkRB, 9,2,1,1);
        contactOptionsGridPane.add(contactFencePostLabel, 0,3,3,1);
        contactOptionsGridPane.add(contactFenceYesRB, 4,3,1,1);
        contactOptionsGridPane.add(contactFenceNoRB, 5,3,1,1);
        contactOptionsGridPane.add(contactFenceIdkRB, 9,3,1,1);
        contactOptionsGridPane.add(contactGardenGateLabel, 0,4,3,1);
        contactOptionsGridPane.add(contactGardenGateYesRB, 4,4,1,1);
        contactOptionsGridPane.add(contactGardenGateNoRB, 5,4,1,1);
        contactOptionsGridPane.add(contactMatchFenceLabel, 0,5,3,1);
        contactOptionsGridPane.add(contactMatchFenceYesRB, 4,5,1,1);
        contactOptionsGridPane.add(contactMatchFenceNoRB, 5,5,1,1);
        
        GridPane contactGOptions = new GridPane();
        contactGOptions.setPrefWidth(900);
        contactGOptions.setPadding(new Insets(10));
        contactGOptions.setAlignment(Pos.BOTTOM_CENTER);
        contactGOptions.setVgap(10);
        contactGOptions.setHgap(10);
        contactGOptions.add(contactColorsLabel, 0, 0,4,1);
        contactGOptions.add(contactColorsTextField, 4,0,8,1);
        contactGOptions.add(contactSHeightLabel, 0, 1, 2, 1);
        contactGOptions.add(startComboBox, 2,1,4,1);
        contactGOptions.add(contactFHeightLabel, 6, 1, 2, 1);
        contactGOptions.add(finishComboBox, 8,1,4,1);
        contactGOptions.add(contactAdditonalLabel, 0, 3, 4, 2);
        contactGOptions.add(contactAdditioalTextArea, 4,3,8,3);
        
        HBox contactQuoteHbox = new HBox(10, contactQuoteVbox, contactOptionsGridPane);
        contactQuoteHbox.setAlignment(Pos.TOP_CENTER);
        
        HBox contactGSSHbox = new HBox(10, contactGateSSLabel, contactGateSSCheckBox);
        HBox contactGDSHbox = new HBox(10, contactGateDSLabel, contactGateDSCheckBox);
        
        HBox contactGSSLHbox = new HBox(10, contactGateSSLLabel, contactGateSSLCheckBox );
        HBox contactGDSLHbox = new HBox(10, contactGateDSLLabel, contactGateDSLCheckBox);
        
        contactGSSHbox.setAlignment(Pos.TOP_CENTER);
        contactGDSHbox.setAlignment(Pos.TOP_CENTER);
        contactGSSLHbox.setAlignment(Pos.TOP_CENTER);
        contactGDSLHbox.setAlignment(Pos.TOP_CENTER);
        
        contactGSSHbox.setPadding(new Insets(10,0,10,0));
        contactGDSHbox.setPadding(new Insets(10,0,10,0));
        contactGSSLHbox.setPadding(new Insets(10,0,10,0));
        contactGDSLHbox.setPadding(new Insets(10,0,10,0));
        
        VBox contactSwingVbox = new VBox(10, contactGSSHbox, contactGDSHbox);
        contactSwingVbox.setPrefWidth(400);
        VBox contactSlideVbox = new VBox(10, contactGSSLHbox, contactGDSLHbox);
        contactSlideVbox.setPrefWidth(400);
        
        HBox contactGateOptionsHbox = new HBox(10,contactSwingVbox, contactSlideVbox);
        contactGateOptionsHbox.setAlignment(Pos.TOP_CENTER);
        
        HBox contactOpenHeadHbox = new HBox(10, contactGateOpenLabel);
        contactOpenHeadHbox.setAlignment(Pos.TOP_CENTER);
        
        HBox contactCommericalHbox = new HBox(10, contactCommercialLabel, contactCommercialCheckBox);
        contactCommericalHbox.setAlignment(Pos.TOP_CENTER);
        
        HBox contactResidentialHbox = new HBox(10,  contactResidentialLabel, contactResidentialCheckBox);
        contactResidentialHbox.setAlignment(Pos.TOP_CENTER);
        
        HBox contactType1Hbox = new HBox(10,  contactRemoteLabel, contactRemoteCheckBox, 
        		contactKeypadLabel,contactKeypadCheckBox, contactCardReaderLabel,
        		contactCardReaderCheckBox);
        contactType1Hbox.setAlignment(Pos.TOP_CENTER);
        contactType1Hbox.setPrefWidth(600);
        
        HBox contactType2Hbox = new HBox(10,  contactBarCodelLabel, contactBarCodeCheckBox,
        		contactPhoneEntryLabel, contactPhoneEntryCheckBox, contactIntercomLabel,
        		contactIntercomCheckBox);
        contactType2Hbox.setAlignment(Pos.TOP_CENTER);
        contactType2Hbox.setPrefWidth(600);
        
        GridPane contactOpenGridPane = new GridPane();
        contactOpenGridPane.setPadding(new Insets(10));
        contactOpenGridPane.setAlignment(Pos.TOP_CENTER);
        contactOpenGridPane.setVgap(10);
        contactOpenGridPane.setHgap(10);
        contactOpenGridPane.add(contactCommericalHbox, 0, 0, 5, 1);
        contactOpenGridPane.add(contactResidentialHbox, 5,0,5,1);
        contactOpenGridPane.add(contactBrandLabel, 0, 1, 5, 1);
        contactOpenGridPane.add(brandComboBox, 5,1,5,1);
        contactOpenGridPane.add(contactOpenLabel, 0, 2, 5, 1);
        contactOpenGridPane.add(contactOpenTextField, 5,2,5,1);
        contactOpenGridPane.add(contactTypeLabel, 0, 3, 5, 2);
        contactOpenGridPane.add(contactType1Hbox, 5,3,5,1);
        contactOpenGridPane.add(contactType2Hbox, 5,4,5,1);
        contactOpenGridPane.add(contactDistanceLabel, 0, 5, 5, 1);
        contactOpenGridPane.add(contactDistanceTextField, 5,5,5,1);
        
        HBox buttonHolderHbox = new HBox(10, contactSubmit, contactReset);
        buttonHolderHbox.setAlignment(Pos.BOTTOM_CENTER);
        
        //No Page Default Holder
        HBox NoPageHbox = new HBox(10, PageNotFoundView);
        NoPageHbox.setAlignment(Pos.TOP_CENTER);

        //Blank No Page
        NoPageVbox = new VBox(10, NoPageHbox);
        
        //Home Page 
        BodyVbox = new VBox(10,descriptionHbox, reasonsHbox, 
        		imagesHbox,typesHbox);
        //About Page
        AboutVbox = new VBox(10, aboutHbox, aboutHbox2);
        
        //Contact Page
        ContactVbox = new VBox(10,contactHeaderVbox, contactGridPane, 
        		contactQuoteHbox, contactGateOptionsHbox, contactGOptions,
        		contactOpenHeadHbox, contactOpenGridPane,buttonHolderHbox);
        
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
        
        
        //Driveway Gates scene
        VBox vbox2 = new VBox(10);
        
        Label edenlbl = new Label("Entrance of Eden");
        Label spearlbl = new Label("Spaer of the Ocean");
        Label miralbl = new Label("Mirabela");
        Label wavelbl = new Label("Wave of Elegance");
        Label seallbl = new Label("Royal Seal");
        Label romanlbl = new Label("Roman Timess");
        
//        ScrollPane scrollPane2 = new ScrollPane(vbox2);
//        scrollPane2.setPadding(new Insets(10));
//        scrollPane2.setBackground(new Background(new BackgroundFill(Color.BLANCHEDALMOND, CornerRadii.EMPTY, Insets.EMPTY)));
//        scrollPane2.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
//        BorderPane root2 = new BorderPane(scrollPane2);
//        root2.setBackground(new Background(new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY, Insets.EMPTY)));
//        root2.setPadding(new Insets(10));
//        Scene dgScene = new Scene(root2, WIDTH, HEIGHT);
//        dgScene.getStylesheets().add("Style.css");
        
        GridPane gridpane = new GridPane();
        gridpane.setVgap(10);
        gridpane.setHgap(10);
        gridpane.add(DG1View, 0, 0);
        gridpane.add(DG2View, 0, 1);
        gridpane.add(DG3View, 1, 0);
        gridpane.add(DG4View, 1, 1);
        gridpane.add(DG5View, 2, 0);
        gridpane.add(DG6View, 2, 1);
        
        //Garden Gates scene
        VBox vbox3 = new VBox(10);
        
        Label gemlbl = new Label("Gem Stone");
        Label sealbl = new Label("Sea Shell");
        Label medlbl = new Label("Mediterranean");
        Label roselbl = new Label("Morning Rose");
        Label archlbl = new Label("Arch Vine");
        Label oasislbl = new Label("Oasis");
        
//        ScrollPane scrollPane3 = new ScrollPane(vbox3);
//        scrollPane3.setPadding(new Insets(10));
//        scrollPane3.setBackground(new Background(new BackgroundFill(Color.BLANCHEDALMOND, CornerRadii.EMPTY, Insets.EMPTY)));
//        scrollPane3.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
//        BorderPane root3 = new BorderPane(scrollPane3);
//        root3.setBackground(new Background(new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY, Insets.EMPTY)));
//        root3.setPadding(new Insets(10));
//        Scene ggScene = new Scene(root3, WIDTH, HEIGHT);
//        ggScene.getStylesheets().add("Style.css");
        
//        GridPane gridpane2 = new GridPane();
//        gridpane2.setVgap(10);
//        gridpane2.setHgap(10);
//        gridpane2.add(GG1View, 0, 0);
//        gridpane2.add(GG2View, 0, 1);
//        gridpane2.add(GG3View, 1, 0);
//        gridpane2.add(GG4View, 1, 1);
//        gridpane2.add(GG5View, 2, 0);
//        gridpane2.add(GG6View, 2, 1);

        //Fencing scene
//        VBox vbox4 = new VBox(10);
//        ScrollPane scrollPane4 = new ScrollPane(vbox4);
//        scrollPane4.setPadding(new Insets(10));
//        scrollPane4.setBackground(new Background(new BackgroundFill(Color.BLANCHEDALMOND, CornerRadii.EMPTY, Insets.EMPTY)));
//        scrollPane4.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
//        BorderPane root4 = new BorderPane(scrollPane3);
//        root4.setBackground(new Background(new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY, Insets.EMPTY)));
//        root4.setPadding(new Insets(10));
//        Scene fScene = new Scene(root4, WIDTH, HEIGHT);
//        fScene.getStylesheets().add("Style.css");
        
//        GridPane gridpane3 = new GridPane();
//        gridpane3.setVgap(10);
//        gridpane3.setHgap(10);
//        gridpane3.add(AF1View, 0, 0);
//        gridpane3.add(AF2View, 0, 1);
//        gridpane3.add(AF3View, 1, 0);
//        gridpane3.add(AF4View, 1, 1);
//        gridpane3.add(AF5View, 2, 0);
//        gridpane3.add(AF6View, 2, 1);

//        linksComboBox.setOnAction(e -> {
//            switch (linksComboBox.getValue()) {
//                case "Driveway Gates": primaryStage.setScene(dgScene);
//                    vbox2.getChildren().addAll(headerHbox, linksHbox, gridpane,
//                            infoHbox);
//                    linksComboBox.setValue("Driveway Gates");
//                    break;
//                    
//                case "Garden Gates": primaryStage.setScene(ggScene);
//                    vbox3.getChildren().addAll(headerHbox, linksHbox, gridpane2,
//                            infoHbox);
//                    linksComboBox.setValue("Garden Gates");
//                    break;
//                    
//                case "Fencing": primaryStage.setScene(fScene);
//                    vbox4.getChildren().addAll(headerHbox, linksHbox, gridpane3,
//                            infoHbox);
//                    linksComboBox.setValue("Fencing");
//                    break;
//                    
//                default:
//                    break;
//            }
//        });
        
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    //functions for star addition and removal
    public static boolean star(Label l) {
    	return l.getText().charAt(0) == '*';
    }
    
    public static void addStar(Label l) {
    	l.setText("*"+l.getText().toString());
    }
    
    public static void subStar(Label l) {
    	l.setText(l.getText().substring(1));
    }
    
    //functions for enabling and disabling toggle groups
    public static void disableGroup(ToggleGroup toggleGroup) {
    	if(toggleGroup.getSelectedToggle() != null) {
    		toggleGroup.getSelectedToggle().setSelected(false);
    	}
	    	toggleGroup.getToggles().forEach(toggle -> {
	    	    Node node = (Node) toggle ;
	    	    node.setDisable(true);
	    	});
    }
    
    public static void enableGroup(ToggleGroup toggleGroup) {
	    	toggleGroup.getToggles().forEach(toggle -> {
	    	    Node node = (Node) toggle ;
	    	    node.setDisable(false);
	    	});
    }
    
    public static void fullDisable(CheckBox cb) {
       if(cb.isSelected()) {
 		   cb.setSelected(false);
 	   }
       cb.setDisable(true);
 	   
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    //handles links hyperlink pages at bottom of every page
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
//				case "Policies":
//					mainVbox.getChildren().set(1, PoliciesVbox);
//					break;
//				case "FAQ":
//					mainVbox.getChildren().set(1, FAQVbox);
//					break;
//				case "Manufactures":
//					mainVbox.getChildren().set(1, ManufacturesVbox);
//					break;
//				case "Links":
//					mainVbox.getChildren().set(1, LinksVbox);
//					break;
				default:
					mainVbox.getChildren().set(1, NoPageVbox);
					break;
			}
		}
		
	}
    //Handles signifier for requirements met on textfields for contact us page
    class RequirementHandler implements EventHandler<KeyEvent>{
    	
    	Label selectedLabel;
    	TextField currentTextField;
    	
    	public RequirementHandler(Label l, TextField f) {
    		selectedLabel = l;
    		currentTextField = f;
    	}

		@Override
		public void handle(KeyEvent event) {
			if (!(currentTextField.getText() == null || currentTextField.getText().trim().isEmpty()) && star(selectedLabel)) {
				subStar(selectedLabel);
            }else if((currentTextField.getText() == null || currentTextField.getText().trim().isEmpty()) && !star(selectedLabel)) {
            	addStar(selectedLabel);
            }
			
		}
    	
    }

}
