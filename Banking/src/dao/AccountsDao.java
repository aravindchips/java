package dao;
import java.sql.*;
import dto.Accounts;

public class AccountsDao {
	private static String jdbcURL;
    private static String jdbcUsername;
    private static String jdbcPassword;
    private static Connection jdbcConnection;
    public String getJdbcURL() {
		return jdbcURL;
	}
	public void setJdbcURL(String jdbcURL) {
		this.jdbcURL = jdbcURL;
	}
	public String getJdbcUsername() {
		return jdbcUsername;
	}
	public void setJdbcUsername(String jdbcUsername) {
		this.jdbcUsername = jdbcUsername;
	}
	public String getJdbcPassword() {
		return jdbcPassword;
	}
	public void setJdbcPassword(String jdbcPassword) {
		this.jdbcPassword = jdbcPassword;
	}
	public Connection getJdbcConnection() {
		return jdbcConnection;
	}
	public void setJdbcConnection(Connection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	@Override
	public String toString() {
		return "AccountsDao [jdbcURL=" + jdbcURL + ", jdbcUsername=" + jdbcUsername + ", jdbcPassword=" + jdbcPassword
				+ ", jdbcConnection=" + jdbcConnection + "]";
	}
	public AccountsDao(String jdbcURL, String jdbcUsername, String jdbcPassword){
    	this.jdbcURL = jdbcURL;
        this.jdbcUsername = jdbcUsername;
        this.jdbcPassword = jdbcPassword;

    }
	protected static void connect() throws SQLException {
        if (jdbcConnection == null || jdbcConnection.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
            jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        }
    }
	protected void disconnect() throws SQLException {
        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
            jdbcConnection.close();
        }
    }
	public static void deposit(String acctNumber,float amount) throws SQLException {
		connect();
		String sql="update accounts set balance=balnace + ? where accountNumber=?";
		PreparedStatement statement=jdbcConnection.prepareStatement(sql);
		statement.setFloat(1, amount);
		statement.setString(2, acctNumber);
		int status=statement.executeUpdate();
		System.out.println("Amount deposited...");
		
	}
	
    public static void withdraw(String acctNumber,float amount) throws SQLException {
    	connect();
		String sql="update accounts set balance=balance - ? where accountNumber=?";
		PreparedStatement statement=jdbcConnection.prepareStatement(sql);
		statement.setFloat(1, amount);
		statement.setString(2, acctNumber);
		int status=statement.executeUpdate(sql);
		System.out.println("Amount withdrawn...");
		
	}
    public static void getBalance(String acctNumber) throws SQLException {
    	connect();
    	String sql="select balance from Accounts where accountNumber=?";
		PreparedStatement statement=jdbcConnection.prepareStatement(sql);
		statement.setString(1, acctNumber);
		ResultSet resultset=statement.executeQuery();
		resultset.next();
		System.out.println("Available Balance is"+resultset.getFloat(1));
    	
    	//return 0;
	
}
	

}
