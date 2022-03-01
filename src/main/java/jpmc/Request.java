package jpmc;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Request {
	String accountNumber;
	List<String> sources;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public List<String> getSources() {
		return sources;
	}

	public void setSources(List<String> sources) {
		this.sources = sources;
	}

}
