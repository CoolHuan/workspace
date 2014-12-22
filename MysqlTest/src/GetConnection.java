import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;


public class GetConnection {

	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("�ɹ�����MySQL��������");
		} catch (ClassNotFoundException e) {
			System.out.println("�Ҳ�������");
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/student";
		Connection conn;
		
		try {
			conn=DriverManager.getConnection(url, "root", "root");
			System.out.println("�ɹ��������ݿ�");
			Statement statement=conn.createStatement();
			
			ResultSet rsResultSet=statement.executeQuery("select * from stu");
			System.out.println("ѧ��\t����\t\t����");
			while(rsResultSet.next()){
				
				System.out.println(rsResultSet.getString(1)+"\t"+rsResultSet.getString(2)+"\t"
						+rsResultSet.getString(3));
			}
		
			statement.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("����ʧ��");
			e.printStackTrace();
		}
	}

}
