$(document).ready(function(){

 $('#signUp').on("click",function(){
               // alert("clicked")
                jsRoutes.controllers.signupController.addPerson($('#username').val(),$('#fname').val(), $('#lname').val(),$('#email').val(),$('#password').val(),$('#gender').val(),$('#dob').val()).ajax({
                            success: function(data){
                           // alert("success")
                              $('#data').html(data);

                            },
                            error: function(){
                            $('#body').html("hello");
                            alert("fail")
                          }

                })


            })
$('#logout').on("click",function(){

                jsRoutes.controllers.HomeController.index().ajax({
                            success: function(data){
                              $('#data').html(data);

                            },
                            error: function(){
                            $('#body').html("hello");
                            alert("fail")
                          }

                })


            })

});