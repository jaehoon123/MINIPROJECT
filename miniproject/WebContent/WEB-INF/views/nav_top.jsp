<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="navbar navbar-default">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
				data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="<c:url value='/'/>"></a>
		</div>
		
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<c:if test="${not empty user }">
					<li><a href="#"><span class="badge" style="background-color: #7386d5;">${user.userId}</span></a></li>
				</c:if>
				<li class="${active=='login'?'active':'' }">
					<c:if test="${not empty user }">
						<a href="<c:url value='/logout'/>">Logout</a>
					</c:if>
					<c:if test="${empty user }">
						<a href="<c:url value='/login'/>">Login</a>
					</c:if>
				</li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid -->
</nav>
<script type="text/javascript">
	// 화면이 갱신되면 효과를 잃어 버린다.
	$('.nav li').click(function(e) {
		$('.nav li').removeClass('active');
		$(this).addClass('active');
	});
</script>