function postMemo() {
    let username = $('#username').val();
    console.log(username)
    let title = $('#title').val();
    let content = $('#content').val();
    let data = {'username': username , 'title': title, 'content': content};

    if (username == "" || title == "") {
        alert('제목과 닉네임은 비워둘 수 없습니다.');
    }else if (content == "") {
        alert('내용을 비워둘 수 없습니다.');
    } else {
        $.ajax({
            type: "POST",
            url: "/fanmemo",
            contentType: "application/json", // JSON 형식으로 전달함을 알리기
            data: JSON.stringify(data),
            success: function (response) {
                alert('게시물 등록!');
                window.location.href = "/";
            }

        });
    }

}