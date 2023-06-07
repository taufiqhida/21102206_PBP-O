package com.muhamad_taufiq_hidayat.pbo.pertemuan7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class register extends JFrame {
    private JTextField text_nama;
    private JTextField txt_nim;
    private JComboBox cb_prodi;
    private JTextField txt_telepon;
    private JRadioButton lakiLaki;
    private JRadioButton perempuan;
    private JButton saveButton;
    private JButton clearButton;
    private JTextArea ta_alamat;
    private javax.swing.JPanel JPanel;
    private JLabel laki;
    private ButtonGroup jk;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
    public register(){
        super("Form Registrasi");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(JPanel);
        this.setSize(800, 600);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text_nama.setText("");
                txt_nim.setText("");
                txt_telepon.setText("");
                ta_alamat.setText("");
                cb_prodi.setSelectedIndex(0);
                lakiLaki.setSelected(false);
                perempuan.setSelected(false);
                jk.clearSelection();
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = text_nama.getText();
                String nim = txt_nim.getText();
                String telp = txt_telepon.getText();
                String alamat = ta_alamat.getText();
                String jk;
                if(lakiLaki.isSelected()){
                    jk = "laki = laki";
                }else if(perempuan.isSelected()) {
                    jk = "perempuan";
                }else{
                    jk = "belum di pilih";
                }
                if(nama.isEmpty() ||nim.isEmpty() || telp.isEmpty() || alamat.isEmpty() || jk.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Data Tidak Boleh Kosing");
                }else{
                    JOptionPane.showMessageDialog(null, "Data "+ nama + " Berhasil di simpan");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new register();
        frame.setVisible(true);
    }


}

