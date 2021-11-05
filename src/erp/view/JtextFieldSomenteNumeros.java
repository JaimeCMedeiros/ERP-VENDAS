/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.view;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author home
 */
public final class JtextFieldSomenteNumeros extends JTextField {
    
private int maximoCaracteres=-1;

public JtextFieldSomenteNumeros() {
        super();
        addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
        public void keyTyped(java.awt.event.KeyEvent evt) {
            jTextFieldKeyTyped(evt);}});
    }

    

private void jTextFieldKeyTyped(KeyEvent evt) {

    String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
        if((getText().length()>=getMaximoCaracteres())&&(getMaximoCaracteres()!=-1)){
            evt.consume();
            setText(getText().substring(0,getMaximoCaracteres()));
         }

    }

public int getMaximoCaracteres() {
        return maximoCaracteres;
    }
public void setMaximoCaracteres(int maximoCaracteres) {
        this.maximoCaracteres = maximoCaracteres;
    }
}

