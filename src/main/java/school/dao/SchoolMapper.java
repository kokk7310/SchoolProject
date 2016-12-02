package school.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import school.model.School;

public class SchoolMapper implements RowMapper<School>{

	@Override
	public School mapRow(ResultSet rs, int rowNum) throws SQLException {
		School school=new School();
		int year=Integer.parseInt(rs.getString("year"));
		int semester=Integer.parseInt(rs.getString("semester"));
		int score=Integer.parseInt(rs.getString("score"));
		
		school.setYear(year);
		school.setSemester(semester);						
		school.setScore(score);	
		
		return school;
	}

}
