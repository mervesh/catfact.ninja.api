package pojoDatas;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetFactsResponse{
	private List<GetFactsResponseItem> getFactsResponse;

	public void setGetFactsResponse(List<GetFactsResponseItem> getFactsResponse){
		this.getFactsResponse = getFactsResponse;
	}

	public List<GetFactsResponseItem> getGetFactsResponse(){
		return getFactsResponse;
	}

	@Override
 	public String toString(){
		return 
			"GetFactsResponse{" + 
			"getFactsResponse = '" + getFactsResponse + '\'' + 
			"}";
		}

	public class GetFactsResponseItem{
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
					"GetFactsResponseItem{" +
							"fact = '" + fact + '\'' +
							",length = '" + length + '\'' +
							"}";
		}
	}
}