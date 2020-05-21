/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienttest;

// Fig. 24.16: TicTacToeClientTest.java
// Tests the TicTacToeClient class.
import javax.swing.JFrame;

public class ClientTestTest {

    public static void main(String args[]) {
        ClientTest application; // declare client application

        // if no command line args
        if (args.length == 0) {
            application = new ClientTest("25.87.44.228"); // localhost
        } else {
            application = new ClientTest(args[0]); // use args
        }
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } // end main
} // end class TicTacToeClientTest

