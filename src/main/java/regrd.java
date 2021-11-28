import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class regrd {
	
	private String dbUrl = "jdbc:mysql://localhost:3306/covidtestresult";
	private String dbUname = "root";
	private String dbPassword = "jith@123";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public String insert(member mmr) 
	{
		loadDriver(dbDriver);
		Connection conn = getConnection();
		String result = "Data entered successfully!!!\nGet Vaccinated and Be Safe";
		String sql = "insert into mmr values(?,?,?,?,?,?)";
		
		PreparedStatement ps;
		try {
		ps = conn.prepareStatement(sql);
		ps.setString(1, mmr.getName());
		ps.setString(2, mmr.getAadhaar());
		ps.setString(3, mmr.getPhone());
		ps.setString(4, mmr.getVaccine());
		ps.setString(5, mmr.getDose());
		ps.setString(6, mmr.getVaccinedate());
		ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Full Data Fields Not Entered or Not Entered Correctly\nor\nYou may have registered before same aadhaar number";
		}
		return result;
	}

}
