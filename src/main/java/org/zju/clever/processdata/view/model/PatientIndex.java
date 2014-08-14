package org.zju.clever.processdata.view.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "MASTER_PATIENT_INDEX")
@DynamicUpdate(true)
public class PatientIndex implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3290772576640645981L;
	@Id
	@GeneratedValue
	@Column(name = "SERIAL_NO")
	private Integer serialNo;
	@Column(name = "PATIENT_ID")
	private String patientId;
	@Column(name = "NAME")
	private String name;
	@Column(name = "NAME_PHONETIC")
	private String namePhonetic;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "DATE_OF_BIRTH")
	private Calendar dateOfBirth;
	@Column(name = "NATIONALITY")
	private String nationality;
	@Column(name = "ETHNIC_GROUP")
	private String ethnicGroup;
	@Column(name = "MARITAL_STATUS")
	private String maritalStatus;
	@Column(name = "CAREER")
	private String career;
	@Column(name = "DEGREE")
	private String degree;
	@Column(name = "BLOOD_TYPE_ABO")
	private String bloodTypeABO;
	@Column(name = "BLOOD_TYPE_RH")
	private String bloodTypeRH;
	@Column(name = "IDENTITY_CARD_NO")
	private String identityCardNo;
	@Column(name = "HOUSEHOLD_NO")
	private String houseHoldNo;
	@Column(name = "PASSPORT_NO")
	private String passportNo;
	@Column(name = "MILITARY_ID")
	private String militaryId;
	@Column(name = "HEALTH_INSURANCE_ID")
	private String healthInsuranceId;
	@Column(name = "HEALTH_CARD_NO")
	private String healthCardNo;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "MAILING_ADDRESS")
	private String mailingAddress;
	@Column(name = "ZIP_CODE")
	private String zipCode;
	@Column(name = "PHONE_NO_MOBILE")
	private String phoneNoMobile;
	@Column(name = "PHONE_NO_HOME")
	private String phoneNoHome;
	@Column(name = "PHONE_NO_BUSINESS")
	private String phoneNoBusines;
	@Column(name = "DEATH_INDICATOR")
	private String deathIndicator;
	@Column(name = "DEATH_TIME")
	private Calendar deathTime;
	@Column(name = "CREATED_DATE")
	private Calendar createdDate;
	@Column(name = "CREATED_BY")
	private String createBy;
	@Column(name = "LAST_MODIFY_DATE")
	private Calendar lastModifyDate;
	@Column(name = "LAST_MODIFIED_BY")
	private String lastModifyBy;
	@Column(name = "VOIDED_INDICATOR")
	private String voidedIndicator;
	@Column(name = "VOIDED_DATE")
	private Calendar voidedDate;
	@Column(name = "VOIDED_BY")
	private String voidedBy;
	@Column(name = "REF_PATIENT_ID")
	private String refPatientId;
	@Column(name = "INPATIENTNO")
	private String inpatientNo;
	@Column(name = "OUTPATIENTNO")
	private String outPaitnetNo;
	@Column(name = "EMERGENCYNO")
	private String emergencyNo;
	@Column(name = "PATIENT_HEALTHCARE_TYPE_CODE")
	private String patientHealthcareTypeCode;
	@Column(name = "PATIENT_HEALTHCARE_TYPE_NAME")
	private String patientHealthcareTypeName;
	@Column(name = "PATIENT_HEALTHCARE_PROPERTY_CODE")
	private String patientPropertyCode;
	@Column(name = "PATIENT_HEALTHCARE_PROPERTY_NAME")
	private String patientPropertyNmae;

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNamePhonetic() {
		return namePhonetic;
	}

	public void setNamePhonetic(String namePhonetic) {
		this.namePhonetic = namePhonetic;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getEthnicGroup() {
		return ethnicGroup;
	}

	public void setEthnicGroup(String ethnicGroup) {
		this.ethnicGroup = ethnicGroup;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getBloodTypeABO() {
		return bloodTypeABO;
	}

	public void setBloodTypeABO(String bloodTypeABO) {
		this.bloodTypeABO = bloodTypeABO;
	}

	public String getBloodTypeRH() {
		return bloodTypeRH;
	}

	public void setBloodTypeRH(String bloodTypeRH) {
		this.bloodTypeRH = bloodTypeRH;
	}

	public String getIdentityCardNo() {
		return identityCardNo;
	}

	public void setIdentityCardNo(String identityCardNo) {
		this.identityCardNo = identityCardNo;
	}

	public String getHouseHoldNo() {
		return houseHoldNo;
	}

	public void setHouseHoldNo(String houseHoldNo) {
		this.houseHoldNo = houseHoldNo;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getMilitaryId() {
		return militaryId;
	}

	public void setMilitaryId(String militaryId) {
		this.militaryId = militaryId;
	}

	public String getHealthInsuranceId() {
		return healthInsuranceId;
	}

	public void setHealthInsuranceId(String healthInsuranceId) {
		this.healthInsuranceId = healthInsuranceId;
	}

	public String getHealthCardNo() {
		return healthCardNo;
	}

	public void setHealthCardNo(String healthCardNo) {
		this.healthCardNo = healthCardNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public String getDeathIndicator() {
		return deathIndicator;
	}

	public void setDeathIndicator(String deathIndicator) {
		this.deathIndicator = deathIndicator;
	}

	public Calendar getDeathTime() {
		return deathTime;
	}

	public void setDeathTime(Calendar deathTime) {
		this.deathTime = deathTime;
	}

	public Calendar getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Calendar createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Calendar getLastModifyDate() {
		return lastModifyDate;
	}

	public void setLastModifyDate(Calendar lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}

	public String getLastModifyBy() {
		return lastModifyBy;
	}

	public void setLastModifyBy(String lastModifyBy) {
		this.lastModifyBy = lastModifyBy;
	}

	public String getInpatientNo() {
		return inpatientNo;
	}

	public void setInpatientNo(String inpatientNo) {
		this.inpatientNo = inpatientNo;
	}

	public String getOutPaitnetNo() {
		return outPaitnetNo;
	}

	public void setOutPaitnetNo(String outPaitnetNo) {
		this.outPaitnetNo = outPaitnetNo;
	}

	public String getEmergencyNo() {
		return emergencyNo;
	}

	public void setEmergencyNo(String emergencyNo) {
		this.emergencyNo = emergencyNo;
	}

	public String getPatientHealthcareTypeCode() {
		return patientHealthcareTypeCode;
	}

	public void setPatientHealthcareTypeCode(String patientHealthcareTypeCode) {
		this.patientHealthcareTypeCode = patientHealthcareTypeCode;
	}

	public String getPatientHealthcareTypeName() {
		return patientHealthcareTypeName;
	}

	public void setPatientHealthcareTypeName(String patientHealthcareTypeName) {
		this.patientHealthcareTypeName = patientHealthcareTypeName;
	}

	public String getPatientPropertyCode() {
		return patientPropertyCode;
	}

	public void setPatientPropertyCode(String patientPropertyCode) {
		this.patientPropertyCode = patientPropertyCode;
	}

	public String getPatientPropertyNmae() {
		return patientPropertyNmae;
	}

	public void setPatientPropertyNmae(String patientPropertyNmae) {
		this.patientPropertyNmae = patientPropertyNmae;
	}

	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhoneNoMobile() {
		return phoneNoMobile;
	}

	public void setPhoneNoMobile(String phoneNoMobile) {
		this.phoneNoMobile = phoneNoMobile;
	}

	public String getPhoneNoHome() {
		return phoneNoHome;
	}

	public void setPhoneNoHome(String phoneNoHome) {
		this.phoneNoHome = phoneNoHome;
	}

	public String getPhoneNoBusines() {
		return phoneNoBusines;
	}

	public void setPhoneNoBusines(String phoneNoBusines) {
		this.phoneNoBusines = phoneNoBusines;
	}

	public String getVoidedIndicator() {
		return voidedIndicator;
	}

	public void setVoidedIndicator(String voidedIndicator) {
		this.voidedIndicator = voidedIndicator;
	}

	public Calendar getVoidedDate() {
		return voidedDate;
	}

	public void setVoidedDate(Calendar voidedDate) {
		this.voidedDate = voidedDate;
	}

	public String getVoidedBy() {
		return voidedBy;
	}

	public void setVoidedBy(String voidedBy) {
		this.voidedBy = voidedBy;
	}

	public String getRefPatientId() {
		return refPatientId;
	}

	public void setRefPatientId(String refPatientId) {
		this.refPatientId = refPatientId;
	}
}
