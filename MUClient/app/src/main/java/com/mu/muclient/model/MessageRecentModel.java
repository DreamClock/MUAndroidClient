package com.mu.muclient.model;

/**
 * Created by Owen on 2016/4/15.
 */
public class MessageRecentModel {

    private String avatarUrl;
    private String userName;
    private String conversationContent;

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getConversationContent() {
        return conversationContent;
    }

    public void setConversationContent(String conversationContent) {
        this.conversationContent = conversationContent;
    }
}
