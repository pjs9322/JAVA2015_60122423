package DAOs;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import entity.CEntity;

public class MySQL implements IDAO {
	private final static String DRIVER = "com.mysql.jdbc.Driver";
	private final static String URL = "jdbc:mysql://localhost:3306";
	private final static String ROOTID = "root";
	private final static String ROOTPASSWORD = "mju12345";
	private static String ID = "";
	private static String PASSWORD = "";
	
	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
	private String dbName;
	private String tableName;
	
	
	public MySQL () throws ClassNotFoundException {
		Class.forName(DRIVER);
	}

	@Override
	public void createAccount(String id, String pw) throws SQLException {
		// TODO Auto-generated method stub
		// 계정 생성
		ID = id;
		PASSWORD = pw;
		connection = DriverManager.getConnection(URL, ROOTID, ROOTPASSWORD);
		String sql = "grant all privileges on *.* to "+ID
				+"@localhost identified by '"+PASSWORD+"' with grant option;";
		statement = connection.createStatement();
		statement.executeQuery(sql);
		statement.close();
	}
	@Override
	public void createDB(String dbname) throws SQLException {
		// 데이터베이스 생성
		this.dbName = dbname;
		connection = DriverManager.getConnection(URL, ID, PASSWORD);
		String sql = "create database "+dbName+";";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		sql = "use "+dbName+";";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		statement.close();
	}
	@Override
	public void createTable(String tablename) throws SQLException {
		// 테이블 생성 (user table / id, password, name / size 각각10씩, primary key는 id)
		this.tableName = tablename;
		String sql = "CREATE TABLE "+tableName+" ("
				+"ID VARCHAR(10) primary key,"
				+"NAME VARCHAR(10),"
				+"PASSWORD VARCHAR(10));";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		statement.close();
	}
	@Override
	public void insertData() throws SQLException {
		// 데이터 5개 삽입(0~4)
		for(int i=0; i<5; i++){
			String sql = "INSERT INTO "+tableName+" (ID, NAME, PASSWORD) VALUES "
			+"('id"+i+"', 'name"+i+"', 'password"+i+"');";
			statement = connection.createStatement();
			statement.executeUpdate(sql);
		}
		statement.close();
	}
	@Override
	public void updateData() throws SQLException {
		// 데이터 1개 업데이트(0->5)
		String sql = "UPDATE "+tableName+" "
				+"SET ID = 'id5', NAME = 'name5', PASSWORD = 'password5' WHERE ID = 'id0';";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		statement.close();
	}
	@Override
	public void selectData() throws SQLException {
		// select를 이용해 데이터 선택 후 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("-INPUT ID NUMBER : ");
		String sql = "SELECT * FROM "+tableName+" WHERE id = 'id"+scanner.next()+"';";
		statement = connection.createStatement();
		resultSet = statement.executeQuery(sql);
		if(resultSet.next()){
			System.out.println(resultSet.getString("id")+" "
					+resultSet.getString("name")+" "
					+resultSet.getString("password"));
			}
		else{
			System.out.print("UserData Not Found");
		}
		statement.close();
	}
	@Override
	public void deleteData() throws SQLException {
		// 데이터 5개 삭제(delete이용)
		String sql = "DELETE FROM "+tableName+";";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		statement.close();
	}
	@Override
	public void dropTable() throws SQLException {
		// 테이블 삭제
		String sql = "drop table "+tableName+";";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		statement.close();
	}
	@Override
	public void dropDB() throws SQLException {
		// 데이터베이스 삭제
		String sql = "drop database "+dbName+";";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		statement.close();
	}
	@Override
	public void dropAccount() throws SQLException {
		// 계정 삭제
		connection = DriverManager.getConnection(URL, ROOTID, ROOTPASSWORD);
		String sql = "drop user "+ID+"@localhost;";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		statement.close();
	}

	@Override
	public void connect(String name) throws IOException, SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection(URL, ROOTID, ROOTPASSWORD);
		this.tableName = name;
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select* from "+this.tableName);
	}

	@Override
	public void disconnect() throws IOException, SQLException {
		// TODO Auto-generated method stub
		if(connection==null){
			return;
		}
		connection.close();
		statement.close();
		resultSet.close();
	}

	@Override
	public CEntity read(CEntity entity, String ID) throws SQLException {
		// TODO Auto-generated method stub
		while(resultSet.next()){
			entity.DBRead(resultSet);
			if(entity.getID().equals(ID)){
				return entity;
			}
		}
		return null;
	}

	@Override
	public CEntity readNext(CEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void write(CEntity entity) throws IOException {
		// TODO Auto-generated method stub
		
	}
}
