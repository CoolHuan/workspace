import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Gradation {
	static Connection conn;
	static Statement state;
	static ResultSet rs;
	static String url="jdbc:mysql://localhost:3306/student";
	
	public Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn=DriverManager.getConnection(url, "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void main(String[] args) {
		try {
			
			Gradation a=new Gradation();
			a.getConnection();
			state=conn.createStatement();
			rs=state.executeQuery("select * from stu");
			while(rs.next()){
				System.out.print("±‡∫≈:"+rs.getString(1)+"\t–’√˚:"+rs.getString(2)
						+"\tƒÍ¡‰:"+rs.getString(3));

				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
