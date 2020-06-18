package model;

//Type your code here
public class User {
	String name;
	String email;
	String dob;
	String gender;
	String month;
	String date;

	public User(String name, String gender, String dob) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
	}

//What is the date format? Please can you type a sample date? ya 18/06/2020. Good. When you have to take the month, what must you do?T first i need to import then  
//You have taken the date as string, in such case what must you do?i need to format date, you split it first but without splitting also i can take

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMonth() {
		return month;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		// TODO Auto-generated method stub
		this.date = date;
	}
}