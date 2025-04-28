package hilos.vista;

import hilos.clase.Auto;

import javax.swing.*;
import java.awt.*;

public class ventanaAuto extends JFrame {
    private JLabel lblMarca;
    private JLabel lblModelo;
    private JLabel lblPrecio;
    private JTextField txtMarca;
    private JTextField txtModelo;
    private JTextField txtPrecio;
    private JButton btnGuardar;

    public ventanaAuto(){
        setTitle("Formulario del Auto");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        Auto auto = new Auto();

        lblMarca = new JLabel("Marca:");
        lblMarca.setBounds(10, 10, 80, 25);
        add(lblMarca);

        txtMarca = new JTextField();
        txtMarca.setBounds(100, 10, 160, 25);
        auto.setMarca(txtMarca.getText());
        add(txtMarca);

        lblModelo = new JLabel("Modelo:");
        lblModelo.setBounds(10, 40, 80, 25);
        add(lblModelo);

        txtModelo = new JTextField();
        txtModelo.setBounds(100, 40, 160, 25);
        auto.setModelo(txtModelo.getText());
        add(txtModelo);

        lblPrecio = new JLabel("Precio:");
        lblPrecio.setBounds(10, 70, 80, 25);
        add(lblPrecio);

        txtPrecio = new JTextField();
        txtPrecio.setBounds(100, 70, 160, 25);
        auto.setPrecio(txtPrecio.getText());
        add(txtPrecio);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(180, 100, 80, 25);
        add(btnGuardar);

        btnGuardar.addActionListener(e -> {
            String marca = txtMarca.getText();
            String modelo = txtModelo.getText();
            String precio = txtPrecio.getText();
            this.setVisible(false);

            auto.setMarca(marca);
            auto.setModelo(modelo);
            auto.setPrecio(precio);


            JOptionPane.showMessageDialog(this, "Auto guardado: \n" + "Marca: "+ auto.getMarca() + "\nModelo: " + auto.getModelo() + "\nPrecio: $" + auto.getPrecio());

        });
    }
}
