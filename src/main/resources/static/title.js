// title 부분 온도 표시
$(document).ready(function () {
    $.ajax({
        type: "GET",
        url: "http://spartacodingclub.shop/sparta_api/weather/seoul",
        data: {},
        success: function (response) {
            let temp = response['temp']

            $('#temp').text(temp)
        }

    })
});