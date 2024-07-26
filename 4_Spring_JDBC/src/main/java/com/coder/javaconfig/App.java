package com.coder.javaconfig;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.coder.dao.StudentDao;
import com.coder.model.Student;

public class App {
	
	public static void main(String[] args) throws SQLException {
		
	 ApplicationContext context	= new AnnotationConfigApplicationContext(config.class);
	 JdbcTemplate jd = context.getBean("jdbc",JdbcTemplate.class);
	 System.out.println(jd.getDataSource().getConnection());
		/*
		 * String sql = "insert into student(id, name, address) values(?,?,?)"; int i =
		 * jd.update(sql,2,"Arsh","Delhi");
		 * System.out.println("Successfully inserted : " + i);
		 */
	 
	 /* Perform Dao Standard */
		
		StudentDao dao = context.getBean("stDao", StudentDao.class);
		
		/* insert */
		
		/*
		 * Student st = new Student(); st.setId(4); st.setName("Ravi");
		 * st.setAddress("pilibhit");
		 * 
		 * 
		 * int i = dao.insert(st); System.out.println("insert successfully" +i);
		 */
		 
		
		/* update details */
		
		/*
		 * Student st = new Student(); st.setId(4); st.setName("Ravi up");
		 * st.setAddress("pilibhit up");
		 * 
		 * 
		 * int i = dao.updateDetails(st); System.out.println("update successfully" +i);
		 */

		
		/* delete data */
		
		/* int i = dao.delete(4); System.out.println("delete successfully" +i); */
		 
		  
		
		/* Student st = dao.getStudentById(1); System.out.println(st); */
		 
		
		
		
		
		
		  List<Student> list=dao.getAllStudent();
		  
		  for(Student st: list) { System.out.println(st);
		  
		  }
		 
		 
		 
	}

}
