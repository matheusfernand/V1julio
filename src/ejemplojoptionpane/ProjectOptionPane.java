/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojoptionpane;

import javax.swing.JOptionPane;


public class ProjectOptionPane {

    public static void main(String[] args) {
        String primeiroNumero = JOptionPane.showInputDialog("Digite o primeiro número");
        String segundoNumero = JOptionPane.showInputDialog("Digite o segundo número");
          
        int numero1 = Integer.parseInt(primeiroNumero);
        int numero2 = Integer.parseInt(segundoNumero);
        
        int soma = numero1 + numero2;
        
        JOptionPane.showMessageDialog(null,"O resultado da soma é: " + soma, "Operação de soma",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
