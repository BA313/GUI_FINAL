package CS2450_Final;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
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
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
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
    
    private static final String REASONS_SEC2 = "Aluminum driveway gates are "
            + "becoming more and more popular because of how strong and durable "
            + "they are. The wide choices for design and style is also"
            + "another reason why this type of gate is preferred by many people "
            + "over wooden or iron gates."
            + "\r\n" +
            
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

//    //Brand Name Section
//    private static final String NAME_BRAND_SEC1 = "Here are some of our top brands!\r\n";
//    
//    private static final String NAME_BRAND_SEC2 = "BFT Gate Openers\r\n"
//            + "PowerMaster Gate Openers\r\n"
//            + "Eagle Gate Operators\r\n"
//            + "Elite Gate Openers\r\n"
//            + "Ramset Gate Operators\r\n"
//            + "Doorking Gate Openers\r\n"
//            + "Viking Gate Operators\r\n"
//            + "OSCO Linear Gate Openers\r\n"
//            + "Liftmaster Gate Openers\r\n"
//            + "Allstar Gate Operators\r\n"
//            + "SEA Gate Openers\r\n"
//            + "FAAC Gate Operators\r\n"
//            + "Apollo Gate Openers\r\n"
//            + "Hysecurity Barriers / Risers  Swing  Slides\r\n"
//            + "\r\n"
//            + "Residential Sliding Gate Openers\r\n"
//            + "\r\n"
//            + "Barrier Gate Vehicle Barrier Gate, Parking\r\n"
//            + "Gate, Barrier\r\n"
//            + "\r\n"
//            + "Ditek Surge Protector  -- Transformers\r\n"
//            + "Revere\r\n"
//            + "Aiphone Intercom";
//            //clean this up a bit/shorter the list

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
    
    static final Image PageNotFound = new Image("PageNotFound.jpg");
    
    static final Image AlFence1 = new Image("AluminumFence1.jpg");
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
    
    static final Image Homepage1 = new Image("homepageimage1.jpg");
    static final Image Homepage2 = new Image("homepageimage2.jpg");
    
    //holds All different Vboxes to display
    static VBox mainVbox;
    
    //Holds Home Screen Attributes
    static VBox BodyVbox;
    
    //Vbox to fill page we didnt make
    static VBox NoPageVbox;
    
    //Holds Driveway Gates page
    static VBox dwgateVbox;
    
    //Holds Garden Gates page
    static VBox ggateVbox;
    
    //Holds Fencing page
    static VBox fenceVbox;
    
    //Holds purchase page
    static VBox purchaseVbox;
    
    //Holds shopping cart page
    static VBox shoppingcartVbox;
    
    static VBox AboutVbox;
    //VBoxes for all bottom of page Links
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
        PageNotFoundView.setFitWidth(900);
        PageNotFoundView.setFitHeight(900);
        
        //imageviews for pictures
        ImageView AF1View = new ImageView(AlFence1);
        AF1View.setFitWidth(300);
        AF1View.setFitHeight(250);
        
        ImageView AF2View = new ImageView(AlFence2);
        AF2View.setFitWidth(300);
        AF2View.setFitHeight(250);
        
        ImageView AF3View = new ImageView(AlFence3);
        AF3View.setFitWidth(300);
        AF3View.setFitHeight(250);
        
        ImageView AF4View = new ImageView(AlFence4);
        AF4View.setFitWidth(300);
        AF4View.setFitHeight(250);
        
        ImageView AF5View = new ImageView(AlFence5);
        AF5View.setFitWidth(300);
        AF5View.setFitHeight(250);
        
        ImageView AF6View = new ImageView(AlFence6);
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
        GG1View.setFitWidth(300);
        GG1View.setFitHeight(250);
        
        ImageView GG2View = new ImageView(GardGate2);
        GG2View.setFitWidth(300);
        GG2View.setFitHeight(250);
        
        ImageView GG3View = new ImageView(GardGate3);
        GG3View.setFitWidth(300);
        GG3View.setFitHeight(250);
        
        ImageView GG4View = new ImageView(GardGate4);
        GG4View.setFitWidth(300);
        GG4View.setFitHeight(250);
        
        ImageView GG5View = new ImageView(GardGate5);
        GG5View.setFitWidth(300);
        GG5View.setFitHeight(250);
        
        ImageView GG6View = new ImageView(GardGate6);
        GG6View.setFitWidth(300);
        GG6View.setFitHeight(250);
        
        ImageView R1View = new ImageView(Railings1);
        R1View.setPreserveRatio(true);
        R1View.setFitWidth(300);
        R1View.setFitHeight(250);
        
        ImageView R2View = new ImageView(Railings2);
        R2View.setPreserveRatio(true);
        R2View.setFitWidth(300);
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
        
        ImageView HP1View = new ImageView(Homepage1);
        HP1View.setFitWidth(300);
        HP1View.setFitHeight(250);
        
        ImageView HP2View = new ImageView(Homepage2);
        HP2View.setFitWidth(300);
        HP2View.setFitHeight(250);
        
        Label subLabel = new Label(SUBHEADER);
        subLabel.setId("sublabel");
        
        Label locationLabel = new Label(BUSINESS_INFO);
        locationLabel.setId("locationlabel");
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
        
//        Label brandsLabel = new Label(NAME_BRAND_SEC1 + NAME_BRAND_SEC2);
//        brandsLabel.setMaxWidth(950);
//        brandsLabel.setTextAlignment(TextAlignment.JUSTIFY);
        
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
        addtInfoTextFlow.setId("addtinfotext");
        
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
        HBox descriptionHbox = new HBox(10, businessLabel, HP1View);
        descriptionHbox.setAlignment(Pos.TOP_CENTER);
        
        //hbox for reasons for use
        HBox reasonsHbox = new HBox(10, reasonsLabel);
        reasonsHbox.setAlignment(Pos.BOTTOM_CENTER);
        reasonsHbox.setPadding(new Insets(0,10,0,10));
        
        HBox imagesHbox = new HBox(10, HP2View, AG1View, AG2View, AG3View);
        imagesHbox.setAlignment(Pos.TOP_CENTER);
        
//        HBox imagesHbox2 = new HBox(10, GG1View, GG2View, GG3View,R1View,R2View);
//        imagesHbox2.setAlignment(Pos.TOP_CENTER);
        
        //hbox for gate types
        HBox typesHbox = new HBox(10, typesLabel);
        typesHbox.setAlignment(Pos.BOTTOM_CENTER);
        typesHbox.setPadding(new Insets(0,10,0,10));
        
//        //hbox for brand links
//        HBox brandsHbox = new HBox(10, brandsLabel);
//        brandsHbox.setAlignment(Pos.BOTTOM_CENTER);
//        brandsHbox.setPadding(new Insets(0,10,0,10));
        
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
        
        
        
        //Driveway Gates scene
        Label edenlbl = new Label("Entrance of Eden");
        edenlbl.setId("pagelabels");
        Label spearlbl = new Label("Spear of the Ocean");
        spearlbl.setId("pagelabels");
        Label miralbl = new Label("Mirabela");
        miralbl.setId("pagelabels");
        Label wavelbl = new Label("Wave of Elegance");
        wavelbl.setId("pagelabels");
        Label seallbl = new Label("Royal Seal");
        seallbl.setId("pagelabels");
        Label romanlbl = new Label("Roman Times");
        romanlbl.setId("pagelabels");
        
        //Label send to purchase scene
        edenlbl.setOnMouseClicked(e -> {
                mainVbox.getChildren().set(1, purchaseVbox);
        });
        
        //Labels send to no page scene
        spearlbl.setOnMouseClicked(e -> {
                mainVbox.getChildren().set(1, NoPageVbox);
        });
        miralbl.setOnMouseClicked(e -> {
                mainVbox.getChildren().set(1, NoPageVbox);
        });
        wavelbl.setOnMouseClicked(e -> {
                mainVbox.getChildren().set(1, NoPageVbox);
        });
        seallbl.setOnMouseClicked(e -> {
                mainVbox.getChildren().set(1, NoPageVbox);
        });
        romanlbl.setOnMouseClicked(e -> {
                mainVbox.getChildren().set(1, NoPageVbox);
        });
        
        VBox dwgbox1 = new VBox(DG1View, edenlbl);
        dwgbox1.setAlignment(Pos.CENTER);
        VBox dwgbox2 = new VBox(DG2View, spearlbl);
        dwgbox2.setAlignment(Pos.CENTER);
        VBox dwgbox3 = new VBox(DG3View, miralbl);
        dwgbox3.setAlignment(Pos.CENTER);
        VBox dwgbox4 = new VBox(DG4View, wavelbl);
        dwgbox4.setAlignment(Pos.CENTER);
        VBox dwgbox5 = new VBox(DG5View, seallbl);
        dwgbox5.setAlignment(Pos.CENTER);
        VBox dwgbox6 = new VBox(DG6View, romanlbl);
        dwgbox6.setAlignment(Pos.CENTER);
        
        GridPane gridpane = new GridPane();
        gridpane.setVgap(10);
        gridpane.setHgap(10);
        gridpane.setAlignment(Pos.CENTER);
        gridpane.add(dwgbox1, 0, 0);
        gridpane.add(dwgbox2, 0, 1);
        gridpane.add(dwgbox3, 1, 0);
        gridpane.add(dwgbox4, 1, 1);
        gridpane.add(dwgbox5, 2, 0);
        gridpane.add(dwgbox6, 2, 1);
        dwgateVbox = new VBox(10, gridpane);
        
        
        //Garden Gates scene
        Label gemlbl = new Label("Gem Stone");
        gemlbl.setId("pagelabels");
        Label seashelllbl = new Label("Sea Shell");
        seashelllbl.setId("pagelabels");
        Label medlbl = new Label("Mediterranean");
        medlbl.setId("pagelabels");
        Label roselbl = new Label("Morning Rose");
        roselbl.setId("pagelabels");
        Label archlbl = new Label("Arch Vine");
        archlbl.setId("pagelabels");
        Label oasislbl = new Label("Oasis");
        oasislbl.setId("pagelabels");
        
        //Labels send to no page scene
        gemlbl.setOnMouseClicked(e -> {
                mainVbox.getChildren().set(1, NoPageVbox);
        });
        seashelllbl.setOnMouseClicked(e -> {
                mainVbox.getChildren().set(1, NoPageVbox);
        });
        medlbl.setOnMouseClicked(e -> {
                mainVbox.getChildren().set(1, NoPageVbox);
        });
        roselbl.setOnMouseClicked(e -> {
                mainVbox.getChildren().set(1, NoPageVbox);
        });
        archlbl.setOnMouseClicked(e -> {
                mainVbox.getChildren().set(1, NoPageVbox);
        });
        oasislbl.setOnMouseClicked(e -> {
                mainVbox.getChildren().set(1, NoPageVbox);
        });
        
        VBox ggbox1 = new VBox(GG1View, gemlbl);
        ggbox1.setAlignment(Pos.CENTER);
        VBox ggbox2 = new VBox(GG2View, seashelllbl);
        ggbox2.setAlignment(Pos.CENTER);
        VBox ggbox3 = new VBox(GG3View, medlbl);
        ggbox3.setAlignment(Pos.CENTER);
        VBox ggbox4 = new VBox(GG4View, roselbl);
        ggbox4.setAlignment(Pos.CENTER);
        VBox ggbox5 = new VBox(GG5View, archlbl);
        ggbox5.setAlignment(Pos.CENTER);
        VBox ggbox6 = new VBox(GG6View, oasislbl);
        ggbox6.setAlignment(Pos.CENTER);
        
        GridPane gridpane2 = new GridPane();
        gridpane2.setVgap(10);
        gridpane2.setHgap(10);
        gridpane2.setAlignment(Pos.CENTER);
        gridpane2.add(ggbox1, 0, 0);
        gridpane2.add(ggbox2, 0, 1);
        gridpane2.add(ggbox3, 1, 0);
        gridpane2.add(ggbox4, 1, 1);
        gridpane2.add(ggbox5, 2, 0);
        gridpane2.add(ggbox6, 2, 1);
        ggateVbox = new VBox(10, gridpane2);
        
        
        //Fencing scene
        Label shellslbl = new Label("Sea Shells");
        shellslbl.setId("pagelabels");
        Label thornslbl = new Label("Thorns of Power II");
        thornslbl.setId("pagelabels");
        Label rusticlbl = new Label("Modernly Rustic");
        rusticlbl.setId("pagelabels");
        Label candylbl = new Label("Candy Cane");
        candylbl.setId("pagelabels");
        Label crescentlbl = new Label("Crescent Moon III");
        crescentlbl.setId("pagelabels");
        Label tidelbl = new Label("Pacific Tide");
        tidelbl.setId("pagelabels");
        
        //Labels send to no page scene
        shellslbl.setOnMouseClicked(e -> {
                mainVbox.getChildren().set(1, NoPageVbox);
        });
        thornslbl.setOnMouseClicked(e -> {
                mainVbox.getChildren().set(1, NoPageVbox);
        });
        rusticlbl.setOnMouseClicked(e -> {
                mainVbox.getChildren().set(1, NoPageVbox);
        });
        candylbl.setOnMouseClicked(e -> {
                mainVbox.getChildren().set(1, NoPageVbox);
        });
        crescentlbl.setOnMouseClicked(e -> {
                mainVbox.getChildren().set(1, NoPageVbox);
        });
        tidelbl.setOnMouseClicked(e -> {
                mainVbox.getChildren().set(1, NoPageVbox);
        });
        
        VBox fbox1 = new VBox(AF1View, shellslbl);
        fbox1.setAlignment(Pos.CENTER);
        VBox fbox2 = new VBox(AF2View, thornslbl);
        fbox2.setAlignment(Pos.CENTER);
        VBox fbox3 = new VBox(AF3View, rusticlbl);
        fbox3.setAlignment(Pos.CENTER);
        VBox fbox4 = new VBox(AF4View, candylbl);
        fbox4.setAlignment(Pos.CENTER);
        VBox fbox5 = new VBox(AF5View, crescentlbl);
        fbox5.setAlignment(Pos.CENTER);
        VBox fbox6 = new VBox(AF6View, tidelbl);
        fbox6.setAlignment(Pos.CENTER);
        
        GridPane gridpane3 = new GridPane();
        gridpane3.setVgap(10);
        gridpane3.setHgap(10);
        gridpane3.setAlignment(Pos.CENTER);
        gridpane3.add(fbox1, 0, 0);
        gridpane3.add(fbox2, 0, 1);
        gridpane3.add(fbox3, 1, 0);
        gridpane3.add(fbox4, 1, 1);
        gridpane3.add(fbox5, 2, 0);
        gridpane3.add(fbox6, 2, 1);
        fenceVbox = new VBox(10, gridpane3);
        
        
        //Purchasing scene
        Button addToCartBtn = new Button("Add To Cart");
        Button checkoutBtn = new Button("Checkout");
        
        Label subTotallbl = new Label();
        subTotallbl.setId("purchaselabels");
        Label shippinglbl = new Label();
        shippinglbl.setId("purchaselabels");
        Label totallbl = new Label();
        totallbl.setId("purchaselabels");
        
        HBox buttonsHbox = new HBox(5, addToCartBtn, checkoutBtn);
       
        ImageView gatePurchaseView = new ImageView(DrivewayGate1);
        gatePurchaseView.setFitWidth(600);
        gatePurchaseView.setFitHeight(550);
        
        Label gatePurchaselbl = new Label("Entrance of Eden");
        gatePurchaselbl.setId("purchaselabels");
        
        VBox gatePurchaseVbox = new VBox(10, gatePurchaseView, gatePurchaselbl);
        gatePurchaseVbox.setAlignment(Pos.CENTER);
        
        ComboBox<String> purchaseOptionsComboBox = new ComboBox<>();
        purchaseOptionsComboBox.getItems().addAll("SELECT SIZE", "10ft Wide : $5,400", "12ft Wide : $6,480", 
                "14ft Wide : $7,560", "16ft Wide : $8,640");
        purchaseOptionsComboBox.setValue("SELECT SIZE");
        
        VBox gatePurchaseVbox2 = new VBox(20, purchaseOptionsComboBox, buttonsHbox, subTotallbl, shippinglbl, totallbl);
      
        //Adds value to purchase
        addToCartBtn.setOnAction(e -> { 
            double cost = 0;
            switch(purchaseOptionsComboBox.getValue()) {
                case "10ft Wide : $5,400": 
                    cost = 5400.00;
                    break;
                case "12ft Wide : $6,480":
                    cost = 6480.00;
                    break;
                case "14ft Wide : $7,560":
                    cost = 7560.00;
                    break;
                case "16ft Wide : $8,640":
                    cost = 8640.00;
                    break;
                default:
                    break;
            }
            double shippingPercent = .11;
            double shipping = cost * shippingPercent;
            double total = cost + shipping;
            subTotallbl.setText(String.format("Subtotal: $" + "%,.2f", cost));
            shippinglbl.setText(String.format("Shipping & Handling: $" + "%,.2f", shipping));
            totallbl.setText(String.format("Total: $" + "%,.2f", total));
        });

        GridPane purchaseGridPane = new GridPane();
        purchaseGridPane.setAlignment(Pos.CENTER);
        purchaseGridPane.setHgap(25);
        purchaseGridPane.setVgap(10);
        purchaseGridPane.add(gatePurchaseVbox, 0, 0);
        purchaseGridPane.add(gatePurchaseVbox2, 1, 0);
        
        purchaseVbox = new VBox(10, purchaseGridPane);
        
        checkoutBtn.setOnAction(e -> {
            mainVbox.getChildren().set(1, NoPageVbox);
        });
        
        
        
        //Code to change what Vbox Shows when button is pressed
        homeBtn.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent event) {
    			mainVbox.getChildren().set(1, BodyVbox);
                        linksComboBox.setValue("SELECT PAGE");
                }
        });
        
        linksComboBox.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent event) {
    			switch(linksComboBox.getValue().toString()) {
    			case "SELECT PAGE":
    				mainVbox.getChildren().set(1, BodyVbox);
    				break;
                        case "Driveway Gates":
                                mainVbox.getChildren().set(1, dwgateVbox);
                                break;
                        case "Garden Gates":
                                mainVbox.getChildren().set(1, ggateVbox);
                                break;
                        case "Fencing":
                                mainVbox.getChildren().set(1, fenceVbox);
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
