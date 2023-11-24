package com.example.StudentProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClass {
    @Autowired
    private RepositoryClass repositoryClass;
    public List Sinfo() {
        return repositoryClass.Sinfo();
    }
    public User getInfo(long SId){
        return this.repositoryClass.getInfo(SId);
    }

    public User addSInfo(User user) {
        return this.repositoryClass.addSInfo(user);
    }

    public List<User> updateS(long sId) {
        return this.repositoryClass.updateS(sId);
    }

    public List<User> dSInfo(long sId) {
        return this.repositoryClass.dSInfo(sId);
    }
}
