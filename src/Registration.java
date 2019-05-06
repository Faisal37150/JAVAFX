

import java.io.FileWriter;

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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Registration  {
	
	Stage window;
	 
	static Scene scene;
	
	Registration(String title,int width,int height){
		window = new Stage();
		window.setTitle(title);
		window.setWidth(width);
		window.setHeight(height);
	
	
			Group root = new Group();
			addComponenet(root);	
			
			
			Scene scene = new Scene(root,650,600,Color.WHITE);
			window.setScene(scene);
			
			 
			window.show();
			window.setResizable(false);
			
			
			
			
			
			
			

		}
		
	 public void addComponenet(Group root){


			
		 
		 
		 
		 
		 Label title = new Label(" PATIENT REGISTRATION" );
		title.setFont(Font.font("Serif",FontWeight.BOLD, 20));
		title.setTranslateX(200);
		title.setTranslateY(20);
		
		Text Patientid =  new Text("Patient ID");
		Patientid.setFont(Font.font("Arial",FontWeight.BOLD,15));
		Patientid.setTranslateX(30);
		Patientid.setTranslateY(100);
		
		TextField ptf = new TextField();
		ptf.setPromptText("Enter ID");
		ptf.setFont(Font.font(13));
		ptf.setTranslateX(120);
		ptf.setTranslateY(85);
		
		Text name =  new Text("NAME");
		name.setFont(Font.font("Arial",FontWeight.BOLD,15));
		name.setTranslateX(30);
		name.setTranslateY(150);
		
		 TextField ntf = new TextField();
		ntf.setPromptText("Enter Name");
		ntf.setFont(Font.font(13));
		ntf.setTranslateX(120);
		ntf.setTranslateY(130);
		
		Text age =  new Text("AGE");
		age.setFont(Font.font("Arial",FontWeight.BOLD,15));
		age.setTranslateX(30);
		age.setTranslateY(200);

		Text Age=  new Text("AGE");
		 Age.setFont(Font.font("arial",FontWeight.BOLD,15));
		//Staffde.setStyle("-fx-font: 15 arial; -fx-base: #AFEEEE;");
		Age.setTranslateX(30);
		Age.setTranslateY(200);
	
		ObservableList<String> options = 
			    FXCollections.observableArrayList(
			        "LESS THAN ONE YEAR",
			        "1-5YEAR ",
			        "LESS THAN 10 YEAR",
			        "10-12YEAR",
			        "12-18YEAR",
			        "18AND ABOVE"
			        
			    );
			final ComboBox comboBox = new ComboBox(options);
		
		comboBox.setTranslateX(150);
		comboBox.setTranslateY(180);
		comboBox.setTranslateX(120);
		comboBox.setTranslateY(180);
		
		Text Date =  new Text("Date");
		Date.setFont(Font.font("Arial",FontWeight.BOLD,15));
		Date.setTranslateX(30);
		Date.setTranslateY(250);
		
		DatePicker checkInDatePicker = new DatePicker();
	    checkInDatePicker.setTranslateX(120);
	    checkInDatePicker.setTranslateY(232);
	
		Text Gender =  new Text("GENDER");
		Gender.setFont(Font.font("Arial",FontWeight.BOLD,15));
		Gender.setTranslateX(30);
		Gender.setTranslateY(300);
		


		ToggleGroup tg = new ToggleGroup();
		RadioButton rb1 = new RadioButton("Male");
		rb1.setUserData("Male");
		RadioButton rb2 = new RadioButton("Female");
		rb2.setUserData("Female");
		rb2.setSelected(true);
		rb1.setTranslateX(120);
		rb1.setTranslateY(280);
		
		rb2.setTranslateX(200);
		rb2.setTranslateY(280);
		
		rb1.setToggleGroup(tg);
		rb2.setToggleGroup(tg);
			
		
		Text Address =  new Text("ADDRESS");
		Address.setFont(Font.font("Arial",FontWeight.BOLD,15));
		Address.setTranslateX(30);
		Address.setTranslateY(340);
	
		 TextField Atf = new TextField();
		Atf.setPromptText("ENTER ADDRESS");
		Atf.setFont(Font.font(13));
		Atf.setTranslateX(120);
		Atf.setTranslateY(320);
	
		Text ContactNo =  new Text("CONTACT NO");
		ContactNo.setFont(Font.font("Arial",FontWeight.BOLD,13));
		ContactNo.setTranslateX(30);
		ContactNo.setTranslateY(380);
		
		 TextField Ctf = new TextField();
		Ctf.setPromptText("ENTER CONT NO");
		Ctf.setFont(Font.font(13));
		Ctf.setTranslateX(120);
		Ctf.setTranslateY(360);
		
		Text Reg =  new Text("REGISTRATION DATE");
		Reg.setFont(Font.font("Arial",FontWeight.BOLD,13));
		Reg.setTranslateX(300);
		Reg.setTranslateY(100);
		
		
	
		/* TextField Rtf = new TextField();
		Rtf.setPromptText("ENTER REG DATE");
		Rtf.setFont(Font.font(12));
		Rtf.setTranslateX(450);
		Rtf.setTranslateY(85);
		*/
		
		DatePicker Rtf = new DatePicker();
		Rtf.setTranslateX(450);
		Rtf.setTranslateY(85);
		
		
		Text Room =  new Text("ROOM NO");
		Room.setFont(Font.font("Arial",FontWeight.BOLD,15));
		Room.setTranslateX(300);
		Room.setTranslateY(150);
		
		 TextField rtf = new TextField();
		rtf.setPromptText("ENTER ROOM NO");
		rtf.setTranslateX(450);
		rtf.setTranslateY(130);
		
		Button Add = new Button("ADD");
		Add.setStyle("-fx-font: 15 arial; -fx-base:#007399;");
		Add.setPrefSize(90, 30);
		Add.setTranslateX(80);
		Add.setTranslateY(450);

		DropShadow shadow = new DropShadow();
		//Adding the shadow when the mouse cursor is on
		Add.addEventHandler(MouseEvent.MOUSE_ENTERED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		            Add.setEffect(shadow);
		        }
		});
		//Removing the shadow when the mouse cursor is off
		Add.addEventHandler(MouseEvent.MOUSE_EXITED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		            Add.setEffect(null);
		        }
		});
		
		ImageView img0 = new ImageView(new Image("file:doctor-filling-in-patients-registration-form-medical-receptionist-at-hospital_ba-m8hnm__F0000.png"));
		img0.setFitWidth(650);
		img0.setOpacity(0.6f);
		img0.setFitHeight(600);
		img0.setTranslateX(0);
		img0.setTranslateY(0);
		
		Add.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				
				String data = ptf.getText() + "|" 
						+ ntf.getText() + "|"
				  + comboBox.getValue()+"|" 
						+ Rtf.getValue() + "|"
				+ tg.getSelectedToggle().getUserData() + "|"
				+ Atf.getText() + "|"
				+ Ctf.getText() + "|"
				
				
				+ checkInDatePicker.getValue()+ "|"
				+ rtf.getText() + "\n";
				
				Writer(data);
				
			}
		});
	
		Button add = new Button("SAVE");
		add.setPrefSize(90, 30);
		add.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
		add.setTranslateX(180);
		add.setTranslateY(450);
		
		DropShadow shadow1 = new DropShadow();
		//Adding the shadow when the mouse cursor is on
		add.addEventHandler(MouseEvent.MOUSE_ENTERED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		            add.setEffect(shadow1);
		        }
		});
		//Removing the shadow when the mouse cursor is off
		add.addEventHandler(MouseEvent.MOUSE_EXITED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		            add.setEffect(null);
		        }
		}); 
		
		
		
		
		
		
		    
		Button Search = new Button("SEARCH");
		Search.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
		Search.setPrefSize(90, 30);
		Search.setTranslateX(380);
		Search.setTranslateY(450);
		

		DropShadow shadow2 = new DropShadow();
		//Adding the shadow when the mouse cursor is on
		Search.addEventHandler(MouseEvent.MOUSE_ENTERED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		            Search.setEffect(shadow2);
		        }
		});
		//Removing the shadow when the mouse cursor is off
		Search.addEventHandler(MouseEvent.MOUSE_EXITED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		            Search.setEffect(null);
		        }
		});
		
		
		
		
		
		
		
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

		DropShadow shadow3= new DropShadow();
		//Adding the shadow when the mouse cursor is on
		Close.addEventHandler(MouseEvent.MOUSE_ENTERED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		            Close.setEffect(shadow3);
		        }
		});
		//Removing the shadow when the mouse cursor is off
		Close.addEventHandler(MouseEvent.MOUSE_EXITED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		            Close.setEffect(null);
		        }
		});
		
		
		
		
		
		
		
		root.getChildren().addAll(img0,Patientid,ptf,name,ntf,title,age,Age,Date,checkInDatePicker,Gender,rb1,rb2,Address,Atf,ContactNo,Ctf,comboBox,add,Reg,Rtf,rtf,Room,Add,Search,Close);
		
				
		
	 }
	 
	 public static void Writer(String data) {
		 
		 try {
			 FileWriter fw = new FileWriter("file://../data/entries.txt", true);
			 fw.write(data);
			 fw.close();
			 
		 } catch (Exception e){
			 System.out.println("File Not Found");
		 }
		 
	 }
} 

