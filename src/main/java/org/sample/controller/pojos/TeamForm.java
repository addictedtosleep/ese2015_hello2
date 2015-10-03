package org.sample.controller.pojos;

import org.hibernate.validator.constraints.NotEmpty;
import java.sql.Timestamp;

public class TeamForm {


    private Long id;
    private Timestamp date;
    


    @NotEmpty(message = "Must not be empty")
    private String teamName;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Timestamp getDate(){
    	return date;
    }
    public void setDate(Timestamp date){
    	this.date=date;
    }
}