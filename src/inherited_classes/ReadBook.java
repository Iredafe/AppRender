/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherited_classes;

import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Iredafe
 */
public class ReadBook {
    
    
    public void openDocument(JTable jTableForSelectTopic){
        int row = jTableForSelectTopic.getSelectedRow();

String value = (jTableForSelectTopic.getModel().getValueAt(row, 2).toString());
    try{
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + value);
    }
    catch(Exception e){
        
        JOptionPane.showMessageDialog(null, "Error");
    }

    }
}
