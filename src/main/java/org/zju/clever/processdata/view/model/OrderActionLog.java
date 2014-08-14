package org.zju.clever.processdata.view.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERS_ACTION_LOG")
public class OrderActionLog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5950617393124297565L;

	@Id
	@GeneratedValue
	@Column(name = "ACTION_ID")
	private Integer actionId;

	@Column(name = "ORDER_ID")
	private Integer orderId;

	@Column(name = "ACTOR_NAME")
	private String actorName;

	@Column(name = "ACTOR_CODE")
	private String actorCode;

	@Column(name = "ACTION_DATE_TIME")
	private Calendar actionDateTime;

	@Column(name = "ACTION_TYPE")
	private String actionType;

	@Column(name = "ACTION_TEXT")
	private String actionText;

	public Integer getActionId() {
		return actionId;
	}

	public void setActionId(Integer actionId) {
		this.actionId = actionId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getActorCode() {
		return actorCode;
	}

	public void setActorCode(String actorCode) {
		this.actorCode = actorCode;
	}

	public Calendar getActionDateTime() {
		return actionDateTime;
	}

	public void setActionDateTime(Calendar actionDateTime) {
		this.actionDateTime = actionDateTime;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getActionText() {
		return actionText;
	}

	public void setActionText(String actionText) {
		this.actionText = actionText;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof OrderActionLog) {
			return ((OrderActionLog) obj).getActionId() == this.actionId;
		}
		return false;
	}
}
