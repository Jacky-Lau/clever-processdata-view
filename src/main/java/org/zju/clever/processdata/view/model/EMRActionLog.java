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
@Table(name = "EMR_ACTION_LOG")
@DynamicUpdate(true)
public class EMRActionLog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6466599467867066968L;

	@Id
	@GeneratedValue
	@Column(name = "ACTION_ID")
	private Integer actionId;

	@Column(name = "EMR_DOCUMENT_ID")
	private Integer emrDocumentId;

	@Column(name = "ACTION_TYPE")
	private Integer actionType;

	@Column(name = "EMR_HISTROY_ID")
	private Integer emrHistroyId;

	@Column(name = "ACTOR_NAME")
	private String actorName;

	@Column(name = "ACTOR_CODE")
	private String actionCode;

	@Column(name = "ACTION_DATE_TIME")
	private Calendar actionDateTime;

	@Column(name = "ACTION_IP")
	private String actionIp;

	public String getActionIp() {
		return actionIp;
	}

	public void setActionIp(String actionIp) {
		this.actionIp = actionIp;
	}

	public Calendar getActionDateTime() {
		return actionDateTime;
	}

	public void setActionDateTime(Calendar actionDateTime) {
		this.actionDateTime = actionDateTime;
	}

	public String getActionCode() {
		return actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public Integer getEmrHistroyId() {
		return emrHistroyId;
	}

	public void setEmrHistroyId(Integer emrHistroyId) {
		this.emrHistroyId = emrHistroyId;
	}

	public Integer getActionType() {
		return actionType;
	}

	public void setActionType(Integer actionType) {
		this.actionType = actionType;
	}

	public Integer getEmrDocumentId() {
		return emrDocumentId;
	}

	public void setEmrDocumentId(Integer emrDocumentId) {
		this.emrDocumentId = emrDocumentId;
	}

	public Integer getActionId() {
		return actionId;
	}

	public void setActionId(Integer actionId) {
		this.actionId = actionId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof EMRActionLog) {
			return ((EMRActionLog) obj).getActionId() == this.actionId;
		}
		return false;
	}
}
