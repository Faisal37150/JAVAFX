
import java.io.FileWriter;

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

public class DoctorRegistration  {
	
	Stage window;
	DoctorRegistration(String title,int width,int height){
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
			 
			 
			 
			 Label title = new Label("\t DOCTOR REGISTRATION ");
				title.setFont(Font.font("Verdana",FontWeight.BOLD, 20));
				title.setTranslateX(130);
				title.setTranslateY(20);
			 
				Text Doctorname =  new Text("NAME");
				Doctorname.setFont(Font.font("arial",FontWeight.BOLD,15));
				Doctorname.setTranslateX(30);
				Doctorname.setTranslateY(100);
				
				
				TextField dname = new TextField();
				dname.setPromptText("Enter NAME");
				dname.setTranslateX(150);
				dname.setTranslateY(80);

			    Text  Doctorage =  new Text("AGE");
				Doctorage.setFont(Font.font("arial",FontWeight.BOLD,15));
				Doctorage.setTranslateX(30);
				Doctorage.setTranslateY(150);
				
				
				
				
				
				
				Text Dage=  new Text("");
				 Dage.setFont(Font.font("arial",FontWeight.BOLD,15));
				//Staffde.setStyle("-fx-font: 15 arial; -fx-base: #AFEEEE;");
				Dage.setTranslateX(30);
				Dage.setTranslateY(200);
			
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
				
				Text Doctorcon=  new Text("CONTACT NO");
				Doctorcon.setFont(Font.font("arial",FontWeight.BOLD,15));
				Doctorcon.setTranslateX(330);
				Doctorcon.setTranslateY(150);
				
				TextField dcontf = new TextField();
				dcontf.setPromptText("Enter CONTACT NO");
				dcontf.setTranslateX(450);
				dcontf.setTranslateY(130);
				
					
				Text Doctorid =  new Text("ID");
				Doctorid.setFont(Font.font("arial",FontWeight.BOLD,15));
				Doctorid.setTranslateX(380);
				Doctorid.setTranslateY(100);
				
				TextField idtf = new TextField();
				idtf.setPromptText("Enter ID");
				idtf.setTranslateX(450);
				idtf.setTranslateY(80);
				
				Text Doctorde=  new Text("DEPARMENTS");
				Doctorde.setFont(Font.font("arial",FontWeight.BOLD,15));
				Doctorde.setTranslateX(30);
				Doctorde.setTranslateY(200);
				
				Text Doctde=  new Text("");
				 Doctde.setFont(Font.font("arial",FontWeight.BOLD,15));
				//Staffde.setStyle("-fx-font: 15 arial; -fx-base: #AFEEEE;");
				Doctde.setTranslateX(30);
				Doctde.setTranslateY(200);
			
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
				Add.setFont(Font.font("arial",FontWeight.BOLD,14));
				Add.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
				Add.setPrefSize(90, 30);
				Add.setTranslateX(80);
				Add.setTranslateY(400);
			
				
				 Add.setOnAction(new EventHandler<ActionEvent>(){
						@Override
						public void handle(ActionEvent arg0) {
							
							String data = dname.getText() + "|" 
									+ comboBox.getValue()+ "|"
							+ dcontf.getText() + "|" 
									+ idtf.getText() + "|"
							+ comboBox1.getValue() + "|"
							+ comboBox3.getValue() + "\n";
							
							
							
						
							
							Writer(data);
							
						}
					});
					
				
				
				
				
				
				Button add = new Button("SAVE");
				add.setFont(Font.font("arial",FontWeight.BOLD,14));
				add.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
				add.setPrefSize(90, 30);
				add.setTranslateX(180);
				add.setTranslateY(400);
				
				Button Search = new Button("SEARCH");
				Search.setFont(Font.font("arial",FontWeight.BOLD,14));
				Search.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
				Search.setPrefSize(90, 30);
				Search.setTranslateX(380);
				Search.setTranslateY(400);
				
				Button Close = new Button("CLOSE");
				Close.setFont(Font.font("arial",FontWeight.BOLD,14));
				Close.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
				Close.setPrefSize(90, 30);
				Close.setTranslateX(480);
				Close.setTranslateY(400);
				
				
				Close.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent arg0) {
						
						window.close();
						
					}
				});
				
				
			
			 root.getChildren().addAll(img0,title,Doctorid,idtf,Doctorname,dname,Doctorage,Dage,comboBox3,Doctorcon,dcontf,Doctorde,Doctde,comboBox,gender,gen,comboBox1,Add,add,Search,Close);
			 
		 }
		 public static void Writer(String data) {
			 
			 try {
				 FileWriter fw = new FileWriter("file://../data/Enteries1.txt", true);
				 fw.write(data);
				 fw.close();
				 
			 } catch (Exception e){
				 System.out.println("File Not Found");
			 }
}
}


