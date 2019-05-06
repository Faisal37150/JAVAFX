
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
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class Billing {
	
	Stage window; 
	static Scene scene;

	Billing(String title,int width,int height){
		window = new Stage();
		window.setTitle(title);
		window.setWidth(width);
		window.setHeight(height);
			Group root = new Group();
			addComponenet(root);	
			Scene scene = new Scene(root,650,700);
			window.setScene(scene);
			
			DatePicker checkInDatePicker = new DatePicker();
		    root.getChildren().add(checkInDatePicker);
		    checkInDatePicker.setTranslateX(450);
		    checkInDatePicker.setTranslateY(50);
		    
			window.show();
			window.setResizable(false);
		}
	
		public void addComponenet(Group root){

	
			ImageView img0 = new ImageView(new Image("file:doctor-filling-in-patients-registration-form-medical-receptionist-at-hospital_ba-m8hnm__F0000.png"));
			img0.setFitWidth(650);
			img0.setFitHeight(650);
			img0.setOpacity(0.6f);
			img0.setTranslateX(0);
			img0.setTranslateY(0);
			
			
			
			
			
			
			
			Label title = new Label("\t CHECK OUT ");
			title.setFont(Font.font("arial",FontWeight.BOLD, 30));

			title.setTranslateX(170);
			title.setTranslateY(15);
			
			Text B =  new Text("BIIL NO");
		    B.setFont(Font.font("arial",FontWeight.BOLD,15));
			B.setTranslateX(10);
			B.setTranslateY(70);
			
			TextField b = new TextField();
			b.setPromptText("Enter bill no");
			b.setTranslateX(100);
			b.setTranslateY(50);
		
			Text Date =  new Text("DATE");
		    Date.setFont(Font.font("arial",FontWeight.BOLD,15));
			Date.setTranslateX(350);
			Date.setTranslateY(70);
			
			Text PD =  new Text("PATIENT DETAIL");
		    PD.setFont(Font.font("Verdana",FontWeight.BOLD,15));
			PD.setTranslateX(10);
			PD.setTranslateY(110);
			PD.setUnderline(true); 
		   
			Text pid =  new Text("ID");
		    pid.setFont(Font.font("arial",FontWeight.BOLD,18));
			pid.setTranslateX(10);
			pid.setTranslateY(150);
			
			TextField id = new TextField();
			id.setPromptText("Enter ID");
			id.setTranslateX(100);
			id.setTranslateY(130);
			
			Text Name =  new Text("NAME");
		    Name.setFont(Font.font("arial",FontWeight.BOLD,16));
			Name.setTranslateX(10);
			Name.setTranslateY(190);
			
			TextField N = new TextField();
			N.setPromptText("Enter NAME");
			N.setTranslateX(100);
			N.setTranslateY(170);
			
			Text age =  new Text("AGE");
		    age.setFont(Font.font("arial",FontWeight.BOLD,16));
			age.setTranslateX(10);
			age.setTranslateY(230);
			
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
			
			
				comboBox.setTranslateX(100);
				comboBox.setTranslateY(210);
				
			
			Text gender =  new Text("GENDER");
		    gender.setFont(Font.font("arial",FontWeight.BOLD,16));
			gender.setTranslateX(10);
			gender.setTranslateY(270);
			

			
			ObservableList<String> options1 = 
				    FXCollections.observableArrayList(
				        "Male",
				        "Female"
				       
				        
				    );
				final ComboBox comboBox1 = new ComboBox(options1);
			
			
				comboBox1.setTranslateX(100);
				comboBox1.setTranslateY(250);
			
			
			
			Text Doa =  new Text("DATE OF ADMISSION");
		    Doa.setFont(Font.font("arial",FontWeight.BOLD,14));
			Doa.setTranslateX(330);
			Doa.setTranslateY(230);
			
			TextField DOA = new TextField();
			DOA.setPromptText("Enter DOA");
			DOA.setTranslateX(480);
		    DOA.setTranslateY(210);

		    Text dod=  new Text("DATE OF DISCHARGE");
		    dod.setFont(Font.font("arial",FontWeight.BOLD,14));
			dod.setTranslateX(330);
			dod.setTranslateY(270);
			
			TextField Dod = new TextField();
			Dod.setPromptText("Enter DOD");
			Dod.setTranslateX(480);
		    Dod.setTranslateY(250);
			
		    Text ch=  new Text("CHARGES");
		    ch.setFont(Font.font("arial",FontWeight.BOLD,16));
			ch.setTranslateX(10);
			ch.setTranslateY(330);
			ch.setUnderline(true); 
		 
		    Text ROM=  new Text("ROOM CHARGES");
		    ROM.setFont(Font.font("arial",FontWeight.BOLD,14));
		    ROM.setTranslateX(10);
		    ROM.setTranslateY(370);
			
			TextField rom = new TextField();
			rom.setPromptText("Enter CHARGES");
			rom.setTranslateX(130);
		    rom.setTranslateY(350);
			
		    Text M=  new Text("MISCELLANOUS");
		    M.setFont(Font.font("arial",FontWeight.BOLD,16));
		    M.setTranslateX(330);
		    M.setTranslateY(370);
			
			TextField m = new TextField();
			m.setPromptText("Misellanous");
			m.setTranslateX(480);
		    m.setTranslateY(350);
		    
		    Text df=  new Text("DOCTOR FEES");
		    df.setFont(Font.font("arial",FontWeight.BOLD,16));
		    df.setTranslateX(10);
		    df.setTranslateY(410);
			
			TextField d = new TextField();
			d.setPromptText("Enter AMOUNT");
			d.setTranslateX(130);
		    d.setTranslateY(390);
		    
		    Text pt=  new Text("PATHOLOGY");
		    pt.setFont(Font.font("arial",FontWeight.BOLD,16));
		    pt.setTranslateX(10);
		    pt.setTranslateY(450);
			
			TextField p= new TextField();
			p.setPromptText("Enter Amount");
			p.setTranslateX(130);
		    p.setTranslateY(430);
		    
		    Text to=  new Text("TOTAL");
		    to.setFont(Font.font("arial",FontWeight.BOLD,16));
		    to.setTranslateX(10);
		    to.setTranslateY(490);
			
			TextField t= new TextField();
			t.setPromptText("TOTAL");
			t.setTranslateX(130);
		    t.setTranslateY(470);
		  
			Button Ad  = new Button("ADD");
		    Ad.setPrefSize(100, 30);
		    Ad.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
			Ad.setTranslateX(120);
			Ad.setTranslateY(530);
			
			
			
			
				
			
			 DropShadow shadow = new DropShadow();
				//Adding the shadow when the mouse cursor is on
				Ad.addEventHandler(MouseEvent.MOUSE_ENTERED, 
				    new EventHandler<MouseEvent>() {
				        @Override public void handle(MouseEvent e) {
				        	Ad.setEffect(shadow);
				        }
				});
				//Removing the shadow when the mouse cursor is off
				Ad.addEventHandler(MouseEvent.MOUSE_EXITED, 
				    new EventHandler<MouseEvent>() {
				        @Override public void handle(MouseEvent e) {
				        	Ad.setEffect(null);
				        }
				});
			
					
				
			
			
		
			Button sa  = new Button("SAVE");
		    sa.setPrefSize(100, 30);
		    sa.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
			sa.setTranslateX(270);
			sa.setTranslateY(530);
			
			
			 DropShadow shadow1 = new DropShadow();
				//Adding the shadow when the mouse cursor is on
				sa.addEventHandler(MouseEvent.MOUSE_ENTERED, 
				    new EventHandler<MouseEvent>() {
				        @Override public void handle(MouseEvent e) {
				        	sa.setEffect(shadow1);
				        }
				});
				//Removing the shadow when the mouse cursor is off
				sa.addEventHandler(MouseEvent.MOUSE_EXITED, 
				    new EventHandler<MouseEvent>() {
				        @Override public void handle(MouseEvent e) {
				        	sa.setEffect(null);
				        }
				});
			
			
			
			
			
		
			Button ex  = new Button("EXIT");
		    ex.setPrefSize(100, 30);
		    ex.setStyle("-fx-font: 15 arial; -fx-base: #007399;");
			ex.setTranslateX(430);
			ex.setTranslateY(530);
			
			 DropShadow shadow3 = new DropShadow();
				//Adding the shadow when the mouse cursor is on
				ex.addEventHandler(MouseEvent.MOUSE_ENTERED, 
				    new EventHandler<MouseEvent>() {
				        @Override public void handle(MouseEvent e) {
				        	ex.setEffect(shadow3);
				        }
				});
				//Removing the shadow when the mouse cursor is off
				ex.addEventHandler(MouseEvent.MOUSE_EXITED, 
				    new EventHandler<MouseEvent>() {
				        @Override public void handle(MouseEvent e) {
				        	ex.setEffect(null);
				        }
				});
			
			
			
				ex.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent arg0) {
						
						window.close();
						
					}
				});
			
			
			
		    
			root.getChildren().addAll(img0,B,b,title,Date,PD,pid,id,Name,N,age,gender,Doa,DOA,dod,Dod,ch,ROM,rom,M,m,d,df,pt,p,to,t,Ad,sa,ex,comboBox,comboBox1);
		}
			
		}

		