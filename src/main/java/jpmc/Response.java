package jpmc;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Response {
	List<PollResponse> result;

	public List<PollResponse> getResult() {
		return result;
	}

	public void setResult(List<PollResponse> result) {
		this.result = result;
	}

}
