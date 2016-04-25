package com.mu.muclient.activity;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

import com.mu.muclient.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ChatActivity extends BaseActivity {

    @Bind(R.id.tv_title) TextView mTvTitle;

    @Override
    public void setLayout() {
        setContentView(R.layout.activity_chat);
        ButterKnife.bind(this);
    }

    @Override
    public void initComponent() {

    }

    @Override
    public void bindData() {

    }

    @OnClick(R.id.iv_back)
    public void back() {
        finish();
    }

    @OnClick(R.id.tv_optional_menu)
    public void optionalMenu() {
        Toast.makeText(ChatActivity.this, "更多", Toast.LENGTH_SHORT).show();
    }

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, ChatActivity.class);
        context.startActivity(intent);
    }
}
