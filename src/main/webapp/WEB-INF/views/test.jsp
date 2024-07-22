<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{
		margin: 0;
		padding: 0;
		box-sizing: border-box;
	}
	body{
		display: flex;
		justify-content: center;
		align-items: center;
		min-height: 100vh;
		background: #25252b;
	}
	@property --a{
		syntax: '<angle>';
		inherits: false;
		initial-value: 0deg;
	}
	.box{
	position: relative;
	width: 400px;
	height: 200px;
	background: repeating-conic-gradient(from var(--a), #ff2770 0%, #ff2770 5%, transparent 5%, transparent 40%, #ff2770 50%);
	filter: drop-shadow(0 15px 50px #000);
	border-radius: 20px;
	animation: rotating 4s linear infinite;
	display: flex;
	justify-content: center;
	align-items: center;
	}
	@keyframes rotating{
	0%{
		--a: 0deg;
	}
	100%{
		--a: 360deg;
	}
	}
</style>
</head>
<body>
	<div class="box">
		<div class="login">
			<div class="loginBx">
			
			</div>
		</div>
	</div>
</body>
</html>