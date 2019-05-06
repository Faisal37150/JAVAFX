
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DoctorEnteries  {
	
	Stage window;
	 
	static Scene scene;
	
	DoctorEnteries(String title,int width,int height){
		window = new Stage();
		window.setTitle(title);
		window.setWidth(width);
		window.setHeight(height);
	
	
			Group root = new Group();
			
			String[][] data = Reader();
			
			
			
			
			
			
			

			Label labelRow[] = new Label[totalLines()];
			for(int i = 0; i < data.length; i++){
				
					String row = "";
					row += "Doctor " + (i+1) + "\n";
					for(int j = 0; j < data[i].length-1; j++){
						row += data[i][j] + "\t   ";
					}
				
					row += data[i][data[i].length -1];
				
					labelRow[i] = new Label(row);
				
			}
			
			int temp = 50;
			for(int i = 0; i < labelRow.length; i++){
				labelRow[i].setTranslateX(30);
				labelRow[i].setTranslateY(temp);
				temp += 50;
				root.getChildren().add(labelRow[i]);	
			}
			
			
			
			
			Scene scene = new Scene(root,650,600,Color.LIGHTSEAGREEN);
			window.setScene(scene);
			
			 
			window.show();
			window.setResizable(false);
		}
	
	int totalLines(){
		try {
			
			FileReader fr = new FileReader("file://../data/Enteries1.txt");
			BufferedReader br = new BufferedReader(fr);
			String[][] result;
			
			int c = 0;
			while(br.readLine() != null){
				c++;
			}
			return c;
		} catch(Exception e){
			System.out.println("File not found");
		}
		return 0;
	}

	String[][] Reader() {
		
		try {
			FileReader fr = new FileReader("file://../data/Enteries1.txt");
			BufferedReader br = new BufferedReader(fr);
			String[][] result = new String[totalLines()][9];
			
			String c;
			int count = 0;
			while((c = br.readLine()) != null){
				String[] s = c.split("\\|");
				
				for(int i = 0; i < s.length; i++){
					result[count][i] = s[i];
				}
				count++;
			}
			
			
			return result;
			
		} catch(Exception e){
			System.out.println("File not found");
		}
		
		return null;
	}
	
	 
	 public static void Writer(String data, boolean append) {
		 
		 try {
			 FileWriter fw = new FileWriter("file://../data/Enteries1.txt", append);
			 fw.write(data);
			 fw.close();
			 
		 } catch (Exception e){
			 System.out.println("File Not Found");
		 }
		 
	 }

	public static void setOnAction(Object object) {
		// TODO Auto-generated method stub
		
	}
}	
