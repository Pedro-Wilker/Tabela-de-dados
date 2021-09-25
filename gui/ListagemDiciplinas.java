package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.List;


public class ListagemDiciplinas extends JFrame{
    private JLabel labelNome;
    private JLabel labelCpf;
    private JLabel labelSignos;
    private JList listDiciplinas;
    private DefaultListModel<String> modelDiciplinas;


    public class ListagemDiciplinas {

        //inicialiacao dos componentes 
        labelNome= new JLabel("Nome : ");
        labelCpf= new JLabel("CPF : ");
        labelSignos= new JLabel("Signo : ");

        //


        super("Listagem dos alunos");
        btnShowDisciplinas.addActionListener(new EventoShowDisciplinas());
     
        //Janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(600,300);
        pack();
        setVisible(true);
    }
    private class EventoCadastrar implements ActionListener{

        public void actionPerformed(ActionEvent e){ // o método invocado quando o btn cadastrar for pressionado
    
            Cadastro janelaCadastro = new Cadastro("Cadastrar aluno");
    
        }

    private class EventoShowDisciplinas implements ActionListener{

        public void actionPerformed(ActionEvent e){ // o método invocado quando o btn cadastrar for pressionado

            ListagemDisciplinas listagemDisciplinas = new ListagemDisciplinas();

        }

    }

    
}
