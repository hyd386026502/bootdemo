$(function () {
    // $("#demo").datagrid({
    //     columns:[[
    //         {field:'itemid',checkbox:true}
    //     ]]
    // })
    var  a = {"nodeId":2};
   // a.push("nodeId",2);
    console.log(a);
    $("button").click(function(){
        $.ajax({
                url:"/main/nodeInfo",
                data:JSON.stringify(a),
                contentType: "application/json; charset=utf-8",
                type:"POST",
                datatype:"json",
                success:function(result){
                    console.log(result);
                 }
        });
    });
})
