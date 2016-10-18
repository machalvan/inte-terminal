package delfy;

import java.util.ArrayList;
public class Team {
	
	private String teamName;
	private ArrayList<Participant> listOfTeamMembers = new ArrayList<Participant>();
	
	public Team (String teamName) {	
		this.teamName = teamName; 
	}
	
	public void getTeamMembers() {
		for (int i=0; i<listOfTeamMembers.size(); i++) {
			System.out.println(i);
		}
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public void addTeamMember(Participant p){
		listOfTeamMembers.add(p);
		System.out.println("New teammember added"); //tillfällig kontroll
	}

}

