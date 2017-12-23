package util.com;

import java.util.ArrayList;
import java.util.List;

public class Model {
	
	private List<Actor> actors;
	private List<UseCase> usecases;
	private List<Systeme> systemes;
	
	
	public Model() {
		 actors = new ArrayList<>();
		 usecases = new ArrayList<>();
		 systemes = new ArrayList<>();
	}
	
	
	public Actor getActorById(String id){
		
		for(Actor actor :actors)
		{
			if(actor.getId().equals(id)) 
			{
				return actor;
			}
		}
		
		return null;
	}
	
public UseCase getUseCaseById(String id){
		
		for(UseCase uc :usecases)
		{
			if(uc.getId().equals(id)) 
			{
				return uc;
			}
		}
		
		return null;
	}

 
	public List<Actor> getActors() {
		return actors;
	}
	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
	 
	public List<UseCase> getUsecases() {
		return usecases;
	}

	public void setUsecases(List<UseCase> usecases) {
		this.usecases = usecases;
	}

	public List<Systeme> getSystemes() {
		return systemes;
	}
	public void setSystemes(List<Systeme> systemes) {
		this.systemes = systemes;
	}

	
}
