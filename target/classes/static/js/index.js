$("body").ready(function (){
    getContent();
    getTags();
    getContentCount();
})
//页面加载查询文章内容
function getContent(){
    $.get({
        url:"/getContent",
        dataType:"json",
        success:function (obj){
            if(obj.data != null){
                for(let blog of obj.data){
                    $(".contentHead").append("<div class=\"item\" id=\""+ blog.id +"\">"+
                        "                <div class=\"image\">" +
                        "                  <img src=\""+ blog.firstPicture+"\">" +
                        "                </div>" +
                        "                <div class=\"content\">" +
                        "                  <a class=\"header\" _msthash=\"2525653\" _msttexthash=\"23287511\">"+blog.title+"</a>" +
                        "                  <div class=\"meta\">" +
                        "                    <span class=\"cinema\" _msthash=\"2683395\" _msttexthash=\"38616838\">"+blog.content+"</span>" +
                        "                  </div>" +
                        "                  <div class=\"description\">" +
                        "                    <p></p>" +
                        "                  </div>" +
                        "                  <div class=\"extra\">" +
                        "                    <div class=\"ui label\" _msthash=\"3168555\" _msttexthash=\"6402227\">"+blog.tagName+"</div>" +
                        "                  </div>" +
                        "                </div>" +
                        "              </div>")
                }
            }else{
               $(".contentHead").append(" <div class=\"item\">" +
                    "                <div class=\"image\">" +
                    "                  <img src=\"\">" +
                    "                </div>" +
                    "                <div class=\"content\">" +
                    "                  <a class=\"header\" _msthash=\"2525653\" _msttexthash=\"23287511\">没有文章</a>" +
                    "                  <div class=\"meta\">" +
                    "                    <span class=\"cinema\" _msthash=\"2683395\" _msttexthash=\"38616838\">没有文章,请联系管理员1712656868@qq.com</span>" +
                    "                  </div>" +
                    "                  <div class=\"description\">" +
                    "                    <p></p>" +
                    "                  </div>" +
                    "                  <div class=\"extra\">" +
                    "                    <div class=\"ui label\" _msthash=\"3168555\" _msttexthash=\"6402227\"></div>" +
                    "                  </div>" +
                    "                </div>" +
                    "              </div>")
            }

        },
        error:function (){
            $(".contentHead").append(" <div class=\"item\">" +
                "                <div class=\"image\">" +
                "                  <img src=\"\">" +
                "                </div>" +
                "                <div class=\"content\">" +
                "                  <a class=\"header\" _msthash=\"2525653\" _msttexthash=\"23287511\">没有文章</a>" +
                "                  <div class=\"meta\">" +
                "                    <span class=\"cinema\" _msthash=\"2683395\" _msttexthash=\"38616838\">没有文章,请联系管理员1712656868@qq.com</span>" +
                "                  </div>" +
                "                  <div class=\"description\">" +
                "                    <p></p>" +
                "                  </div>" +
                "                  <div class=\"extra\">" +
                "                    <div class=\"ui label\" _msthash=\"3168555\" _msttexthash=\"6402227\"></div>" +
                "                  </div>" +
                "                </div>" +
                "              </div>")
        }
    })
}
//获取首页标签
function getTags(){
    $.get({
        url: "/getTags",
        dataType: "json",
        success:function (obj){
            if(obj.data != null){
                for (let blog of obj.data){
                    $(".index-tags").append(" <a target=\"_blank\" class=\"ui teal basic left pointing label m-margin-tb-tiny\">\n" +
                        "                <span ></span> <div class=\"detail\">"+blog+"</div>\n" +
                        "              </a>")
                }
            }
        },
        error:function (){
            $(".tags").append(" <a target=\"_blank\" class=\"ui teal basic left pointing label m-margin-tb-tiny\">\n" +
                "                <span ></span> <div class=\"detail\">系统异常,请联系管理员</div>\n" +
                "              </a>")
        }
    })
}
// 获取文章篇数
function getContentCount(){
    $.get({
        url:"/getContentCount",
        dataType:"json",
        success:function (obj){
            if (obj != 0){
                $(".content-count").text(obj);
            }
        }
    })
}

