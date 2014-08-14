package org.zju.clever.processdata.view.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "ACTION_CLINIC_DICT")
@DynamicUpdate(true)
public class ActionClinicDict {
	@Id
	@GeneratedValue
	@Column(name = "SERIAL_NO")
	private Integer serialNo;
	@Column(name = "CODE_TYPE")
	private String codeType;
	@Column(name = "CODE")
	private Integer code;
	@Column(name = "NAME")
	private String name;

	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
