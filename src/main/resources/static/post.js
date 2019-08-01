$(document).ready(function() {
    // when the button is clicked the values entered are gathered and inserted
    // into the string that will be the url route.
    
	    $("#btnSubmit").click(function(){
        var m = $('#m').val();
        var url = 'http://localhost:8080/api/post/'+ m;

 //the get method takes the route and then has a function waiting
    //     for the response which will take the data and insert it into the
      //   HTML.
        $.get(url, function(data) {
             $('#results').text(data);
            });
       });
    });

