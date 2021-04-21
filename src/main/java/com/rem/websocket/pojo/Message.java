package com.rem.websocket.pojo;


import lombok.Data;

import java.sql.Timestamp;

@Data
public class Message {

    private Integer id;

    private String content;

    private Timestamp createTime = new Timestamp(System.currentTimeMillis());

}
