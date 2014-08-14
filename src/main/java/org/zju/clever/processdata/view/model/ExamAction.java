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
@Table(name="EXAM_ACTION")
@DynamicUpdate(true)
public class ExamAction implements Serializable, Action {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4100655346797390427L;

	@Id
	@GeneratedValue
	@Column(name = "SERIAL_NO")
	private Integer serialNo;
	
	@Column(name = "EXAM_REQ_ID")
	private String examReqId;
	
	@Column(name = "EXAM_ID")
	private String examId;
	
	@Column(name = "ACTOR_ID")
	private String actorId;
	
	@Column(name = "ACTION_DATE_TIME")
	private Calendar actionDateTime;
	
	@Column(name = "ACTION_TYPE_ID")
	private String actionTypeId;	
	
	@Column(name = "ACTION_MEMO")
	private String actionMemo;
	
	@Column(name = "ACTOR_NAME")
	private String actorName;

	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	public String getExamReqId() {
		return examReqId;
	}

	public void setExamReqId(String examReqId) {
		this.examReqId = examReqId;
	}

	public String getExamId() {
		return examId;
	}

	public void setExamId(String examId) {
		this.examId = examId;
	}

	public String getActorId() {
		return actorId;
	}

	public void setActorId(String actorId) {
		this.actorId = actorId;
	}

	public Calendar getActionDateTime() {
		return actionDateTime;
	}

	public void setActionDateTime(Calendar actionDateTime) {
		this.actionDateTime = actionDateTime;
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
		if (obj instanceof ExamAction) {
			return ((ExamAction) obj).getSerialNo() == this.serialNo;
		}
		return false;
	}
}
