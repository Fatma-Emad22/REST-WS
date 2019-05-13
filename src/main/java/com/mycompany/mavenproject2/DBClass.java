/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hp
 */
public class DBClass {
    private static Map<Long,MessageBean> msg = new HashMap<>();
    private static Map<Long,ProfileBean> pro =new HashMap<>();
    
    public static Map<Long,MessageBean> getMessgaes(){
        return msg;
    }
     public static Map<Long,ProfileBean> getProfiles(){
         return pro;
    }
}
