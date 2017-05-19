/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author NAILA SHIRU
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   StackClass s1=new StackClass(50);
   s1.push("John Wekesa");
   s1.push("Atieno Nduta");
   s1.push("Lorelei Philip");
   s1.display();
   s1.size();

   
    }
    
}
