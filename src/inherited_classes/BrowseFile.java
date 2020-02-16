/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherited_classes;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BrowseFile {

 
    
    public void AttachFile(JTextField AddLectureNotesTextField){


        JFileChooser chooser = new JFileChooser();
 chooser.showOpenDialog(null);
    File file = chooser.getSelectedFile();
                        
    
    try {
String filename =file.getAbsolutePath();
AddLectureNotesTextField.setText(filename);
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(null, "No File was Selected!"); 
            } }



//
//String filename = f.getAbsolutePath();
//AddLectureNotesTextField.setText(filename);
//        
        
        
    
    
    public void AttachFile1(JTextField UpdateLectureNotesTextField){
        
        JFileChooser chooser = new JFileChooser();
chooser.showOpenDialog(null);
File f1 = chooser.getSelectedFile();

try{
String filename1 = f1.getAbsolutePath();
UpdateLectureNotesTextField.setText(filename1);
}catch(Exception ex){
           JOptionPane.showMessageDialog(null, "No File was Selected!"); 
    
}    
        
        
    }
    
    public void AttachFile2(JTextField AddVideoTextField){
        
        JFileChooser chooser = new JFileChooser();
chooser.showOpenDialog(null);
File f2 = chooser.getSelectedFile();

try{
String filename2 = f2.getAbsolutePath();
AddVideoTextField.setText(filename2);
}catch(Exception ex){
           JOptionPane.showMessageDialog(null, "No File was Selected!"); 
    
}    
    }

    public void AttachFile3(JTextField AddToLibraryTextField){
        
        JFileChooser chooser = new JFileChooser();
chooser.showOpenDialog(null);
File f3 = chooser.getSelectedFile();

try{
String filename3 = f3.getAbsolutePath();
AddToLibraryTextField.setText(filename3);
}catch(Exception ex){
           JOptionPane.showMessageDialog(null, "No File was Selected!"); 
    
}    
    }
 
    
    public void AttachFile4(JTextField UpdateVideoTextField){
        
        JFileChooser chooser = new JFileChooser();
chooser.showOpenDialog(null);
File f4 = chooser.getSelectedFile();

try{
String filename4 = f4.getAbsolutePath();
UpdateVideoTextField.setText(filename4);
}catch(Exception ex){
           JOptionPane.showMessageDialog(null, "No File was Selected!"); 
    
}    
    }
 
    public void AttachFile5(JTextField UpdateLibraryTextField){
        
        JFileChooser chooser = new JFileChooser();
chooser.showOpenDialog(null);
File f5 = chooser.getSelectedFile();

try{
String filename5 = f5.getAbsolutePath();
UpdateLibraryTextField.setText(filename5);
}catch(Exception ex){
           JOptionPane.showMessageDialog(null, "No File was Selected!"); 
    
}    
    }
    
    
    
}