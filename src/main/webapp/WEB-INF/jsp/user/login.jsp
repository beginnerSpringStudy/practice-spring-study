<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<h1>로그인</h1>
<div class="container">
    <form name="form" action="/login/action.do" method="post">
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
                <a class="btn btn-warning" href="/join.do">회원가입</a>
                <button class="btn btn-success" onclick="login()">로그인</button>
            </div>
        </div>
    </form>
</div>

<script type="text/javascript">
  function login() {
    var form = $("form");
    var name = $("[name='username']").val();
    var password = $("[name='password']").val();
    // false , 0 , null, "",
    // if(name) == false
    if (username == "" || password == "") {
      alert('name / password 를 확인해주세요.');
      event.preventDefault();
      return;
    }

    form.submit();
  }

  $(function () {
    var result = '${result}';
    if (result == 'parameter') {
      alert('name // password 를 확인해주세요.');
    }
    if (result == 'notFound') {
      alert('사용자 정보가 존재하지 않습니다.');
    }
  })
</script>