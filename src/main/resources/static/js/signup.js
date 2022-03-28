
function checkAll() {
    let form = document.form;
    if (!checkUsername(form.username.value)) {
        return false;
    } else if (!checkPassword(form.username.value, form.password.value, form.verifyPssword.value)) {
        return false;
    } else if (!checkEmail(form.email.value)) {
        return false;
    }
    return true;
}

// 공백함수 확인
function checkExistData(value, dataName) {
    if (value === '') {
        alert(dataName + " 입력해주세요.");
        return false;
    }
    return true;
}

// 사용자명 확인
function checkUsername(username) {
    let form = document.form;
    if (!checkExistData(username, "아이디를")) {
        return false;
    }
    if (!/^[a-zA-Z0-9]{3,}$/.test(username)) {
        alert('숫자와 영문자 조합으로 최소 3자리 이상이어야합니다.');
        form.username.value = '';
        form.username.focus();
        return false;
    }
    return true;
}

//비밀번호 확인
function checkPassword(username, password, verifyPssword) {
    let form = document.form;
    if (!checkExistData(password, "비밀번호를")) {
        return false;
    }

    if (!/^[a-zA-Z0-9]{4,}$/.test(password)) {
        alert('숫자와 영문자 조합으로 최소 4자리 이상이어야합니다.');
        form.password.value = '';
        form.password.focus();
        return false;
    }

    if (password.search(username) > -1) {
        alert("비밀번호에 아이디가 포함되었습니다.");
        form.password.value = '';
        form.password.focus();
        return false;
    }

    if (password != verifyPssword) {
        alert('비밀번호가 일치하지 않습니다.')
        form.password.value = '';
        form.verifyPssword.value = '';
        form.password.focus();
        return false;
    }
    return true;
}

// 이메일 확인
function checkEmail(email) {
    let form = document.form;
    if (!checkExistData(email, "이메일을")) {
        return false;
    }

    if (!/^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/.test(email)) {
        alert('이메일 형식이 올바르지 않습니다.')
        form.email.value = '';
        form.email.focus();
        return false;
    }
    return true;
}