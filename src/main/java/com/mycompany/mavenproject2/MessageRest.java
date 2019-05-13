/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author hp
 */
@Path("/messages")
public class MessageRest {
    MessageDAO msg=new MessageDAO();
    @GET
    @Produces(MediaType.APPLICATION_XML)
    
    public List<MessageBean> getMessages()
    {
        return msg.getAllMessages();
    }
    @GET
    @Path("/{msgId}")
    @Produces(MediaType.APPLICATION_XML)
    public MessageBean getMessage(@PathParam("msgId" )long id){
    return msg.getMsg(id);
    }
}
