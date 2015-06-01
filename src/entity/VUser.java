package entity;

public class VUser {
	// attributes
	public enum EUserType {EProfessor, EStudent}
	private String userID;
	private String name;
	private EUserType eUsertype;
	
	public String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public EUserType geteUsertype() {return eUsertype;}
	public void seteUsertype(EUserType eUsertype) {this.eUsertype = eUsertype;}
}
