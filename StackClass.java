/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import javax.swing.JOptionPane;

/**
 *
 * @author NAILA SHIRU
 */
public class StackClass {
    private int top;
    private String arr[];
    public StackClass(int capacity)
    {
        top = -1;
        
        arr=new String[capacity];
    }
   public void push(String e)
   {
       top++;
       arr[top]=e;
   }
   public String pop()
   {
       String s=arr[top];
       top--;
       return s;
   }
   public int size()
   {
       return top+1;
   }
   
   /**
    * 
    * @return boolean?
    */
   public boolean IsEmpty()
   {
       if(top==-1)
       {
           return true;
       }
      else
       {
           return false;
       }
   }
   
   /**
    * 
    * @return peek string
    */
       public String peek()
       {
           return arr[top];
       }
       public void display()
       {
          String out="";
           for(int i=0;i<=top;i++)
           {
               /*JOptionPane.showMessageDialog(null, arr[i]);*/
               out=out+"\n"+arr[i];
              
           }
           JOptionPane.showMessageDialog(null, out);
       }
   }

