
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class PantallaPrincipal extends javax.swing.JFrame {
    
    Empresa empresa2 = new Empresa("EmpresaPrueba");

    public PantallaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel32 = new javax.swing.JLabel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        btnGuardarEmpleado = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSalario2 = new javax.swing.JTextField();
        txtDocs9 = new javax.swing.JTextField();
        txtMatricula2 = new javax.swing.JTextField();
        txtCantidad2 = new javax.swing.JTextField();
        btnGuardarEmpleados = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtSalario3 = new javax.swing.JTextField();
        txtPuesto3 = new javax.swing.JTextField();
        txtNombre3 = new javax.swing.JTextField();
        txtMatricula3Modificar = new javax.swing.JTextField();
        txtMatricula3 = new javax.swing.JTextField();
        btnGuardarModificaciones = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtNombre4 = new javax.swing.JTextField();
        txtPuesto7 = new javax.swing.JTextField();
        btnEliminarEmpleados = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtPuesto4 = new javax.swing.JTextField();
        btnEliminarEmpleado = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtMatricula5 = new javax.swing.JTextField();
        btnEliminarDelTurno = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtMatricula6 = new javax.swing.JTextField();
        btnAniadirAlTurno = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtPuesto2 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtTablas10 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtCabina9 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtCabina10 = new javax.swing.JTextField();
        btnGuardarOficinaAdministrativa = new javax.swing.JButton();
        btnGuardarOficinaContador = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtMatricula11 = new javax.swing.JTextField();
        txtCabina11 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtMatricula12 = new javax.swing.JTextField();
        txtCabina12 = new javax.swing.JTextField();
        btnAsociarEmpleadoContador = new javax.swing.JButton();
        btnAsociarEmpleadoAdministrativa = new javax.swing.JButton();
        btnVisualizarEmpleados = new javax.swing.JButton();
        btnVisualizarEmpDespedidos = new javax.swing.JButton();
        btnConsultarOficinasContadores = new javax.swing.JButton();
        btnConsultarOficinasOcupacion = new javax.swing.JButton();
        btnEmpOcupadosYDesocupados = new javax.swing.JButton();
        btnConsultarOficinasAdministrativas = new javax.swing.JButton();
        btnEliminarTodosLosEmp = new javax.swing.JButton();
        btnConsultarEmpleado = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        txtPromedioSalarios = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtPorcEmpleadosTurno = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        txtSalarioMinYMax = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtNumEmpleadosGen = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        txtNumEmpleadosTurno = new javax.swing.JLabel();

        jLabel32.setText("Numero de Cabina:");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(1168, 1500));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("OPCIONES DE EMPLEADOS");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("AÑADIR UN EMPLEADO");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Salario:");

        jLabel5.setText("Puesto:");

        jLabel6.setText("Matricula: ");

        btnGuardarEmpleado.setText("Guardar Empleado");
        btnGuardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEmpleadoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("AÑADIR VARIOS EMPLEADOS");

        jLabel8.setText("Puesto:");

        jLabel9.setText("Salario:");

        jLabel10.setText("Matricula: ");

        jLabel11.setText("Cantidad:");

        txtSalario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalario2ActionPerformed(evt);
            }
        });

        btnGuardarEmpleados.setText("Guardar Empleados");
        btnGuardarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEmpleadosActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("MODIFICAR EMPLEADO");

        jLabel13.setText("Matricula del empleado a modificar: ");

        jLabel14.setText("Nombre:");

        jLabel15.setText("Puesto:");

        jLabel16.setText("Salario:");

        jLabel17.setText("Matricula: ");

        txtSalario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalario3ActionPerformed(evt);
            }
        });

        btnGuardarModificaciones.setText("Guardar Modficaciones");
        btnGuardarModificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarModificacionesActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel18.setText("ELIMINAR EMPLEADO SEGUN");

        jLabel19.setText("Nombre:");

        jLabel20.setText("Puesto:");

        btnEliminarEmpleados.setText("ELIMINAR EMPLEADOS");
        btnEliminarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleadosActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel21.setText("ELIMINAR EMPLEADOS DE UN PUESTO");

        jLabel22.setText("Puesto:");

        btnEliminarEmpleado.setText("ELIMINAR EMPLEADO");
        btnEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleadoActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel23.setText("AÑADIR EMPLEADO AL TURNO ");

        jLabel24.setText("Matricula: ");

        txtMatricula5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatricula5ActionPerformed(evt);
            }
        });

        btnEliminarDelTurno.setText("ELIMINAR DEL TURNO");
        btnEliminarDelTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDelTurnoActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel25.setText("ELIMINAR EMPLEADO DEL TURNO ");

        jLabel26.setText("Matricula: ");

        txtMatricula6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatricula6ActionPerformed(evt);
            }
        });

        btnAniadirAlTurno.setText("AÑADIR AL TURNO");
        btnAniadirAlTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAniadirAlTurnoActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel28.setText("NOMBRE Y PUESTO ");

        btnSalir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSalir.setText("LIMPIAR DATOS");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel27.setText("CONSULTA DE DATOS");

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel29.setText("CREAR OFICINA ADMINISTRATIVA");

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel30.setText("CREAR OFICINA CONTADORES");

        jLabel31.setText("Numero de Cabina:");

        jLabel33.setText("Numero de Cabina:");

        jLabel34.setText("Numero de Tablas:");

        jLabel35.setText("Numero de Docs:");

        btnGuardarOficinaAdministrativa.setText("CREAR OFICINA");
        btnGuardarOficinaAdministrativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarOficinaAdministrativaActionPerformed(evt);
            }
        });

        btnGuardarOficinaContador.setText("CREAR OFICINA");
        btnGuardarOficinaContador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarOficinaContadorActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel36.setText("OPCIONES DE OFICINA");

        jLabel37.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel37.setText("ASOCIAR EMPLEADO A CONTADOR");

        jLabel38.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel38.setText("ASOCIAR EMPLEADO A ADMINISTRATIVA");

        jLabel39.setText("Matricula: ");

        jLabel40.setText("Numero Cabina:");

        jLabel41.setText("Matricula: ");

        jLabel42.setText("Numero Cabina:");

        btnAsociarEmpleadoContador.setText("ASOCIAR");
        btnAsociarEmpleadoContador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsociarEmpleadoContadorActionPerformed(evt);
            }
        });

        btnAsociarEmpleadoAdministrativa.setText("ASOCIAR");
        btnAsociarEmpleadoAdministrativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsociarEmpleadoAdministrativaActionPerformed(evt);
            }
        });

        btnVisualizarEmpleados.setText("VISUALIZAR TODOS LOS EMPLEADOS");
        btnVisualizarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarEmpleadosActionPerformed(evt);
            }
        });

        btnVisualizarEmpDespedidos.setText("VISUALIZAR EMPLEADOS DESPEDIDOS");
        btnVisualizarEmpDespedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarEmpDespedidosActionPerformed(evt);
            }
        });

        btnConsultarOficinasContadores.setText("CONSULTAR LISTA OFICINAS CONTADORES");
        btnConsultarOficinasContadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarOficinasContadoresActionPerformed(evt);
            }
        });

        btnConsultarOficinasOcupacion.setText("CONSULTAR OFICINAS OCUPADAS Y DESOCUPADAS");

        btnEmpOcupadosYDesocupados.setText("MOSTRAR EMPLEADOS OCUPADOS Y DESOCUPADOS");

        btnConsultarOficinasAdministrativas.setText("CONSULTAR LISTA OFICINAS ADMINISTRATIVAS");
        btnConsultarOficinasAdministrativas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarOficinasAdministrativasActionPerformed(evt);
            }
        });

        btnEliminarTodosLosEmp.setText("ELIMINAR TODOS LOS EMPLEADOS");
        btnEliminarTodosLosEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodosLosEmpActionPerformed(evt);
            }
        });

        btnConsultarEmpleado.setText("CONSULTAR EMPLEADOS TURNO");
        btnConsultarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarEmpleadoActionPerformed(evt);
            }
        });

        jLabel45.setText("PORCENTAJE TURNOS:");

        jLabel46.setText("NUM EMPLEADOS TURNO:");

        jLabel48.setText(" SALARIO MAX Y MIN : ");

        jLabel49.setText("NUMERO DE EMPLEADOS GEN:");

        jLabel50.setText("PROMEDIO DE SALARIOS: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnGuardarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPuesto2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSalario2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMatricula2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(582, 582, 582))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(btnGuardarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPuesto7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnVisualizarEmpDespedidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnVisualizarEmpleados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminarTodosLosEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(160, 160, 160))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPromedioSalarios, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnEliminarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnConsultarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtMatricula3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtPuesto3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtSalario3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtMatricula3Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnGuardarModificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGap(6, 6, 6)
                                                            .addComponent(btnAniadirAlTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(jLabel26)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(txtMatricula6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel24)
                                                        .addGap(31, 31, 31)
                                                        .addComponent(txtMatricula5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(25, 25, 25)
                                                        .addComponent(btnEliminarDelTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addComponent(jLabel28))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txtPuesto4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtNumEmpleadosTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel50)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel45)
                                                        .addGap(4, 4, 4)
                                                        .addComponent(txtPorcEmpleadosTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(49, 49, 49))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(69, 69, 69))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel48)
                                                .addGap(9, 9, 9)
                                                .addComponent(txtSalarioMinYMax, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnEmpOcupadosYDesocupados, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnConsultarOficinasAdministrativas)
                                                    .addComponent(btnConsultarOficinasContadores, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel49)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtNumEmpleadosGen, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))))))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConsultarOficinasOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel35)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtDocs9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtCabina9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(258, 258, 258)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addComponent(btnGuardarOficinaAdministrativa, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(105, 105, 105)
                                                .addComponent(btnGuardarOficinaContador, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtMatricula11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(txtMatricula12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(2, 2, 2))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(txtCabina10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(jLabel34)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(txtTablas10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(btnAsociarEmpleadoAdministrativa, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnAsociarEmpleadoContador, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(txtCabina11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(41, 41, 41)
                                                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtCabina12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel33)
                    .addComponent(txtCabina9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCabina10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPuesto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtSalario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34)
                        .addComponent(txtDocs9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTablas10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel35))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGuardarOficinaAdministrativa)
                    .addComponent(btnGuardarOficinaContador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtMatricula2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardarEmpleados)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel38)
                                .addComponent(jLabel37)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel39)
                                    .addComponent(txtMatricula11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41)
                                    .addComponent(txtMatricula12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel40)
                                    .addComponent(txtCabina11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42)
                                    .addComponent(txtCabina12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAsociarEmpleadoContador)
                                    .addComponent(btnAsociarEmpleadoAdministrativa))
                                .addGap(26, 26, 26)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarTodosLosEmp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVisualizarEmpleados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVisualizarEmpDespedidos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConsultarOficinasAdministrativas))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel28)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel19)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtMatricula3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel14)
                                            .addComponent(txtNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtPuesto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15))
                                        .addGap(22, 22, 22)))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSalario3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel20)
                                    .addComponent(txtPuesto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnEliminarEmpleado)
                                        .addComponent(txtMatricula3Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardarModificaciones))))
                    .addComponent(btnGuardarEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25)
                    .addComponent(btnEmpOcupadosYDesocupados, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txtMatricula6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMatricula5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAniadirAlTurno)
                            .addComponent(btnEliminarDelTurno))
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtPuesto7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsultarEmpleado)
                            .addComponent(btnEliminarEmpleados))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConsultarOficinasContadores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumEmpleadosGen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalarioMinYMax, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumEmpleadosTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txtPromedioSalarios, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPorcEmpleadosTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(btnConsultarOficinasOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-4, -4, 960, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarEmpleadoActionPerformed
        // TODO add your handling code here:
        VisualizarEmpleadosTurno visualizarEmpleadosTurno = new VisualizarEmpleadosTurno(empresa2);
        visualizarEmpleadosTurno.setVisible(true);
        visualizarEmpleadosTurno.setLocationRelativeTo(null);
        visualizarEmpleadosTurno.setSize(800,600);
    }//GEN-LAST:event_btnConsultarEmpleadoActionPerformed

    private void btnEliminarTodosLosEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodosLosEmpActionPerformed
        // TODO add your handling code here:
        try{
            for (Empleado e : empresa2.listaEmpleados){
                empresa2.listaEmpleadosDespedidos.add(e);
                empresa2.listaEmpleados.clear();
            }
        }catch (ConcurrentModificationException exception) {
            System.out.println("excepcion, todos los empleados se han borrado satisfactoriamente");

        }
    }//GEN-LAST:event_btnEliminarTodosLosEmpActionPerformed

    private void btnConsultarOficinasContadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarOficinasContadoresActionPerformed
        // TODO add your handling code here:
        VisualizarOficinasContadores visualizarOficinasContadores = new VisualizarOficinasContadores(empresa2);
        visualizarOficinasContadores.setVisible(true);
        visualizarOficinasContadores.setLocationRelativeTo(null);
        visualizarOficinasContadores.setSize(800,600);
    }//GEN-LAST:event_btnConsultarOficinasContadoresActionPerformed

    private void btnVisualizarEmpDespedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarEmpDespedidosActionPerformed
        VisualizarEmpleadosDespedidos visualizarEmpleadosDespedidos = new VisualizarEmpleadosDespedidos(empresa2);
        visualizarEmpleadosDespedidos.setVisible(true);
        visualizarEmpleadosDespedidos.setLocationRelativeTo(null);
        visualizarEmpleadosDespedidos.setSize(800,600);
    }//GEN-LAST:event_btnVisualizarEmpDespedidosActionPerformed

    private void btnVisualizarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarEmpleadosActionPerformed
        VisualizarTodosLosEmpleados visualizarEmpleados = new VisualizarTodosLosEmpleados(empresa2);
        visualizarEmpleados.setVisible(true);
        visualizarEmpleados.setLocationRelativeTo(null);
        visualizarEmpleados.setSize(800,600);
    }//GEN-LAST:event_btnVisualizarEmpleadosActionPerformed

    private void btnAsociarEmpleadoAdministrativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsociarEmpleadoAdministrativaActionPerformed
        // TODO add your handling code here:
        System.out.println("Que empleado quieres elegir?. Introduzca su matricula");
        String matricula11 = txtMatricula11.getText();
        int matriculaOK11 = Integer.parseInt(matricula11);
        String cabina11 = txtCabina11.getText();
        int cabinaOK11 = Integer.parseInt(cabina11);

        for (Empleado e : empresa2.listaEmpleados) { //Recorremso empleados
            if (matriculaOK11 == e.getMatricula()) { //Buscamos la matricula del empleado que queremos añadir a la lista.
                for (OficinaAdministrativa f : empresa2.listaOficinaAdministrativa) { //Recorremos oficinas administrativas
                    if (cabinaOK11 == f.getNumeroCabina()) { // Buscamos oficina con mismo numero de cabina
                        f.setEmpleado(e); //añadimos el empleado a la oficina administrativa f.
                        System.out.println("la oficina con cabina numero " + f.getNumeroCabina() + "esta asociada al empleado " + f.empleado.getNombre());
                        f.setOcupado(true);
                        e.setOcupado(true);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnAsociarEmpleadoAdministrativaActionPerformed

    private void btnAsociarEmpleadoContadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsociarEmpleadoContadorActionPerformed
        // TODO add your handling code here:
        String matricula12 = txtMatricula12.getText();
        int matriculaOK12 = Integer.parseInt(matricula12);
        String cabina12 = txtCabina12.getText();
        int cabinaOK12 = Integer.parseInt(cabina12);

        for (Empleado e : empresa2.listaEmpleados) {  //Recorremos empleados
            if (matriculaOK12 == e.getMatricula()) { // Buscamos empleado con la matricula
                for (OficinaContadores f : empresa2.listaOficinaContadores) { //Recorremos oficinas de contadores
                    if (cabinaOK12 == f.getNumeroCabina()) { // Buscamos oficina con el numero de cabina
                        f.setEmpleado(e); //Asociamos empleado a oficina.
                        System.out.println("la oficina con cabina numero " + f.getNumeroCabina() + "esta asociada al empleado " + f.empleado.getNombre());
                        f.setOcupado(true); // Convertimos la oficina en ocupada para la lista de oficinas ocupadas.
                        e.setOcupado(true);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnAsociarEmpleadoContadorActionPerformed

    private void btnGuardarOficinaContadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarOficinaContadorActionPerformed
        // TODO add your handling code here:
        String cabina10 = txtCabina10.getText();
        int cabinaOK10 = Integer.parseInt(cabina10);
        Iterator<OficinaContadores> it4 = empresa2.listaOficinaContadores.iterator();
        boolean creaccionCorrectaB = true;
        while (it4.hasNext()) {
            OficinaContadores e = it4.next();
            if (e.getNumeroCabina() == cabinaOK10) {
                creaccionCorrectaB = false;
                break;
            }
        }
        if (creaccionCorrectaB) {
            String tablas = txtTablas10.getText();
            int tablasOK10 = Integer.parseInt(tablas);
            OficinaContadores oficinaContadores = new OficinaContadores(cabinaOK10, tablasOK10);
            empresa2.listaOficinaContadores.add(oficinaContadores);
        }
    }//GEN-LAST:event_btnGuardarOficinaContadorActionPerformed

    private void btnGuardarOficinaAdministrativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarOficinaAdministrativaActionPerformed
        String cabina2 = txtCabina9.getText();
        int cabina2OK = Integer.parseInt(cabina2);

        Iterator<OficinaAdministrativa> it = empresa2.listaOficinaAdministrativa.iterator();
        boolean creaccionCorrectaA = true; // Bandera true
        while (it.hasNext()) {
            OficinaAdministrativa e = it.next();
            if (cabina2.equals(e.getNumeroCabina())) {
                System.out.println("Numero de cabina repetido. No se guardará esta oficina.");
                creaccionCorrectaA = false;
                break;
            }
        }
        if(creaccionCorrectaA) { //Solo se realiza este if si la bandera sigue true.
            System.out.println("Cuantos documentos hay en la oficina administrativa?");
            String documentos = txtDocs9.getText();
            int documentos9OK = Integer.parseInt(documentos);
            OficinaAdministrativa oficinaDeAdministradores = new OficinaAdministrativa(cabina2OK, documentos9OK);
            empresa2.listaOficinaAdministrativa.add(oficinaDeAdministradores);
        }
    }//GEN-LAST:event_btnGuardarOficinaAdministrativaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        txtCabina10.setText("");
        txtCabina11.setText("");
        txtCabina12.setText("");
        txtCabina9.setText("");
        txtCantidad2.setText("");
        txtDocs9.setText("");
        txtMatricula.setText("");
        txtMatricula11.setText("");
        txtMatricula12.setText("");
        txtMatricula2.setText("");
        txtMatricula3.setText("");
        txtMatricula3Modificar.setText("");
        txtMatricula5.setText("");
        txtMatricula6.setText("");
        txtNombre.setText("");
        txtNombre3.setText("");
        txtNombre4.setText("");
        txtPuesto.setText("");
        txtPuesto2.setText("");
        txtPuesto3.setText("");
        txtPuesto4.setText("");
        txtPuesto7.setText("");
        txtSalario.setText("");
        txtSalario2.setText("");
        txtSalario3.setText("");
        txtTablas10.setText("");
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAniadirAlTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAniadirAlTurnoActionPerformed

        String matriculaEmpleado6 = txtMatricula6.getText();
        int matriculaEmpleadoOK6 = Integer.parseInt(matriculaEmpleado6);
        for (Empleado f : empresa2.listaEmpleados) {
            if (matriculaEmpleadoOK6 == f.getMatricula()) {
                empresa2.listaEmpleadosEnTurno.add(f);
            }
        }
        
        String numEmpleadosTurno = Integer.toString(Empresa.listaEmpleadosEnTurno.size());
        txtNumEmpleadosTurno.setText(numEmpleadosTurno);
        
        double porcEmpleadosTurno = empresa2.numeroEmpleadosEnTurno() * 100 / empresa2.numeroEmpleadosGenerales();
        String porcEmpleadosTurnoOK = Double.toString(porcEmpleadosTurno);
        txtPorcEmpleadosTurno.setText(porcEmpleadosTurnoOK); 
    }//GEN-LAST:event_btnAniadirAlTurnoActionPerformed

    private void btnEliminarDelTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDelTurnoActionPerformed
        String matriculaEmpleado5 = txtMatricula5.getText();
        int matriculaEmpleadoOK5 = Integer.parseInt(matriculaEmpleado5);
        Iterator<Empleado> it = empresa2.listaEmpleadosEnTurno.iterator();
        while (it.hasNext()) {
            Empleado e = it.next();
            if (e.getMatricula() == matriculaEmpleadoOK5) {
                it.remove();
            }
        }
        
        String numEmpleadosTurno = Integer.toString(Empresa.listaEmpleadosEnTurno.size());
        txtNumEmpleadosTurno.setText(numEmpleadosTurno);
        
        double porcEmpleadosTurno = empresa2.numeroEmpleadosEnTurno() * 100 / empresa2.numeroEmpleadosGenerales();
        String porcEmpleadosTurnoOK = Double.toString(porcEmpleadosTurno);
        txtPorcEmpleadosTurno.setText(porcEmpleadosTurnoOK); 
    }//GEN-LAST:event_btnEliminarDelTurnoActionPerformed

    private void txtMatricula5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatricula5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatricula5ActionPerformed

    private void btnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoActionPerformed
        // TODO add your handling code here:
        try {
            if (empresa2.listaEmpleados.size() > 0) {
                String nombre4 = txtNombre4.getText();
                String puesto4 = txtPuesto4.getText();
                empresa2.eliminarEmpleado(nombre4, puesto4);
            } else {
                System.out.println("No hay empleados que eliminar");
            }
        } catch (ConcurrentModificationException ex) {
            System.out.println("proceso de eliminacion finalizado");
        }
    }//GEN-LAST:event_btnEliminarEmpleadoActionPerformed

    private void btnEliminarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadosActionPerformed
        // TODO add your handling code here:
        String puesto7 = txtPuesto7.getText();
        Iterator<Empleado> iter = empresa2.listaEmpleados.iterator();
        while (iter.hasNext()) {
            Empleado e = iter.next();
            if (e.getPuesto().equals(puesto7)) {
                empresa2.listaEmpleadosDespedidos.add(e);
                iter.remove();
            }
        }
        
        String NumEmpleadosGen = Integer.toString(empresa2.listaEmpleados.size());
        txtNumEmpleadosGen.setText(NumEmpleadosGen);
    }//GEN-LAST:event_btnEliminarEmpleadosActionPerformed

    private void btnGuardarModificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarModificacionesActionPerformed

        String matricula3 = this.txtMatricula3.getText();
        int matriculaOK3 = Integer.parseInt(matricula3);

        for (Empleado e : empresa2.listaEmpleados) {
            if (matriculaOK3 == e.getMatricula()) {
                String nombre3 = this.txtNombre3.getText();
                e.setNombre(nombre3);

                String puesto3 = this.txtPuesto3.getText();
                e.setPuesto(puesto3);

                String salario3 = this.txtSalario3.getText();
                int salarioOK3 = Integer.parseInt(salario3);
                e.setSalario(salarioOK3);

                String matricula3Modificar = this.txtMatricula3.getText();
                int matriculaOK3Modificar = Integer.parseInt(matricula3Modificar);
                e.setMatricula(matriculaOK3Modificar);
            }
        }
    }//GEN-LAST:event_btnGuardarModificacionesActionPerformed

    private void txtSalario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalario3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalario3ActionPerformed

    private void btnGuardarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpleadosActionPerformed

        String nombreOK2 = "";
        String puestoMasivoOK2 = this.txtPuesto2.getText();
        String salarioMasivo2 = this.txtSalario2.getText();
        String cantEmplMasivos2 = this.txtCantidad2.getText(); //Metodo para la cantidad de empleados a crear.
        String matriculaMasiva2 = this.txtMatricula2.getText(); //Empieza el numero de matricula aqui.

        double salarioOK2 = Double.parseDouble(salarioMasivo2);
        int matriculaOK2 = Integer.parseInt(matriculaMasiva2);
        int cantEmplMasivosOK2 = Integer.parseInt(cantEmplMasivos2);

        for (int j = matriculaOK2; j < (cantEmplMasivosOK2 + matriculaOK2); j++) {
            int matriculaOK3 = j;
            empresa2.listaEmpleados.add(new Empleado(nombreOK2, puestoMasivoOK2, salarioOK2, matriculaOK3));
        }

        String promedioSalario = Double.toString(empresa2.promedioSalarios());
        txtPromedioSalarios.setText(promedioSalario);

        String maxMinSalarios = empresa2.SalarioMaximoMinimo2();
        txtSalarioMinYMax.setText(maxMinSalarios);

        String NumEmpleadosGen = Integer.toString(empresa2.listaEmpleados.size());
        txtNumEmpleadosGen.setText(NumEmpleadosGen);

    }//GEN-LAST:event_btnGuardarEmpleadosActionPerformed

    private void txtSalario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalario2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalario2ActionPerformed

    private void btnGuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpleadoActionPerformed
        String nombre = this.txtNombre.getText();
        String sueldo = this.txtSalario.getText();
        String matricula = this.txtMatricula.getText();
        String puesto = this.txtPuesto.getText();

        double salario = Double.parseDouble(sueldo);
        int matriculaOK = Integer.parseInt(matricula);

        Empleado e2 = new Empleado(nombre, puesto, salario, matriculaOK);
        empresa2.agregarEmpleadoGUI(e2);

        String promedioSalario = Double.toString(empresa2.promedioSalarios());
        txtPromedioSalarios.setText(promedioSalario);

        String maxMinSalarios = empresa2.SalarioMaximoMinimo2();
        txtSalarioMinYMax.setText(maxMinSalarios);
        
        String NumEmpleadosGen = Integer.toString(empresa2.listaEmpleados.size());
        txtNumEmpleadosGen.setText(NumEmpleadosGen);

    }//GEN-LAST:event_btnGuardarEmpleadoActionPerformed

    private void txtMatricula6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatricula6ActionPerformed
            
           String matricula6 = txtMatricula6.getText();
           int matricula6OK = Integer.parseInt(matricula6);
           for (Empleado e : empresa2.listaEmpleados) {
               if (e.getMatricula() == matricula6OK) {
                   empresa2.listaEmpleadosEnTurno.add(e);
               }
           }
    }//GEN-LAST:event_txtMatricula6ActionPerformed

    private void btnConsultarOficinasAdministrativasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarOficinasAdministrativasActionPerformed
        // TODO add your handling code here:
          // TODO add your handling code here:
        VisualizarOficinasAdministrativos visualizarOficinasAdministrativo = new VisualizarOficinasAdministrativos(empresa2);
        visualizarOficinasAdministrativo.setVisible(true);
        visualizarOficinasAdministrativo.setLocationRelativeTo(null);
        visualizarOficinasAdministrativo.setSize(800,600);
    }//GEN-LAST:event_btnConsultarOficinasAdministrativasActionPerformed
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAniadirAlTurno;
    private javax.swing.JButton btnAsociarEmpleadoAdministrativa;
    private javax.swing.JButton btnAsociarEmpleadoContador;
    private javax.swing.JButton btnConsultarEmpleado;
    private javax.swing.JButton btnConsultarOficinasAdministrativas;
    private javax.swing.JButton btnConsultarOficinasContadores;
    private javax.swing.JButton btnConsultarOficinasOcupacion;
    private javax.swing.JButton btnEliminarDelTurno;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnEliminarEmpleados;
    private javax.swing.JButton btnEliminarTodosLosEmp;
    private javax.swing.JButton btnEmpOcupadosYDesocupados;
    private javax.swing.JButton btnGuardarEmpleado;
    private javax.swing.JButton btnGuardarEmpleados;
    private javax.swing.JButton btnGuardarModificaciones;
    private javax.swing.JButton btnGuardarOficinaAdministrativa;
    private javax.swing.JButton btnGuardarOficinaContador;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVisualizarEmpDespedidos;
    private javax.swing.JButton btnVisualizarEmpleados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField txtCabina10;
    private javax.swing.JTextField txtCabina11;
    private javax.swing.JTextField txtCabina12;
    private javax.swing.JTextField txtCabina9;
    private javax.swing.JTextField txtCantidad2;
    private javax.swing.JTextField txtDocs9;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtMatricula11;
    private javax.swing.JTextField txtMatricula12;
    private javax.swing.JTextField txtMatricula2;
    private javax.swing.JTextField txtMatricula3;
    private javax.swing.JTextField txtMatricula3Modificar;
    private javax.swing.JTextField txtMatricula5;
    private javax.swing.JTextField txtMatricula6;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre3;
    private javax.swing.JTextField txtNombre4;
    private javax.swing.JLabel txtNumEmpleadosGen;
    private javax.swing.JLabel txtNumEmpleadosTurno;
    private javax.swing.JLabel txtPorcEmpleadosTurno;
    private javax.swing.JLabel txtPromedioSalarios;
    private javax.swing.JTextField txtPuesto;
    private javax.swing.JTextField txtPuesto2;
    private javax.swing.JTextField txtPuesto3;
    private javax.swing.JTextField txtPuesto4;
    private javax.swing.JTextField txtPuesto7;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSalario2;
    private javax.swing.JTextField txtSalario3;
    private javax.swing.JLabel txtSalarioMinYMax;
    private javax.swing.JTextField txtTablas10;
    // End of variables declaration//GEN-END:variables


}
