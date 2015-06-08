package DAOs;

import java.io.IOException;
import java.sql.SQLException;

import entity.CEntity;

public interface IDAO {
	public void connect(String name) throws IOException, SQLException;
	public void disconnect() throws IOException, SQLException;

	public void createAccount(String id, String pw) throws SQLException;
	public void createDB(String dbName) throws SQLException;
	public void createTable(String tableName) throws SQLException;
	public void insertData() throws SQLException;
	public void updateData() throws SQLException;
	public void selectData() throws SQLException;
	public void deleteData() throws SQLException;
	public void dropTable() throws SQLException;
	public void dropDB() throws SQLException;
	public void dropAccount() throws SQLException;
	public CEntity read(CEntity entity, String ID) throws SQLException;
	public CEntity readNext(CEntity entity);
	public void write(CEntity entity) throws IOException;
}
