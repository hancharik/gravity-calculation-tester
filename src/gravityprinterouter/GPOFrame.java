/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravityprinterouter;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Mark
 */
public class GPOFrame extends JFrame{
    
    
     int height = 600;//(int)space.Space.height;
    int width = 800;//(int)space.Space.width;  
    
    
    GPOPanel gp;
    
    
    public GPOFrame(){
        
		super ("Gravity Calulatron 6000");
                getContentPane().setLayout(new BorderLayout());
                setExtendedState(JFrame.MAXIMIZED_BOTH);//setSize (width, height);
                width = this.getWidth();
                height = this.getHeight();
                gp = new GPOPanel();
		getContentPane().add(gp,"Center");
                setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
                
        }
    
}  // end
