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
@Table(name = "EMR_FIRST_PAGE_ACTION_LOG")
@DynamicUpdate(true)
public class EMRFirstPageActionLog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -93820314035664389L;

	@Id
	@GeneratedValue
	@Column(name = "ACTION_ID")
	private Integer actionId;

	@Column(name = "EMR_FIRST_PAGE_ID")
	private Integer emrFirstPageId;

	@Column(name = "ACTION_NAME")
	private String actionName;

	@Column(name = "ACTION_CODE")
	private String actionCode;

	@Column(name = "ACTION_DATE_TIME")
	private Calendar actionDateTime;

	@Column(name = "ACTION_IP")
	private String actionIP;

	@Column(name = "ACTION_TYPE")
	private Integer actionType;

	@Column(name = "EMR_HISTORY_ID")
	private Integer emrHistoryId;

	public Integer getActionId() {
		return actionId;
	}

	public void setActionId(Integer actionId) {
		this.actionId = actionId;
	}

	public Integer getEmrFirstPageId() {
		return emrFirstPageId;
	}

	public void setEmrFirstPageId(Integer emrFirstPageId) {
		this.emrFirstPageId = emrFirstPageId;
	}

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public String getActionCode() {
		return actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public Calendar getActionDateTime() {
		return actionDateTime;
	}

	public void setActionDateTime(Calendar actionDateTime) {
		this.actionDateTime = actionDateTime;
	}

	public String getActionIP() {
		return actionIP;
	}

	public void setActionIP(String actionIP) {
		this.actionIP = actionIP;
	}

	public Integer getActionType() {
		return actionType;
	}

	public void setActionType(Integer actionType) {
		this.actionType = actionType;
	}

	public Integer getEmrHistoryId() {
		return emrHistoryId;
	}

	public void setEmrHistoryId(Integer emrHistoryId) {
		this.emrHistoryId = emrHistoryId;
	}	
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof EMRFirstPageActionLog) {
			return ((EMRFirstPageActionLog) obj).getActionId() == this.actionId;
		}
		return false;
	}
}
