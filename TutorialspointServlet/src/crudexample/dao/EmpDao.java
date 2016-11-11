package crudexample.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import crudexample.beanorentity.Emp;

/*CREATE TABLE emptab (
 id integer NOT NULL AUTO_INCREMENT,
 empname VARCHAR(4000) ,
 emppass VARCHAR(4000) ,
 empemail VARCHAR(4000) ,
 country VARCHAR(4000) ,
 PRIMARY KEY (id)
 );

 */
public class EmpDao {

	public static Connection getConnection() {

		try {
			System.out.println("Driver class loaded ");
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			System.out.println(" Driver Class not loading");
		}

		try {
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/newdb", "root", "password");
			return con;
		} catch (Exception e) {
			System.out.println(" Connection failed ");
		}
		return null;

	}

	public static int saveEmp(Emp em) {
		int Status = 0;
		Connection con = EmpDao.getConnection();
		try {
			PreparedStatement ps = con
					.prepareStatement("insert into emptab (empname,emppass,empemail,country) values(?,?,?,?)");
			ps.setString(1, em.getEmpname());
			ps.setString(2, em.getEmppassword());
			ps.setString(3, em.getEmpemail());
			ps.setString(4, em.getCountry());
			Status = ps.executeUpdate();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Status;

	}

	public static List<Emp> getAllEmployees(){  
        List<Emp> list=new ArrayList<Emp>();  
          
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from emptab");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Emp e=new Emp();  
                e.setId(rs.getInt(1));  
                e.setEmpname(rs.getString(2));  
                e.setEmppassword(rs.getString(3));  
                e.setEmpemail(rs.getString(4));  
                e.setCountry(rs.getString(5));  
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
}
