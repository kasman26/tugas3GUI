/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2.kasman;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;



/**
 *
 * @author kasman
 */
public class JavaFXApplication2Kasman extends Application {
    
    @Override
    public void start(Stage stage) {
       Text t1 = new Text("Nama     :");
Text t2 = new Text("Telepon  :");
Text t3 = new Text("Alamat   :");
Text t4 = new Text("Output   :");
TextField tField1 = new TextField();
TextField tField2 = new TextField();
TextArea tArea1 = new TextArea();
TextArea hasiltampil = new TextArea();

//var alert = new Alert(Alert.AlertType.NONE);

Button btn1 = new Button("Kirim");
Button btn2 = new Button("Hapus");




GridPane gridPane = new GridPane();
gridPane.setMinSize(400, 200);
gridPane.setPadding(new Insets(50,50,50,50));
gridPane.setVgap(7);
gridPane.setHgap(9);
gridPane.setAlignment(Pos.CENTER);

gridPane.add(t1, 0, 0);
gridPane.add(tField1, 1, 0);
gridPane.add(t2, 0, 1);
gridPane.add(tField2, 1, 1);


gridPane.add(t3, 0, 2);
gridPane.add(tArea1, 1, 2);
gridPane.add(t4, 0, 8);
gridPane.add(hasiltampil, 1, 8);
gridPane.add(btn1, 0, 3);
gridPane.add(btn2, 1, 3);



btn1.setOnAction(new EventHandler<ActionEvent>() {
         
           public void handle(ActionEvent event) {
              hasiltampil.setText("Nama :"  + tField1.getText() + "\n" + "Notelp :" + tField2.getText() + "\n" + "Alamat :" + tArea1.getText()  );
              
              
           }    
       });

Scene scene1 = new Scene(gridPane);

    stage.setTitle("Lomba panjat pinang");
    stage.setScene(scene1);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
