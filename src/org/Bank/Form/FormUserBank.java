package org.Bank.Form;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormUserBank {
    private JTextField textNomorKartu;
    private JComboBox comboJenisATM;
    private JComboBox comboBank;
    private JButton buttonBrowser;
    private JButton buttonSimpan;
    private JTextArea textArea1;
    private JTextField textNamaPemillik;
    private JScrollPane viewImage;

    public FormUserBank() {
        buttonSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonBrowser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
