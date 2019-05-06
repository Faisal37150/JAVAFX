
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ViewPatients  {
	
	Stage window;
	static Scene scene;
	
	ViewPatients(String title,int width,int height){
		window = new Stage();
		window.setTitle(title);
	
		window.setWidth(900);
		window.setHeight(400);
	
	
			Group root = new Group();
			

		    TableView<PatientEntries> table = new TableView<PatientEntries>();
		    ObservableList<PatientEntries> data = FXCollections.observableArrayList();
		    
		    String[][] dataRead = Reader();
		    
		    for(int i = 0; i < (dataRead.length); i++){
					
					data.add(new PatientEntries(
							dataRead[i][0],
							dataRead[i][1],
							dataRead[i][2],
							dataRead[i][3],
							dataRead[i][4],
							dataRead[i][5],
							dataRead[i][6],
							dataRead[i][7],
							dataRead[i][8]));
			}
		    
TableColumn idCol = new TableColumn("ID");
idCol.setMinWidth(100);
idCol.setCellValueFactory(new PropertyValueFactory<PatientEntries, String>("patId"));

TableColumn nameCol = new TableColumn("Name");
nameCol.setMinWidth(100);
nameCol.setCellValueFactory(new PropertyValueFactory<PatientEntries, String>("patName"));

TableColumn ageCol = new TableColumn("Age");
ageCol.setMinWidth(100);
ageCol.setCellValueFactory(new PropertyValueFactory<PatientEntries, String>("patAge"));

TableColumn dateCol = new TableColumn("Date");
dateCol.setMinWidth(100);
dateCol.setCellValueFactory(new PropertyValueFactory<PatientEntries, String>("patDate"));

TableColumn genderCol = new TableColumn("Gender");
genderCol.setMinWidth(100);
genderCol.setCellValueFactory(new PropertyValueFactory<PatientEntries, String>("patGender"));

TableColumn addressCol = new TableColumn("Address");
addressCol.setMinWidth(100);
addressCol.setCellValueFactory(new PropertyValueFactory<PatientEntries, String>("patAddress"));

TableColumn contactCol = new TableColumn("Contact");
contactCol.setMinWidth(100);
contactCol.setCellValueFactory(new PropertyValueFactory<PatientEntries, String>("patContact"));


TableColumn regCol = new TableColumn("REGISTRATION");
regCol.setMinWidth(100);
regCol.setCellValueFactory(new PropertyValueFactory<PatientEntries, String>("patReg"));

TableColumn RoomCol = new TableColumn("ROOM");
RoomCol.setMinWidth(100);
RoomCol.setCellValueFactory(new PropertyValueFactory<PatientEntries, String>("patRoom"));

	        table.setItems(data);
	        table.getColumns().addAll(idCol,nameCol,ageCol,dateCol,genderCol,addressCol,contactCol,regCol,RoomCol);
	 
			
			
			/*
			String[][] data = Reader();
			
			// for deleting 2nd record
			int deleting = 1;
			for(int i = deleting; i < data.length-1; i++){
				for(int j = 0; j < data[i].length; j++){
					
					data[i][j] = data[i+1][j];
					
				}
			}			
			for(int i = 0; i < data[0].length; i++)
				data[data.length-1][i] = null;
			// deleting method end
			
			
			

			Label labelRow[] = new Label[totalLines()];
			for(int i = 0; i < (data.length - 1); i++){
				System.out.println(data.length);
				
					String row = "";
					row += "Patient " + (i+1) + "\n";
					for(int j = 0; j < data[i].length-1; j++){
						row += data[i][j] + "\t   ";
					}
				
					row += data[i][data[i].length -1];
				
					labelRow[i] = new Label(row);
				
			}
			
			int temp = 50;
			for(int i = 0; i < labelRow.length - 1; i++){
				labelRow[i].setTranslateX(30);
				labelRow[i].setTranslateY(temp);
				temp += 50;
				root.getChildren().add(labelRow[i]);	
			}
			
			*/
			
	        root.getChildren().add(table);
			Scene scene = new Scene(root,900,500,Color.LIGHTSEAGREEN);
			window.setScene(scene);
			
			 
			window.show();
			window.setResizable(true);
		}
	
	int totalLines(){
		try {
			
			FileReader fr = new FileReader("file://../data/entries.txt");
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
			FileReader fr = new FileReader("file://../data/entries.txt");
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
			
			/*for(int i = 0; i < count; i++){
				for(int j = 0; j < 9; j++){
					System.out.print(result[i][j]);
				}
				System.out.println("\n\n");
			}*/
			
			return result;
			
		} catch(Exception e){
			System.out.println("File not found");
		}
		
		return null;
	}
	
	 
	 public static void Writer(String data, boolean append) {
		 
		 try {
			 FileWriter fw = new FileWriter("file://../data/entries.txt", append);
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
