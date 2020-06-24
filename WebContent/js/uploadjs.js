/**
 * 
 */
$(document).ready(function () {

	// bài trung làm, mới sửa ở đây
    $('#username1').change(function (event) {
    	
        //stop submit the form, we will post it manually.
        event.preventDefault();

        // Get form
        var form = $('#signupForm1')[0];

		// Create an FormData object 
        var data = new FormData(form);

        
		// If you want to add an extra field for the FormData
        //data.append("CustomField", "This is some extra data, testing");

		// disabled the submit button
        $("#taosp").prop("disabled", true);

        $.ajax({
            type: "post",
            enctype: 'multipart/form-data',
            url: "/Project_Burger/upload",
            data: data,
            processData: false,
            contentType: false,
            cache: false,
            timeout: 1000,
            success: function (data) {

                //$("#result").text(data);               
                var fileName = event.target.files[0].name;               
                $("#img").attr("src", "/Project_Burger/img/burger/" + fileName); //
             $("#username1").attr("value", fileName);
                console.log("SUCCESS : ", data);
                $("#taosp").prop("disabled", false);
                //form.reset(); 
            },
            error: function (e) {

                $("#result").text(e.responseText);
                console.log("ERROR : ", e);
                $("#taosp").prop("disabled", false);

            }
        });

    });

});