/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package example;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author fanis
 */
public class Divider extends JFrame {
     private JButton divideBtn;
    private JTextField txt1, txt2;
    private JLabel resultLabel;
    
    public Divider() {
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Divider");
        
        divideBtn = new JButton("Divide");
        txt1 = new JTextField(10);
        txt2 = new JTextField(10);
        resultLabel = new JLabel();
        
        this.setLayout(new FlowLayout());
        this.add(txt1);
        this.add(txt2);
        this.add(divideBtn);
        this.add(resultLabel);
        this.setVisible(true);
        
        divideBtn.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                callDivide();
            }
        });
    }
    
    public void callDivide() {
        double a = Double.parseDouble(txt1.getText());
        double b = Double.parseDouble(txt2.getText());
        
        try {
            double result = divide(a, b);
            resultLabel.setText(result + "");
            
        } catch (Exception e) {
            resultLabel.setText(e.getMessage());
        }
    }
    
    public double divide(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception("Bad Number");
        } else {
            return a / b;
        }
    }
}
