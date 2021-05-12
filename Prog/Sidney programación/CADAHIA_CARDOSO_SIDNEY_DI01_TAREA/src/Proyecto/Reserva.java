/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;//Importaciones
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;

/**
 *
 * @author dedei
 */
public class Reserva extends javax.swing.JFrame {
    Calendar calendar = Calendar.getInstance();
    /**
     * Creates new form Inicio
     */
    public Reserva() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        evento.add(banquete);
        evento.add(jornada);
        evento.add(congreso);
        cocina.add(buffet);
        cocina.add(carta);
        citaChef.add(si);
        citaChef.add(no);
        Date inicio = calendar.getTime();
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        Date fechaAnterior = calendar.getTime();
        calendar.add(Calendar.YEAR, 2);
        Date fechaPosterior = calendar.getTime();
        SpinnerModel fechaModel = new SpinnerDateModel(inicio, fechaAnterior, fechaPosterior, Calendar.YEAR);
        Fecha.setModel(fechaModel);
        Fecha.setEditor(new JSpinner.DateEditor(Fecha, "dd/MM/yyyy"));
        NumJornadas.setEnabled(false);
        NumHabs.setEnabled(false);
        
    }

    Reserva(Inicio aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cocina = new javax.swing.ButtonGroup();
        citaChef = new javax.swing.ButtonGroup();
        evento = new javax.swing.ButtonGroup();
        Título = new javax.swing.JLabel();
        TNombre = new javax.swing.JLabel();
        NombreReserva = new javax.swing.JTextField();
        TTelefono = new javax.swing.JLabel();
        TelefonoReserva = new javax.swing.JTextField();
        TFecha = new javax.swing.JLabel();
        TEvento = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TCatering = new javax.swing.JLabel();
        TCita = new javax.swing.JLabel();
        Aceptar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        banquete = new javax.swing.JRadioButton();
        jornada = new javax.swing.JRadioButton();
        congreso = new javax.swing.JRadioButton();
        buffet = new javax.swing.JRadioButton();
        carta = new javax.swing.JRadioButton();
        si = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        Fecha = new javax.swing.JSpinner();
        Tjornadas = new javax.swing.JLabel();
        THabs = new javax.swing.JLabel();
        NumJornadas = new javax.swing.JSpinner();
        NumHabs = new javax.swing.JSpinner();
        NumPersonas = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Salon Habana");
        setBackground(java.awt.SystemColor.activeCaption);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());

        Título.setBackground(new java.awt.Color(153, 153, 153));
        Título.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Título.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Título.setText("Gestor de Reservas");

        TNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TNombre.setText("Nombre:");
        TNombre.setToolTipText("nombre");

        NombreReserva.setToolTipText("Introduzca el nombre");
        NombreReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NombreReservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NombreReservaMouseExited(evt);
            }
        });

        TTelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TTelefono.setText("Teléfono:");
        TTelefono.setToolTipText("Telefono");

        TelefonoReserva.setToolTipText("Introduzca el teléfono");
        TelefonoReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TelefonoReservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TelefonoReservaMouseExited(evt);
            }
        });
        TelefonoReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoReservaActionPerformed(evt);
            }
        });
        TelefonoReserva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TelefonoReservaKeyTyped(evt);
            }
        });

        TFecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TFecha.setText("Fecha:");
        TFecha.setToolTipText("Fecha");

        TEvento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TEvento.setText("Tipo de evento:");
        TEvento.setToolTipText("Seleccione el evento");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Número de personas:");
        jLabel6.setToolTipText("Número de personas");

        TCatering.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TCatering.setText("Tipo de catering:");
        TCatering.setToolTipText("Seleccione el catering ");

        TCita.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TCita.setText("Cita con el cheff:");
        TCita.setToolTipText("Seleccione si quiere cita con el cheff");

        Aceptar.setText("Aceptar");
        Aceptar.setToolTipText("Pulse aqui cuando haya realizado el formulario al completo");
        Aceptar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Aceptar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AceptarMouseExited(evt);
            }
        });
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.setToolTipText("Pulse aqui para volver a inicio");
        Salir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Salir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        banquete.setText("Banquete");
        banquete.setToolTipText("Banquete");
        banquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                banqueteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                banqueteMouseExited(evt);
            }
        });
        banquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banqueteActionPerformed(evt);
            }
        });

        jornada.setText("Jornada");
        jornada.setToolTipText("Jornada");
        jornada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jornadaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jornadaMouseExited(evt);
            }
        });
        jornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jornadaActionPerformed(evt);
            }
        });

        congreso.setText("Congreso");
        congreso.setToolTipText("Congreso");
        congreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                congresoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                congresoMouseExited(evt);
            }
        });
        congreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congresoActionPerformed(evt);
            }
        });

        buffet.setText("Buffet");
        buffet.setToolTipText("Buffet");
        buffet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buffetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buffetMouseExited(evt);
            }
        });
        buffet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buffetActionPerformed(evt);
            }
        });

        carta.setText("Carta");
        carta.setToolTipText("Carta");
        carta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cartaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cartaMouseExited(evt);
            }
        });
        carta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartaActionPerformed(evt);
            }
        });

        si.setText("Si");
        si.setToolTipText("Si");
        si.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                siMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                siMouseExited(evt);
            }
        });

        no.setText("No");
        no.setToolTipText("No");
        no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                noMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                noMouseExited(evt);
            }
        });

        Fecha.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(), new java.util.Date(1664635200000L), java.util.Calendar.DAY_OF_MONTH));
        Fecha.setToolTipText("Seleccione la fecha");
        Fecha.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                FechaStateChanged(evt);
            }
        });
        Fecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FechaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FechaMouseExited(evt);
            }
        });
        Fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FechaKeyTyped(evt);
            }
        });

        Tjornadas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Tjornadas.setText("Nº Jornadas: ");
        Tjornadas.setToolTipText("NumJornadas");

        THabs.setText("Nº Habitaciones:");
        THabs.setToolTipText("NumHabitaciones");

        NumJornadas.setModel(new javax.swing.SpinnerNumberModel(10, 10, 30, 1));
        NumJornadas.setToolTipText("?Cuantas Jornadas serán?");
        NumJornadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NumJornadasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NumJornadasMouseExited(evt);
            }
        });

        NumHabs.setModel(new javax.swing.SpinnerNumberModel(20, 20, 200, 1));
        NumHabs.setToolTipText("Seleccione las habitaciones necesarias");
        NumHabs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NumHabsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NumHabsMouseExited(evt);
            }
        });

        NumPersonas.setModel(new javax.swing.SpinnerNumberModel(1, 1, 200, 1));
        NumPersonas.setToolTipText("Indique cuantas personas asistirán");
        NumPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NumPersonasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NumPersonasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TFecha)
                            .addComponent(TNombre)
                            .addComponent(TTelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NombreReserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TelefonoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Aceptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Salir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Tjornadas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NumJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(THabs)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NumHabs, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(TCatering)
                                            .addComponent(TEvento)
                                            .addComponent(TCita))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(si)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(no))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(buffet)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(carta))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(banquete)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jornada)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(congreso))))
                                    .addComponent(Título)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(NumPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Título)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TNombre)
                    .addComponent(NombreReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TTelefono)
                    .addComponent(TelefonoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(banquete, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEvento)
                    .addComponent(jornada, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(congreso, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TCatering)
                    .addComponent(buffet)
                    .addComponent(carta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TCita)
                    .addComponent(si)
                    .addComponent(no))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(NumPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tjornadas)
                    .addComponent(THabs)
                    .addComponent(NumJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumHabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Salir)
                    .addComponent(Aceptar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jornada.getAccessibleContext().setAccessibleName("jRadioButton2");
        congreso.getAccessibleContext().setAccessibleName("jRadioButton3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TelefonoReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoReservaActionPerformed
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
        getImage(ClassLoader.getSystemResource("Imagenes/Logo.png"));
        return retValue;
    }
    
    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
       String nombre= this.NombreReserva.getText();
       String Telefono=this.TelefonoReserva.getText();
       Date fecha=(Date) Fecha.getValue();
       SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
       String fechat=formatter.format(fecha);
       String Evento=obEvento();
       String Cocina=obCocina();
       String Citac=obCita();
       String nPersonas= NumPersonas.getValue().toString();
       nPersonas=nPersonas.trim();
       String nJornadas="";
       String nHabs="";
       if(congreso.isSelected()){
           nJornadas= this.NumJornadas.getValue().toString();
           nHabs=this.NumHabs.getValue().toString();
       }
       String[] error=controlError(nombre,Telefono,Evento,Cocina,Citac);
      
       if(error[0].equalsIgnoreCase("Sin errores")){
        this.Reset(error[1]);
        JOptionPane.showMessageDialog(null, PrintDetalles(nombre,Telefono,fechat,Evento,Cocina,Citac,nPersonas,nJornadas,nHabs), "Reserva Confirmada",JOptionPane.INFORMATION_MESSAGE);
                
        Inicio menu = new Inicio(); 
        menu.setLocationRelativeTo(null);
        this.setVisible(false);
        menu.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
        menu.setVisible(true);
        
      
        dispose();
       }
       else{
        this.Reset(error[1]);
        this.IndicadorErrores(error[0]);
        
        JOptionPane.showMessageDialog(null, error[0], "Error en la reserva",JOptionPane.INFORMATION_MESSAGE);
       }
       
       
    }//GEN-LAST:event_AceptarActionPerformed
    
    private String[] controlError(String nombre,String tel,String evento,String cocina,String cita){
        String[] aux=new String[2];
        aux[0]="";
        aux[1]="";
        int cont=0;
        if(nombre.length()==0){
            aux[0]+="No ha ingresado el nombre\n";
            cont++;
        }else
            aux[1]+="nombre ";
        if(tel.length()==0){
            aux[0]+="No ha ingresado el teléfono\n";
            cont++;
        }else
            if(tel.length()<9){
            aux[0]+="Número de teléfono incorrecto\n";
            TelefonoReserva.setText("");
            cont++;
        }else
            aux[1]+="telefono ";
          
        if(evento.equalsIgnoreCase("Not")){
            aux[0]+="No ha seleccionado el evento\n";
            cont++;
        }else 
            aux[1]+="evento ";
        if(cocina.equalsIgnoreCase("Not")){
            aux[0]+="No ha seleccionado el catering\n";
            cont++;
        }else 
            aux[1]+="catering ";
        if(cita.equalsIgnoreCase("Not")){
            aux[0]+="No ha seleccionado si quiere cita con el chef";
            cont++;
        }else 
            aux[1]+="cita ";
        if(cont==0)
            aux[0]+="Sin errores";
            else
            aux[1]+="Total ";
        
        return aux;
    }
    
    private void IndicadorErrores(String s){
        if(s.contains("nombre"))
            this.TNombre.setForeground(Color.red);
        if(s.contains("teléfono"))
            this.TTelefono.setForeground(Color.red);
        if(s.contains("evento"))
            this.TEvento.setForeground(Color.red);
        if(s.contains("catering"))
            this.TCatering.setForeground(Color.red);
         if(s.contains("cita"))
            this.TCita.setForeground(Color.red);
    }
    private void Reset(String s){
        if(s.contains("nombre"))
            this.TNombre.setForeground(Color.black);
        if(s.contains("telefono"))
            this.TTelefono.setForeground(Color.black);
        if(s.contains("evento"))
            this.TEvento.setForeground(Color.black);
        if(s.contains("catering"))
            this.TCatering.setForeground(Color.black);
        if(s.contains("cita"))
            this.TCita.setForeground(Color.black);
    }
    private String PrintDetalles(String nombre,String tel,String d,String evento,String cocina, String cita,String np,String nj,String nh){
        String aux="";
        if(evento.equalsIgnoreCase("Congreso"))
            aux+="Nombre: "+nombre+"   Telefono: "+tel+
                             "\nFecha: "+d+"   Evento: "+evento+"\nNúmero de personas: "+np+
                             "\nCatering: "+cocina+"   Exige cita con el chef: "+cita+
                             "\nNúmero de Jornadas: "+nj+"\nNúmero de Habitaciones: "+nh;
        else
            aux+="Nombre: "+nombre+"   Telefono: "+tel+
                             "\nFecha: "+d+" Evento: "+evento+"\nNúmero de personas: "+np+
                             "\nCatering: "+cocina+"\nExige cita con el chef: "+cita;
        return aux;
        
    }
    private String obEvento(){
        String aux="";
        if(jornada.isSelected())
            aux+="Jornada";
        else
        if(congreso.isSelected())
            aux+="Congreso";
        else
        if(banquete.isSelected())
            aux+="Banquete";
        else
            aux+="Not";
        return aux;    
    }
    
    private String obCocina(){
        String aux="";
        if(buffet.isSelected())
            aux+="Buffet";
        else
        if(carta.isSelected())
            aux+="Carta";
        else
            aux+="Not";
        return aux;    
    }
    
    private String obCita(){
        String aux="";
        if(si.isSelected())
            aux+="Si";
        else
        if(no.isSelected())
            aux+="No";
        else
            aux+="Not";
        return aux;    
    }
    
    private void jornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jornadaActionPerformed
       NumJornadas.setEnabled(false);
       NumHabs.setEnabled(false);
       
    }//GEN-LAST:event_jornadaActionPerformed

    private void buffetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buffetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buffetActionPerformed

    private void cartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartaActionPerformed

    private void congresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congresoActionPerformed
      NumJornadas.setEnabled(true);
      NumHabs.setEnabled(true);
       
    }//GEN-LAST:event_congresoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        Inicio menu=new Inicio();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void banqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banqueteActionPerformed
       NumJornadas.setEnabled(false);
       NumHabs.setEnabled(false);
       
    }//GEN-LAST:event_banqueteActionPerformed

    private void FechaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_FechaStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaStateChanged

    private void TelefonoReservaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoReservaKeyTyped
       char c=evt.getKeyChar();
       if(!Character.isDigit(c)|| TelefonoReserva.getText().length()>=9)
           evt.consume();
      
    }//GEN-LAST:event_TelefonoReservaKeyTyped

    private void NombreReservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreReservaMouseEntered
        this.NombreReserva.setForeground(Color.blue);
    }//GEN-LAST:event_NombreReservaMouseEntered

    private void NombreReservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreReservaMouseExited
         this.NombreReserva.setForeground(Color.black);
    }//GEN-LAST:event_NombreReservaMouseExited

    private void TelefonoReservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelefonoReservaMouseEntered
         this.TelefonoReserva.setForeground(Color.blue);
    }//GEN-LAST:event_TelefonoReservaMouseEntered

    private void TelefonoReservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelefonoReservaMouseExited
         this.TelefonoReserva.setForeground(Color.black);
    }//GEN-LAST:event_TelefonoReservaMouseExited

    private void FechaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FechaMouseEntered
        this.Fecha.setForeground(Color.blue);
    }//GEN-LAST:event_FechaMouseEntered

    private void FechaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FechaMouseExited
        this.Fecha.setForeground(Color.black);
    }//GEN-LAST:event_FechaMouseExited

    private void banqueteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banqueteMouseEntered
        this.banquete.setForeground(Color.blue);
    }//GEN-LAST:event_banqueteMouseEntered

    private void banqueteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banqueteMouseExited
        this.banquete.setForeground(Color.black);
    }//GEN-LAST:event_banqueteMouseExited

    private void jornadaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jornadaMouseEntered
        this.jornada.setForeground(Color.blue);
    }//GEN-LAST:event_jornadaMouseEntered

    private void congresoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_congresoMouseEntered
        this.congreso.setForeground(Color.blue);
    }//GEN-LAST:event_congresoMouseEntered

    private void jornadaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jornadaMouseExited
        this.jornada.setForeground(Color.black);
    }//GEN-LAST:event_jornadaMouseExited

    private void congresoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_congresoMouseExited
       this.congreso.setForeground(Color.black);
    }//GEN-LAST:event_congresoMouseExited

    private void buffetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buffetMouseEntered
        this.buffet.setForeground(Color.blue);
    }//GEN-LAST:event_buffetMouseEntered

    private void buffetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buffetMouseExited
       this.buffet.setForeground(Color.black);
    }//GEN-LAST:event_buffetMouseExited

    private void cartaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartaMouseEntered
        this.carta.setForeground(Color.blue);
    }//GEN-LAST:event_cartaMouseEntered

    private void cartaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartaMouseExited
        this.carta.setForeground(Color.black);
    }//GEN-LAST:event_cartaMouseExited

    private void siMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siMouseEntered
       this.si.setForeground(Color.blue);
    }//GEN-LAST:event_siMouseEntered

    private void siMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siMouseExited
        this.si.setForeground(Color.black);
    }//GEN-LAST:event_siMouseExited

    private void noMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noMouseEntered
        this.no.setForeground(Color.blue);
    }//GEN-LAST:event_noMouseEntered

    private void noMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noMouseExited
        this.no.setForeground(Color.black);
    }//GEN-LAST:event_noMouseExited

    private void NumPersonasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumPersonasMouseEntered
        this.NumPersonas.setForeground(Color.blue);
    }//GEN-LAST:event_NumPersonasMouseEntered

    private void NumPersonasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumPersonasMouseExited
         this.NumPersonas.setForeground(Color.black);
    }//GEN-LAST:event_NumPersonasMouseExited

    private void NumJornadasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumJornadasMouseEntered
         this.NumJornadas.setForeground(Color.blue);
    }//GEN-LAST:event_NumJornadasMouseEntered

    private void NumJornadasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumJornadasMouseExited
        this.NumJornadas.setForeground(Color.black);
    }//GEN-LAST:event_NumJornadasMouseExited

    private void NumHabsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumHabsMouseEntered
        this.NumHabs.setForeground(Color.blue);
    }//GEN-LAST:event_NumHabsMouseEntered

    private void NumHabsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumHabsMouseExited
        this.NumHabs.setForeground(Color.black);
    }//GEN-LAST:event_NumHabsMouseExited

    private void AceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseEntered
        this.Aceptar.setForeground(Color.blue);
    }//GEN-LAST:event_AceptarMouseEntered

    private void AceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseExited
         this.Aceptar.setForeground(Color.black);
    }//GEN-LAST:event_AceptarMouseExited

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
         this.Salir.setForeground(Color.blue);
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
         this.Salir.setForeground(Color.black);
    }//GEN-LAST:event_SalirMouseExited

    private void FechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FechaKeyTyped

    }//GEN-LAST:event_FechaKeyTyped

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JSpinner Fecha;
    private javax.swing.JTextField NombreReserva;
    private javax.swing.JSpinner NumHabs;
    private javax.swing.JSpinner NumJornadas;
    private javax.swing.JSpinner NumPersonas;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel TCatering;
    private javax.swing.JLabel TCita;
    private javax.swing.JLabel TEvento;
    private javax.swing.JLabel TFecha;
    private javax.swing.JLabel THabs;
    private javax.swing.JLabel TNombre;
    private javax.swing.JLabel TTelefono;
    private javax.swing.JTextField TelefonoReserva;
    private javax.swing.JLabel Tjornadas;
    private javax.swing.JLabel Título;
    private javax.swing.JRadioButton banquete;
    private javax.swing.JRadioButton buffet;
    private javax.swing.JRadioButton carta;
    public javax.swing.ButtonGroup citaChef;
    private javax.swing.ButtonGroup cocina;
    private javax.swing.JRadioButton congreso;
    private javax.swing.ButtonGroup evento;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jornada;
    private javax.swing.JRadioButton no;
    private javax.swing.JRadioButton si;
    // End of variables declaration//GEN-END:variables
}
