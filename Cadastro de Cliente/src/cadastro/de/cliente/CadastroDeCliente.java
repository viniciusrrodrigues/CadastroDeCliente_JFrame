/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastro.de.cliente;
import javax.swing.*;
import java.awt.*;

public class CadastroDeCliente extends JFrame{
    //criando variaveis de instancia
JLabel rotulo1, rotulo2,rotulo3, rotulo4, rotulo5, rotulo6, rotulo7, titulo;
JTextField texto1,texto2,texto3,texto4, texto5, texto6, texto7;
JButton botao1, botao2;
ImageIcon icone, icone2;
//metodo construtor sem parametros
public CadastroDeCliente () {
  super ("Exemplo com JTextField");
Container tela = getContentPane(); 
// seta para receber objetos
setLayout(null); 
// intancia dos objetos do tipo Jlabet
    titulo =  new JLabel ("Cadastro De Cliente");
    rotulo1 = new JLabel ("Nome");
    rotulo2 = new JLabel ("CPF");
    rotulo3 = new JLabel ("RG");
    rotulo4 = new JLabel ("Endereço");
    rotulo5 = new JLabel ("Cidade");
    rotulo6 = new JLabel ("Estado");
    rotulo7 = new JLabel ("CEP:");
    icone = new ImageIcon ("abrir-cadeado.png");
    icone2 = new ImageIcon ("logout.png");
 // intancia dos objetos do tipo JTextField  
        texto1 = new JTextField(100);
        texto2 = new JTextField(100);
        texto3 = new JTextField(100);
        texto4 = new JTextField(100);
        texto5 = new JTextField(100);
        texto6 = new JTextField(100);
        texto7 = new JTextField(100);
        
   // instanciando objetos botões
  botao1 = new JButton ("Enviar", icone);
  botao2 = new JButton ("Fechar", icone2);
      
 // posicionando objetos na tela     
            titulo.setBounds(245,10,200,20);   
            rotulo1.setBounds(50,40,80,20);
            rotulo2.setBounds(50,80,80,20);
            rotulo3.setBounds(50,120,80,20);
            rotulo4.setBounds(50,160,80,20);
            rotulo5.setBounds(50,200,80,20);
            rotulo6.setBounds(50,240,80,20);
            rotulo7.setBounds(50,280,80,20);
            
            botao1.setBounds(100,350,120,20);
            botao2.setBounds(250,350,120,20);
  /*adicionando cor (azul)a fonte do rotulo          
            rotulo1.setForeground(Color.blue);
            rotulo2.setForeground(Color.blue);
            rotulo3.setForeground(Color.blue);
            rotulo4.setForeground(Color.blue);
  */
   // adicionando cor vermelha ao titulo
               titulo.setForeground(Color.red);


            
                texto1.setBounds(50,60,200,20);
                texto2.setBounds(50,100,200,20);
                texto3.setBounds(50,140,200,20);
                texto4.setBounds(50,180,200,20);
                texto5.setBounds(50,220,200,20);
                texto6.setBounds(50,260,200,20);
                texto7.setBounds(50,300,200,20);



                
// adicionando os objetos na tela 
        tela.add(titulo);               
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(rotulo7);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(texto6);
        tela.add(texto7);
        tela.add(botao1);
        tela.add(botao2);
         
       
            setSize(700, 700);
            setVisible(true);
            setLocationRelativeTo(null);
            tela.setBackground(Color.lightGray);
            }
} 