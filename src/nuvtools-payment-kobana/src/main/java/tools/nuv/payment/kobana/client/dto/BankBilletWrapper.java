package tools.nuv.payment.kobana.client.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BankBilletWrapper {

	@JsonProperty("bank_billet")
	private BankBillet bankBillet;

	public BankBilletWrapper(BankBillet bankBillet) {
		this.bankBillet = bankBillet;
	}

	public BankBillet getBankBillet() {
		return bankBillet;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}