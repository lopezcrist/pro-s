package com.wozeze.pros.demo.action;

import com.wozeze.pros.demo.domain.User;


public class UserAction    
{    
    private User user;    
   
    public User getUser()    
    {    
        return user;    
    }    
   
    public void setUser(User user)    
    {    
        this.user = user;    
    }    
        
    public String execute() throws Exception    
    {    
        	System.out.println("name : " + user.getUsername());
        	System.out.println("name : " + user.getPassword());
            return "success";    
    }    
} 