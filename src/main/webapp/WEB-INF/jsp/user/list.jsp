<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/el.jspf"%>

<h1>회원 목록</h1>
<form name="frm" class="form-inline text-right">
	<div class="form-group">
		<label class="sr-only" for="username">이름</label> 
		<input type="text" class="form-control" id="username" name="username" value="${param.username}" placeholder="이름을 입력하세요.">
	</div>
	<button id="search" class="btn btn-primary">검색</button>
	<button id="init" class="btn btn-default">초기화</button>
	<input type="hidden" name="p" value="${param.p }" />
</form>

<table class="table table-bordered">
	<thead>
		<tr>
			<th>이름</th>
			<th>비밀번호</th>
			<th>가입일</th>
		<tr>
	</thead>
	<c:forEach items="${listObj.list}" var="list">
		<tr onclick="getUser('${list.username}')" style="cursor: pointer;">
			<td>${list.username}</td>
			<td>${fn:substring(list.password,0,2)}**</td>
			<td>${list.joinDate}</td>
		</tr>
	</c:forEach>
</table>
<!--// 페이징과 버튼 부분 -->
<div class="paging_all c_box">
	<!--// 페이징 부분 -->
	<div class="paging">
		<ul>
			<ui:pagination paginationInfo="${listObj.paginationInfo}" type="text"
				jsFunction="getPageList" />
		</ul>
	</div>
	<!-- 페이징 부분 //-->
</div>
<!-- 페이징과 버튼 부분 //-->


<script type="text/javascript">
	function getUser(name) {
		location.href = "/user/" + name + ".do";
	}

	function getPageList(page) {
		var f = document.frm;
		f.action = "./list.do";
		f.p.value = page;
		f.submit();
	}

	$("#search").click(function() {
		getPageList(1);
	});

	$("#init").click(function() {
		$('#username').val('');
		
		getPageList(1);
	});
</script>