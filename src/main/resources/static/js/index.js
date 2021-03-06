$(document).ready(function () {
    if ($.cookie('token')) {
        $.ajaxSetup({
            headers:{
                'Authorization': $.cookie('token')
            }
        })
    } else {
        window.location.href = '/user/loginView';
    }

    $.ajax({
        type: "POST",
        url: `/user/userinfo`,
        contentType: "application/json",
        success: function (response) {
            const username = response.username;

            if (!username) {
                window.location.href = '/user/loginView';
            }

            $('#username').text(username);

        },
        error: function() {
            window.location.href = '/user/loginView';
        }
    })
})