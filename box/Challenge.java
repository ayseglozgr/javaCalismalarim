/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

/**
 *
 * @author Aysegul
 */
public class Challenge {

	public static void main(String args[]) {

		Box mybox1 = new Box(10, 20, 15);

		Box mybox2 = new Box();

		Box mycube = new Box(7);

		int vol;

		vol = mybox1.volume();

		System.out.println("Volume of mybox1 is " + vol);

		vol = mybox2.volume();

		System.out.println("Volume of mybox2 is " + vol);

		vol = mycube.volume();

		System.out.println("Volume of mycube is " + vol);
                
	}
}



