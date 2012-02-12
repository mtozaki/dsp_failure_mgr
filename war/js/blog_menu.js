$(function(){
    var g = $('#blogMenuList');
    var b = $('#blogMenuButton');
    var c = $('#container');
    var c3 = $('#container3');
    
    var backButton = $('#contentsHeader .headerBack a');
    var headerTitle = $('#contentsHeader .headerTitle');
    var orgTitle = headerTitle.text();
    
    b.click(function(){
        if(!b.hasClass('close')) {
            //メニュー表示
            backButton.hide();
            headerTitle.text('メニュー');
            //c.slideUp('slow');
            //g.slideDown('slow');
            c.hide();
			c3.hide();
            g.show();
            b.addClass('close');
        } else {
            //メニュー閉じる
            //g.slideUp('slow');
            //c.slideDown('slow');
            g.hide();
            c.show();
            c3.show();
            headerTitle.text(orgTitle);
            backButton.show();
            b.removeClass('close');
        }
    });
});
$(function(){
    var blogSelect = $('#blogSelect');

    blogSelect.change(function(){
        var cmsUrl = blogSelect.val();
        location.href= cmsUrl;
    });
});
$(function(){
    var g = $('#container2');
    var b = $('#blogMenu');
    var c = $('#container');
	var d = $('#detailFailure');
    
    var backButton = $('#contentsHeader .headerBack a');
    var headerTitle = $('#contentsHeader .headerTitle');
    var orgTitle = headerTitle.text();
    
    d.click(function(){
        if(!d.hasClass('close')) {
            //メニュー表示
            backButton.hide();
			b.hide();
            headerTitle.text('障害詳細登録');
            //c.slideUp('slow');
            //g.slideDown('slow');
            c.hide();
            g.show();
            d.addClass('close');
			d.val('閉じる');
        } else {
            //メニュー閉じる
            //g.slideUp('slow');
            //c.slideDown('slow');
            g.hide();
            c.show();
            headerTitle.text(orgTitle);
            backButton.show();
            b.show();
            d.removeClass('close');
			d.val('詳細');
        }
    });
});
