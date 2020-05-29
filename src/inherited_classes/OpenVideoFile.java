/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherited_classes;

import java.awt.Desktop;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Iredafe
 */
public class OpenVideoFile {


public void playVideo(JTable jTableForStudentVideo){
    
            int row = jTableForStudentVideo.getSelectedRow();

String value = (jTableForStudentVideo.getModel().getValueAt(row, 2).toString());
    
if (Desktop.isDesktopSupported()){
try{
//      File myFile = new File(value);
    Desktop.getDesktop().open(new File (value));    }

catch(Exception e){
        
        JOptionPane.showMessageDialog(null, "Error");
}  
} else{
            JOptionPane.showMessageDialog(null, "Desktop not supported!");
}
}

public void openLibraryBook(JTable jTableForLibraryBook){
    
    int row = jTableForLibraryBook.getSelectedRow();
            String value =(jTableForLibraryBook.getModel().getValueAt(row, 2).toString());
if (Desktop.isDesktopSupported()){
try{
      File myFile = new File(value);
    Desktop.getDesktop().open(myFile);    }

catch(Exception e){
        
        JOptionPane.showMessageDialog(null, "Error");
}  
} else{
            JOptionPane.showMessageDialog(null, "Desktop not supported!");
}
            

}


    
}


