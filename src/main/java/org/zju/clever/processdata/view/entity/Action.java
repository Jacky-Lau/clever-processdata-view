package org.zju.clever.processdata.view.entity;

import java.util.Calendar;

public class Action {

	private Integer actionId;
	private String actorName;
	private String actionName;
	private Calendar actionDateTime;

	public Integer getActionId() {
		return actionId;
	}

	public void setActionId(Integer actionId) {
		this.actionId = actionId;
	}

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
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
