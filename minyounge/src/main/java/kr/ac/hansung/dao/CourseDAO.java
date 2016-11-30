package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("CourseDAO")
public class CourseDAO {
	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public int getRow() {
		String sqlStatement = "select count(*) from takingcourse";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);

	}
	public List<Course> getYearSemesterSum(){
		String sqlStatement= "select year, semester, sum(marks) from takingcourse group by year, semester";
		return jdbcTemplateObject.query(sqlStatement, new RowMapper<Course>() {
	         public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
	            Course course = new Course();
	            course.setYear(rs.getInt("year"));
	            course.setSemester(rs.getInt("semester"));
	            course.setMarks(rs.getInt("sum(marks)"));
	            return course;
	         }
	      });
	}
	public int getSummarks(){
		String sqlStatement= "select sum(marks) from takingcourse";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}

	public List<Course> getSumdivision(){
		String sqlStatement= "select division, sum(marks) from takingcourse group by division";
		return jdbcTemplateObject.query(sqlStatement, new RowMapper<Course>() {
	         public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
	            Course course = new Course();

	            course.setDivision(rs.getString("division"));
	            course.setMarks(rs.getInt("sum(marks)"));
	            return course;
	         }
	      });
	}
	public List<Course> getDetails(int year, int semester){
		String sqlStatement= "select * from takingcourse where year=? and semester=?";
			return  jdbcTemplateObject.query(sqlStatement, new Object[]{year, semester}, new CourseMapper());
	}
}
