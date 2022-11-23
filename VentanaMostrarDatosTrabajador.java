package guis;

import modelo.Trabajador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMostrarDatosTrabajador extends Ventana implements ActionListener {
    JButton volver;
    Trabajador trabajador;

    public VentanaMostrarDatosTrabajador (Trabajador trabajador) {
        this.trabajador = trabajador;

        this.generarEtiqueta("Nombre: " + trabajador.getNombre(), 50,100,200,25);
        this.generarEtiqueta("Apellido: " + trabajador.getApellido(), 50,150,200,25);
        this.generarEtiqueta("Rut: " + trabajador.getRut(), 50,200,200,25);
        this.generarEtiqueta("AFP: " + trabajador.getAfp(), 50,250,200,25);
        this.generarEtiqueta("Isapre: " + trabajador.getIsapre(), 50,300,200,25);

        volver = this.generarBoton("Volver", 10,10,140,25);

        volver.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == volver) {
            this.dispose();
            new VentanaTrabajador(trabajador);
        }
    }
}