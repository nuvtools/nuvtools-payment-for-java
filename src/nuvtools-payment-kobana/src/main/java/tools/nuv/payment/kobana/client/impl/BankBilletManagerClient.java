package tools.nuv.payment.kobana.client.impl;

import tools.nuv.payment.kobana.client.dto.BankBillet;
import tools.nuv.payment.kobana.client.dto.BankBilletWrapper;
import tools.nuv.payment.kobana.client.exception.BankBilletException;
import org.springframework.http.*;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class BankBilletManagerClient {

	private static final String PRODUCTION_URL = "https://api.kobana.com.br/v1/";
	private static final String SANDBOX_URL = "https://api-sandbox.kobana.com.br/v1/";

	private RestTemplate template;

	private String url;

	private HttpHeaders headers;

	/**
	 * Initialize the client manager.
	 * 
	 * @param productionEnvironment Indicate which environment should it use. Production or sandbox.
	 * @param token Authencation token
	 * @param username Username
	 */
	public BankBilletManagerClient(boolean productionEnvironment, String token, String username) {
		super();
		if (productionEnvironment) {
			this.url = PRODUCTION_URL;
		} else {
			this.url = SANDBOX_URL;
		}

		template = new RestTemplate();

		template.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		template.getInterceptors().add(new BasicAuthorizationInterceptor(token, ""));

		headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.set("User-Agent", username);
	}

	/**
	 * Creates a bank billet
	 * 
	 * @param bankBillet Bank billet information to be created.
	 */
	public BankBillet create(BankBillet bankBillet) {
		try {
			BankBilletWrapper requisicao = new BankBilletWrapper(bankBillet);

			ResponseEntity<BankBillet> wrapper = template.postForEntity(url + "bank_billets", new HttpEntity<BankBilletWrapper>(requisicao, headers),
					BankBillet.class);

			return wrapper.getBody();

		} catch (HttpStatusCodeException e) {
			if (HttpStatus.BAD_REQUEST == e.getStatusCode() || HttpStatus.UNPROCESSABLE_ENTITY == e.getStatusCode()) {
				throw new BankBilletException(e.getStatusCode() + " - " + e.getResponseBodyAsString());

			} else {
				throw e;
			}
		}
	}

	public void cancel(Long id) {
		template.put(url + "bank_billets/" + id + "/cancel", new HttpEntity<BankBilletWrapper>(null, headers));
	}

	/**
	 * Gets the bank billet by Id
	 * 
	 * @param id The bank billet Id
	 */
	public BankBillet getById(Long id) {
		ResponseEntity<BankBillet> wrapper = template.exchange(url + "bank_billets/" + id, HttpMethod.GET, new HttpEntity<Object>(headers), BankBillet.class);

		return wrapper.getBody();
	}
}