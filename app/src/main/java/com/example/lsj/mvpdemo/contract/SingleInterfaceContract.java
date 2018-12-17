package com.example.lsj.mvpdemo.contract;

import com.example.lsj.mvpdemo.bean.ArticleListBean;
import com.example.lsj.mvpdemo.presenter.IPresenter;
import com.example.lsj.mvpdemo.view.IView;

public interface SingleInterfaceContract {


    interface View extends IView {
        void showArticleSuccess(ArticleListBean bean);

        void showArticleFail(String errorMsg);
    }

    interface Presenter<T extends IView> extends IPresenter<T>{
        void getData(int curPage);
    }


}
