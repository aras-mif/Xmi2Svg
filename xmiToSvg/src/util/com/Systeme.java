package util.com;

import java.util.HashSet;
import java.util.Set;

public class Systeme {

	String id;
	String name;
	int x;
	int y;
	boolean isPrint;
	Set<UseCase> useCases = new HashSet<>();
	
	
	
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
	public String getId() {
		return id;
	}
	public void setId(String idBoundary) {
		this.id = idBoundary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<UseCase> getUseCases() {
		return useCases;
	}
	public void setUseCases(Set<UseCase> useCases) {
		this.useCases = useCases;
	}
	public Systeme() {
		 
		// TODO Auto-generated constructor stub
	}                                                                                                       
	
	
	
}
