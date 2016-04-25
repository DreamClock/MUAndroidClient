package com.mu.muclient.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Owen on 2016/4/25.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setLayout();
        initComponent();
        bindData();
    }

    public abstract void setLayout();
    public abstract void initComponent();
    public abstract void bindData();

}
