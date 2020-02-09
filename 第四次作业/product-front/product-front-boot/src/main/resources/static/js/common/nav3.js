var isLogin=false;

$(function () {
    var v_navHtml = "<nav class=\"navbar navbar-inverse\">\n" +
        "    <div class=\"container-fluid\">\n" +
        "        <!-- Brand and toggle get grouped for better mobile display -->\n" +
        "        <div class=\"navbar-header\">\n" +
        "           <ul> <li><a class=\"navbar-brand\" href='/'>飞狐电商前台666</a></li></ul>\n" +
        "        </div>\n" +
        "\n" +
        "        <!-- Collect the nav links, forms, and other content for toggling -->\n" +
        "        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">" +
        "            <ul class=\"nav navbar-nav navbar-right\" id='nav_ul'>" +
        "                <li id=\"loginInfo\"><a href=\"/view2/login.html\">登录</a></li>" +
        "                <li><a href=\"/view2/reg.html\">注册</a></li>" +
        "                <li><a href=\"/view2/cart.html\">购物车</a></li>" +
        "            </ul>\n" +
        "        </div><!-- /.navbar-collapse -->\n" +
        "    </div><!-- /.container-fluid -->\n" +
        "</nav>";

    $("#navDiv").html(v_navHtml);

    /*$.ajaxSetup({
        beforeSend: function(xhr) {
            var token = window.localStorage.getItem("token");
            console.log("token:"+token);
            xhr.setRequestHeader("x-auth", token);
        }
    })*/


    $.ajax({
        url:"http://localhost:8030/queryMemberById",
        async:false,
        success:function (result) {
            if (result.status == 200) {
                isLogin = true;
                $("#loginInfo").html("<a>欢迎"+result.data+"登录！！！</a><a href='#' onclick='logout();'>退出</a>")
            }
        }

    })


})


/*function buy(productId,count,flag) {
    $.post(
        "http://localhost:8082/carts/add",
        {"productId":productId,"count":count},
        function (data) {
            if(data.status==200){
                if(flag==1){
                    location.href="/view2/cart.html"
                }else {
                    initCart();
                }

            }else{
                alert(data.msg);
            }
        }
    )
}
function logout(){
    $.post(
        "http://localhost:8082/member/outLogin",
        function (result) {
            if (result.status == 200) {
                window.localStorage.setItem("token","");
                location.href = "index-1.html";
            }else {
                alert(result.msg);
            }
        }
    )


}*/





