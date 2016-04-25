package com.mu.muclient.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.mu.muclient.R;
import com.mu.muclient.activity.ChatActivity;
import com.mu.muclient.model.MessageRecentModel;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * 最近聊天
 * Created by Owen on 2016/4/15.
 */
public class MessageRecentAdapter extends BaseAdapter {

    private final Context mContext;
    private final LayoutInflater mInflater;
    private List<MessageRecentModel> mData;

    public MessageRecentAdapter(Context context) {
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
    }

    public void setDataSourse(List<MessageRecentModel> data) {
        mData = data;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mData == null ? 0 : mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData == null ? null : mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (null == convertView) {
            convertView = mInflater.inflate(R.layout.item_message_recent, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        final MessageRecentModel message = mData.get(position);

        holder.tvUserName.setText(message.getUserName());
        holder.tvConversationContent.setText(message.getConversationContent());
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChatActivity.actionStart(mContext);
            }
        });

        return convertView;
    }

    static class ViewHolder {

        @Bind(R.id.iv_profile_image) CircleImageView avatar;
        @Bind(R.id.tv_userName) TextView tvUserName;
        @Bind(R.id.tv_conversation_content) TextView tvConversationContent;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
