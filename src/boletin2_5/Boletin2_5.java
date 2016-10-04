
package boletin2_5;

import javax.swing.JOptionPane;


public class Boletin2_5 {

   
    public static void main(String[] args) {
        float millas, metros;
        millas=Float.parseFloat(JOptionPane.showInputDialog("metros"));
        int CONSTANTE=1852;
        metros=millas*CONSTANTE;
        JOptionPane.showMessageDialog(null,"metros="+ metros);
    }
    
}
