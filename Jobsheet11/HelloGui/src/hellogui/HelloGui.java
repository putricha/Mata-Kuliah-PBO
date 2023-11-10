/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hellogui;

/**
 *
 * @author Putri Chasanah
 */
import javax.swing.*;
public class HelloGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame;
        frame = new JFrame("Ini percobaan HelloGui Frame");
        //Program akan berhenti jika ditutup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,300);
        frame.setLocation(200,200);// x,y tampilan pada windows
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);//untuk menampilkam frame
        
    }
    
}
