<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
	<head>
		<title>CLEVER系统 - 过程数据</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link type="text/css" rel="stylesheet" href="http://misc.360buyimg.com/lib/skin/2013/base.css">
	</head>
	<body myjd="_MYJD_ordercenter">
		<div class="w">
			<div class="breadcrumb">
				<strong><a href="http://home.jd.com/">过程数据</a></strong><span>&nbsp;&gt;&nbsp;<a href="http://jd2008.jd.com/JdHome/OrderList.aspx">检查</a>&nbsp;&gt;&nbsp;检查申请单号：ER4567<span></span></span>
			</div>
			<!--变量-->
			<span id="pay-button-order" style="display:none"></span>
			<!--状态、提示-->
			<div class="m" id="orderstate">
				<div class="mt">
					<strong>检查申请单号：1638734402&nbsp;&nbsp;&nbsp;&nbsp;状态：<span class="ftx14">检查完成</span><span id="pay-button-1638734402"></span> </strong>
				</div>
			</div>

			<div id="hbdd" class="Tip360" style="width: 600px;">
				<div class="Tip_Title">
					<em><img src="http://www.360buy.com/images/tip_close.jpg" class="Tip_Close" width="14" height="13"></em>
					合并订单
				</div>
				<div class="Tip_Content">
					<div id="combin_main"></div>
					<div class="align_Left" style="padding: 15px 0 5px;">
						请选择要合并到主订单的订单：
					</div>
					<div id="combin_item"></div>
					<div class="Tip_Submit" style="background: none; border: 0; padding: 20px 250px 20px 0;">
						<a id="combinBtn" href="javascript:alert('请选择要合并的订单！');"><span>合并订单</span></a>
					</div>
					<div class="align_Left">
						<font color="#FF6600">提示</font>：订单合并后，收货人信息、支付方式、配送方式等都将以主订单为准。
					</div>
				</div>
			</div>

			<div id="ddyq" class="Tip360" style="width: 360px;">
				<div class="Tip_Title">
					<em> <img src="http://www.360buy.com/images/tip_close.jpg" class="Tip_Close" id="defercloseBtn" width="14" height="13"> </em>订单延期
				</div>
				<div class="Tip_Content">
					<div class="align_Left" style="padding: 5px 0 5px;">
						订单自提时间将延长至： <span id="defer_item"></span>
					</div>
					<div class="align_Left" style="padding: 5px 0 5px;">
						注：超过自提日期，您的订单商品将退库
					</div>
				</div>
			</div>

			<!--进度条-->

			<div id="process" class="section4">
				<c:forEach var="action" items="${actions}" varStatus="index">
					<div class="node ready" style="height: 100px;">
						<ul>
							<li class="tx1">
								&nbsp;
							</li>
							<li class="tx2">
								${action.actionName}
							</li>
							<li id="track_time_4" class="tx3">
								<fmt:formatDate pattern="yyyy-MM-dd" value="${action.actionDateTime.time}"/>
								<br>
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
			</div>

			<br />
			<!--跟踪、付款信息、gis-->
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
									</td><td>${action.actionName}</td><td>${action.actorName}</td>
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
					<!-- 节能补贴信息 -->

					<!--顾客信息-->
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
					<!-- 礼品购订单展示送礼人信息 -->

					<!--配送、支付方式-->
					<dl>
						<dt>
							数据信息
						</dt>
						<dd>
							<ul>

								<li>
									数据类别：电子检查
								</li>

								<li>
									数据索引：ER45355
								</li>
							</ul>
						</dd>
					</dl>
					<!-- 礼品购订单展示寄语信息 -->

					<!--备注-->

				</div>

				<link type="text/css" rel="stylesheet" href="http://misc.360buyimg.com/jd2008/201010/skin/orderdetail2012.css">
			</div>
		</div>
	</body>
</html>