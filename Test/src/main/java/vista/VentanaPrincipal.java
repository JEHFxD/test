package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends javax.swing.JFrame implements ActionListener{
    
    private JButton btnSuma, btnResta, limpiar;
    private JTextField campoNum1, campoNum2;
    private JLabel Num1,Num2,Resultado, Suma;
    private JPanel miPanel;
    
            
    public VentanaPrincipal(){
        initComponent();
        setSize(400,300);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    private void initComponent(){
      miPanel = new JPanel();
        
      miPanel.setLayout(null);
      miPanel.setBackground(Color.LIGHT_GRAY);
      add(miPanel);
      
      btnSuma = new JButton("sumar");
      btnSuma.setBounds(30,140,100,30);
      btnSuma.addActionListener(this);
      miPanel.add(btnSuma);
      
      btnResta = new JButton("restar");
      btnResta.setBounds(150,140,100,30);
      btnResta.addActionListener(this);
      miPanel.add(btnResta);
      
      limpiar = new JButton("limpiar");
      limpiar.setBounds(270,140,100,30);
      limpiar.addActionListener(this);
      miPanel.add(limpiar);
      
      campoNum1 = new JTextField();
      campoNum1.setBounds(80,80,100,30);
      miPanel.add(campoNum1);
      
      campoNum2 = new JTextField();
      campoNum2.setBounds(200,80,100,30);
      miPanel.add(campoNum2);
      
      Num1 = new JLabel();
      Num1.setText("Numero 1");
      Num1.setBounds(100,40,80,40);
      miPanel.add(Num1);
      
      Num2 = new JLabel();
      Num2.setText("Numero 2");
      Num2.setBounds(220,40,80,40);
      miPanel.add(Num2);
      
      
      
    }
          
            
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
