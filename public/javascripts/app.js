$(document).ready(function() {


    $('#a').click(function(e) {
      signinCall();
    });
    $('#b').click(function(e) {
      signupCall();
    });
});

var signinCall = function() {
    var ajaxCallBack = {
        success : function(data) {$('#data').html(data);},
        error : function(error) {alert(error);}
    }

    jsRoutes.controllers.AjaxController.signin().ajax(ajaxCallBack);
};

var signupCall = function() {
    var ajaxCallBack = {
        success : function(data) {$('#data').html(data);},
        error : function(error) {alert(error);}
    }

    jsRoutes.controllers.AjaxController.signup().ajax(ajaxCallBack);
};