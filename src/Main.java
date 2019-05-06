
import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.sql.*;

public class Main extends Application {
	
	Stage window;
	 String user="admin",pass="admin";
	static Scene scene;
	public static void main(String[] args) {
			launch(args);
		}

		@Override
		public void start(Stage primaryStage) throws Exception {
		
		
			window=primaryStage;
			Group root = new Group();
			addComponenet(root);	
						
			Scene scene = new Scene(root,400,550,Color.WHITE);
			
			
			window.setScene(scene);
			window.show();
			window.setResizable(false);
		}
		
	 public void addComponenet(Group root){

	
		final String content = "\t\tWELLCOME TO\nHOSPITAL MANAGEMENT SYSTEM";
	    final Text title = new Text(20, 60, "Hospital MANAGEMENT SYSTEM");
	    title.setFill(Color.web("#007399"));
	    title.setFont(Font.font("TimeNewRoman", FontWeight.BOLD, 22));
	    final Animation animation = new Transition() {
	        {
	            setCycleDuration(Duration.millis(4000));
	        }
	    
	        public void interpolate(double frac) {
	            final int length = content.length();
	            final int n = Math.round(length * (float) frac);
	            title.setText(content.substring(0, n));
	        }
	    
	    };
	    animation.play();
		ImageView img = new ImageView(new Image("file:administrator.png"));
		img.setFitWidth(150);
		img.setFitHeight(150);
		img.setTranslateX(130);
		img.setTranslateY(120);
		
		
		root.getChildren().add(img);
		Text Username =  new Text("Username");
		Username.setFill(Color.web("#007399"));
		Username.setFont(Font.font("arial",FontWeight.BOLD, 15));
		Username.setTranslateX(70);
		Username.setTranslateY(330);
		
		TextField ftf = new TextField();
		ftf.setPromptText("Enter User name");
		ftf.setStyle("-fx-text-inner-color: #007399;");
		ftf.setTranslateX(160);
		ftf.setText("admin");
		ftf.setTranslateY(310);
		ftf.setPrefSize(170, 30);

		
		
		
		Text pssname =  new Text("password:");
		pssname.setFill(Color.web("#007399"));
		
		pssname.setTranslateX(70);
		pssname.setTranslateY(390);
		pssname.setFont(Font.font("arial",FontWeight.BOLD, 15));
		
		PasswordField ptf = new PasswordField();
		ptf.setPromptText("Enter password");
		ptf.setStyle("-fx-text-inner-color: #007399;");
		ptf.setTranslateX(160);
		ptf.setText("admin");
		ptf.setTranslateY(370);
		ptf.setPrefSize(170, 30);
		
		Button login = new  Button("Login");
		login.setTranslateX(250);
		login.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
		login.setTranslateY(430);
		login.setPrefSize(80, 30);
		root.getChildren().addAll(Username,ftf,pssname,ptf,login,title);
		
	
		
		login.setOnAction(new EventHandler <ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				
				if(user.equals(ftf.getText().trim()) && pass.equals(ptf.getText().trim())){
					
					Menu m = new Menu("Hospital Management System",600,600);
					window.close();
		
				} else {		
					
					Alert ab = new Alert(AlertType.ERROR);
		    		ab.setContentText("Login Failed");
		    		ab.setTitle("Login");
		    		ab.show();
		    		
				}
			}
		});
		
		
	 }
} 

