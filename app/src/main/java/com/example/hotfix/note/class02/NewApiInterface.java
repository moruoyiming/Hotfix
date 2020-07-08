package com.example.hotfix.note.class02;

import com.cocos.network.beans.NewsListBean;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewApiInterface {
    @GET
    Call<NewsListBean> getNewsList(String name, String pwd);
}