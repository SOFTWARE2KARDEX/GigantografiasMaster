
package Datos;

import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Anthony
 */
public class LetrasoCaracteres{

    private JTextField a;

    public LetrasoCaracteres(JTextField a) {
        this.a = a;
    }
        
    public static void SLetras(JTextField  a){
        a.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if(Character.isDigit(c)){
                    //getToolkit().beep();
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        });
    }
    
    public static void SDigitos(JTextField  a){
        a.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if(Character.isLetter(c) || Character.isSpaceChar(c)){
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        });
    }    
    
}
