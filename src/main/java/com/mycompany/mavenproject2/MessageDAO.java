/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author hp
 */
public class MessageDAO {
   
    
    private  Map<Long,MessageBean> msgs = DBClass.getMessgaes();
    public MessageDAO(){
    msgs.put(1L,new MessageBean(1,"hi there","fatma"));
    msgs.put(2L,new MessageBean(2,"hi there 11","fatma"));

    }
    public  List<MessageBean> getAllMessages(){
      

        return new ArrayList<MessageBean>(msgs.values());
    
    }
 public  MessageBean getMsg(long id)
 {
 return msgs.get(id);
 }
 public MessageBean addMsg(MessageBean msg)
 {
 msg.setId(msgs.size()+1);
 msgs.put(msg.getId(), msg);
 return msg;
 }
 public MessageBean updMsg(MessageBean msg) {
 
 if (msg.getId()<=0)
 {
 return null;
 }
 msgs.put(msg.getId(), msg);
 return msg;
 }
 public MessageBean remMsg(long id)
 {
 return msgs.remove(id);
 }
}
