/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hellogui;

/**
 *
 * @author Putri Chasanah
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyInputForm  extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel,dLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JPanel panel;
    
      public MyInputForm(){
        createTextField();
        createButton();
        createPanel();
        setSize(FRAME_WIDTH,FRAME_WIDTH);
    }
      
      private void createTextField(){
          aLabel = new JLabel("Nilai A :");
          bLabel = new JLabel("Nilai C :");
          cLabel= new JLabel("Hasil perkalian : ");
          dLabel= new JLabel("Hasil penjumlahan : ");
          final int FIELD_WIDTH = 10;
          aField = new JTextField(FIELD_WIDTH);
          aField.setText("0");
          bField = new JTextField(FIELD_WIDTH);
          bField.setText("0");                  
      }
      

      
      private void createButton(){
          button = new JButton("Calculate");
          class AddInterestListener implements ActionListener {
              //untuk event click
              @Override
//              public void actionPerformed(ActionEvent event){
//                  int a = Integer.valueOf(aField.getText());
//                  int b = Integer.valueOf(bField.getText());
//                  int c = a * b;
//                  cLabel.setText("Hasil : " +c);
//              }
              
              //modifikasi menjadi penjumlahan
              public void actionPerformed(ActionEvent event){
                  int a = Integer.valueOf(aField.getText());
                  int b = Integer.valueOf(bField.getText());
                  int c = a * b;
                  int d = a + b;
                  cLabel.setText("Hasil perkalian : " +c);
                  dLabel.setText("Hasil penjumlahan : " + d);
              }
          }
          ActionListener listener = new AddInterestListener();
          button.addActionListener(listener);
      }
      
      private void createPanel(){
            panel = new JPanel();
            panel.add(aLabel);
            panel.add(aField);
            panel.add(bLabel);
            panel.add(bField);
            panel.add(button);
            panel.add(cLabel);
            panel.add(dLabel);
            add(panel);
            
      }
      
      public static void main(String[] args) {
        //TODO code application logic here
        JFrame frame = new MyInputForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
  
}

