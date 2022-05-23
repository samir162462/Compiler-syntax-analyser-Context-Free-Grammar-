/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler_sam;

/**
 *
 * @author sam
 */
public class Child_of {
    
    int Child_number;
    String Child_of_top;
    String Parent_name;
    String midel;
    String type;
    int Child_depth_num;
    int line_number;

    public Child_of() {
        this.Child_number = 0;
        this.Child_of_top = "";
        this.midel = "";
        this.Child_depth_num = 0;
        this.type = "";
    }

    @Override
    public String toString() {
        return "Child_of{" + "Child_number=" + Child_number + ", Child_of_top=" + Child_of_top + ", Parent_name=" + Parent_name + ", midel=" + midel + ", type=" + type + ", Child_depth_num=" + Child_depth_num + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
