/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dots;

/**
 *
 * @author zvibock
 */
public class Dots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
 String each="";
 //int row =0;
String dots="*";

for(int i=0;i<6;i++){
    System.out.println(each);
each="";
    int row =6;
while(row>i){
each+=dots;
   row--;     }
} System.out.println(dots);}}
//System.out.println(each);}}}


