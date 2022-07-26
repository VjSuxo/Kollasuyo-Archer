/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kollasuyo.archer.Jefe;

import EstructuraDatos.ListaEmpleado;
import EstructuraDatos.NodoEmpleado;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import kollasuyo.archer.GenradorCodigoRegistro;
import kollasuyo.archer.Persistencia;
import kollasuyo.archer.Personal.Bonos;
import kollasuyo.archer.Personal.Empleado;
import kollasuyo.archer.Personal.Jefe;

/**
 *
 * @author victo
 */
public class ControlPersonal extends javax.swing.JFrame {

    /**
     * Creates new form ControlPersonal
     */
    
    DefaultTableModel modelo;
    String[] info = new String[7];
    Persistencia per = new Persistencia();
    ListaEmpleado ls = new ListaEmpleado();
    Empleado emp ;
    Jefe j;
    int sw=1;
    public void setJefe(Jefe j){
        this.j = j;
    }
    
    public void CargarTabla(){        
            
        try {
            ls = (ListaEmpleado) per.recuperar("empleado");
        } catch (IOException ex) {
            Logger.getLogger(ControlPersonal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControlPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
         if(ls!=null){
                NodoEmpleado nodo = ls.getP();
                while(nodo!=null){
                    emp = nodo.getEmpleado();
                    info[0] = emp.getCi();
                    info[1] = emp.getNombre();
                    info[2] = String.valueOf(emp.getContDispVendidos());
                    info[3] = emp.getDiaDescanso();
                    info[4] = String.valueOf(emp.getPago());
                    info[5] = String.valueOf(emp.getBonos().ObtenerBonos());
                    Bonos b = emp.getBonos();
                    
                    System.out.println(b.ObtenerBonos());
                    double x = emp.getPago()+emp.getBonos().ObtenerBonos();
                    info[6] = String.valueOf(x);
                    System.out.println(info[0]+" 1  "+info[1]+" 2  "+info[2]+" 3  "+info[3]+" 4  "+info[4]+" 5");
                    modelo.addRow(info);
                    nodo = nodo.getSig();
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"No hay empleados registrados");
            }
           
       
    }
    
    private String[][] mDias = new String[2][7];
    private String[] vDias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
    private void CargarDias(){
        int x = ls.nroNodos()/7;        
        if(x==0){
            x=1;
        }
        
        
        System.out.println("Cantida de capacida : "+x);
        mDias[0][0]="Lunes";        
        mDias[1][0]=String.valueOf(x);
        mDias[0][1]="Martes";
        mDias[1][1]=String.valueOf(x);
        mDias[0][2]="Miercoles";
        mDias[1][2]=String.valueOf(x);
        mDias[0][3]="Jueves";
        mDias[1][3]=String.valueOf(x);
        mDias[0][4]="Viernes";
        mDias[1][4]=String.valueOf(x);
        mDias[0][5]="Sabado";
        mDias[1][5]=String.valueOf(x);
        mDias[0][6]="Domingo";
        mDias[1][6]=String.valueOf(x);
        
        for(String dias : vDias){
            Combo.addItem(dias);
        }
        
        NodoEmpleado p = ls.getP();
        while(p!=null){
            emp = p.getEmpleado();
            
            if(emp.getDiaDescanso()!=null){
                switch(emp.getDiaDescanso()){
                case "Lunes":
                            if(!mDias[1][0].equals("0"))
                            {
                                mDias[1][0] = String.valueOf(Integer.parseInt(mDias[1][0])-1);
                                if(mDias[1][0].equals("0")){
                                    Combo.removeItem("Lunes");
                                }
                            }
                            else{
                            
                            }                            
                            break;
                case "Martes":
                            if(!mDias[1][1].equals("0"))
                            {
                                 mDias[1][1] = String.valueOf(Integer.parseInt(mDias[1][1])-1);
                                 if(mDias[1][1].equals("0")){
                                    Combo.removeItem("Martes");
                                }
                            }
                            break;            
                case "Miercoles":
                            if(!mDias[1][2].equals("0"))
                            {
                                 mDias[1][2] = String.valueOf(Integer.parseInt(mDias[1][2])-1);
                                 if(mDias[1][2].equals("0")){
                                    Combo.removeItem("Miercoles");
                                }
                            }
                            break;
                case "Jueves":
                            if(!mDias[1][3].equals("0"))
                            {
                                 mDias[1][3] = String.valueOf(Integer.parseInt(mDias[1][3])-1);
                                 if(mDias[1][3].equals("0")){
                                    Combo.removeItem("Jueves");
                                }
                            }
                            break;
                case "Viernes":
                            if(!mDias[1][4].equals("0"))
                            {
                                 mDias[1][4] = String.valueOf(Integer.parseInt(mDias[1][4])-1);
                                 if(mDias[1][4].equals("0")){
                                    Combo.removeItem("Viernes");
                                }
                            }
                            break;
                case "Sabado":
                            if(!mDias[1][5].equals("0"))
                            {
                                 mDias[1][5] = String.valueOf(Integer.parseInt(mDias[1][5])-1);
                                 if(mDias[1][5].equals("0")){
                                    Combo.removeItem("Sabado");
                                }
                            }
                            break;
                 case "Domingo":
                            if(!mDias[1][6].equals("0"))
                            {
                                 mDias[1][6] = String.valueOf(Integer.parseInt(mDias[1][6])-1);
                                 if(mDias[1][6].equals("0")){
                                    Combo.removeItem("Domingo");
                                }
                            }
                            break;           
            }
            }
            
            p = p.getSig();
        }
                  
        
    }
    
      FondoPanel fondo = new FondoPanel();
    
    public ControlPersonal() {
         this.setContentPane(fondo);
        initComponents();
        modificarPago.setEnabled(false);
        modiificarDia.setEnabled(false);
        setLocationRelativeTo(null);
        modelo = new DefaultTableModel();
        modelo.addColumn("Ci");
        modelo.addColumn("Nombre");
        modelo.addColumn("Disp Vendidos");
        modelo.addColumn("Dia Descanso");
        modelo.addColumn("Pago");
        modelo.addColumn("Bonos");
        modelo.addColumn("Pago Total");
        this.tabla.setModel(modelo);
        CargarTabla();
        CargarDias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        modificarPago = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Combo = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        datos = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pago = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        modiificarDia = new javax.swing.JButton();
        modificarPago1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 61, 903, 265));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("LISTA DE PERSONAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 12, 252, 43));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 903, 10));

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 103, 40));

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, 160, 120));

        modificarPago.setText("Modificar");
        modificarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarPagoActionPerformed(evt);
            }
        });
        getContentPane().add(modificarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 103, 40));

        jButton2.setText("Añadir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 103, 40));

        Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        getContentPane().add(Combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 132, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 17, 150));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Pago :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 60, -1));

        datos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 870, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Dia Descanso :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 132, -1));

        pago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pagoKeyTyped(evt);
            }
        });
        getContentPane().add(pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 130, 30));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 930, 10));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 408, 903, 10));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 20, 150));

        modiificarDia.setText("Modificar");
        modiificarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modiificarDiaActionPerformed(evt);
            }
        });
        getContentPane().add(modiificarDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 103, 40));

        modificarPago1.setText("Modificar");
        modificarPago1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarPago1ActionPerformed(evt);
            }
        });
        getContentPane().add(modificarPago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 103, 40));

        jButton3.setText("Ver Contraseña");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int fila = tabla.getSelectedRow();
        
        if(fila>=0){
            
            String id = tabla.getValueAt(fila,0).toString();
            ls.eliminar(id);
            modelo.removeRow(fila);            
        }
        else{
            JOptionPane.showMessageDialog(null,"Seleccionar Fila");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        if(sw ==0 ){
            JOptionPane.showMessageDialog(null,"Cambios Guardados");
        }
        ls.mostrar();
        per.guardar((ListaEmpleado)ls, "empleado");
        InicioJefe ini = new InicioJefe();
        ini.setVisible(true);
        ini.Jefe(j);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void modificarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPagoActionPerformed
        // TODO add your handling code here:
        int fila = tabla.getSelectedRow();
        String ci = String.valueOf(tabla.getValueAt(fila,0));
        ModificarPago(ci,fila);
        
        
    }//GEN-LAST:event_modificarPagoActionPerformed
    private void ModificarPago(String ci,int fila){
        NodoEmpleado p = ls.getP();
        while(p!=null){
            emp = p.getEmpleado();
            if(emp.getCi().equals(ci)){
                emp.setPago(Double.parseDouble(String.valueOf(this.pago.getText())));
                ls.Modificar(ci, emp);
                tabla.setValueAt(String.valueOf(this.pago.getText()),fila,4);
                sw=0;
                this.pago.setText("0");
                break;
            }
            p=p.getSig();
        }
      
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        GenradorCodigoRegistro gen = new GenradorCodigoRegistro("empleado");
        String c = gen.generarCodigo();
        Persistencia per = new Persistencia();
        per.guardar(gen, "codigo");
        System.out.println(c);
        JOptionPane.showMessageDialog(null,"El codigo para el registro es : \n"+c);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void modiificarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modiificarDiaActionPerformed
        // TODO add your handling code here:
        int fila = tabla.getSelectedRow();
        String ci = String.valueOf(tabla.getValueAt(fila,0));
        String item = Combo.getSelectedItem().toString();
        if(!item.equals("Seleccionar")){
            switch(item){
                case "Lunes":
                            if(!mDias[1][0].equals("0"))
                            {
                                ModificarDia("Lunes", ci,fila);
                                mDias[1][0] = String.valueOf(Integer.parseInt(mDias[1][0])-1);
                                if(mDias[1][0].equals("0")){
                                    Combo.removeItem(Combo.getSelectedItem());
                                }
                            }
                            else{
                            
                            }                            
                            break;
                case "Martes":
                            if(!mDias[1][1].equals("0"))
                            {
                                ModificarDia("Martes", ci,fila);
                                 mDias[1][1] = String.valueOf(Integer.parseInt(mDias[1][1])-1);
                                 if(mDias[1][1].equals("0")){
                                    Combo.removeItem(Combo.getSelectedItem());
                                }
                            }
                            break;            
                case "Miercoles":
                            if(!mDias[1][2].equals("0"))
                            {
                                ModificarDia("Miercoles", ci,fila);
                                 mDias[1][2] = String.valueOf(Integer.parseInt(mDias[1][2])-1);
                                 if(mDias[1][2].equals("0")){
                                    Combo.removeItem(Combo.getSelectedItem());
                                }
                            }
                            break;
                case "Jueves":
                            if(!mDias[1][3].equals("0"))
                            {
                                ModificarDia("Jueves", ci,fila);
                                 mDias[1][3] = String.valueOf(Integer.parseInt(mDias[1][3])-1);
                                 if(mDias[1][3].equals("0")){
                                    Combo.removeItem(Combo.getSelectedItem());
                                }
                            }
                            break;
                case "Viernes":
                            if(!mDias[1][4].equals("0"))
                            {
                                ModificarDia("Viernes", ci,fila);
                                 mDias[1][4] = String.valueOf(Integer.parseInt(mDias[1][4])-1);
                                 if(mDias[1][4].equals("0")){
                                    Combo.removeItem(Combo.getSelectedItem());
                                }
                            }
                            break;
                case "Sabado":
                            if(!mDias[1][5].equals("0"))
                            {
                                ModificarDia("Sabado", ci,fila);
                                 mDias[1][5] = String.valueOf(Integer.parseInt(mDias[1][5])-1);
                                 if(mDias[1][5].equals("0")){
                                    Combo.removeItem(Combo.getSelectedItem());
                                }
                            }
                            break;
                 case "Domingo":
                            if(!mDias[1][6].equals("0"))
                            {
                                ModificarDia("Domingo", ci,fila);
                                 mDias[1][6] = String.valueOf(Integer.parseInt(mDias[1][6])-1);
                                 if(mDias[1][6].equals("0")){
                                    Combo.removeItem(Combo.getSelectedItem());
                                }
                            }
                            break;           
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Seleccione dia");
        }
    }//GEN-LAST:event_modiificarDiaActionPerformed
    
    private void ModificarDia(String dia,String ci,int fila){
        NodoEmpleado p = ls.getP();
        while(p!=null){
            emp = p.getEmpleado();
            if(emp.getCi().equals(ci)){
                emp.setDiaDescanso(dia);
                ls.Modificar(ci, emp);
                tabla.setValueAt(dia,fila,3);
                sw=0;
                break;
            }
            p=p.getSig();
        }
      
    }
    private void modificarPago1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPago1ActionPerformed
        // TODO add your handling code here:
        int fila = tabla.getSelectedRow();
        
        if(fila>=0){
            String datos = "Ci : "+tabla.getValueAt(fila,0)+" Nombre : "+tabla.getValueAt(fila,1);
            this.datos.setText(datos);
            modificarPago.setEnabled(true);
            modiificarDia.setEnabled(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Seleccione un empleado");
        }
    }//GEN-LAST:event_modificarPago1ActionPerformed

    private void pagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pagoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_pagoKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int fila = tabla.getSelectedRow();
        
        if(fila>=0){
            String datos = tabla.getValueAt(fila,0).toString();
            NodoEmpleado emp = ls.getP();
            while(emp!=null){
                if(emp.getEmpleado().getCi().equals(datos)){
                    JOptionPane.showMessageDialog(null,"Usuario : "+emp.getEmpleado().getLog().getUsuario()+"\n Contraseña :"+emp.getEmpleado().getLog().getContraseña());
                }
                
                emp = emp.getSig();
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Seleccione un empleado");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ControlPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo;
    private javax.swing.JLabel datos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton modificarPago;
    private javax.swing.JButton modificarPago1;
    private javax.swing.JButton modiificarDia;
    private javax.swing.JTextField pago;
    private javax.swing.JButton regresar;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
   class FondoPanel extends JPanel{
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Img/Fondo-0.jpg")).getImage();
            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
        
    }
}
