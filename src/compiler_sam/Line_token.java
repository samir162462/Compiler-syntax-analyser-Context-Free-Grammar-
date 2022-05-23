/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler_sam;

import java.util.ArrayList;

/**
 *
 * @author samir filfil
 */
public class Line_token {
   int number;
   String token;
   String line_number;
   String class_type;
   boolean has_to_split;
   static int max_line;
   

    public Line_token(int number, String token, String line_number, String class_type) {
        this.number = number;
        this.token = token;
        this.line_number = line_number;
        this.class_type = class_type;
    }

    public Line_token(int number, String token, String line_number, String class_type, boolean has_to_split) {
        this.number = number;
        this.token = token;
        this.line_number = line_number;
        this.class_type = class_type;
        this.has_to_split = has_to_split;
    }

    public Line_token() {
    }
   

   
   
   
   
}
