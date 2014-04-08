package org.lotus;

import java.awt.Frame;
import java.awt.EventQueue;
import java.awt.TextField;

public class Launch {

    public static void main(String[] args) {

		Runnable work = new Runnable() {
			@Override
			public void run() {
				Frame f = new Frame("My AWT Frame"); //set title
				f.setLocationRelativeTo(null); //put in center of screen
                TextField tf = new TextField("Press ctrl + c to exit", 20); // default text, to show column count
                f.add(tf); // add field to frame
                f.pack(); // set auto width and height
				f.setVisible(true); //show to the user
			}
		};

		// create thread for this work(optional but recommended)
		EventQueue.invokeLater(work);
    }
}
