package jpmc;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class PollResponse {
	String source;
	
	@JsonProperty("isValid")
	boolean isValid;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@JsonProperty("isValid")
	public boolean isValid() {
		return isValid;
	}

	@JsonProperty("isValid")
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}


}
