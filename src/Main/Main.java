package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Application {

    //ArrayList that contains info about aspects
    ArrayList<Aspect> aspects = new ArrayList<>();

    //getting aspects' info from the "paths.txt"
    void getAspects() throws IOException {
        //scanner that reads from the file
        Scanner filescan = new Scanner(new BufferedReader(new FileReader("src/src/paths.txt")));

        int ID = 0;

        //reading info
        while (filescan.hasNextLine()) {
            //get one line, split it by ", " and store that in an array of strings
            String[] aspectInfo = filescan.nextLine().split(", ");

            Image image = new Image (new FileInputStream(aspectInfo[0]));
            String aspectTitle = aspectInfo[1];
            boolean containsAer = Boolean.parseBoolean(aspectInfo[2]);
            boolean containsAqua = Boolean.parseBoolean(aspectInfo[3]);
            boolean containsIgnis = Boolean.parseBoolean(aspectInfo[4]);
            boolean containsOrdo = Boolean.parseBoolean(aspectInfo[5]);
            boolean containsPerditio = Boolean.parseBoolean(aspectInfo[6]);
            boolean containsTerra = Boolean.parseBoolean(aspectInfo[7]);

            aspects.add(new Aspect(ID++, image, aspectTitle, containsAer, containsAqua, containsIgnis, containsOrdo, containsPerditio, containsTerra));
        }

    }

    public void aspectClicked(int ID){
        System.out.println(ID);
    }

    @Override
    public void start(Stage primaryStage) throws Exception, IOException {
        getAspects();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("src/sample.fxml"));

        BorderPane root = loader.load(new FileInputStream("src/src/sample.fxml"));
        ScrollPane scrollBarPane = (ScrollPane) root.getLeft();
        AnchorPane aspectsAnchorPane = (AnchorPane) scrollBarPane.getContent();

        ArrayList<HBox> aspectsLine = new ArrayList<>(10);
        for(int i = 0; i < 10; i++){
            aspectsLine.add((HBox) aspectsAnchorPane.getChildren().get(i));
        }

        for(int i = 0; i < 10; i++){
            for(int j = i*6; j < i*6+6; j++){
                try{
                    ImageView img = new ImageView(aspects.get(j).getAspectImage());
                    Tooltip.install(img, new Tooltip(aspects.get(j).getAspectTitle()));
                    img.setPickOnBounds(true);
                    int ID = aspects.get(j).getID();
                    img.setOnMouseClicked(e -> {
                        aspectClicked(ID);
                    });
                    img.setFitWidth(64);
                    img.setFitHeight(64);
                    aspectsLine.get(i).getChildren().add(img);
                }catch(IndexOutOfBoundsException ignored){
                }
            }
        }

        Scene scene = new Scene(root);
        scene.getStylesheets().add("src/style.css");
        primaryStage.setScene(scene);
        primaryStage.setTitle("Centi-vis Calculator");
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}