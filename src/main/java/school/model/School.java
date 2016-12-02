package school.model;

public class School {
	private int year;
	private int semester;
	private String subject="과목";
	private String subjectCode="코드";
	private String partition="구분";
	private int score;
	
	public School(){}
	public School(int year, int semester) {
		
		this.year = year;
		this.semester = semester;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getPartition() {
		return partition;
	}
	public void setPartition(String partition) {
		this.partition = partition;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "School [year=" + year + ", semester=" + semester + ", subject=" + subject + ", subjectCode="
				+ subjectCode + ", partition=" + partition + ", score=" + score + "]";
	}
	
	
	
	
}
