package school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import school.model.School;
import school.service.SchoolService;
@Controller
public class SchoolController {	
	
	private SchoolService schoolService;
	
	@Autowired
	public void setSchoolService(SchoolService schoolService){
		this.schoolService=schoolService;
	}  
	@RequestMapping("/home") 
	public String goHome(Model model){
		
		return "home";
	}
	@RequestMapping("/scoreCheck")  //학기별 이수 학점 조회
	public String getScoreCheck(Model model){
		
		List<School> schoolTotalScore=schoolService.getTotalScore();		
		model.addAttribute("schools",schoolTotalScore);
		
		return "scoreCheck";
	}
	
	@RequestMapping(value="/subjectList", method=RequestMethod.GET)//교과목 리스트
	public String getSubjectList(Model model,School school){
		
		List<School> schoolSubjectList=schoolService.getSubjectList_service(school);
		model.addAttribute("schoolSubjectList",schoolSubjectList);
		return "subjectList";
	}
	@RequestMapping("/perPartition")  //이수 구분별 학점 조회
	public String getPerPartitionScore(Model model){
		List<School> schoolPerPartitionScore=schoolService.getPerPartitionScore_service();
		int totalScore=0;
		for(School school:schoolPerPartitionScore){
			totalScore+=school.getScore();
		}
		model.addAttribute("schools",schoolPerPartitionScore);
		model.addAttribute("totalScore",totalScore);
		return "perPartition";
	}
	@RequestMapping("/applySubjectHome")  //수강 신청 홈으로 
	public String applySubjectHome(Model model){
		
		return "applySubject";
	}
	@RequestMapping("/applySubject")  //수강 신청
	public String applySubject(Model model,School school){
		schoolService.setApplySubject_service(school);
		return "successApply";
	}
	@RequestMapping("/checkAppliedSubject")  //수강신청한 과목 조회
	public String checkAppliedSubjectList(Model model){
		List<School> schoolAppliedSubjectList=schoolService.getApplySubjectList_service();
		
		model.addAttribute("schoolAppliedSubjectList",schoolAppliedSubjectList);
		return "appliedSubjects";
	}
}
