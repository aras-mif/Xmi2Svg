package util.com;

import java.util.HashSet;
import java.util.Set;

public class Actor {

	String name;
	String id;
	int x;
	int y;
	boolean isPrint;
	Set<UseCase> useCases = new HashSet<>();
	Set<Actor> actorsChild = new HashSet<>();

	/**
	 * 
	 * @return
	 */
	public Set<Actor> getActorsChild() {
		return actorsChild;
	}

	/**
	 * 
	 * @param actorsChild
	 */
	public void setActorsChild(Set<Actor> actorsChild) {
		this.actorsChild = actorsChild;
	}

	/**
     * 
     */
	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @return
	 */

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	/**
	 * 
	 * @return
	 */

	public int getY() {
		return y;
	}

	/**
	 * 
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * 
	 * @return
	 */

	public boolean isPrint() {
		return isPrint;
	}

	/**
	 * 
	 * @param isPrint
	 */

	public void setPrint(boolean isPrint) {
		this.isPrint = isPrint;
	}

	/**
	 * 
	 * @return
	 */

	public Set<UseCase> getUseCases() {
		return useCases;
	}

	/**
	 * 
	 * @param useCases
	 */
	public void setUseCases(Set<UseCase> useCases) {
		this.useCases = useCases;
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
	 * @param idActor
	 */
	public void setId(String idActor) {
		this.id = idActor;
	}

	/**
	 * 
	 * @return
	 */
	public String getNom() {
		return name;
	}

	/**
	 * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.name = nom;
	}

}
