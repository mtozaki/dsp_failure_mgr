package jp.co.dol.controller.menu;

import jp.co.dol.controller.BaseController;

import org.slim3.controller.Navigation;

public class IndexController extends BaseController {

    @Override
    public Navigation run() throws Exception {
        return forward("index.jsp");
    }
}
