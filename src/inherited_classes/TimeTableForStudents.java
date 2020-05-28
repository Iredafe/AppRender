/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherited_classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import schoolApp.SqlConnection;

/**
 *
 * @author Iredafe
 */
public class TimeTableForStudents {
    
    PreparedStatement pst;
    ResultSet rs;
    
    
    
    public void addTimeTableToJTable(JTable jTableForStudentTimeTable){

DefaultTableModel myTimeTable = (DefaultTableModel) jTableForStudentTimeTable.getModel();

myTimeTable.setRowCount(0);

 String query = "SELECT `time`, `monday`, `tuesday`, `wednesday`, `thursday`, "
         + "`friday` FROM `student timetable`";
 
 
 try{
     
                pst = SqlConnection.getConnection().prepareStatement(query);
                rs = pst.executeQuery();
                        
                while (rs.next()) {
String Time = rs.getString("time");
String Monday = rs.getString("monday");
String Tuesday = rs.getString("tuesday");
String Wednesday = rs.getString("wednesday");
String Thursday = rs.getString("thursday");
String Friday = rs.getString("friday");

myTimeTable.addRow(new Object [] { Time, Monday, Tuesday, Wednesday, 
                                    Thursday, Friday});
                } 
 
 }
 catch(Exception e){
             JOptionPane.showMessageDialog(null, e.getMessage());
}
    }


    }