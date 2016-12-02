package school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import school.dao.SchoolDAO;
import school.model.School;
@Service
public class SchoolService {
	
	private SchoolDAO schoolDAO;
	
	@Autowired
	public void setOfferDAO(SchoolDAO schoolDAO){
		this.schoolDAO=schoolDAO;
	}
	
	public List<School> getTotalScore(){  //학년/학기별 이수 총 학점 조희
		return schoolDAO.getTotalScore();
	}
	public List<School> getPerPartitionScore_service(){
		return schoolDAO.getPerPatitionScore_dao();
	}
	public List<School> getSubjectList_service(School school){
		return schoolDAO.getSubjectList_dao(school);
	}
	public boolean setApplySubject_service(School school){
		return schoolDAO.setApplySubject_dao(school);
	}
	public List<School> getApplySubjectList_service(){
		return schoolDAO.getApplySubjectList_dao();
	}
}

