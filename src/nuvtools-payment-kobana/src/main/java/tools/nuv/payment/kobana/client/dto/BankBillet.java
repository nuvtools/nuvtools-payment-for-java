package tools.nuv.payment.kobana.client.dto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BankBillet {

	public static final Integer TIPO_MULTA_INEXISTENTE = 0;
	public static final Integer TIPO_MULTA_PERCENTUAL = 1;
	public static final Integer TIPO_MULTA_VALOR = 2;

	public static final Integer TIPO_JUROS_INEXISTENTE = 0;
	public static final Integer TIPO_JUROS_PORCENTAGEM_DIARIA_DIA_CORRIDO = 1;
	public static final Integer TIPO_JUROS_VALOR_DIARIO_DIA_CORRIDO = 2;
	public static final Integer TIPO_JUROS_PORCENTAGEM_DIARIA_DIA_UTIL = 3;
	public static final Integer TIPO_JUROS_VALOR_DIARIO_DIA_UTIL = 4;
	public static final Integer TIPO_JUROS_PORCENTAGEM_MENSAL_DIA_CORRIDO = 5;
	public static final Integer TIPO_JUROS_PORCENTAGEM_MENSAL_DIA_UTIL = 6;

	public static final Integer TIPO_DESCONTO_INEXISTENTE = 0;
	public static final Integer TIPO_DESCONTO_VALOR = 1;
	public static final Integer TIPO_DESCONTO_PERCENTUAL = 0;

	@JsonProperty("bank_billet_account_id")
	private Integer bankBilletAccountId;

	@JsonProperty("our_number")
	private String ourNumber;

	@JsonProperty("amount")
	private BigDecimal amount;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@JsonProperty("expire_at")
	private Date expireAt;

	@JsonProperty("description")
	private String description;

	@JsonProperty("customer_person_name")
	private String customerPersonName;

	@JsonProperty("customer_cnpj_cpf")
	private String customerCnpjCpf;

	@JsonProperty("customer_zipcode")
	private String customerZipcode;

	@JsonProperty("customer_address")
	private String customerAddress;

	@JsonProperty("customer_city_name")
	private String customerCityName;

	@JsonProperty("customer_state")
	private String customerState;

	@JsonProperty("customer_neighborhood")
	private String customerNeighborhood;

	@JsonProperty("customer_address_number")
	private String customerAddressNumber;

	@JsonProperty("customer_address_complement")
	private String customerAddressComplement;

	@JsonProperty("instructions")
	private String instructions;

	// Multa
	@JsonProperty("fine_type")
	private Integer fineType;

	@JsonProperty("fine_percentage")
	private BigDecimal finePercentage;

	@JsonProperty("fine_value")
	private String fineValue;

	@JsonProperty("days_for_fine")
	private Integer daysForFine;

	// Juros
	@JsonProperty("interest_type")
	private Integer interestType;

	@JsonProperty("interest_daily_percentage")
	private BigDecimal interestDailyPercentage;

	@JsonProperty("interest_daily_value")
	private String interestDailyValue;

	@JsonProperty("interest_monthly_percentage")
	private BigDecimal interestMonthlyPercentage;

	@JsonProperty("days_for_interest")
	private Integer daysForInterest;

	// Desconto
	@JsonProperty("discount_type")
	private Integer discountType;

	@JsonProperty("discount_value")
	private String discountValue;

	@JsonProperty("discount_percentage")
	private BigDecimal discountPercentage;

	@JsonProperty("days_for_discount")
	private Integer daysForDiscount;

	// Valores apenas do retorno
	@JsonProperty("id")
	private Long id;

	@JsonProperty("paid_amount")
	private BigDecimal paidAmount;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@JsonProperty("paid_at")
	private Date paidAt;

	@JsonProperty("shorten_url")
	private String shortenUrl;

	@JsonProperty("status")
	private String status;

	public Integer getBankBilletAccountId() {
		return bankBilletAccountId;
	}

	/**
	 * Set the account ID. If not informed the default account ID will be used.
	 *
	 * @param bankBilletAccountId The account ID
	 */
	///
	public void setBankBilletAccountId(Integer bankBilletAccountId) {
		this.bankBilletAccountId = bankBilletAccountId;
	}

	public String getOurNumber() {
		return ourNumber;
	}

	/**
	 * If not informed the next our number from sequence will be used.
	 * 
	 * @param ourNumber Our number
	 */
	public void setOurNumber(String ourNumber) {
		this.ourNumber = ourNumber;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * Required
	 * 
	 * @param amount Bank billet amount
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getExpireAt() {
		return expireAt;
	}

	/**
	 * Required
	 * 
	 * @param expireAt Expiration date
	 */
	public void setExpireAt(Date expireAt) {
		this.expireAt = expireAt;
	}

	public String getDescription() {
		return description;
	}

	/**
	 * Required
	 * 
	 * @param description Description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public String getCustomerPersonName() {
		return customerPersonName;
	}

	/**
	 * Required
	 * 
	 * @param customerPersonName Customer name or the payer.
	 */
	public void setCustomerPersonName(String customerPersonName) {
		this.customerPersonName = customerPersonName;
	}

	public String getCustomerCnpjCpf() {
		return customerCnpjCpf;
	}

	/**
	 * Required
	 * 
	 * @param customerCnpjCpf Customer document with the mask.
	 */
	public void setCustomerCnpjCpf(String customerCnpjCpf) {
		this.customerCnpjCpf = customerCnpjCpf;
	}

	public String getCustomerZipcode() {
		return customerZipcode;
	}

	/**
	 * Required
	 * 
	 * @param customerZipcode Customer zip code address
	 */
	public void setCustomerZipcode(String customerZipcode) {
		this.customerZipcode = customerZipcode;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	/**
	 * Required
	 * 
	 * @param customerAddress Customer address
	 */
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerCityName() {
		return customerCityName;
	}

	/**
	 * Required
	 * 
	 * @param customerCityName Customer city address
	 */
	public void setCustomerCityName(String customerCityName) {
		this.customerCityName = customerCityName;
	}

	public String getCustomerState() {
		return customerState;
	}

	/**
	 * Required
	 * 
	 * @param customerState State (Initials) of customer address
	 */
	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}

	public String getCustomerNeighborhood() {
		return customerNeighborhood;
	}

	/**
	 * Required
	 * 
	 * @param customerNeighborhood Neighborhood of customer address
	 */
	public void setCustomerNeighborhood(String customerNeighborhood) {
		this.customerNeighborhood = customerNeighborhood;
	}

	public String getCustomerAddressNumber() {
		return customerAddressNumber;
	}

	/**
	 * Optional
	 * 
	 * @param customerAddressNumber Number of customer address
	 */
	public void setCustomerAddressNumber(String customerAddressNumber) {
		this.customerAddressNumber = customerAddressNumber;
	}

	public String getCustomerAddressComplement() {
		return customerAddressComplement;
	}

	/**
	 * Optional
	 * 
	 * @param customerAddressComplement Complement of customer address
	 */
	public void setCustomerAddressComplement(String customerAddressComplement) {
		this.customerAddressComplement = customerAddressComplement;
	}

	public String getInstructions() {
		return instructions;
	}

	/**
	 * Optional
	 * 
	 * @param instructions Payment instructions
	 */
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public Integer getFineType() {
		return fineType;
	}

	/**
	 * Optional
	 * 
	 * @param fineType Fine type
	 */
	public void setFineType(Integer fineType) {
		this.fineType = fineType;
	}

	public BigDecimal getFinePercentage() {
		return finePercentage;
	}

	/**
	 * Optional
	 * 
	 * @param finePercentage Fine percentage
	 */
	public void setFinePercentage(BigDecimal finePercentage) {
		this.finePercentage = finePercentage;
	}

	public String getFineValue() {
		return fineValue;
	}

	/**
	 * Optional
	 * 
	 * @param fineValue Fine value
	 */
	public void setFineValue(String fineValue) {
		this.fineValue = fineValue;
	}

	public Integer getDaysForFine() {
		return daysForFine;
	}

	/**
	 * Optional
	 * 
	 * @param daysForFine Days for fine after expiration.
	 */
	public void setDaysForFine(Integer daysForFine) {
		this.daysForFine = daysForFine;
	}

	public Integer getInterestType() {
		return interestType;
	}

	/**
	 * Optional
	 * 
	 * @param interestType Interest type
	 */
	public void setInterestType(Integer interestType) {
		this.interestType = interestType;
	}

	public BigDecimal getInterestDailyPercentage() {
		return interestDailyPercentage;
	}

	/**
	 * Optional
	 * 
	 */
	public void setInterestDailyPercentage(BigDecimal interestDailyPercentage) {
		this.interestDailyPercentage = interestDailyPercentage;
	}

	public String getInterestDailyValue() {
		return interestDailyValue;
	}

	/**
	 * Optional
	 *
	 */
	public void setInterestDailyValue(String interestDailyValue) {
		this.interestDailyValue = interestDailyValue;
	}

	public BigDecimal getInterestMonthlyPercentage() {
		return interestMonthlyPercentage;
	}

	/**
	 * Optional
	 *
	 */
	public void setInterestMonthlyPercentage(BigDecimal interestMonthlyPercentage) {
		this.interestMonthlyPercentage = interestMonthlyPercentage;
	}

	public Integer getDaysForInterest() {
		return daysForInterest;
	}

	/**
	 * Optional
	 *
	 */
	public void setDaysForInterest(Integer daysForInterest) {
		this.daysForInterest = daysForInterest;
	}

	public Integer getDiscountType() {
		return discountType;
	}

	/**
	 * Optional
	 *
	 */
	public void setDiscountType(Integer discountType) {
		this.discountType = discountType;
	}

	public String getDiscountValue() {
		return discountValue;
	}

	/**
	 * Optional
	 *
	 */
	public void setDiscountValue(String discountValue) {
		this.discountValue = discountValue;
	}

	public BigDecimal getDiscountPercentage() {
		return discountPercentage;
	}

	/**
	 * Optional
	 *
	 */
	public void setDiscountPercentage(BigDecimal discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public Integer getDaysForDiscount() {
		return daysForDiscount;
	}

	/**
	 * Optional
	 *
	 * @param daysForDiscount Days for discaunt
	 */
	public void setDaysForDiscount(Integer daysForDiscount) {
		this.daysForDiscount = daysForDiscount;
	}

	/**
	 * Bank billet ID
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the paid amount
	 */
	public BigDecimal getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(BigDecimal paidAmount) {
		this.paidAmount = paidAmount;
	}

	/**
	 * Gets the paid date
	 */
	public Date getPaidAt() {
		return paidAt;
	}

	/**
	 * This property is used just when you need to looking for a bank billet.
	 * 
	 * @param paidAt Paid date
	 */
	public void setPaidAt(Date paidAt) {
		this.paidAt = paidAt;
	}

	/**
	 * Gets the url used to show up the bank billet.
	 */
	public String getShortenUrl() {
		return shortenUrl;
	}

	public void setShortenUrl(String shortenUrl) {
		this.shortenUrl = shortenUrl;
	}

	/**
	 * 
	 * @return Bank billet status
	 */
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}