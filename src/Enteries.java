import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Enteries  {
	
	Stage window;
	 String user="admin",pass="admin";
	static Scene scene;
	Enteries(String title,int width,int height){
		window = new Stage();
		window.setTitle(title);
		window.setWidth(width);
	
		
			
			Group root = new Group();
			addComponenet(root);	
						
			Scene scene = new Scene(root,500,500,Color.WHITE);
			
			
			window.setScene(scene);
			window.show();
			window.setResizable(false);
		}
		
	 public void addComponenet(Group root){

	
		 
		 Label title = new Label("HOSPITAL ENTERIES" );
		title.setFont(Font.font("arial",FontWeight.BOLD, 20));
		title.setTranslateX(160);
		title.setTranslateY(20);
		ImageView img = new ImageView(new Image("file:stock-vector-horizontal-banner-in-modern-flat-line-stile-health-care-concept-with-a-lot-of-medical-equipment-542646928.jpg"));
		img.setFitWidth(600);
		img.setFitHeight(600);
		img.setTranslateX(0);
		img.setTranslateY(0);
		img.setOpacity(0.5f);
		root.getChildren().add(img);
		

		
		
		
		Button pe = new  Button("PATIENTS ENTERIES");
		pe.setTranslateX(50);
		pe.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
		pe.setTranslateY(70);
		pe.setPrefSize(180, 40);
		pe.setOnAction(e->{
			ViewPatients r = new ViewPatients("Hospital Management System",650,600);
		});
		DropShadow shadow = new DropShadow();
		//Adding the shadow when the mouse cursor is on
	pe.addEventHandler(MouseEvent.MOUSE_ENTERED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	pe.setEffect(shadow);
		        }
		});
		//Removing the shadow when the mouse cursor is off
		pe.addEventHandler(MouseEvent.MOUSE_EXITED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	pe.setEffect(null);
		        }
		});
		
		
		
		
		Button de  = new  Button("DOCTOR ENTERIES");
		de.setTranslateX(280);
		de.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
		de.setTranslateY(70);
		de.setPrefSize(180, 40);
		de.setOnAction(e->{
			DoctorEnteries r = new DoctorEnteries("Hospital Management System",650,600);
		});
		
		DropShadow shadow2 = new DropShadow();
		//Adding the shadow when the mouse cursor is on
		de.addEventHandler(MouseEvent.MOUSE_ENTERED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	de.setEffect(shadow2);
		        }
		});
		//Removing the shadow when the mouse cursor is off
		de.addEventHandler(MouseEvent.MOUSE_EXITED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	de.setEffect(null);
		        }
		});
		
		
		
		
		
		
		
		Button se  = new  Button("STAFF ENTERIES");
		se.setTranslateX(50);
		se.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
		se.setTranslateY(200);
		se.setPrefSize(180, 40);
		se.setOnAction(e->{
			StaffEnteries r = new StaffEnteries("Hospital Management System",650,600);
		});
		
		DropShadow shadow3 = new DropShadow();
		//Adding the shadow when the mouse cursor is on
		se.addEventHandler(MouseEvent.MOUSE_ENTERED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	se.setEffect(shadow3);
		        }
		});
		//Removing the shadow when the mouse cursor is off
		se.addEventHandler(MouseEvent.MOUSE_EXITED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	se.setEffect(null);
		        }
		});
		
		
		Button Pe  = new  Button("PATIENT  ENTERIES");
		Pe.setTranslateX(280);
		Pe.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
		Pe.setTranslateY(200);
		Pe.setPrefSize(180, 40);
		Pe.setOnAction(e->{
		DoctorEnteries r = new DoctorEnteries("Hospital Management System",650,600);
		});
		
		DropShadow shadow4 = new DropShadow();
		//Adding the shadow when the mouse cursor is on
		Pe.addEventHandler(MouseEvent.MOUSE_ENTERED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	Pe.setEffect(shadow4);
		        }
		});
		//Removing the shadow when the mouse cursor is off
		Pe.addEventHandler(MouseEvent.MOUSE_EXITED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	Pe.setEffect(null);
		        }
		});
		
		
		Button Be  = new  Button("BIll ENTERIES");
		Be.setTranslateX(170);
		Be.setStyle("-fx-font: 15 arial; -fx-base: #007399;");	
		Be.setTranslateY(330);
		Be.setPrefSize(180, 40);
		Be.setOnAction(e->{
		DoctorEnteries r = new DoctorEnteries("Hospital Management System",650,600);
		});
		
		DropShadow shadow5 = new DropShadow();
		//Adding the shadow when the mouse cursor is on
		Be.addEventHandler(MouseEvent.MOUSE_ENTERED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	Be.setEffect(shadow5);
		        }
		});
		//Removing the shadow when the mouse cursor is off
		Be.addEventHandler(MouseEvent.MOUSE_EXITED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	Be.setEffect(null);
		        }
		});
		
		
		
		
		
		
		root.getChildren().addAll(pe,de,title,se,Pe,Be);
		

		
		
	 }
} 


