import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class GirlFriends {
	static Connection conn;
	static PreparedStatement sql;
	static ResultSet rs;
	static String url="jdbc:mysql://localhost:3306/girlfriends";
	
	public static Connection getConnection(){
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
	//输出表格
	public static void update(){
		conn=getConnection();
		try {
			sql=conn.prepareStatement("select * from girls");
			rs=sql.executeQuery();
			while(rs.next()){
				System.out.print("编号:"+rs.getString(1)+"\t姓名:"+rs.getString(2)
						+"\t年龄:"+rs.getString(3)+"\t等级:"+rs.getString(4)+"\n");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	//增加一个女朋友
	public static void addGirl(){
		
		conn=GirlFriends.getConnection();
		try {
			Scanner in=new Scanner(System.in);
		//	sql=conn.prepareStatement("insert into girls"+"values(?,?,?,?)");
			System.out.println("请输入编号");
			String a=in.next();
			//sql.setInt(1,a);
			
			System.out.println("请输入姓名");
			String b=in.next();
		//	sql.setString(2, b);
			
			System.out.println("请输入年龄");
			String c=in.next();;
			//sql.setInt(3, c);
			
			System.out.println("请输入等级");
			String d=in.next();
		//	sql.setString(4, "S");
			sql=conn.prepareStatement("insert into girls values('"+a+"','"+b+"','"+c+"','"+d+"')");
			
			sql.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	//找个女朋友分手
	public static void goodBay(){
		conn=GirlFriends.getConnection();
	try {	
		Scanner in=new Scanner(System.in);
		System.out.println("请输入要分手的女朋友姓名:");
		String name=in.next();
		
		
			sql=conn.prepareStatement("delete from girls where name='"+name+"'");
			sql.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	//修改数据
	public static void change(){
		conn=GirlFriends.getConnection();
		
		try {
			Scanner in=new Scanner(System.in);
			sql=conn.prepareStatement("update girls set level=?where name=?");
			System.out.println("请输入需要更改信息的人的姓名：");
			String name=in.next();
			sql.setString(2, name);
			System.out.println("请输入新的等级");
			String level=in.next();
			sql.setString(1, level);
			sql.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println();
	}
	//查询一个女朋友的信息
	public static void search(){
		conn=getConnection();
		try {
			sql=conn.prepareStatement("select * from girls where name=?");
			Scanner in=new Scanner(System.in);
			System.out.println("请输入要查找的姓名：");
			String name=in.next();
			sql.setString(1, name);
			
			rs=sql.executeQuery();
			while(rs.next()){
				System.out.print("编号:"+rs.getString(1)+"\t姓名:"+rs.getString(2)
						+"\t年龄:"+rs.getString(3)+"\t等级:"+rs.getString(4)+"\n");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
		
	
	public static void main(String[] args) {
			// addGirl(); 添加一个女朋友
			//goodBay();	找个女朋友分手
			//change();		改变一个女朋友的信息
			//search();	//查找一个女朋友
			update();	//打印女朋友总表格
			
			
	}

}

