/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.burmashave;

/**
 *
 * @author 25019666
 */
import javax.swing.JOptionPane;
public class BurmaShave {

    public static void main(String[] args) {
        String [] Rhyme ={
           "Shaving brushes",
           "You'll soon see 'em",
           "In some museum",
           "Burma Shave"
        };
    for(String line: Rhyme){
        JOptionPane.showMessageDialog(null, line,"Burma Shave",
                JOptionPane.INFORMATION_MESSAGE);
                
    }
    }
}
