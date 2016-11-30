package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CourseMapper implements RowMapper<Course>{

	   public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
	         Course course = new Course();
	         course.setYear(rs.getInt("year"));
	         course.setSemester(rs.getInt("semester"));
	         course.setCode(rs.getString("code"));
	         course.setSubject(rs.getString("subject"));
	         course.setDivision(rs.getString("division"));
	         course.setMarks(rs.getInt("marks"));
	         return course;
	   }

	}