import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
	
	ArrayList<Patient> plist = new ArrayList<>();
	String file;
	
	String name;
	int id;
	String disease;
	int age; 
	String doctor;
	
	public FileReader(String filename) throws FileNotFoundException{
		
		
	Scanner scan = new Scanner(file);
	
	while (scan.hasNextLine()) {
		id = Integer.valueOf(scan.nextLine());
		name = scan.nextLine();
		disease = scan.nextLine();
		age = Integer.valueOf(scan.nextLine());
		doctor = scan.nextLine();
		
		Patient temp = new Patient(id, name, disease, age, doctor);
		plist.add(temp);
		}
	}
	
	public ArrayList<Patient> getPatientInfo(){
		return plist;
	}
	
	
}
