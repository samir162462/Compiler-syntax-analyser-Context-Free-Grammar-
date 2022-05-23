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
public class Parent_name {
    
    String name ;
    boolean inside;
    int depth;

    public Parent_name() {
        this.name = "";
        this.inside = false;
        this.depth = 0;
    }

    public Parent_name(String name, boolean inside, int depth) {
        this.name = name;
        this.inside = inside;
        this.depth = depth;
    }
    
    
}
