

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class STAFFREG  {
	
	Stage window;
	 
	static Scene scene;
	STAFFREG(String title,int width,int height){
		window = new Stage();
		window.setTitle(title);
		window.setWidth(width);
		window.setHeight(height);
			Group root = new Group();
			addComponenet(root);	
			
			
			Scene scene = new Scene(root,650,500);
			window.setScene(scene);
			window.show();
			window.setResizable(false);
		}
		
		 public void addComponenet(Group root){
			
			 ImageView img0 = new ImageView(new Image("file:doctor-filling-in-patients-registration-form-medical-receptionist-at-hospital_ba-m8hnm__F0000.png"));
				img0.setFitWidth(650);
				img0.setFitHeight(600);
				img0.setOpacity(0.6f);
				img0.setTranslateX(0);
				img0.setTranslateY(0);
			 
			 Label title = new Label("\t STAFF REGISTRATION ");
			 title.setFont(Font.font("Serif",FontWeight.BOLD, 25));
				title.setTranslateX(130);
				title.setTranslateY(20);
				
			 
				Text Staffname =  new Text("NAME");
				 Staffname.setFont(Font.font("arial",FontWeight.BOLD,15));
				//Staffname.setStyle("-fx-font: 15 arial; -fx-base: #AFEEEE;");
				Staffname.setTranslateX(30);
				Staffname.setTranslateY(100);
				
				TextField dname = new TextField();
				dname.setPromptText("Enter NAME");
				dname.setTranslateX(150);
				dname.setTranslateY(80);
				
			    Text Staffage =  new Text("AGE");
			    Staffage.setFont(Font.font("arial",FontWeight.BOLD,15));
				//Staffage.setStyle("-fx-font: 15 arial; -fx-base: #AFEEEE;");
				Staffage.setTranslateX(30);
				Staffage.setTranslateY(150);
				

				Text Sage=  new Text("");
				 Sage.setFont(Font.font("arial",FontWeight.BOLD,15));
				//Staffde.setStyle("-fx-font: 15 arial; -fx-base: #AFEEEE;");
				Sage.setTranslateX(30);
				Sage.setTranslateY(200);
			
				ObservableList<String> options3 = 
					    FXCollections.observableArrayList(
					        "25-35",
					        "35-45",
					        "45-55",
					        "55 AND ABOVE"
					        
					        
					    );
					final ComboBox comboBox3 = new ComboBox(options3);
				
				
				comboBox3.setTranslateX(150);
				comboBox3.setTranslateY(130);
				
				Text Staffcon=  new Text("CONTACT NO");
				 Staffcon.setFont(Font.font("arial",FontWeight.BOLD,15));
				//Staffcon.setStyle("-fx-font: 15 arial; -fx-base: #AFEEEE;");
				Staffcon.setTranslateX(330);
				Staffcon.setTranslateY(150);
				
				TextField dcontf = new TextField();
				dcontf.setPromptText("Enter CONTACT NO");
				dcontf.setTranslateX(450);
				dcontf.setTranslateY(130);
				
					
				Text Staffid =  new Text("ID");
				 Staffid.setFont(Font.font("arial",FontWeight.BOLD,15));
				//Staffid.setStyle("-fx-font: 15 arial; -fx-base: #AFEEEE;");
				Staffid.setTranslateX(380);
				Staffid.setTranslateY(100);
				
				TextField idtf = new TextField();
				idtf.setPromptText("Enter ID");
				idtf.setTranslateX(450);
				idtf.setTranslateY(80);
				
				Text Staffde=  new Text("DEPARMENTS");
				 Staffde.setFont(Font.font("arial",FontWeight.BOLD,15));
				//Staffde.setStyle("-fx-font: 15 arial; -fx-base: #AFEEEE;");
				Staffde.setTranslateX(30);
				Staffde.setTranslateY(200);
			
				ObservableList<String> options = 
					    FXCollections.observableArrayList(
					        "EMERGENCY DEPARTMENT",
					        "OPD DEPARTMENT ",
					        "CCU DEPARTMENT",
					        "ICU DEPARTMENT",
					        "X-RAY DEPARTENT"
					        
					    );
					final ComboBox comboBox = new ComboBox(options);
				
				comboBox.setTranslateX(150);
				comboBox.setTranslateY(180);
				
				Text gender=  new Text("GENDER");
				 gender.setFont(Font.font("arial",FontWeight.BOLD,15));
				//gender.setStyle("-fx-font: 15 arial; -fx-base: #AFEEEE;");
				gender.setTranslateX(360);
				gender.setTranslateY(200);
				
				Text gen=  new Text("");
				 gen.setFont(Font.font("arial",FontWeight.BOLD,15));
				//Staffde.setStyle("-fx-font: 15 arial; -fx-base: #AFEEEE;");
				gen.setTranslateX(300);
				gen.setTranslateY(200);
			
				ObservableList<String> options1 = 
					    FXCollections.observableArrayList(
					        "FEMALE",
					        "MALE "
				
					    );
					final ComboBox comboBox1 = new ComboBox(options1);
				comboBox1.setTranslateX(450);
				comboBox1.setTranslateY(180);
			
				Button Add = new Button("ADD");
			
				Add.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
				Add.setPrefSize(90, 30);
				Add.setTranslateX(80);
				Add.setTranslateY(450);
			
				Button add = new Button("SAVE");
				
				add.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
				add.setPrefSize(90, 30);
				add.setTranslateX(180);
				add.setTranslateY(450);
				
				
				Button Search = new Button("SEARCH");
				
				Search.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
				Search.setPrefSize(90, 30);
				Search.setTranslateX(380);
				Search.setTranslateY(450);
				
				Button Close = new Button("CLOSE");
				Close.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
				Close.setPrefSize(90, 30);
				Close.setTranslateX(480);
				Close.setTranslateY(450);
				
				Close.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent arg0) {
						
						window.close();
						
					}
				});
			 
			 root.getChildren().addAll(img0,title,Staffid,comboBox,idtf,Staffname,dname,Staffage,Sage,comboBox3,Staffcon,dcontf,Staffde,gender,gen,comboBox1,Add,add,Search,Close);
			 
		 }
}


