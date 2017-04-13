package com.objectedge.wireless.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserRequest {
	private Boolean basicServiceable;
	private Boolean dvrServiceable;
	private Boolean hdtvServiceable;
	private Boolean internetEligible;
	private Boolean videoEligible;
	private Boolean vodServiceable;
	private Boolean voiceEligible;
	private Boolean address1;
	private Boolean address2;
	private Boolean city;
	private Boolean state;
	private String zip;
	private Boolean zip4;
	private Boolean bulkCustomer;
	private Boolean bulkMDUCustomer;
	private Boolean nonPayCustomer;
	private Boolean customerType;
	private Boolean delinquencyStatus;
	private Boolean sys;
	private Boolean prin;
	private Boolean agent;
	private Boolean houseStatus;
	private Boolean dwellingTypeCategory;
	private Boolean dwellType;
	private Boolean overbuilderIndicator;
	private Boolean locationStatus;
	private Boolean genericAccount;
	private Boolean houseRef;
	private Boolean miscCode;
	private Boolean rateCenter;
	private Boolean overbuilderIndicator2;
	private Boolean siteServiceabilityLevel;
	private Boolean lobServiceabilities;
	private Boolean accountNumbers;
	private String description;
	
	public UserRequest(){
		
	}

	public UserRequest(Boolean basicServiceable, Boolean dvrServiceable,
			Boolean hdtvServiceable, Boolean internetEligible,
			Boolean videoEligible, Boolean vodServiceable,
			Boolean voiceEligible, Boolean address1, Boolean address2,
			Boolean city, Boolean state, String zip, Boolean zip4,
			Boolean bulkCustomer, Boolean bulkMDUCustomer,
			Boolean nonPayCustomer, Boolean customerType,
			Boolean delinquencyStatus, Boolean sys, Boolean prin,
			Boolean agent, Boolean houseStatus, Boolean dwellingTypeCategory,
			Boolean dwellType, Boolean overbuilderIndicator,
			Boolean locationStatus, Boolean genericAccount, Boolean houseRef,
			Boolean miscCode, Boolean rateCenter,
			Boolean overbuilderIndicator2, Boolean siteServiceabilityLevel,
			Boolean lobServiceabilities, Boolean accountNumbers,
			String description) {
		super();
		this.basicServiceable = basicServiceable;
		this.dvrServiceable = dvrServiceable;
		this.hdtvServiceable = hdtvServiceable;
		this.internetEligible = internetEligible;
		this.videoEligible = videoEligible;
		this.vodServiceable = vodServiceable;
		this.voiceEligible = voiceEligible;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.zip4 = zip4;
		this.bulkCustomer = bulkCustomer;
		this.bulkMDUCustomer = bulkMDUCustomer;
		this.nonPayCustomer = nonPayCustomer;
		this.customerType = customerType;
		this.delinquencyStatus = delinquencyStatus;
		this.sys = sys;
		this.prin = prin;
		this.agent = agent;
		this.houseStatus = houseStatus;
		this.dwellingTypeCategory = dwellingTypeCategory;
		this.dwellType = dwellType;
		this.overbuilderIndicator = overbuilderIndicator;
		this.locationStatus = locationStatus;
		this.genericAccount = genericAccount;
		this.houseRef = houseRef;
		this.miscCode = miscCode;
		this.rateCenter = rateCenter;
		this.overbuilderIndicator2 = overbuilderIndicator2;
		this.siteServiceabilityLevel = siteServiceabilityLevel;
		this.lobServiceabilities = lobServiceabilities;
		this.accountNumbers = accountNumbers;
		this.description = description;
	}


	public Boolean getBasicServiceable() {
		return basicServiceable;
	}

	public void setBasicServiceable(Boolean basicServiceable) {
		this.basicServiceable = basicServiceable;
	}

	public Boolean getDvrServiceable() {
		return dvrServiceable;
	}

	public void setDvrServiceable(Boolean dvrServiceable) {
		this.dvrServiceable = dvrServiceable;
	}

	public Boolean getHdtvServiceable() {
		return hdtvServiceable;
	}

	public void setHdtvServiceable(Boolean hdtvServiceable) {
		this.hdtvServiceable = hdtvServiceable;
	}

	public Boolean getInternetEligible() {
		return internetEligible;
	}

	public void setInternetEligible(Boolean internetEligible) {
		this.internetEligible = internetEligible;
	}

	public Boolean getVideoEligible() {
		return videoEligible;
	}

	public void setVideoEligible(Boolean videoEligible) {
		this.videoEligible = videoEligible;
	}

	public Boolean getVodServiceable() {
		return vodServiceable;
	}

	public void setVodServiceable(Boolean vodServiceable) {
		this.vodServiceable = vodServiceable;
	}

	public Boolean getVoiceEligible() {
		return voiceEligible;
	}

	public void setVoiceEligible(Boolean voiceEligible) {
		this.voiceEligible = voiceEligible;
	}

	public Boolean getAddress1() {
		return address1;
	}

	public void setAddress1(Boolean address1) {
		this.address1 = address1;
	}

	public Boolean getAddress2() {
		return address2;
	}

	public void setAddress2(Boolean address2) {
		this.address2 = address2;
	}

	public Boolean getCity() {
		return city;
	}

	public void setCity(Boolean city) {
		this.city = city;
	}

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Boolean getZip4() {
		return zip4;
	}

	public void setZip4(Boolean zip4) {
		this.zip4 = zip4;
	}

	public Boolean getBulkCustomer() {
		return bulkCustomer;
	}

	public void setBulkCustomer(Boolean bulkCustomer) {
		this.bulkCustomer = bulkCustomer;
	}

	public Boolean getBulkMDUCustomer() {
		return bulkMDUCustomer;
	}

	public void setBulkMDUCustomer(Boolean bulkMDUCustomer) {
		this.bulkMDUCustomer = bulkMDUCustomer;
	}

	public Boolean getNonPayCustomer() {
		return nonPayCustomer;
	}

	public void setNonPayCustomer(Boolean nonPayCustomer) {
		this.nonPayCustomer = nonPayCustomer;
	}

	public Boolean getCustomerType() {
		return customerType;
	}

	public void setCustomerType(Boolean customerType) {
		this.customerType = customerType;
	}

	public Boolean getDelinquencyStatus() {
		return delinquencyStatus;
	}

	public void setDelinquencyStatus(Boolean delinquencyStatus) {
		this.delinquencyStatus = delinquencyStatus;
	}

	public Boolean getSys() {
		return sys;
	}

	public void setSys(Boolean sys) {
		this.sys = sys;
	}

	public Boolean getPrin() {
		return prin;
	}

	public void setPrin(Boolean prin) {
		this.prin = prin;
	}

	public Boolean getAgent() {
		return agent;
	}

	public void setAgent(Boolean agent) {
		this.agent = agent;
	}

	public Boolean getHouseStatus() {
		return houseStatus;
	}

	public void setHouseStatus(Boolean houseStatus) {
		this.houseStatus = houseStatus;
	}

	public Boolean getDwellingTypeCategory() {
		return dwellingTypeCategory;
	}

	public void setDwellingTypeCategory(Boolean dwellingTypeCategory) {
		this.dwellingTypeCategory = dwellingTypeCategory;
	}

	public Boolean getDwellType() {
		return dwellType;
	}

	public void setDwellType(Boolean dwellType) {
		this.dwellType = dwellType;
	}

	public Boolean getOverbuilderIndicator() {
		return overbuilderIndicator;
	}

	public void setOverbuilderIndicator(Boolean overbuilderIndicator) {
		this.overbuilderIndicator = overbuilderIndicator;
	}

	public Boolean getLocationStatus() {
		return locationStatus;
	}

	public void setLocationStatus(Boolean locationStatus) {
		this.locationStatus = locationStatus;
	}

	public Boolean getGenericAccount() {
		return genericAccount;
	}

	public void setGenericAccount(Boolean genericAccount) {
		this.genericAccount = genericAccount;
	}

	public Boolean getHouseRef() {
		return houseRef;
	}

	public void setHouseRef(Boolean houseRef) {
		this.houseRef = houseRef;
	}

	public Boolean getMiscCode() {
		return miscCode;
	}

	public void setMiscCode(Boolean miscCode) {
		this.miscCode = miscCode;
	}

	public Boolean getRateCenter() {
		return rateCenter;
	}

	public void setRateCenter(Boolean rateCenter) {
		this.rateCenter = rateCenter;
	}

	public Boolean getOverbuilderIndicator2() {
		return overbuilderIndicator2;
	}

	public void setOverbuilderIndicator2(Boolean overbuilderIndicator2) {
		this.overbuilderIndicator2 = overbuilderIndicator2;
	}

	public Boolean getSiteServiceabilityLevel() {
		return siteServiceabilityLevel;
	}

	public void setSiteServiceabilityLevel(Boolean siteServiceabilityLevel) {
		this.siteServiceabilityLevel = siteServiceabilityLevel;
	}

	public Boolean getLobServiceabilities() {
		return lobServiceabilities;
	}

	public void setLobServiceabilities(Boolean lobServiceabilities) {
		this.lobServiceabilities = lobServiceabilities;
	}

	public Boolean getAccountNumbers() {
		return accountNumbers;
	}

	public void setAccountNumbers(Boolean accountNumbers) {
		this.accountNumbers = accountNumbers;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
	
}
