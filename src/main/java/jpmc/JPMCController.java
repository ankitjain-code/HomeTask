package jpmc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JPMCController {

	@Autowired
	PollingService pollingService;

	@PostMapping("/pay/validate")
	public Response pay(@RequestBody Request webRequest) {
		return pollingService.pay(webRequest);
	}

}
