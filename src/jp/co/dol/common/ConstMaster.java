package jp.co.dol.common;

public class ConstMaster {
    
    public static final String SESSION_ID = "jp-co-dol-failure";
    
    // �A�N�Z�X������HostIP
//    public static final String[] AllowHost = {"61.123.243.9","127.0.0.1","192.168.6.*"};
    public static final String[] AllowHost = {"*."};
    
    // �Ώۃu���E�U
    // ���́A�\���ہA�f�[�^�̔z�u�ӏ�(�ύX�s��)
    // �\�����͈ʒu��ς��đΉ�
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
    
    // �Ή���(supportKbn)
    public static final String[][] SupportKbn = {{"",""}
        ,{"1","��"}
        ,{"5","��"}
        ,{"9","�~"}
        };
    
    // �D��x(priorityLv)
    public static final String[][] PriorityLv = {{"",""}
        ,{"1","�x"}
        ,{"5","��"}
        ,{"9","�}"}
        };
    
    // �d�v�x(importantLv)
    public static final String[][] ImportantLv = {{"",""}
        ,{"1","��"}
        ,{"5","��"}
        ,{"9","��"}
        };
    
    // ��Q�����敪(troubleCauseKbn)
    public static final String[][] TroubleCauseKbn = {{"",""}
        ,{"1","�v���ʂ�"}
        ,{"2","���ݒ�"}
        ,{"3","�f�[�^�s��"}
        ,{"4","�e�X�g�s��"}
        ,{"5","�V�X�e��"}
        ,{"6","�Č�����"}
        ,{"7","���̑�"}
        };
    
    // �f�[�^��؂蕶��
    public static final String SEPARATE = "�b";
}
