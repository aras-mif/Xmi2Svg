package util.com;

import java.util.HashSet;
import java.util.Set;

public class UseCase {
	
	String id;
	String name;
	int x;
	int y;
	boolean isPrint;
	Actor actor;
	Set<UseCase> useCasesExtend = new HashSet<>();
	Set<UseCase> useCasesInclud = new HashSet<>();
	
	Systeme sys;
	/**
	 * 
	 */
	public UseCase() {
		 
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isPrint() {
		return isPrint;
	}

	public void setPrint(boolean isPrint) {
		this.isPrint = isPrint;
	}

	/**
	 * 
	 * @return
	 */
	public String getId() {
		return id;
	}
	/**
	 * 
	 * @param idUseCase
	 */
	public void setId(String idUseCase) {
		this.id = idUseCase;
	} 
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return
	 */
	public Actor getActor() {
		return actor;
	}
	/**
	 * 
	 * @param actor
	 */
	
	public void setActor(Actor actor) {
		this.actor = actor;
	}
	
	 
	
	 
	public Set<UseCase> getUseCasesExtend() {
		return useCasesExtend;
	}
	public void setUseCasesExtend(Set<UseCase> useCasesExtend) {
		this.useCasesExtend = useCasesExtend;
	}
	
	public Set<UseCase> getUseCasesInclud() {
		return useCasesInclud;
	}
	public void setUseCasesInclud(Set<UseCase> useCasesInclud) {
		this.useCasesInclud = useCasesInclud;
	}
	public Systeme getSys() {
		return sys;
	}
	public void setSys(Systeme sys) {
		this.sys = sys;
	}

}
