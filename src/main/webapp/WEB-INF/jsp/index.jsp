<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
	<head>
		<title>CLEVER系统 - 过程数据</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link type="text/css" rel="stylesheet" href="/css/base.css">
			<link type="text/css" rel="stylesheet" href="/css/orderdetail2012.css">
	</head>
	<body>
		<div class="w">
			<div class="breadcrumb">
				<strong>过程数据</strong><span>&nbsp;&gt;&nbsp;${type}&nbsp;&gt;&nbsp;数据索引号：${dataIndex}<span></span></span>
			</div>
			<div class="m" id="orderstate">
				<div class="mt">
					<strong>${indexName}：${dataIndex}&nbsp;&nbsp;&nbsp;&nbsp;状态：<span class="ftx14">${finalState}</span><span id="pay-button-1638734402"></span> </strong>
				</div>
			</div>

			<div id="process" class="section4">
				<c:forEach var="action" items="${actions}" varStatus="index">
					<div class="node ready" style="height: 100px;">
						<ul>
							<li class="tx1">
								&nbsp;
							</li>
							<li class="tx2">
								${action.actionType}
							</li>
							<li id="track_time_4" class="tx3">
								<fmt:formatDate pattern="yyyy-MM-dd" value="${action.actionDateTime.time}"/>
								
								<fmt:formatDate pattern="HH:mm:ss" value="${action.actionDateTime.time}"/>
							</li>
						</ul>
					</div>
					<c:if test="${index.index != actions.size() - 1}">
						<div class="proce ready">
							<ul>
								<li class="tx1">
									&nbsp;
								</li>
							</ul>
						</div>
					</c:if>
				</c:forEach>
				<div style="clear:both"></div>
			</div>

			<div class="m" id="ordertrack">
				<ul class="tab">
					<li class="curr" clstag="click|keycount|orderinfo|ordertrack">
						<h2> 数据跟踪</h2>
					</li>
				</ul>
				<div class="clr"></div>
				<div class="mc tabcon">

					<table cellpadding="0" cellspacing="0" width="100%">
						<tbody id="tbody_track">
							<tr>
								<th width="15%"><strong>处理时间</strong></th>
								<th width="50%"><strong>处理信息</strong></th>
								<th width="35%"><strong>操作人</strong></th>
							</tr>

						</tbody>
						<tbody>
							<c:forEach var="action" items="${actions}">
								<tr>
									<td>
									<fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${action.actionDateTime.time}"/>
									</td><td>${action.actionType}</td><td>${action.actorName}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>

			</div>
			<!--留言-->
			<!--订单信息-->
			<div class="m" id="orderinfo">
				<div class="mt">
					<strong>相关信息</strong>
				</div>
				<div class="mc">
					<dl class="fore">
						<dt>
							病人信息
						</dt>
						<dd>
							<ul>
								<li>
									病人姓名：${patientIndex.name}
								</li>
								<li>
									性&nbsp;&nbsp;&nbsp;&nbsp;别：
									<c:if test="${patientIndex.gender == 'F'}">
										女
									</c:if>
									<c:if test="${patientIndex.gender == 'M'}">
										男
									</c:if>
								</li>
								<li>
									出生日期：
									<fmt:formatDate pattern="yyyy-MM" value="${patientIndex.dateOfBirth.time}"/>
								</li>
							</ul>
						</dd>
					</dl>
					<dl>
						<dt>
							数据信息
						</dt>
						<dd>
							<ul>

								<li>
									数据类别：${type}
								</li>

								<li>
									数据索引：${dataIndex}
								</li>
							</ul>
						</dd>
					</dl>
				</div>

			</div>
		</div>
	</body>
</html>