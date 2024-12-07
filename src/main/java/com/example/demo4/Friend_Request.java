package com.example.demo4;

public class Friend_Request {
    private final int id ;
    private static int cont =0;
    private final  User sender ;
    private final  User receiver ;
    private String status ;

    public Friend_Request(User sender, User receiver) {
        cont++;
        id = cont ;
        this.sender = sender;
        this.receiver = receiver;
        this.status = "PENDING";
    }

    public User getReceiver() {
        return receiver;
    }

    public User getSender() {
        return sender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void accept_Request(){
        if ("PENDING".equals(this.status)) {
            setStatus("ACCEPTED");
            sender.add_friend(receiver);
            receiver.add_friend(sender);
        }
    }
    public void declineRequest(){
        if ("PENDING".equals(this.status)) {
            setStatus("DECLINED");
        }
    }



}
