package com.example.StudentProject;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositoryClass {
    List<User>ls=new ArrayList<>();
    public RepositoryClass(){
        ls.add(new User("girjesh",78,85,94,123));
        ls.add(new User("priya",80,90,100,133));
        ls.add(new User("ravi",79,89,95,143));
    }
    public List Sinfo() {
        return ls;
    }

    public User getInfo(long SId){
        User c=null;
        for(User user:ls){
            if(user.getSId()==SId){
                c=user;
                break;
            }
        }
        return c;
    }

    public User addSInfo(User user) {
        ls.add(user);
        return user;
    }

    public List<User> updateS(long sId) {
        for(User user:ls){
            if(user.getSId()==sId){
                user.setSName("TOPPER");
                break;
            }
        }
        return ls;
    }

    public List<User> dSInfo(long sId) {
        for(User user:ls){
            if(user.getSId()==sId){
                ls.remove(user);
                break;
            }
        }
        return ls;
    }
}
