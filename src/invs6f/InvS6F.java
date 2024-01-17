/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invs6f;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class InvS6F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* System.out.println("Hello Netbeans...");
        for(int i=1;i<=10;i++){
            System.out.print(i + " ");
        }
        System.out.print("\n");
        
        int a = 1;
        while(a <= 10){
            System.out.println(a);
            a=a+1;
        }
        String ganjil = "";
        String genap = "";
        for(int c=1;c<=10;c++){
            if((c%2)==0){
                genap = genap + " " + Integer.toString(c);
            }else{
                ganjil = ganjil + " " + Integer.toString(c);
                
            }
        }
        System.out.println("Bilangan ganjil : " +ganjil);
        System.out.println("Bilangan genap  : " +genap);
       */
        FLogin mLogin = new FLogin();
        mLogin.setVisible(true);
        mLogin.setSize(400, 300);
        mLogin.setLocationRelativeTo(null);
        mLogin.setTitle("Form Login");
        
        //dbKoneksi connect = new dbKoneksi();
        //connect.config();
    }
    
}
