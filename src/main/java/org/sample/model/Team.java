package org.sample.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;


@Entity
public class Team {
	  @Id
	    @GeneratedValue
	    private Long id;

	    private String teamName;
	    private Timestamp date; 


		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTeamName() {
			return teamName;
		}

		public void setTeamName(String teamName){
	    	this.teamName = teamName;
	    }

	    public Timestamp getDate() {
	        return date;
	    }
	    
	    public void setDate(Timestamp date) {
	        this.date = date;
	    }
	    
	    public String toString(){
	    	return "id= "+this.id+", teamName= "+this.teamName;
	    }
	    
	    
	  
}
