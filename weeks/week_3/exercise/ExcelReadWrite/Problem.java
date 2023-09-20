package weeks.week_3.exercise.ExcelReadWrite;

public class Problem {

	//序号
	private String id;
	//题干
	private String stem;
	//选项A
	private String optionA;
	//选项B
	private String optionB;
	//选项C
	private String optionC;
	//选项D
	private String optionD;
	
	//答案
	private String answer;

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStem() {
		return stem;
	}

	public void setStem(String stem) {
		this.stem = stem;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public String getOptionD() {
		return optionD;
	}

	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Problem [id=" + id + ", stem=" + stem + ", optionA=" + optionA + ", optionB=" + optionB + ", optionC="
				+ optionC + ", optionD=" + optionD + ", answer=" + answer + "]";
	}

	public Problem(String id, String stem, String optionA, String optionB, String optionC, String optionD,
			String answer) {
		super();
		this.id = id;
		this.stem = stem;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.answer = answer;
	}

	public Problem() {
		super();
	}
	
	
	
}
