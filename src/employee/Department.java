/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yamuna
 */
public class Department{

    private String name;
    private int head_DptNo;
    public List<Employee> dptList;

    public Department(String name, int head_DptNo, List<Employee> dptList) {
        this.name = name;
        this.head_DptNo = head_DptNo;
        this.dptList = dptList;
    }
    
    public Department(){
    dptList=new ArrayList<Employee> ();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHead_DptNo() {
        return head_DptNo;
    }

    public void setHead_DptNo(int head_DptNo) {
        this.head_DptNo = head_DptNo;
    }

    public List<Employee> getDptList() {
        return dptList;
    }

    public void setDptList(List<Employee> dptList) {
        this.dptList = dptList;
    }
    
    @Override
    public String toString() {
        return "Department " + name + " :\n"+ "Head of Department ID: " + head_DptNo + "\n" + "Employee: "+ dptList ;
    }

}
