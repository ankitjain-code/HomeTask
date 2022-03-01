package jpmc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PollingService {

	@Autowired
	PropConfiguration propConfiguration;

	@Autowired
	Response response;

	public Response pay(Request webRequest) {
		Map<String, String> sourcesMap = extractPropMap();
		List<PollResponse> polList = pollDataSource(webRequest, sourcesMap);
		return createResponse(polList);
	}

	private Response createResponse(List<PollResponse> polList) {
		response.setResult(polList);
		return response;
	}

	private List<PollResponse> pollDataSource(Request webRequest, Map<String, String> sourcesMap) {
		int j = 0;
		List<PollResponse> polList = new ArrayList<PollResponse>();
		while (j < webRequest.getSources().size()) {
			// poll to data source url
			String accountNumber = webRequest.getAccountNumber();
			String source = webRequest.getSources().get(j);
			String url = sourcesMap.get(webRequest.getSources().get(j));
			boolean isValid = true;
			PollResponse pollResponse = new PollResponse();
			pollResponse.setSource(source);
			pollResponse.setValid(isValid);
			polList.add(pollResponse);
			j++;
		}
		return polList;
	}

	private Map<String, String> extractPropMap() {
		Map<String, String> sourcesMap = new HashMap<String, String>();
		int i = 0;
		while (i < propConfiguration.getName().size()) {
			sourcesMap.put(propConfiguration.getName().get(i), propConfiguration.getUrl().get(i));
			i++;
		}
		return sourcesMap;
	}

}
