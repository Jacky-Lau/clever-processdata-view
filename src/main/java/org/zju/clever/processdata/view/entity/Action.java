package org.zju.clever.processdata.view.entity;

import java.util.Calendar;

public class Action {

	private Integer actionId;
	private String actorName;
	private String actionType;
	private Calendar actionDateTime;

	public Integer getActionId() {
		return actionId;
	}

	public void setActionId(Integer actionId) {
		this.actionId = actionId;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public Calendar getActionDateTime() {
		return actionDateTime;
	}

	public void setActionDateTime(Calendar actionDateTime) {
		this.actionDateTime = actionDateTime;
	}

}
