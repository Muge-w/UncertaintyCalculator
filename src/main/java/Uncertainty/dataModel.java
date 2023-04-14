/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Uncertainty;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 27323
 */
public class dataModel extends AbstractTableModel{
    String[] columnNames = new String[]{"id","data"};
    ArrayList<String[]> content = new ArrayList<>();
    protected int counter = 1;
    
    public void addData(String data){
        content.add(new String[]{Integer.toString(counter),data});
        counter++;
    }

    public int getRowCount() {
        return content.size();
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public Object getValueAt(int columnIndex,int rowIndex) {
        return content.get(columnIndex)[rowIndex];
    }
        
}

