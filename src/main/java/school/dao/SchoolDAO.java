package school.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import school.model.School;

@Repository
public class SchoolDAO {
private JdbcTemplate jdbcTemplateObject;
	
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplateObject=new JdbcTemplate(dataSource);
	}
//학기별 이수 학점 조회
	public List getTotalScore(){
		String sqlStatement="SELECT  year, semester,sum(score) 'score'FROM school GROUP BY year, semester";
		
		return jdbcTemplateObject.query(sqlStatement,
				new SchoolMapper());
	}
//과목 리스트
	public List getSubjectList_dao(School school){
		int year=school.getYear();
		int semester=school.getSemester();
		String sqlStatement="select subject,subjectcode from school where year=? and semester=?";
		
		return jdbcTemplateObject.query(sqlStatement, new Object[]{year,semester},
				new RowMapper<School>(){
					
					public School mapRow(ResultSet rs, int rowNum) throws SQLException {
						School school=new School();
						school.setSubject(rs.getString("subject"));						
						return school;
					}
			
		});
	}
//이수 구분별 학점 내역
		public List getPerPatitionScore_dao(){
			String sqlStatement="select a.partition 'partition', sum(a.score) 'score' from school a group by a.partition";
			
			return jdbcTemplateObject.query(sqlStatement,
					new RowMapper<School>(){

						
						public School mapRow(ResultSet rs, int rowNum) throws SQLException {
							School school=new School();
							int score=Integer.parseInt(rs.getString("score"));							
							school.setPartition(rs.getString("partition"));
							school.setScore(score);						
							
							return school;
						}
				
			});
		}
//수강 신청
		public Boolean setApplySubject_dao(School school){
			String sqlStatement ="INSERT INTO school (`year`,`semester`,`subject`,`subjectcode`,`partition`,`score`) VALUES(?,?,?,?,?,?)";
			
			int year=2017;
			int semester=1;
			int score=school.getScore();
			String subject=school.getSubject();
			String subjectcode=school.getSubjectCode();
			String partition=school.getPartition();
			return (jdbcTemplateObject.update(sqlStatement,new Object[] {year,semester,subject,subjectcode,partition,score})==1);
			
		}
//수강신청 내역
		public List getApplySubjectList_dao(){
			String sqlStatement="select * from school where year='2017'";
			
			return jdbcTemplateObject.query(sqlStatement,
					new RowMapper<School>(){

						
						public School mapRow(ResultSet rs, int rowNum) throws SQLException {
							School school=new School();
							int score=Integer.parseInt(rs.getString("score"));
							int year=Integer.parseInt(rs.getString("year"));
							int semester=Integer.parseInt(rs.getString("semester"));							
							
							school.setYear(year);
							school.setSemester(semester);
							school.setScore(score);	
							school.setSubject(rs.getString("subject"));													
							school.setSubjectCode(rs.getString("subjectcode"));							
							school.setPartition(rs.getString("partition"));												
							
							return school;
						}
				
			});
		}
	}
