/* AUTEUR: Samuel Pinto Da Silva
 * NOM DE LA CLASSE: 
 * DESCRIPTION: 
 */

import java.awt.BorderLayout;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;

public class Play {

	public static void main(String[] args) {

		
		JFrame test = new JFrame();
		PokerApp pApp;
		pApp = new PokerApp();
		test.add(pApp);
		test.setSize(480, 755);
		test.setVisible(true);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.pack();
		
		
	}


	


}