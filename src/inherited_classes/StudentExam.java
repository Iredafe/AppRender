/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherited_classes;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Iredafe
 */
public class StudentExam {
    
    public void addExamRules (JTextArea jTextAreaForExamRules){
    
    try{
FileReader reader = new FileReader("C:\\Users\\Iredafe\\Desktop\\Programming books\\exam rules.txt");  
BufferedReader br = new BufferedReader (reader);
jTextAreaForExamRules.read(br, null);
br.close();
//jTextArea1.requestFocus();    
    
} catch(Exception e){
    
    JOptionPane.showMessageDialog(null, e);
    
}

    
}
}