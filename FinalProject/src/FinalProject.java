package CS2450_Final;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author Nate
 */
public class FinalProject extends Application {

    //window size
    private static final double WIDTH = 1000.0, HEIGHT = 1500.0;

    //greeting header
    private static final String HEADER = "Welcome To: Gates N Fences";
    private static final String SUBHEADER = "Designed to Enhance the Entry"
            + " of your home with Custom Ornamental Decorative Driveway "
            + "Gates while bringing Safety, Security and convenience.";
    
    //Cut down on the text cause this site says so much fucking information
    
    //business info
    private static final String BUSINESS_INFO = "L.A. Ornamental Corp\r\n"
            + "3708 N.W. 82nd Street\r\n"
            + "Miami, Florida 33147\r\n"
            + "Phone: 305-696-0419\r\n"
            + "LAOrnamental@Aol.com";

    //about section text
    private static final String ABOUT_SEC1 = "All of our Aluminum or Wrought Iron "
            + "Gates, or Fences are designed and manufactured to withstand a"
            + " range of outdoor conditions. Our\r\n commitment to our "
            + "customers and dedication to produce quality gates has earned"
            + " us thousands of satisfied customers.";
    private static final String ABOUT_SEC2 = "Although we offer a wide selection or "
            + "Ornamental Designs or Decorative Designs, we can design and "
            + "manufacture any style in aluminum or\r\n wrought iron metals. "
            + "L. A. Ornamental & Rack Corp also offers Fences, Garden or Walk "
            + "Thru Gates to match your driveway  gates. With over\r\n "
            + "thirty five years of experience in manufacturing and designing"
            + " elegant, custom, or exotic Aluminum Driveway Gates and Fences,"
            + " our past and\r\n future customers can have peace of mind that"
            + " they are receiving quality workmanship.  We are a Fence Company "
            + "that gives our customers\r\n 110% of dedication to manufacture "
            + "quality driveway gates and fences.\r\n For a quote please send an"
            + " e-mail to LAOrnamental@aol.com";
    private static final String ABOUT_SEC3 = "";

    //reasons to buy section
    private static final String REASONS_SEC1 = "Why our Custom Made Aluminum "
            + "Driveway Gates are Awsome looking, stronger, better material and "
            + "workmanship is just part of our success";
    private static final String REASONS_SEC2 = "Aluminum driveway gates are "
            + "becoming more and more popular because of how strong and durable "
            + "they are. The wide choices for design and style is also\r\n"
            + "another reason why this type of gate is preferred by many people "
            + "over wooden or iron gates.\r\n"
            + "\r\n"
            + "Here are the reasons why a lot of homeowners choose to put up "
            + "custom made gates made of aluminum.\r\n"
            + "\r\n"
            + "1. Cost : Aluminum gates are less costly than steel gates at"
            + " least nowadays as 10 years ago they were allot more expensive "
            + "than Steel gates. If you like an\r\n"
            + "elaborate and very decorative gate, the cost of wrought steel "
            + "would be more, but with aluminum, the same design can be within "
            + "your allotted budget.\r\n"
            + "\r\n"
            + "2. Weight: Aluminum custom made gates are very light compare to "
            + "Steel gates, making them a lot easier to open compared to those "
            + "made of iron. This may be\r\n"
            + "just as important point when it comes to automatic gates, "
            + "aluminum only lets minimal tear and ware on the rollers and "
            + "hinges sliding gates. Because materials\r\n"
            + "are not heavy, the automated opening system will surely stay in "
            + "good condition for a longer time period and in some cases "
            + "extending the life of the gate\r\n"
            + "openers by 50%.\r\n"
            + "\r\n"
            + "3. Durability:Since aluminum is not damaged by rust or corrosion,"
            + " your gate can serve you well for many years. All our gates "
            + "designs are made from solid plate\r\n"
            + "aluminum that is 1/2 to 1\" inch thick. A gate made of solid "
            + "aluminum rods are a bit heavier but way lighter and so we are able"
            + " to use thick material which makes\r\n"
            + "our work stand out.\r\n"
            + "\r\n"
            + "4. Appearance and Options. When talking about sheer beauty, Our "
            + "aluminum gate are so elegant as the materials that we use in most"
            + " cases are TWICE thick than\r\n"
            + "a metal gate . You also have a wide choice in terms of colors as "
            + "we offer one of the largest select of Powder Coat Oven Baked in the net, larger selection\r\n"
            + "styles, and custom sizes.\r\n"
            + "\r\n"
            + "5. Maintenance: Maintenance is out of the question Aluminum is "
            + "the way to go, since it does not corrode, unlike with wrought "
            + "Iron ( steel ), you are not required\r\n"
            + "the Maintenance to up keep your gate no sanding,priming,re-painting"
            + " for many ,many,many years to come. With aluminum custom made gates,"
            + " you can save\r\n"
            + "time, money, and effort in maintenance This gates are capable of "
            + "enduring different types of elements without flaking, chipping, or cracking.";

    //Gate and Fence Descriptions
    private static final String OPEN_AND_OPS_DES = "We offer a large selection of "
            + " Gate Openers and Gate Operators for Residential Driveway Gates, "
            + "Light or Heavy Commercial Gates, or industrial\r\n"
            + "locations. If your not sure the style or size of the Gate opener"
            + " / gate operator  you need, please e-mail or contact us so we can"
            + " gladly help guide\r\n"
            + "you to the correct choice. We offer all type of Gate Openers / "
            + "Gate Operator, Sliding Gate Openers / Gate Operator, Swing Gate "
            + "Openers / Gate\r\n"
            + "Operator, Hydraulic Gate Openers / Gate Operator. We also have a "
            + "wide selection of replacement Main Circuit Boards for all brands, and\r\n"
            + "Remote Controls  for Visors or Keychains.";
    private static final String RAILING_DES = "Railings - L. A. Ornamental Rack "
            + "Corp offers top quality Balcony Railings, Front Porch Railings, "
            + "Deck Railings in Metal, Aluminum, or Wrought\r\n"
            + "Iron Steel.  We offer rails for residential or commercial "
            + "locations for either Interior or Exterior locations. We also "
            + "offer Custom Made Railings,\r\n"
            + "Decorative Railings, or HandRails that are powder coated paint "
            + "for low maintenance and long last Balcony Rails, Porch Rails, "
            + "or Deck Rails";
    private static final String GARDEN_DES = "Garden Gates or Walk Gates can be"
            + " designed to match any existing or ordered driveway gate.  "
            + "Customers can choose between wrought iron\r\n"
            + "or aluminum as material  and choose from our wide selection"
            + " of powder coated colors.  Garden or Walk Gates are custom made "
            + "that can give\r\n your home that special and elegant look.";

    //Brand Name Section
    private static final String NAME_BRAND_SEC1 = "Top Brands of Gate Openers "
            + "and Operators, Commercial, Residential, Industrial, Swing, Slide,"
            + " Rack & Pinion, Barrier";
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

    //final about section and legal information
    static final String ADDITIONAL_INFO = "About Us  |   Contact Us   |   "
            + "Our Policies   |   FAQ   |   Manufactures   |   Links   |   \r\n"
            + "Copyright Protected 2004-2008 - L. A. Ornamental & Rack Corp.  "
            + "All rights reserved. No part of this site can be reproduced in "
            + "any form or by any means,\r\n"
            + "electronic, mechanical, photocopying, or otherwise without prior "
            + "written consent of L. A. Ornamental & Rack Corp.\r\n"
            + "3708 NW 82nd Street  Miami  Florida  33147, Office: 305-696-0419 "
            + " Fax: 305-696-0461 E-Mail: LAOrnamental@Aol.com";

    //Gate and Fence Images
    static final Image AlFence1 = new Image("file:AluminumFence1.jpg");
    static final Image AlFence2 = new Image("file:AluminumFence2.jpg");
    
    static final Image AlGate1 = new Image("file:AluminumGate1.jpg");
    static final Image AlGate2 = new Image("file:AluminumGate2.jpg");
    static final Image AlGate3 = new Image("file:AluminumGate3.jpg");

    static final Image GardGate1 = new Image("file:GardenGate1.jpg");
    static final Image GardGate2 = new Image("file:GardenGate2.jpg");
    static final Image GardGate3 = new Image("file:GardenGate3.jpg");

    static final Image Railings1 = new Image("file:Ralings1.jpg");
    static final Image Railings2 = new Image("file:Ralings2.jpg");

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

        //lables for descriptions and stuff
        //Temp labels for header and business location/info
        Label headerLabel = new Label(HEADER);
        headerLabel.setStyle("-fx-font-size: 30pt");
        headerLabel.setWrapText(true);

        Label subLabel = new Label(SUBHEADER); //figure out way to put it under header but not in the way of the business info

        Label locationLabel = new Label(BUSINESS_INFO);
        locationLabel.setStyle("-fx-font-size: 18pt");
        locationLabel.setWrapText(true);

        Label businessLabel = new Label(ABOUT_SEC1 + "\n" + ABOUT_SEC2);
        businessLabel.setWrapText(true);
        businessLabel.setTextAlignment(TextAlignment.JUSTIFY);
        
        Label reasonsLabel = new Label(REASONS_SEC1 + "\n" + REASONS_SEC2);
        reasonsLabel.setWrapText(true);
        reasonsLabel.setTextAlignment(TextAlignment.JUSTIFY);
        
        Label typesLabel = new Label(OPEN_AND_OPS_DES + RAILING_DES + GARDEN_DES);
        typesLabel.setWrapText(true);
        typesLabel.setTextAlignment(TextAlignment.JUSTIFY);
        
        Label brandsLabel = new Label(NAME_BRAND_SEC1 + NAME_BRAND_SEC2);
        brandsLabel.setTextAlignment(TextAlignment.JUSTIFY);
        
        Label addtInfoLabel = new Label(ADDITIONAL_INFO);
        addtInfoLabel.setWrapText(true);
        addtInfoLabel.setTextAlignment(TextAlignment.JUSTIFY);

        //ComboBox or Listview will probably look better than a string of buttons
        ComboBox<String> linksComboBox = new ComboBox<>();
        linksComboBox.getItems().addAll("Driveway Gates", "Garden Gates", "Fencing",
                "Railings", "Openers - Operators", "Main Control Boards",
                "Remote Controls", "Receivers", "Telephone Entry",
                "Safety Equipment", "Gate Accessories", "Gate Operator Parts");
        linksComboBox.setValue("Driveway Gates");

        //Search bar text field, make it larger and more prominent than original website
        TextArea searchBar = new TextArea();
        searchBar.setPrefRowCount(1);

        

        /*This hbox will hold all the button links and search bar for the site
        Fix the organization of buttons later, its too long and clunky
        Probably delete this because combobox looks much cleaner
        
        HBox btnHbox = new HBox(10, homeBtn, drivewayBtn, gardenBtn, 
                fenceBtn, railBtn, openerBtn, mainCtrlBtn, remoteBtn, receiverBtn,
                telephoneBtn, safetyBtn, accessoryBtn, partsBtn, searchBar, searchBtn);
        btnHbox.setAlignment(Pos.TOP_CENTER);
         */
        
        //hbox for the header and initial information
        HBox headerHbox = new HBox(20, headerLabel, locationLabel);
        headerHbox.setAlignment(Pos.TOP_CENTER);
        
        //hbox for the links
        HBox linksHbox = new HBox(10, homeBtn, linksComboBox, searchBar, searchBtn);
        linksHbox.setAlignment(Pos.TOP_CENTER);

        //hbox with business desciption text and gate picture
        HBox descriptionHbox = new HBox(10, businessLabel, AF1View);
        descriptionHbox.setAlignment(Pos.TOP_CENTER);
        
        //hbox for reasons for use
        HBox reasonsHbox = new HBox(10, reasonsLabel);
        reasonsHbox.setAlignment(Pos.BOTTOM_CENTER);
        
        //hbox for gate types
        HBox typesHbox = new HBox(10, typesLabel);
        typesHbox.setAlignment(Pos.BOTTOM_CENTER);
        
        //hbox for brand links
        HBox brandsHbox = new HBox(10, brandsLabel);
        brandsHbox.setAlignment(Pos.BOTTOM_CENTER);
        
        //hbox for additional site bs
        HBox infoHbox = new HBox(10, addtInfoLabel);
        infoHbox.setAlignment(Pos.BOTTOM_CENTER);

        //vbox to order everything vertically
        VBox vbox = new VBox(10, headerHbox, linksHbox, descriptionHbox, reasonsHbox, 
                typesHbox, brandsHbox, infoHbox);

        //added a scroll bar in case its too long, restyle later
        ScrollPane scrollPane = new ScrollPane(vbox);
        scrollPane.setFitToHeight(true);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        BorderPane root = new BorderPane(scrollPane);
        root.setPadding(new Insets(10));
        
        Scene scene = new Scene(root, WIDTH, HEIGHT, Color.GRAY);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
