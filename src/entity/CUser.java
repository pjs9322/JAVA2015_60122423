package entity;

import java.io.BufferedWriter;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CUser extends CEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	private String password;
	private String name;	
	
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public void read(Scanner scanner) {
		ID = scanner.next();
		password = scanner.next();
		name = scanner.next();
	};
	public void write(Scanner scanner) {		
	}
	@Override
	public void write(BufferedWriter scanner) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void DBRead(ResultSet resultSet) throws SQLException {
		// TODO Auto-generated method stub
		ID = resultSet.getString("id");
		password = resultSet.getString("pw");
		name = resultSet.getString("name");
	}
	@Override
	public void DBWrite(PreparedStatement pstmt) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}






