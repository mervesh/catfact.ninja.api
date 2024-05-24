package pojoDatas;

public class GetFactResponse{
	private String fact;
	private Integer length;

	public void setFact(String fact){
		this.fact = fact;
	}

	public String getFact(){
		return fact;
	}

	public void setLength(Integer length){
		this.length = length;
	}

	public Integer getLength(){
		return length;
	}

	@Override
 	public String toString(){
		return 
			"GetFactResponse{" + 
			"fact = '" + fact + '\'' + 
			",length = '" + length + '\'' + 
			"}";
		}
}
