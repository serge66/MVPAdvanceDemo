package com.example.lsj.mvpdemo.base;

import com.example.lsj.mvpdemo.presenter.IPresenter;
import com.example.lsj.mvpdemo.view.IView;

public interface IMultiplePresenter<T extends IView> extends IPresenter<T> {
    void addPresenter(IPresenter<T> ap);
}
