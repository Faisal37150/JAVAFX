
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Menu {

	static Stage window;
	static Scene scene1;
	Menu(String title,int width,int height){
		window = new Stage();
		window.setTitle(title);
		window.setWidth(width);
		window.setHeight(height);
			window.setResizable(false);
		ImageView img0 = new ImageView(new Image("file:67f2d01b00fe5417c567649e7332264c.png"));
		img0.setFitWidth(650);
		img0.setFitHeight(600);
		img0.setTranslateX(0);
		img0.setTranslateY(0);
		img0.setOpacity(0.3f);
		
		
		Group g = new Group();
		Button inpatient = new Button("PATIENT ENTRY");
		inpatient.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
		inpatient.setPrefSize(170, 40);
		inpatient.setTranslateX(50);
		inpatient.setTranslateY(90);

		DropShadow shadow = new DropShadow();
		//Adding the shadow when the mouse cursor is on
		inpatient.addEventHandler(MouseEvent.MOUSE_ENTERED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	inpatient.setEffect(shadow);
		        }
		});
		//Removing the shadow when the mouse cursor is off
		inpatient.addEventHandler(MouseEvent.MOUSE_EXITED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	inpatient.setEffect(null);
		        }
		});

		Button doctor = new Button("DOCTOR REGISTRATION");
		doctor.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
		doctor.setPrefSize(170,40);
		doctor.setTranslateX(340);
		doctor.setTranslateY(90);

		DropShadow shadow1 = new DropShadow();
		//Adding the shadow when the mouse cursor is on
		doctor.addEventHandler(MouseEvent.MOUSE_ENTERED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	doctor.setEffect(shadow1);
		        }
		});
		//Removing the shadow when the mouse cursor is off
		doctor.addEventHandler(MouseEvent.MOUSE_EXITED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	doctor.setEffect(null);
		        }
		});
	
		doctor.setOnAction(e ->{
			DoctorRegistration dr = new DoctorRegistration("Hospital Management System",650,600);
		});		
			
		Button Staffinfo = new Button("STAFF REGISTRATION");
		Staffinfo.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
	    Staffinfo.setPrefSize(170,40);
		Staffinfo.setTranslateX(50);
		Staffinfo.setTranslateY(220);
		
	
		
		//A button with the specified text caption and icon.
		
		
		
		
		
		DropShadow shadow2 = new DropShadow();
		//Adding the shadow when the mouse cursor is on
		Staffinfo.addEventHandler(MouseEvent.MOUSE_ENTERED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	Staffinfo.setEffect(shadow2);
		        }
		});
		//Removing the shadow when the mouse cursor is off
		Staffinfo.addEventHandler(MouseEvent.MOUSE_EXITED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	Staffinfo.setEffect(null);
		        }
		});
		Staffinfo.setOnAction(e ->{
			STAFFREG SR = new STAFFREG("Hospital Management System",650,600);
		});		
			
		Button billing = new Button("CHECK OUT");
		billing.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
	    billing.setPrefSize(170,40);
		billing.setTranslateX(340);
		billing.setTranslateY(220);
		DropShadow shadow3 = new DropShadow();
		//Adding the shadow when the mouse cursor is on
		billing.addEventHandler(MouseEvent.MOUSE_ENTERED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	billing.setEffect(shadow3);
		        }
		});
		//Removing the shadow when the mouse cursor is off
		billing.addEventHandler(MouseEvent.MOUSE_EXITED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	billing.setEffect(null);
		        }
		});
		billing.setOnAction(e->{
			Billing b = new Billing("CHECK OUT",650,650);
		});
		
		Button Pathology  = new Button("PATHOLOGY");
		Pathology.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
	    Pathology.setPrefSize(170,40);
		Pathology.setTranslateX(50);
		Pathology.setTranslateY(350);
		DropShadow shadow4 = new DropShadow();
		//Adding the shadow when the mouse cursor is on
		Pathology.addEventHandler(MouseEvent.MOUSE_ENTERED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	Pathology.setEffect(shadow4);
		        }
		});
		//Removing the shadow when the mouse cursor is off
		Pathology.addEventHandler(MouseEvent.MOUSE_EXITED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	Pathology.setEffect(null);
		        }
		});
		
		
		Pathology.setOnAction(e->{
			Pathology p = new Pathology("Pathology",600,600);
		});
		
		Button Room  = new Button("ROOM");
		Room.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
	    Room.setPrefSize(170,40);
		Room.setTranslateX(340);
		Room.setTranslateY(350);
		DropShadow shadow5 = new DropShadow();
		//Adding the shadow when the mouse cursor is on
		Room.addEventHandler(MouseEvent.MOUSE_ENTERED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	Room.setEffect(shadow5);
		        }
		});
		//Removing the shadow when the mouse cursor is off
		Room.addEventHandler(MouseEvent.MOUSE_EXITED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	Room.setEffect(null);
		        }
		});
		
		Room.setOnAction(e->{
			Room R = new Room("Room",500,500);
		});
		
		
		Button Enteries   = new Button("View Enteries");
		Enteries.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
		Enteries.setPrefSize(170,40);
		Enteries.setTranslateX(200);
	    Enteries.setTranslateY(460);
	    DropShadow shadow6 = new DropShadow();
		//Adding the shadow when the mouse cursor is on
		Enteries.addEventHandler(MouseEvent.MOUSE_ENTERED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	Enteries.setEffect(shadow6);
		        }
		});
		//Removing the shadow when the mouse cursor is off
		Enteries.addEventHandler(MouseEvent.MOUSE_EXITED, 
		    new EventHandler<MouseEvent>() {
		        @Override public void handle(MouseEvent e) {
		        	Enteries.setEffect(null);
		        }
		});
	 
		Enteries.setOnAction(e->{
		Enteries E = new Enteries("Enteries",500,500);
		});
		ImageView img1 = new ImageView(new Image("file:images.jpg"));
		img1.setFitWidth(600);
		img1.setFitHeight(600);
		img1.setTranslateX(0);
		img1.setTranslateY(0);
		
		g.getChildren().addAll(img0,inpatient,img1,doctor,Staffinfo,billing,Pathology,Room,Enteries);

		scene1 = new Scene(g,Color.WHITE);
		window.setScene(scene1);
		window.show();
	
        inpatient.setOnAction(e ->{
			
			Registration r = new Registration("Hospital Management System",650,600);
			
		});
		
	}
	
}