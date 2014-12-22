import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;


public class GetConnection {

	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("成功加载MySQL驱动程序");
		} catch (ClassNotFoundException e) {
			System.out.println("找不到驱动");
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/student";
		Connection conn;
		
		try {
			conn=DriverManager.getConnection(url, "root", "root");
			System.out.println("成功连接数据库");
			Statement statement=conn.createStatement();
			
			ResultSet rsResultSet=statement.executeQuery("select * from stu");
			System.out.println("学号\t姓名\t\t年龄");
			while(rsResultSet.next()){
				
				System.out.println(rsResultSet.getString(1)+"\t"+rsResultSet.getString(2)+"\t"
						+rsResultSet.getString(3));
			}
		
			statement.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("连接失败");
			e.printStackTrace();
		}
	}

}
