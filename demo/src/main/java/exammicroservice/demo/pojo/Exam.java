package exammicroservice.demo.pojo;

public class Exam 
{
	private Integer minMarks;
	private Integer maxMarks;
	
	public Exam() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Exam(Integer minMarks, Integer maxMarks) {
		super();
		this.minMarks = minMarks;
		this.maxMarks = maxMarks;
	}

	public Integer getMinMarks() {
		return minMarks;
	}

	public void setMinMarks(Integer minMarks) {
		this.minMarks = minMarks;
	}

	public Integer getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(Integer maxMarks) {
		this.maxMarks = maxMarks;
	}

	@Override
	public String toString() {
		return "Exam [minMarks=" + minMarks + ", maxMarks=" + maxMarks + "]";
	}
		
}
