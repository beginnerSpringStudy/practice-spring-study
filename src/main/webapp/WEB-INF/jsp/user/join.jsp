<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<h1>회원가입</h1>
<form name="form" method="post">
    <div class="col-md-6 col-md-offset-3">
        <table class="table table-bordered">
            <tr>
                <th>name</th>
                <td><input type="text" name="username"/></td>
            </tr>
            <tr>
                <th>password</th>
                <td><input type="password" name="password"/></td>
            </tr>
        </table>
        <div style="text-align: right;">
            <button class="btn" onclick="join()">회원가입</button>
        </div>
    </div>
</form>

<script type="text/javascript">
  function join() {
    var form = $("form");
    var name = $("[name='username']").val();
    var password = $("[name='password']").val();
    // false , 0 , null, "",
    // if(name) == false
    if (name == "" || password == "") {
      alert('name / password 를 확인해주세요.');
      event.preventDefault();
      return;
    }
    form.attr("action", "/join/action.do");
    form.submit();
  }
</script>