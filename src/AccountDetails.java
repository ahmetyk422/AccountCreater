
public class AccountDetails {
String name ="please enter name :";
String surname ="please enter surname :";
String password ="please enter password :";
 
public AccountDetails() {}

public AccountDetails(String name, String surname, String password) {
	this.name = name;
	this.surname = surname;
	this.password = password;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}



}
