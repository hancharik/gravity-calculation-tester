/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravityprinterouter;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Mark
 */
public class GPOPanel extends JPanel{
    
    
    JLabel result1;
    
    
    public GPOPanel(){
        
        super();
        setLayout(null);
        
       result1 = new JLabel("<html><h2><font color='white'>mass of center: </font><font color='red'>" + 8.6 + "</font><h2></html>");
        result1.setBounds(60, 60, 320, 360);
        add(result1);
        
        
        
       
        
        
        
    }  // end constructor
  
    
    
    
}//end
    
