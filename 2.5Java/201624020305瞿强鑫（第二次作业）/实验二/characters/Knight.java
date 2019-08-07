package First.characters;

import First.behavior.*;
/**
 * 
 * @author dell
 *
 */
public class Knight extends Characters{
	/**
	 * 
	 * @param name
	 */
	public Knight(String name){
		super(name);
		weapon = new SwordBehavior(); 
		magic = new InvisibleBehavior();

	}
	/**
	 *  
	 */
	public void display(){
		System.out.print("I am Knight  "+getName()+" I ");
		weapon.weapon();
		System.out.println();
	}
}
