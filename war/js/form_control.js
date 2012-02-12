(function() {
    jQuery.fn.extend({
        insert_at_caret: function(v) {
            var o = this.get(0);
            o.focus();
            if ($.browser.msie) {
                var r = document.selection.createRange();
                r.text = v;
                r.select();
            } else {
                var s = o.value;
                var p = o.selectionStart || s.length;
                var np = p + v.length;
                o.value = s.substr(0, p) + v + s.substr(p);
                o.setSelectionRange(np, np);
            }
        },
        confirm_and_post : function (cfg) {
            var msg = cfg && cfg.msg && cfg.msg.confirm || 'よろしいですか?';
            if(confirm(msg)){
                this.post_data(cfg);               
            }
        },
        post_data : function (cfg) {
            var data = (typeof cfg.data == 'object')
                ? $.param(cfg.data) : cfg.data;
            
            if (this.is('form')) {
                if (data != '') {
                    data += '&'
                };
                data += this.serialize();
            }
            if (data == ''){
                return this;
            }

            var loading_msg = cfg.loading || '処理中です';
            var cancel = cfg.onCancel || undefined;
            
            Util.progress.on(loading_msg, cancel);

            if (!cfg.api){
                cfg.api = './save';
            }
            if (!cfg.msg) {
                cfg.msg = {};
            }
            if (data.indexOf('rkey') < 0) {
                data += '&rkey='+rkey;
            }
            
            jQuery.ajax({
                type: "POST",
                url: cfg.api,
                data: data,
                cache: false,
                dataType: "json",
                success: function (json) {
                    Util.progress.off();
                    if (json.status == 'success'){
                        if (cfg.do_alert) {
                            alert(cfg.msg.success || '完了しました。');
                        }
                        if ($.isFunction(cfg.onSuccess)){
                            cfg.onSuccess(json);                
                        }
                    } else {
                        if(cfg.do_alert){
                            alert(cfg.msg.error || '処理に失敗しました。');
                        }
                        if ($.isFunction(cfg.onFailed)){
                            cfg.onFailed(json);
                        }
                    }
                },
                error: function (xhr, textStatus, errorThrown) {
                    Util.progress.off();
                    if (cfg.do_alert) {
                        alert('接続がタイムアウトしました');
                    }
                }
            });
            return this;
        },
        
        reset : function () {
            return this.each(function () {
                $(this).is('form') && this.reset();
            });
        },
        
        post_simple : function (cfg) {
            var data = (typeof cfg.data == 'object') ? $.param(cfg.data) : cfg.data;
            if (this.is('form')) {
                if (data != '')
                    data += '&';
                data += this.serialize();
            }
            if (data == '') {
                return;
            }
            if (data.indexOf('rkey') < 0) {
                data += '&rkey='+rkey;
            }
            jQuery.post( cfg.api,
                         data,
                         function (json) {
                             Util.progress();
                             if (typeof cfg.onSuccess == 'function')
                                 cfg.onSuccess(json);
                         }
                       );
            return this;
        }
    });
})();
