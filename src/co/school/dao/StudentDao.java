 package co.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.school.configuration.HelperClass;
import com.school.dto.Student;

public class StudentDao {
	HelperClass helperClass = new HelperClass();
	Connection connection = null;
	public Student saveStudent(Student student) {
		connection = helperClass.getConnection();
		String sql = "INSERT INTO student values(?,?,?)";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,student.getId());
			preparedStatement.setString(2,student.getName());
			preparedStatement.setString(3,student.getEmail());
			preparedStatement.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	return student;
		
	}
	

}
