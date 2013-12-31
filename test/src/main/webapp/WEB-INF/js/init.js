$(function() {
	$("input[type=text]").val("请输入");
	$("input[type=text]").focus(function() {
		if ($(this).val() == "请输入") {
			$(this).val("");
		}
	});
	$("input[type=text]").blur(function() {
		if ($(this).val() == "") {
			$(this).val("请输入");
		}
	});
	$("input").css("color", "grey");
	$("input").css("font-size", "16px");
});
