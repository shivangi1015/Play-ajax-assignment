if (window.console) {
  console.log("Welcome to your Play application's JavaScript!");
}

$(document).ready(function(){


         $('#btn1').on("click",function(){
         jsRoutes.controllers.signupController.signup().ajax({
                      success: function(data){
                        $('#data').html(data);
                      },
                      error: function(){
                      $('#data').html("error");
                      alert("fail")
                    }

          })



      })

      $('#btn').on("click",function(){
                jsRoutes.controllers.LoginController.login().ajax({
                            success: function(data){
                              $('#data').html(data);
                            },
                            error: function(){
                            $('#data').html("error");
                            alert("fail")
                          }

                })


            })



});
