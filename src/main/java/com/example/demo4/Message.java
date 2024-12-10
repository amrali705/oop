package com.example.demo4;
public class Message {
    private String messageId;
    private User sender;
    private String content;

    public Message(String messageId, User sender, String content) {
        this.messageId = messageId;
        this.sender = sender;
        this.content = content;
    }

    public String getMessageId() {
        return messageId;
    }
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Edit message content
    public void editMessage(String newContent) {
        if(!content.equals("Message has been deleted.")){
        this.content = newContent;
        }
    }
    // Delete message
    public void deleteMessage() {
        content="Message has been deleted.";
        System.out.println(content);
    }

    public void displayMessage() {
        System.out.println("Message ID: "+ messageId);
        System.out.println("Content: " + content);
    }



}