package com.mu.muclient.activity;

import android.widget.ListView;

import com.mu.muclient.R;
import com.mu.muclient.adapter.MessageRecentAdapter;
import com.mu.muclient.model.MessageRecentModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MessageRecentActivity extends BaseActivity {

    @Bind(R.id.lv_message_recent) ListView mListView;
    MessageRecentAdapter mAdapter;

    @Override
    public void setLayout() {
        setContentView(R.layout.activity_message_recent);
        ButterKnife.bind(this);
    }

    @Override
    public void initComponent() {
        mAdapter = new MessageRecentAdapter(this);
        mListView.setAdapter(mAdapter);
    }

    @Override
    public void bindData() {
        mAdapter.setDataSourse(generateData());
    }

    private List<MessageRecentModel> generateData() {
        List<MessageRecentModel> messageList = new ArrayList<>(20);
        for (int i = 0 ; i < 20; i++) {
            MessageRecentModel message = new MessageRecentModel();
            message.setUserName("userName" + (i + 1));
            message.setConversationContent("conversationContent" + (i + 1));

            messageList.add(message);
        }

        return messageList;
    }
}
