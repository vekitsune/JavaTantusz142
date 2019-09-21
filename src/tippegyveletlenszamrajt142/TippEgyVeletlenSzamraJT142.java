/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tippegyveletlenszamrajt142;

import javax.swing.JOptionPane;

/**
 *
 * @author Verosffy
 */
public class TippEgyVeletlenSzamraJT142 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int indulhat=JOptionPane.showConfirmDialog(null, "Van kedved számtippelőset játszani?", "válaszolj :)", JOptionPane.YES_NO_OPTION);
    if(indulhat!=1){
        int tol, ig;
          tol=Integer.parseInt(JOptionPane.showInputDialog("Határozd meg mettől meddig gondoljak egy számra. Előszőr a tól értéket kérem."));
          ig=Integer.parseInt(JOptionPane.showInputDialog("Meddig?"));
          VeletlenSzam jatek=new VeletlenSzam(tol, ig);
          
          int kor=JOptionPane.showConfirmDialog(null, "Szóval, jöhet egy kör?","Mondj igent!",JOptionPane.YES_NO_OPTION);
          int vszam=jatek.veletlenszam();
          while(kor==0){
              int tipp=Integer.parseInt(JOptionPane.showInputDialog("Tippelj "+jatek.tol+" és"+jatek.ig+" közötti számra"));
              
              if(tipp==vszam){
                  JOptionPane.showMessageDialog(null, "Gratulálok, nyertél!");
                  kor++;
              }else{
                  if(tipp<vszam)
                  JOptionPane.showMessageDialog(null, "A tipped kisebb, mint az a szám, amire én gondoltam");
                  else
                   JOptionPane.showMessageDialog(null, "A tipped nagyobb, mint az a szám, amire én gondoltam");   
              }
              
             
          }
          System.exit(0);
         
    }
    }
    
}
