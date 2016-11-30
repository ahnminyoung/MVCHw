package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.Course;
import kr.ac.hansung.dao.CourseDAO;

@Service("courseService")
public class CourseService {
   private CourseDAO courseDAO;

   @Autowired
   public void setCourseDAO(CourseDAO courseDAO) {
      this.courseDAO = courseDAO;
   }
   
   public List<Course> getSemesterList() {
      return courseDAO.getYearSemesterSum();
   }
  
   public int getSummarks(){
	   return courseDAO.getSummarks();
   }
   public List<Course> getDivisionList() {
	      return courseDAO.getSumdivision();
	   }
   public List<Course> getDetails(int year, int semester) {
	      return courseDAO.getDetails(year, semester);
	   }
}