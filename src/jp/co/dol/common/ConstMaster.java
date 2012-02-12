package jp.co.dol.common;

public class ConstMaster {
    
    public static final String SESSION_ID = "jp-co-dol-failure";
    
    // アクセス許可するHostIP
//    public static final String[] AllowHost = {"61.123.243.9","127.0.0.1","192.168.6.*"};
    public static final String[] AllowHost = {"*."};
    
    // 対象ブラウザ
    // 名称、表示可否、データの配置箇所(変更不可)
    // 表示順は位置を変えて対応
    public static final String[][] Browser = {{"Win-IE6","y","0"}
        ,{"Win-IE7","y","1"}
        ,{"Win-IE8","y","2"}
        ,{"Win-IE9","y","12"}
        ,{"Win-FF2","y","3"}
        ,{"Win-FF3","y","4"}
        ,{"Win-FF4","y","13"}
        ,{"Win-FF5","y","14"}
        ,{"Win-FF6","y","15"}
        ,{"Mac-FF2","y","5"}
        ,{"Mac-FF3","y","6"}
        ,{"Mac-Sa2","y","7"}
        ,{"Mac-Sa3","y","8"}
        ,{"Docomo","y","9"}
        ,{"AU","y","10"}
        ,{"SoftBank","y","11"}
        };
    
    // 対応可否(supportKbn)
    public static final String[][] SupportKbn = {{"",""}
        ,{"1","○"}
        ,{"5","△"}
        ,{"9","×"}
        };
    
    // 優先度(priorityLv)
    public static final String[][] PriorityLv = {{"",""}
        ,{"1","遅"}
        ,{"5","並"}
        ,{"9","急"}
        };
    
    // 重要度(importantLv)
    public static final String[][] ImportantLv = {{"",""}
        ,{"1","小"}
        ,{"5","中"}
        ,{"9","大"}
        };
    
    // 障害原因区分(troubleCauseKbn)
    public static final String[][] TroubleCauseKbn = {{"",""}
        ,{"1","要件通り"}
        ,{"2","環境設定"}
        ,{"3","データ不良"}
        ,{"4","テスト不良"}
        ,{"5","システム"}
        ,{"6","再現せず"}
        ,{"7","その他"}
        };
    
    // データ区切り文字
    public static final String SEPARATE = "｜";
}
