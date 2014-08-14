package org.zju.clever.processdata.view.model;

import java.util.Calendar;

public interface Action {
	public Integer getSerialNo();
	public Calendar getActionDateTime();
	public String getActorName();
}
