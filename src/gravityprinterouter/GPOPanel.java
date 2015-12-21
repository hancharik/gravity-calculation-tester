/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravityprinterouter;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Mark
 */
public class GPOPanel extends JPanel{
    
    
    JLabel result1;
    JTextArea gimmegimme;
    
    public GPOPanel(){
        
        super();
        setLayout(null);
        
       result1 = new JLabel("<html><h2><font color='blue'> searching for a gravitational force between: </font><font color='red'>" + .993 + "</font><font color='blue'> and </font><font color='red'>" + 1.007 + "</font><h2></html>");
        result1.setBounds(160, 40, 720, 160);
        add(result1);
        
        gimmegimme = new JTextArea();
        gimmegimme.setBounds(160, 160, 720, 660);
        add(gimmegimme);
        
       
        
        
        
    }  // end constructor
  
    
    
    
}//end
    
