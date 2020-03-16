package Lesson4.HW;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PFChat {
    private JPanel lowerPanel;
    private JButton btSend;
    private JTextField textField1;
    private JList<String> list1;
    private JList<String> list2;
    private JPanel PFChat;
    private JPanel pnlContacts;
    private JPanel pnlChat;
    private String currSelection;

    public PFChat() {
        DefaultListModel<String> listModel1 = new DefaultListModel<>();
        DefaultListModel<String> listModel2 = new DefaultListModel<>();
        list1.setModel(listModel1);
        list2.setModel(listModel2);
        String [] contactList = {"Аня", "Катя", "Наташа", "Илья"};
        for (int i = 0; i < contactList.length; i++) {
            listModel2.addElement(contactList[i]);
        }


        list2.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                setName(list2.getSelectedValue());
            }
        });

        btSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String sendMsg = textField1.getText();
                if (getName()  == null || getName() .equals("")) {
                    listModel1.addElement(sendMsg);
                } else {
                       listModel1.addElement(currSelection + ", " + sendMsg);
                }
                textField1.setText("");
            }
        });
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String sendMsg = textField1.getText();
                if (getName()  == null || getName() .equals("")) {
                    listModel1.addElement(sendMsg);
                } else {

                    listModel1.addElement(currSelection + ", " + sendMsg);
                }
                textField1.setText("");

            }
        });
    }

    public String getName() {
        return currSelection;
    }

    public void setName(String incName) {
         currSelection = incName;
    }
    public static void main(String[] args) {
        JFrame frmChat = new JFrame("PFChat");
        frmChat.setContentPane(new PFChat().PFChat);
        frmChat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frmChat.setBounds(400,100,600,600);
       // frmChat.setSize(600,600);

        frmChat.pack();
        frmChat.setVisible(true);

    }

}
