$(document).ready(function(){

$('#signin').on("click",function(){

console.log("clicked")
jsRoutes.controllers.LoginController.processForm($('#username').val()).ajax({
success: function(data){
//alert("sign success")
$('#data').html(data);

},
error: function(){
$('#data').html("hello");
alert("fail")
}

})


})

});