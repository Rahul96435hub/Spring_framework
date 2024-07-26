package com.coder.xml;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.aop.interceptor.PerformanceMonitorInterceptor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.coder.dao.StudentDao;
import com.coder.model.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/coder/xml/config.xml");

		JdbcTemplate jd = context.getBean("jdbcTemplate", JdbcTemplate.class);
		System.out.println(jd.getDataSource().getConnection());

		/*
		 * String sql = "insert into student(id, name, address) values(?,?,?)"; int i =
		 * jd.update(sql,1,"coder","Noida"); System.out.println("sucessfully inserted"
		 * +i);
		 */

		// insert
//        String sql ="insert into student(id, name, address) values(?,?,?)";
//        int i = jd.update(sql,3, "Rahul", "Puranpur");
//        System.out.println("inserted succefully" +i);

		// update data
//        String sql = "update student set name=?, address=? where id = ?";
//        int i = jd.update(sql,"Rahul up", "Puranpur up", 3);
//        System.out.println("update successfully" +i);

		// delete data
//        String sql = "delete from student where id = ?";
//        int i = jd.update(sql, 3);
//        System.out.println("delete succefully" + i);

		/* fetch data by id */
		/*
		 * String sql = "select * from student where id = ?"; RowMapper rowMapper = new
		 * RowMapper() {
		 * 
		 * @Override public Object mapRow(ResultSet rs, int rowNum) throws SQLException
		 * { String name = rs.getString(2); return name; } }; String name = (String)
		 * jd.queryForObject(sql, rowMapper, 2); System.out.println(name); } }
		 */

		/*
		 * String sql = "select * from student";
		 * 
		 * RowMapper rowMapper = new RowMapper() {
		 * 
		 * @Override public Object mapRow(ResultSet rs, int rowNum) throws SQLException
		 * { String name = rs.getString(2); return name; } };
		 * 
		 * List<String> list =jd.query(sql, rowMapper); for(String name : list) {
		 * System.out.println(name ); }
		 */
		
		/* Perform Dao Standard */
		
		StudentDao dao = context.getBean("stDao", StudentDao.class);
		
		/* insert */
		/*
		 * Student st = new Student(); st.setId(3); st.setName("Rahul");
		 * st.setAddress("Puranpur");
		 * 
		 * 
		 * int i = dao.insert(st); System.out.println("insert successfully" +i);
		 */
		
		/* update details */
		/*
		 * Student st = new Student(); st.setId(3); st.setName("Rahul up");
		 * st.setAddress("Puranpur up");
		 * 
		 * 
		 * int i = dao.updateDetails(st); System.out.println("update successfully" +i);
		 */

		
		/* delete data */
		/*
		 * int i = dao.delete(3); System.out.println("delete successfully" +i);
		 */
	
		 Student st = dao.getStudentById(1); 
		 System.out.println(st);
		
		
		/*
		 * List<Student> list=dao.getAllStudent();
		 * 
		 * for(Student st: list) { System.out.println(st); }
		 */
		
	}
}
