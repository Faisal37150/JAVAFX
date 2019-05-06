
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

public class Pathology {
	
	Stage window;
	 
	static Scene scene;
	Pathology(String title,int width,int height){
		window = new Stage();
		window.setTitle(title);
		window.setWidth(width);
		window.setHeight(height);
	
			Group root = new Group();
			addComponenet(root);	
			
			Scene scene = new Scene(root,550,500);
			window.setScene(scene);
			window.show();
			window.setResizable(false);
		}
		public void addComponenet(Group root){
			
			ImageView img1 = new ImageView(new Image("file:doctor-filling-in-patients-registration-form-medical-receptionist-at-hospital_ba-m8hnm__F0000.png"));
			img1.setFitWidth(700);
			img1.setFitHeight(700);
			img1.setOpacity(0.6f);
			img1.setTranslateX(0);
			img1.setTranslateY(0);
			
			
			
			
			
			Label title = new Label("\t PATHOLOGY DEPARTMENT ");
				title.setFont(Font.font("arial",FontWeight.BOLD, 20));
				
				title.setTranslateX(130);
				title.setTranslateY(20);
	
				Text Patientname =  new Text("NAME");
			    Patientname.setFont(Font.font("arial",FontWeight.BOLD,15));
				Patientname.setTranslateX(30);
				Patientname.setTranslateY(100);
				
				TextField pname = new TextField();
				pname.setPromptText("Enter NAME");
				pname.setTranslateX(120);
				pname.setTranslateY(80);
				
				Text Patientage =  new Text("AGE");
			    Patientage.setFont(Font.font("arial",FontWeight.BOLD,15));
				Patientage.setTranslateX(30);
				Patientage.setTranslateY(150);
				
				TextField page = new TextField();
				page.setPromptText("AGE");
				page.setPrefSize(50, 15);
				page.setTranslateX(120);
				page.setTranslateY(130);
				
				Text Patientgender=  new Text("Gender");
			    Patientgender.setFont(Font.font("arial",FontWeight.BOLD,15));
				Patientgender.setTranslateX(30);
				Patientgender.setTranslateY(200);
				
				TextField pgender = new TextField();
				pgender.setPromptText("ENTER GENDER");
				pgender.setTranslateX(120);
				pgender.setTranslateY(180);
				
				Text PTestname=  new Text("TEST NAME");
			    PTestname.setFont(Font.font("arial",FontWeight.BOLD,13));
				PTestname.setTranslateX(30);
				PTestname.setTranslateY(250);
				
				TextField pTestname= new TextField();
				pTestname.setPromptText("ENTER TEST NAME");
				pTestname.setTranslateX(120);
				pTestname.setTranslateY(230);
				
				Text PID=  new Text("PATIENT ID");
			    PID.setFont(Font.font("arial",FontWeight.BOLD,15));
				PID.setTranslateX(290);
				PID.setTranslateY(100);
				
				TextField pid= new TextField();
				pid.setPromptText("ENTER ID");
				pid.setTranslateX(410);
				pid.setTranslateY(80);
				
				Button Add = new Button("ADD");
				
				Add.setPrefSize(90, 30);
				Add.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
				Add.setTranslateX(60);
				Add.setTranslateY(450);
			
				Button Save = new Button("SAVE");
				
				Save.setPrefSize(90, 30);
				Save.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
				Save.setTranslateX(230);
				Save.setTranslateY(450);
		
				Button exit = new Button("EXIT");
				exit.setFont(Font.font("Verdana",FontWeight.BOLD,14));
				exit.setPrefSize(90, 30);
				exit.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
				exit.setTranslateX(400);
				exit.setTranslateY(450);
				
				exit.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent arg0) {
						
						window.close();
						
					}
				});
			
		root.getChildren().addAll(img1,title,Patientname,pname,Patientage,page,Patientgender,pgender,PTestname,pTestname,PID,pid,Add,Save,exit);
		
		
		}
}