package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumnModel;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Listagem extends JFrame{
    private JButton btnCadastrar;
    private JTable tableAlunos;
    private JButton btnShowDiciplinas;

    public class Listagem {
        super("Listagem dos alunos");
        // inicialização dos componentes

        btnCadastrar = new JButton("Cadastrar alunos");
        btnCadastrar.addActionListener((new EventoCadastrar()));

        String[] colunas = {"nome","cpf","signo"};

        Object[][] dados = {
        {"Pedro","123.456.789-00","LEÃO"},
        {"Leandra","123.456.789-00","ÁERIES"},
        {"Bruno","123.456.789-00","SAGITÁRIO"}
        };

        tableAlunos = new JTable(dados,colunas);

        tableAlunos.setPreferredScrollableViewportSize(new Dimension(500,200)); // definie a largura da tabela

        tableAlunos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // restringe a seleção de um único registro na tabela

       btnShowDisciplinas = new JButton("Mostrar disciplinas do aluno");

        // definição dos layouts

       JPanel panel = new JPanel(new BorderLayout(10,10)); // espaçamento de 5px entre os componentes

        panel.setBorder(new EmptyBorder(10,10,10,10));

        panel.add(btnCadastrar, BorderLayout.NORTH);

        panel.add( new JScrollPane(tableAlunos), BorderLayout.CENTER);

        panel.add(btnShowDisciplinas, BorderLayout.SOUTH);

        add(panel); // coloco o painel dentro da janela

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

}
}