<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

	<div class="container">
		<form action="/login.do" method="post">
			<p>
				<font color="red">${errorMessage}</font>
			</p>
			<fieldset class="form-group">
				<label>Name</label>
				<input type="text" name="name" class="form-control" />
			</fieldset>
			<fieldset class="form-group">
				<label>Password</label>
				<input type="password" name="password" class="form-control" />
			</fieldset>  
			<input type="submit" value="Login" class="btn btn-success" />
		</form>
	</div>

<%@ include file="../common/footer.jspf"%>