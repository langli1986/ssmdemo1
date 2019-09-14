var user = {
    query: function () {

        utils.req({},"json","get","/user/query",function (data) {
            if (data.status == 200) {
                $("#template1").tmpl(data.data).appendTo("#tbodyList");
            }
            else {
                alert("系统异常，请稍后再试");
            }
        })
    },

    del: function (id) {

        utils.req({id: id},"json","get","/user/delete",function (data) {
            if (data.status == 200) {
                window.location.href = "index.html";
            }
            else {
                alert("系统异常，请稍后再试");
            }
        })
    },

    toupdatepage: function (id) {
        window.location.href = "userupdate.html?id=" + id;
    }
}

var utils = {
    req: function (data, dataType, type, url, callback) {


        $.ajax({
            data: data,
            dataType: dataType,
            type: type,
            url: url,
            success: callback
        });


    }
}