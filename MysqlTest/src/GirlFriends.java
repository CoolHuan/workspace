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
	//������
	public static void update(){
		conn=getConnection();
		try {
			sql=conn.prepareStatement("select * from girls");
			rs=sql.executeQuery();
			while(rs.next()){
				System.out.print("���:"+rs.getString(1)+"\t����:"+rs.getString(2)
						+"\t����:"+rs.getString(3)+"\t�ȼ�:"+rs.getString(4)+"\n");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	//����һ��Ů����
	public static void addGirl(){
		
		conn=GirlFriends.getConnection();
		try {
			Scanner in=new Scanner(System.in);
		//	sql=conn.prepareStatement("insert into girls"+"values(?,?,?,?)");
			System.out.println("��������");
			String a=in.next();
			//sql.setInt(1,a);
			
			System.out.println("����������");
			String b=in.next();
		//	sql.setString(2, b);
			
			System.out.println("����������");
			String c=in.next();;
			//sql.setInt(3, c);
			
			System.out.println("������ȼ�");
			String d=in.next();
		//	sql.setString(4, "S");
			sql=conn.prepareStatement("insert into girls values('"+a+"','"+b+"','"+c+"','"+d+"')");
			
			sql.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	//�Ҹ�Ů���ѷ���
	public static void goodBay(){
		conn=GirlFriends.getConnection();
	try {	
		Scanner in=new Scanner(System.in);
		System.out.println("������Ҫ���ֵ�Ů��������:");
		String name=in.next();
		
		
			sql=conn.prepareStatement("delete from girls where name='"+name+"'");
			sql.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	//�޸�����
	public static void change(){
		conn=GirlFriends.getConnection();
		
		try {
			Scanner in=new Scanner(System.in);
			sql=conn.prepareStatement("update girls set level=?where name=?");
			System.out.println("��������Ҫ������Ϣ���˵�������");
			String name=in.next();
			sql.setString(2, name);
			System.out.println("�������µĵȼ�");
			String level=in.next();
			sql.setString(1, level);
			sql.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println();
	}
	//��ѯһ��Ů���ѵ���Ϣ
	public static void search(){
		conn=getConnection();
		try {
			sql=conn.prepareStatement("select * from girls where name=?");
			Scanner in=new Scanner(System.in);
			System.out.println("������Ҫ���ҵ�������");
			String name=in.next();
			sql.setString(1, name);
			
			rs=sql.executeQuery();
			while(rs.next()){
				System.out.print("���:"+rs.getString(1)+"\t����:"+rs.getString(2)
						+"\t����:"+rs.getString(3)+"\t�ȼ�:"+rs.getString(4)+"\n");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
		
	
	public static void main(String[] args) {
			// addGirl(); ���һ��Ů����
			//goodBay();	�Ҹ�Ů���ѷ���
			//change();		�ı�һ��Ů���ѵ���Ϣ
			//search();	//����һ��Ů����
			update();	//��ӡŮ�����ܱ��
			
			
	}

}

