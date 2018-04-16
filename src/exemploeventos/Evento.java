package exemploeventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Evento implements ActionListener{
    
    JFrame marco;
    JPanel panel;
    JButton bAzul,bVermello,bAmarelo;
    
     public Evento(){
        marco=new JFrame("Ventana  Eventos 1!!");
        panel=new JPanel();
        bAzul=new JButton("Azul");
        bVermello=new JButton("Vermello");
        bAmarelo=new JButton("Amarelo");
        
        marco.setSize(400, 200);
        panel.add(bAzul);
        panel.add(bVermello);
        panel.add(bAmarelo);
        marco.add(panel);
        bAzul.addActionListener(this);
        bVermello.addActionListener(this);
        bAmarelo.addActionListener(this);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //.getSource sirve para saber que boton presionamos, devuelve un Object por eso lo guardamos en boton.
        Object boton=e.getSource();
        if(boton==bAzul){
        panel.setBackground(Color.BLUE);
        }else if(boton==bVermello){
        panel.setBackground(Color.RED);
        }else
        panel.setBackground(Color.yellow);
    }
    
}
