$(document).ready(function() {
    // when the button is clicked the values entered are gathered and inserted
    // into the string that will be the url route.
    $('button').click(function() {
        var x = $('#x').val() || 0;
        var y = $('#y').val() || 0;
        var url = 'api/post/Id/' + x + '/' + y;

// the get method takes the route and then has a function waiting
        // for the response which will take the data and insert it into the
        // HTML.
        $.get(url, function(data) {
            $('#result').text(data);
        });
    });
});