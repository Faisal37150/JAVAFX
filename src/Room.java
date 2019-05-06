

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Room  {
	
	Stage window;
	static Scene scene;
	Room(String title,int width,int height){
		window = new Stage();
		window.setTitle(title);
		window.setWidth(width);
		window.setHeight(height);
		
			Group root = new Group();
			addComponenet(root);	
			
			Scene scene = new Scene(root,400,350);
			window.setScene(scene);
			window.show();
			window.setResizable(false);
		}
		public void addComponenet(Group root){
			
			ImageView img0 = new ImageView(new Image("file:stock-vector-horizontal-banner-in-modern-flat-line-stile-health-care-concept-with-a-lot-of-medical-equipment-542646928.jpg"));
			img0.setFitWidth(500);
			img0.setFitHeight(500);
			img0.setOpacity(0.3f);
			img0.setTranslateX(0);
			img0.setTranslateY(0);
			
			
			
			
			
			
			Label title = new Label("\t ROOM INFO ");
			title.setFont(Font.font("arial",FontWeight.BOLD, 30));
			
			title.setTranslateX(80);
			title.setTranslateY(20);
			

			Text Rno =  new Text("ROOM NO");
			Rno.setFont(Font.font("arial",FontWeight.BOLD,20));
			Rno.setTranslateX(60);
			Rno.setTranslateY(150);
			
			TextField Rn = new TextField();
			Rn.setPromptText("Enter ROOM No");
			Rn.setFont(Font.font(15));
			Rn.setTranslateX(200);
			Rn.setTranslateY(125);
			
			
			
			Text Rt =  new Text("ROOM TYPE");
			Rt.setFont(Font.font("arial",FontWeight.BOLD,20));
			Rt.setTranslateX(60);
			Rt.setTranslateY(250);
			
			
			ObservableList<String> options = 
				    FXCollections.observableArrayList(
				        "Semi Ward",
				        "Private ",
				        "Semi Private"
				     
				        
				    );
				final ComboBox comboBox = new ComboBox(options);
			
			comboBox.setTranslateX(210);
			comboBox.setTranslateY(225);
			comboBox.setPrefWidth(180);
			
			
			
			

			Button add = new Button("SAVE");
			add.setStyle("-fx-font: 15 arial; -fx-base:#007399");
			add.setPrefSize(90, 30);
			add.setTranslateX(100);
			add.setTranslateY(400);
			
			

			Button Ex = new Button("EXIT");
			Ex.setStyle("-fx-font: 15 arial; -fx-base: #007399");
			Ex.setPrefSize(90, 30);
			Ex.setTranslateX(300);
			Ex.setTranslateY(400);
			
			Ex.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					
					window.close();
					
				}
			});
			
			
			
			
			
			root.getChildren().addAll(img0,Rno,Rn,title,Rt,add,Ex,comboBox);
			
		}
		}
	
	