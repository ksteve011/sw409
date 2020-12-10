public class Patient {

	String name;
	int id;
	String disease;
	int age; 
	String doctor;

	public Patient(int id, String name, String disease, int age, String doctor) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.disease = disease;
		this.age = age;
		this.doctor = doctor;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}