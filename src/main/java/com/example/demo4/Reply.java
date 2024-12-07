package com.example.demo4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reply extends Comment{


    public Reply(String content, User author, Date timestamp) {
        super(content,  author,timestamp);
    }

    public void editComment(String newContent) {
        if(!getContent().equals("Reply IS DELETED")){
            setContent(newContent);
        }
    }
    public void deleteComment() {
        setContent("Reply IS DELETED");
    }
}

