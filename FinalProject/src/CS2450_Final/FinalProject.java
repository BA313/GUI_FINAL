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
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/** Nate C/Ben A
 *  CS2450
 *  Final Project
 */
public class FinalProject extends Application {

    //window size
    private static final double WIDTH = 950.0, HEIGHT = 1800.0;

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
            + " range of outdoor conditions. Our\r\ncommitment to our "
            + "customers and dedication to produce quality gates has earned"
            + " us thousands of satisfied customers.";
    private static final String ABOUT_SEC2 = "We offer a wide selection of decorative"
            + " designs in either aluminum or wrought iron.\r\nWith over "
            + "35 years of experience, we seek to provide the highest quality and"
            + " service to our customers.";

    //reasons to buy section
    private static final String REASONS_SEC1 = "Take a look at some of our custom"
            + " driveway gates and fences!\r\n ";
    //Take a look at some of our custom driveway gates and fences!\r\n 
    
    private static final String REASONS_SEC2 = "Aluminum driveway gates are "
            + "becoming more and more popular because of how strong and durable "
            + "they are. The wide choices for design and style is also\r\n"
            + "another reason why this type of gate is preferred by many people "
            + "over wooden or iron gates.\r\n"
            + "\r\n Here are some reasons why our customers choose us for their "
            + "aluminum gates!\r\n" +
            
            "1. Aluminum gates are much more cost effective than steel gates.\r\n "
            + "Save money while still having a beautiful gate for your driveway!\r\n" +
            
            "2. Aluminum gates weigh less compared to steel gates and the rollers"
            + " and hinges will receive less wear and tear.\r\n" +
            
            "3. Our aluminum fences and gates will withstand rust or corrosion "
            + "and are very durable.\r\n Our gates are made with 1/2 to 1 inch "
            + "thick aluminum plating.\r\n" +
            
            "4. We offer a wide variety of styles, sizes, and paint colors for "
            + "our gates or fences.\r\n We promise that your home will standout from"
            + " the rest.\r\n" +
            
            "5. Aluminum gates need almost no maintenance when compared to a steel"
            + " gate.\r\n Our gates and fences will last for years without any "
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
    static final String ADDITIONAL_INFO = "\t\t\t\t\t|  About Us  |   Contact Us   |   "
            + "Our Policies   |   FAQ   |   Manufactures   |   Links   |   \r\n"
            + "Copyright Protected 2004-2008 - L. A. Ornamental & Rack Corp.  "
            + "All rights reserved. No part of this site can be reproduced in "
            + "any form or by any means,\r\n"
            + "electronic, mechanical, photocopying, or otherwise without prior "
            + "written consent of L. A. Ornamental & Rack Corp.\r\n"
            + "3708 NW 82nd Street  Miami  Florida  33147, Office: 305-696-0419 "
            + " Fax: 305-696-0461 E-Mail: LAOrnamental@Aol.com";

    //Gate and Fence Images
    static final Image Header = new Image("PageHeader.jpg");
    
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
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Button searchBtn = new Button("Search");
        Button homeBtn = new Button("Home");
        
        ImageView HeaderHolder = new ImageView(Header);
        HeaderHolder.setPreserveRatio(true);
        HeaderHolder.setFitWidth(600);
        HeaderHolder.setFitHeight(300);
        
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
        
        
        //lables for descriptions and stuff
        //Temp labels for header and business location/info
//        Label headerLabel = new Label(HEADER);
//        headerLabel.setFont(Font.font("Cambria", 50));
//        headerLabel.setWrapText(true);

        Label subLabel = new Label(SUBHEADER); //figure out way to put it under header but not in the way of the business info

        
        Label locationLabel = new Label(BUSINESS_INFO);
        locationLabel.setStyle("-fx-font-size: 15pt");
        locationLabel.setWrapText(true);

        Label businessLabel = new Label(ABOUT_SEC1 + "\n" + ABOUT_SEC2);
        businessLabel.setWrapText(true);
        businessLabel.setMaxWidth(600);
        businessLabel.setPadding(new Insets(0,10,0,10));
        businessLabel.setTextAlignment(TextAlignment.JUSTIFY);
        
        Label reasonsLabel = new Label(REASONS_SEC1 + "\n" + REASONS_SEC2);
        reasonsLabel.setWrapText(true);
        reasonsLabel.setTextAlignment(TextAlignment.JUSTIFY);
        
        Label typesLabel = new Label(OPEN_AND_OPS_DES + RAILING_DES + GARDEN_DES);
        typesLabel.setWrapText(true);
        typesLabel.setTextAlignment(TextAlignment.CENTER);
        
        Label brandsLabel = new Label(NAME_BRAND_SEC1 + NAME_BRAND_SEC2);
        brandsLabel.setTextAlignment(TextAlignment.JUSTIFY);
        
        Label addtInfoLabel = new Label(ADDITIONAL_INFO);
        addtInfoLabel.setWrapText(true);
        addtInfoLabel.setTextAlignment(TextAlignment.CENTER);

        //ComboBox or Listview will probably look better than a string of buttons
        ComboBox<String> linksComboBox = new ComboBox<>();
        linksComboBox.getItems().addAll("SELECT PAGE","Driveway Gates", "Garden Gates", "Fencing",
                "Railings", "Openers - Operators", "Main Control Boards",
                "Remote Controls", "Receivers", "Telephone Entry",
                "Safety Equipment", "Gate Accessories", "Gate Operator Parts");
        linksComboBox.setValue("SELECT PAGE");

        //Search bar text field, make it larger and more prominent than original website
        TextArea searchBar = new TextArea();
        searchBar.setMaxSize(430, 40);
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
        
        //hbox for the header and initial information
        HBox headerHbox = new HBox(20, HeaderHolder, locationLabel);
        headerHbox.setAlignment(Pos.TOP_LEFT);
        headerHbox.setPadding(new Insets(10));
        
        //hbox for the links
        HBox linksHbox = new HBox(10, homeBtn, linksComboBox, searchBar, searchBtn);
        linksHbox.setAlignment(Pos.TOP_LEFT);
        linksHbox.setPadding(new Insets(10));

        //hbox with business desciption text and gate picture
        HBox descriptionHbox = new HBox(10, businessLabel, AF1View);
        descriptionHbox.setAlignment(Pos.TOP_LEFT);
        
        //hbox for reasons for use
        HBox reasonsHbox = new HBox(10, reasonsLabel);
        reasonsHbox.setAlignment(Pos.BOTTOM_LEFT);
        reasonsHbox.setPadding(new Insets(0,10,0,10));
        
        //hbox for gate types
        HBox typesHbox = new HBox(10, typesLabel);
        typesHbox.setAlignment(Pos.BOTTOM_LEFT);
        typesHbox.setPadding(new Insets(0,10,0,10));
        
        //hbox for brand links
        HBox brandsHbox = new HBox(10, brandsLabel);
        brandsHbox.setAlignment(Pos.BOTTOM_LEFT);
        brandsHbox.setPadding(new Insets(0,10,0,10));
        
        //hbox for additional site bs
        HBox infoHbox = new HBox(10, addtInfoLabel);
        infoHbox.setAlignment(Pos.BOTTOM_LEFT);
        infoHbox.setPadding(new Insets(0,10,0,10));

        //vbox to order everything vertically
        VBox vbox = new VBox(10, headerHbox, linksHbox, descriptionHbox, reasonsHbox, 
                typesHbox, infoHbox);
        

        //added a scroll bar in case its too long, restyle later
        ScrollPane scrollPane = new ScrollPane(vbox);
        scrollPane.setPadding(new Insets(10));
        scrollPane.setBackground(new Background(new BackgroundFill(Color.BLANCHEDALMOND, CornerRadii.EMPTY, Insets.EMPTY)));
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
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
        
        ScrollPane scrollPane2 = new ScrollPane(vbox2);
        scrollPane2.setPadding(new Insets(10));
        scrollPane2.setBackground(new Background(new BackgroundFill(Color.BLANCHEDALMOND, CornerRadii.EMPTY, Insets.EMPTY)));
        scrollPane2.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        BorderPane root2 = new BorderPane(scrollPane2);
        root2.setBackground(new Background(new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY, Insets.EMPTY)));
        root2.setPadding(new Insets(10));
        Scene dgScene = new Scene(root2, WIDTH, HEIGHT);
        dgScene.getStylesheets().add("Style.css");
        
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
        
        ScrollPane scrollPane3 = new ScrollPane(vbox3);
        scrollPane3.setPadding(new Insets(10));
        scrollPane3.setBackground(new Background(new BackgroundFill(Color.BLANCHEDALMOND, CornerRadii.EMPTY, Insets.EMPTY)));
        scrollPane3.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        BorderPane root3 = new BorderPane(scrollPane3);
        root3.setBackground(new Background(new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY, Insets.EMPTY)));
        root3.setPadding(new Insets(10));
        Scene ggScene = new Scene(root3, WIDTH, HEIGHT);
        ggScene.getStylesheets().add("Style.css");
        
        GridPane gridpane2 = new GridPane();
        gridpane2.setVgap(10);
        gridpane2.setHgap(10);
        gridpane2.add(GG1View, 0, 0);
        gridpane2.add(GG2View, 0, 1);
        gridpane2.add(GG3View, 1, 0);
        gridpane2.add(GG4View, 1, 1);
        gridpane2.add(GG5View, 2, 0);
        gridpane2.add(GG6View, 2, 1);

        //Fencing scene
        VBox vbox4 = new VBox(10);
        ScrollPane scrollPane4 = new ScrollPane(vbox4);
        scrollPane4.setPadding(new Insets(10));
        scrollPane4.setBackground(new Background(new BackgroundFill(Color.BLANCHEDALMOND, CornerRadii.EMPTY, Insets.EMPTY)));
        scrollPane4.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        BorderPane root4 = new BorderPane(scrollPane3);
        root4.setBackground(new Background(new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY, Insets.EMPTY)));
        root4.setPadding(new Insets(10));
        Scene fScene = new Scene(root4, WIDTH, HEIGHT);
        fScene.getStylesheets().add("Style.css");
        
        GridPane gridpane3 = new GridPane();
        gridpane3.setVgap(10);
        gridpane3.setHgap(10);
        gridpane3.add(AF1View, 0, 0);
        gridpane3.add(AF2View, 0, 1);
        gridpane3.add(AF3View, 1, 0);
        gridpane3.add(AF4View, 1, 1);
        gridpane3.add(AF5View, 2, 0);
        gridpane3.add(AF6View, 2, 1);

        linksComboBox.setOnAction(e -> {
            switch (linksComboBox.getValue()) {
                case "Driveway Gates": primaryStage.setScene(dgScene);
                    vbox2.getChildren().addAll(headerHbox, linksHbox, gridpane,
                            infoHbox);
                    linksComboBox.setValue("Driveway Gates");
                    break;
                    
                case "Garden Gates": primaryStage.setScene(ggScene);
                    vbox3.getChildren().addAll(headerHbox, linksHbox, gridpane2,
                            infoHbox);
                    linksComboBox.setValue("Garden Gates");
                    break;
                    
                case "Fencing": primaryStage.setScene(fScene);
                    vbox4.getChildren().addAll(headerHbox, linksHbox, gridpane3,
                            infoHbox);
                    linksComboBox.setValue("Fencing");
                    break;
                    
                default:
                    break;
            }
        });
        
        //Return home if off default scene
        homeBtn.setOnAction(e -> primaryStage.setScene(scene));
        
        
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
