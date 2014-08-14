package org.zju.clever.processdata.view.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OPERATION_ACTION_LOG")
public class OperationActionLog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7517062028123932856L;

	@Id
	@GeneratedValue
	@Column(name = "SERIAL_NO")
	private Integer serialNo;

	private String operationReqId;

	private String operationId;

	private String actorId;

	private String actorName;

	private Calendar actionDateime;

	private String actionTypeId;

	private String actionMemo;
	
	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	public String getOperationReqId() {
		return operationReqId;
	}

	public void setOperationReqId(String operationReqId) {
		this.operationReqId = operationReqId;
	}

	public String getOperationId() {
		return operationId;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	public String getActorId() {
		return actorId;
	}

	public void setActorId(String actorId) {
		this.actorId = actorId;
	}

	public Calendar getActionDateime() {
		return actionDateime;
	}

	public void setActionDateime(Calendar actionDateime) {
		this.actionDateime = actionDateime;
	}

	public String getActionTypeId() {
		return actionTypeId;
	}

	public void setActionTypeId(String actionTypeId) {
		this.actionTypeId = actionTypeId;
	}

	public String getActionMemo() {
		return actionMemo;
	}

	public void setActionMemo(String actionMemo) {
		this.actionMemo = actionMemo;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}


	@Override
	public boolean equals(Object obj) {
		if (obj instanceof OperationActionLog) {
			return ((OperationActionLog) obj).getSerialNo() == this.serialNo;
		}
		return false;
	}
}
