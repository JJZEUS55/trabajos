/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazvoltimetro;

import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultValueDataset;
import java.awt.*;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.dial.*;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.general.ValueDataset;
import org.jfree.ui.GradientPaintTransformType;
import org.jfree.ui.StandardGradientPaintTransformer;

/**
 *
 * @author usuario
 */
public class Prueba1 extends javax.swing.JFrame {

    static DefaultValueDataset dataset;

    static class DemoPanel extends JPanel implements ChangeListener {

        public static JFreeChart createStandardDialChart(String s, String s1, ValueDataset valuedataset, double d, double d1, double d2, int i) {
            DialPlot dialplot = new DialPlot();
            dialplot.setDataset(valuedataset);
            dialplot.setDialFrame(new StandardDialFrame());
            dialplot.setBackground(new DialBackground());
            DialTextAnnotation dialtextannotation = new DialTextAnnotation(s1);
            dialtextannotation.setFont(new Font("Dialog", 1, 14));
            dialtextannotation.setRadius(0.69999999999999996D);
            dialplot.addLayer(dialtextannotation);
            DialValueIndicator dialvalueindicator = new DialValueIndicator(0);
            dialplot.addLayer(dialvalueindicator);
            StandardDialScale standarddialscale = new StandardDialScale(d, d1, -120D, -300D, 10D, 4);
            standarddialscale.setMajorTickIncrement(d2);
            standarddialscale.setMinorTickCount(i);
            standarddialscale.setTickRadius(0.88D);
            standarddialscale.setTickLabelOffset(0.14999999999999999D);
            standarddialscale.setTickLabelFont(new Font("Dialog", 0, 14));
            dialplot.addScale(0, standarddialscale);
            dialplot.addPointer(new org.jfree.chart.plot.dial.DialPointer.Pin());
            DialCap dialcap = new DialCap();
            dialplot.setCap(dialcap);
            return new JFreeChart(s, dialplot);
        }

        public void stateChanged(ChangeEvent changeevent) {
//			dataset.setValue(new Integer(slider.getValue()));
        }

        public DemoPanel() {
            super(new BorderLayout());
            dataset = new DefaultValueDataset(0D);
            JFreeChart jfreechart = createStandardDialChart("Voltimetro", "Volts", dataset, 0D, 60D, 10D, 9);
            DialPlot dialplot = (DialPlot) jfreechart.getPlot();
            StandardDialRange standarddialrange = new StandardDialRange(40D, 60D, Color.red);
            standarddialrange.setInnerRadius(0.52000000000000002D);
            standarddialrange.setOuterRadius(0.55000000000000004D);
            dialplot.addLayer(standarddialrange);
            StandardDialRange standarddialrange1 = new StandardDialRange(20D, 40D, Color.orange);
            standarddialrange1.setInnerRadius(0.52000000000000002D);
            standarddialrange1.setOuterRadius(0.55000000000000004D);
            dialplot.addLayer(standarddialrange1);
            StandardDialRange standarddialrange2 = new StandardDialRange(0D, 20D, Color.green);
            standarddialrange2.setInnerRadius(0.52000000000000002D);
            standarddialrange2.setOuterRadius(0.55000000000000004D);
            dialplot.addLayer(standarddialrange2);
            GradientPaint gradientpaint = new GradientPaint(new Point(), new Color(255, 255, 255), new Point(), new Color(170, 170, 220));
            DialBackground dialbackground = new DialBackground(gradientpaint);
            dialbackground.setGradientPaintTransformer(new StandardGradientPaintTransformer(GradientPaintTransformType.VERTICAL));
            dialplot.setBackground(dialbackground);
            dialplot.removePointer(0);
            org.jfree.chart.plot.dial.DialPointer.Pointer pointer = new org.jfree.chart.plot.dial.DialPointer.Pointer();
            dialplot.addPointer(pointer);
            ChartPanel chartpanel = new ChartPanel(jfreechart);
            chartpanel.setPreferredSize(new Dimension(500, 500));
//			slider = new JSlider(-40, 60);
//			slider.setMajorTickSpacing(10);
//			slider.setPaintLabels(true);
//			slider.addChangeListener(this);
            add(chartpanel);

//			add(slider, "South");
        }
    }

    public static JPanel createDemoPanel() {
        return new DemoPanel();
    }

    public Prueba1() {
        initComponents();
        jFrameVoltimetro.setContentPane(createDemoPanel());
        //jPanel1.add(new DemoPanel());
//        setDefaultCloseOperation(3);        
//        setContentPane(createDemoPanel());
        //setContentPane(createDemoPanel());     

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtfValor = new javax.swing.JTextField();
        jFrameVoltimetro = new javax.swing.JInternalFrame();
        jbtnPrueba = new javax.swing.JButton();
        jlabelImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Volts");

        jFrameVoltimetro.setTitle("Voltimetro");
        jFrameVoltimetro.setMaximumSize(new java.awt.Dimension(500, 500));
        jFrameVoltimetro.setVisible(true);

        javax.swing.GroupLayout jFrameVoltimetroLayout = new javax.swing.GroupLayout(jFrameVoltimetro.getContentPane());
        jFrameVoltimetro.getContentPane().setLayout(jFrameVoltimetroLayout);
        jFrameVoltimetroLayout.setHorizontalGroup(
            jFrameVoltimetroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );
        jFrameVoltimetroLayout.setVerticalGroup(
            jFrameVoltimetroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        jbtnPrueba.setText("prueba");
        jbtnPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPruebaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jbtnPrueba))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jlabelImagen)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
                .addComponent(jFrameVoltimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFrameVoltimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)
                        .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jbtnPrueba)
                        .addGap(53, 53, 53)
                        .addComponent(jlabelImagen)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        try {
            jFrameVoltimetro.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPruebaActionPerformed

        ImageIcon icon = null;

        int valor = Integer.parseInt(jtfValor.getText().toString());

        dataset.setValue(valor);
        if (valor == 0) {
            icon = new ImageIcon("src\\Imagenes\\v0.jpg");
        } else if (valor > 0 && valor <= 20) {
            icon = new ImageIcon("src\\Imagenes\\v1.jpg");

        } else if (valor > 20 && valor <= 40) {
            icon = new ImageIcon("src\\Imagenes\\v2.jpg");

        } else if (valor >= 40 && valor <= 60) {
            icon = new ImageIcon("src\\Imagenes\\max.jpg");

        }
        Image img = icon.getImage();
        Image newimg = img.getScaledInstance(275, 300, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newimg);
        jlabelImagen.setIcon(newIcon);
        jlabelImagen.setSize(275, 300);
    }//GEN-LAST:event_jbtnPruebaActionPerformed

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
            java.util.logging.Logger.getLogger(Prueba1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prueba1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prueba1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prueba1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prueba1().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jFrameVoltimetro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtnPrueba;
    private javax.swing.JLabel jlabelImagen;
    private javax.swing.JTextField jtfValor;
    // End of variables declaration//GEN-END:variables
}
