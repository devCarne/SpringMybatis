function inputCheck(){
        if ($("#writer").val().length === 0) {
            alert("작성자를 입력하세요");
            $("#writer").focus();
            return false;
        } else if ($("#title").val().length === 0) {
            alert("제목을 입력하세요");
            $("#title").focus();
            return false;
        } else if ($("#content").val().length === 0) {
            alert("내용을 입력하세요");
            $("#content").focus();
            return false;
        }
}
