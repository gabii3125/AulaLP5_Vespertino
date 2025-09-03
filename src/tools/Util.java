/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author u06075330135
 */
public class Util {
    public  static void habilitar(boolean  valor, JComponent ... componentes){
        for (int i = 0; i < componentes.length; i++) {
             componentes[i].setEnabled(valor);
            
        }
    }
        public static void Limpar(JComponent... components){
            for (int i = 0; i < components.length; i++) {
                 if (components[i] instanceof  JTextField) {
                ((JTextField)components[i]).setText("");
                
            }
                 if (components[i] instanceof  JComboBox) {
                ((JComboBox)components[i]).setSelectedIndex(-1);
                
            }     
                
            }
        }
        public static void mensagem(String cad) {
            JOptionPane.showMessageDialog(null, cad);
        }
        public static void pergunta(String cad){
            JOptionPane.showConfirmDialog(null, cad);
        
    }
        public static int strToInt(String num) {
        return Integer.valueOf(num);
    }
        public static String intToStr(int num){
            return String.valueOf(num);
        }
    
}
