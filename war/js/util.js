//global
var Util = Util || {};

var escapeHTML = function(str){
    return $('<div/>').text(str).html();
};

// クライアント判別
(function (){
    Util.is_iphone = function(){
        //iPhone or iPod Touch or iPad
        return window.navigator.userAgent.match(/(iphone|ipod|ipad)/i);
    };
    Util.is_android = function(){
        return window.navigator.userAgent.match(/android/i);
    };
})();

//文字列処理
(function(){
    Util.strcut = function(str, length, fill){
        var s = String(str);
        var f = (typeof fill == 'string') ? fill : '...';
        if (s.length > length) {
            return s.slice(0, length) + f;
        } else {
            return s;
        }
    }
})();



// オーバーレイ用レイヤー(z-index:1000で出る。)
(function() {
    var layer = null;
    Util.overlay = {
        //クリック時のキャンセル操作をコールバックとして渡せる
        //undefinedではない明示的な偽値を渡した場合、
        //タップしてもキャンセルせず、レイヤーを閉じない。
        on: function(callback) {
		    layer = $('<div/>');
            layer.css({
		        backgroundColor : 'white',
				opacity : 0.5,
				position : 'absolute',
				top : 0,
				left : 0,
				width : '100%',
                height : $(document).height(),
				zIndex : 1000,
            });

            if(callback || typeof callback == 'undefined'){
                layer.click(function(e) {
                    if($.isFunction(callback)){
                        callback();
                    }
                    Util.overlay.off();
                    return false;
                });
            }
		    
            $('body').append(layer);
	    },
        off: function( evt ) {
            if(layer){
		        layer.remove();
                layer = null;
            }
	    },
    };    
})();

//処理中表示(偽プログレスバー)
(function(){
    var fg = null;
    Util.progress = {
        //cancel_callbackに関数を渡すとキャンセルボタンが出る。
        //この関数の返値が真であれば、キャンセルをし、プログレスバー表示を解除する。
        on: function (msg, cancel_callback) {
            
            msg = '<p class="spLoading"><img src="http://parts.blog.livedoor.jp/img/lite2/loading.gif" width="24" height="24"><br>' + msg + '</p>';
            
            var fg_style = {
                position :  'fixed',
                width:      ($(window).width()/3) + 'px',
                height:     'auto',
                top:        '50%',
                left:       '50%',
                marginLeft: '-' + ($(window).width()/6) + 'px',
                zIndex:     1001,
                display:    'none',
                textAlign:  'center',
            };
            
            fg = $('<div/>').html(msg).css(fg_style).appendTo("body");
            fg.find('p').css('padding','20px')
                .find('img').css('margin-bottom', '10px');
            
            if ($.isFunction(cancel_callback)) {
                fg.append('<form><input type="button" value="キャンセル"/></form>');
                fg.find('input:button').click(function(){
                    if(cancel_callback()){
                            Util.progress.off();
                    }
                });                
            }
            Util.overlay.on(false);
            fg.css({
                marginTop:  '-' + fg.height()/2 + 'px',
                marginLeft: '-' + fg.width()/2 + 'px'
            }).show();
        },
        off : function(){
            if(fg) {
                fg.remove();
                fg = null;
            }
            Util.overlay.off();
            return;
        }
    };
})();
    

