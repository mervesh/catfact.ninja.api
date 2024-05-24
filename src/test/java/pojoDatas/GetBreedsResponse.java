package pojoDatas;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetBreedsResponse{
	private List<GetBreedsResponseItem> getBreedsResponse;

	public void setGetBreedsResponse(List<GetBreedsResponseItem> getBreedsResponse){
		this.getBreedsResponse = getBreedsResponse;
	}

	public List<GetBreedsResponseItem> getGetBreedsResponse(){
		return getBreedsResponse;
	}

	@Override
 	public String toString(){
		return 
			"GetBreedsResponse{" + 
			"getBreedsResponse = '" + getBreedsResponse + '\'' + 
			"}";
		}

	public class GetBreedsResponseItem{
		private String country;
		private String coat;
		private String origin;
		private String pattern;
		private String breed;

		public void setCountry(String country){
			this.country = country;
		}

		public String getCountry(){
			return country;
		}

		public void setCoat(String coat){
			this.coat = coat;
		}

		public String getCoat(){
			return coat;
		}

		public void setOrigin(String origin){
			this.origin = origin;
		}

		public String getOrigin(){
			return origin;
		}

		public void setPattern(String pattern){
			this.pattern = pattern;
		}

		public String getPattern(){
			return pattern;
		}

		public void setBreed(String breed){
			this.breed = breed;
		}

		public String getBreed(){
			return breed;
		}

		@Override
		public String toString(){
			return
					"GetBreedsResponseItem{" +
							"country = '" + country + '\'' +
							",coat = '" + coat + '\'' +
							",origin = '" + origin + '\'' +
							",pattern = '" + pattern + '\'' +
							",breed = '" + breed + '\'' +
							"}";
		}
	}
}