/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherited_classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import schoolApp.SqlConnection;

/**
 *
 * @author Iredafe
 */
public class StudentGrade {
 
     public void addGradeFile (JTextArea jTextAreaForStudentGrade){
    
    try{
FileReader reader = new FileReader("C:\\Users\\Iredafe\\Desktop\\Programming books\\Grade.txt");  
BufferedReader br = new BufferedReader (reader);
jTextAreaForStudentGrade.read(br, null);
br.close();
//jTextArea1.requestFocus();    
    
} catch(Exception e){
    
    JOptionPane.showMessageDialog(null, e);
    
}

    
}   
    
    
    
    /*
     PreparedStatement pst;
    ResultSet rs;
    
    
    
    public void addGradeToTextArea(JTextArea jTextAreaForStudentGrade){

jTextAreaForStudentGrade.setText(null);
        
 String query = "SELECT `student name`, math, english, history, `computer science`, "
         + "economics, literature, geography, french, design FROM `students grade`"
         + "WHERE `student id`=1";
 
 try{
                pst = SqlConnection.getConnection().prepareStatement(query);
                rs = pst.executeQuery();
                        
                while (rs.next()) {
String StudentName = rs.getString("student name");
String Math = rs.getString("math");
String English = rs.getString("english");
String History = rs.getString("history");
String ComputerScience = rs.getString("computer science");
String Economics = rs.getString("economics");
String Literature = rs.getString("literature");
String Geography = rs.getString("geography");
String French = rs.getString("french");
String Design = rs.getString("design");


jTextAreaForStudentGrade.append("    \n Your Grades  \n\n"

           + "Name :" +StudentName+"\n"+
             "Math :\t"+Math+"\n\n" +
             "English: "+English+"\n\n"+
             "Computer Science: "+ComputerScience+"\n\n"+
              "History : "+History+"\n\n"+
            "Economics : "+Economics+"\n\n"+
            "Literature : "+Literature+"\n\n"+
            "Geography : "+Geography+"\n\n"+
            "French : "+French+"\n\n"+
            "Design : "+Design+"\n\n"+
        
          "=================="
        
);
             }

    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    }  */
    

}