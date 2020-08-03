package mainpackage;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.coobird.thumbnailator.Thumbnails;
import net.proteanit.sql.DbUtils;

public class MainForm extends javax.swing.JFrame {

    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public MainForm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        con = MySqlConnect.dbConnect();
        
        jTable_refresh();
        
        GenderClearRadio.setSelected(false);
        GenderClearRadio.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jeID = new javax.swing.JTextField();
        jeName = new javax.swing.JTextField();
        jeAge = new javax.swing.JTextField();
        jePosition = new javax.swing.JTextField();
        jePhone = new javax.swing.JTextField();
        Female = new javax.swing.JRadioButton();
        Male = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        btnInsertImage = new javax.swing.JButton();
        profilepic = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        viewProfilePicture = new javax.swing.JLabel();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInfo = new javax.swing.JTable();
        GenderClearRadio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Form for CRUD operation on Employee info");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 51)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Gender");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Age");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Position");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Phone");

        jeID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jeID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 1, true));
        jeID.setEnabled(false);

        jeName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jeName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 1, true));

        jeAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jeAge.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 1, true));

        jePosition.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jePosition.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 1, true));

        jePhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jePhone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 1, true));

        buttonGroupGender.add(Female);
        Female.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Female.setText("Female");
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });

        buttonGroupGender.add(Male);
        Male.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Male.setText("Male");
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Profile pic");

        btnInsertImage.setText("Insert Profile");
        btnInsertImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertImageActionPerformed(evt);
            }
        });

        profilepic.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        profilepic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 1, true));

        jDesktopPane1.setBackground(new java.awt.Color(153, 153, 153));

        viewProfilePicture.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 102), 1, true), "Profile picture"));

        jDesktopPane1.setLayer(viewProfilePicture, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewProfilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(viewProfilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnRead.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        btnRead.setForeground(new java.awt.Color(0, 153, 153));
        btnRead.setText("Read");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 204, 204));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 0, 51));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCreate.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(0, 153, 153));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 153, 204));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(114, 114, 114)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jeID)
                    .addComponent(jeName)
                    .addComponent(jeAge)
                    .addComponent(jePosition)
                    .addComponent(jePhone)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Female)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(Male)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInsertImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(profilepic)
                    .addComponent(jDesktopPane1))
                .addGap(126, 126, 126)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRead, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jeID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jeName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Female)
                                .addComponent(Male)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jeAge, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jePosition, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(profilepic, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInsertImage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnRead, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 68, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);

        jTableInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableInfo.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableInfo.setGridColor(new java.awt.Color(51, 255, 0));
        jTableInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableInfo);

        buttonGroupGender.add(GenderClearRadio);
        GenderClearRadio.setText("GenderClearRadio");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(GenderClearRadio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(GenderClearRadio)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(950, 950, 950))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        // clear all value on component
        clear_jtable();
    }//GEN-LAST:event_btnClearActionPerformed

    private void clear_jtable(){
                jeID.setText("");
                jeName.setText("");
                jePhone.setText("");
                jePosition.setText("");
                jeAge.setText("");
                viewProfilePicture.setIcon(null);
                profilepic.setText("");
                Female.setSelected(false);
                Male.setSelected(false);
                GenderClearRadio.setSelected(true);
    }
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if(jeID.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please Select any data from Table row to delete");
        }else {
            try {
                String sql = "delete from employeeinfo where eID=?";
                pst = con.prepareStatement(sql);
                pst.setString(1, jeID.getText());
                
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deleted success!");
                
                //refresh jtable after delete
                jTable_refresh();
                
                // clear all component after delete
                clear_jtable();
                
            } catch (Exception error){
                JOptionPane.showMessageDialog(null, "Delete unsuccess! \n"+error);
            }finally {
                try {
                    rs.close();
                    pst.close();
                    
                }catch(Exception error){
                    
                }
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnInsertImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertImageActionPerformed
        // TODO add your handling code here:
        JFileChooser browimg = new JFileChooser();
        
        browimg.showOpenDialog(null);
        File imgFile =  browimg.getSelectedFile();
        
        filename = imgFile.getAbsolutePath();
        profilepic.setText(filename);
        
        try {
            File picture = new File(filename);
            BufferedImage thumbnail = Thumbnails.of(picture).size(200, 300).asBufferedImage();
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            ImageIO.write(thumbnail, "png", os);
            InputStream is = new ByteArrayInputStream(os.toByteArray());
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buff = new byte[1024];
            
            for (int rN; (rN = is.read(buff))!=-1;){
                bos.write(buff,0,rN);
            }
            
            viewprofile = new ImageIcon(thumbnail);
            viewProfilePicture.setIcon(viewprofile);
            
            profilepicturedb = bos.toByteArray(); // this store profile picture for instert into Database
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error);
        }
        
    }//GEN-LAST:event_btnInsertImageActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        // TODO add your handling code here:
        genders = "Female";
        
    }//GEN-LAST:event_FemaleActionPerformed

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        // TODO add your handling code here:
        genders = "Male";
    }//GEN-LAST:event_MaleActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        // basic user input validation
        String n_vali = jeName.getText();
        String age_vali = jeAge.getText();
        String gen_vali = genders;
        String ph_vali = jePhone.getText();
        String pos_vali = jePosition.getText();
        
        if(n_vali.equals("")){
            JOptionPane.showMessageDialog(null, "Please Input name!");
            jeName.requestFocus();
        }else if((!"Female".equals(gen_vali)) && (!"Male".equals(gen_vali))){
            JOptionPane.showMessageDialog(null, "Please select Gender");
        }else if(age_vali.equals("")){
            JOptionPane.showMessageDialog(null, "Please input Age!");
            jeAge.requestFocus();
        }else if(ph_vali.equals("")){
            JOptionPane.showMessageDialog(null, "Please input Phone Number!");
            jePhone.requestFocus();
        }else if(pos_vali.equals("")){
            JOptionPane.showMessageDialog(null, "Please input Position");
            jePosition.requestFocus();
        }else if(profilepicturedb==null){
            JOptionPane.showMessageDialog(null, "Please input Profile picture!");
            btnInsertImage.setText("*Insert Profile*");
        }else {
        
            try {
                // eName 	eGender 	eAge 	eContactNo 	eImage 	ePosition 
                String sql = "insert into employeeinfo (eName, eGender, eAge, eContactNo, eImage, ePosition)value(?,?,?,?,?,?)";
                pst = con.prepareStatement(sql);
                pst.setString(1, jeName.getText());
                pst.setString(2, genders);
                pst.setString(3, jeAge.getText());
                pst.setString(4, jePhone.getText());
                pst.setBytes(5, profilepicturedb);
                pst.setString(6, jePosition.getText());

                pst.execute();

                JOptionPane.showMessageDialog(null, "Success!");
                clear_jtable();
            } catch (Exception error) {
               // JOptionPane.showMessageDialog(null, error);
            } finally{
                try {
                    rs.close();
                    pst.close();
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, error);
                }
            }
        }
        jTable_refresh();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void jTable_refresh() {
        try {
            String sql = "select * from employeeinfo";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTableInfo.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch(Exception error){}
        }
    }
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        try {
            String sql = "update employeeinfo set eName=?, eGender=?, eAge=?, eContactNo=?, eImage=?, ePosition=? where eID=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, jeName.getText());
            
            if(Male.isSelected()){
                pst.setString(2, "Male");
            }
            if(Female.isSelected()){
                pst.setString(2, "Female");
            }
            
            pst.setString(3, jeAge.getText());
            pst.setString(4, jePhone.getText());
            pst.setBytes(5, profilepicturedb);
            pst.setString(6, jePosition.getText());

            pst.setString(7, jeID.getText());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Update success!");
            jTable_refresh();
        } catch (Exception error){
            JOptionPane.showMessageDialog(null, error);
        }finally {
            try {
                rs.close();
                pst.close();
            }catch(Exception error) {}
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jTableInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInfoMouseClicked
        // TODO add your handling code here:
        // this will select all data when clicked on row
        int row = jTableInfo.getSelectedRow();
        String row_Click = (jTableInfo.getModel().getValueAt(row, 0).toString());
        
        try {
            String sql = "select * from employeeinfo where eID='" + row_Click + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                //eID	eName	eGender	eAge	eContactNo	eImage	ePosition
                jeID.setText(rs.getString("eID"));
                jeName.setText(rs.getString("eName"));
                
                String getGen = rs.getString("eGender");
                if("Male".equals(getGen)){
                    Male.setSelected(true);
                }else {
                    Female.setSelected(true);
                }
                
                jeAge.setText(rs.getString("eAge"));
                jePhone.setText(rs.getString("eContactNo"));
                jePosition.setText(rs.getString("ePosition"));
                
                byte[] pictureprofiledata = rs.getBytes("eImage");
                getProfileFdB = new ImageIcon(pictureprofiledata);
                //profilepicturedb =
                viewProfilePicture.setIcon(getProfileFdB);
                profilepicturedb = pictureprofiledata;
                
                        
                       
            }
        }catch (Exception error) {
            JOptionPane.showMessageDialog(null, error);
            
        }finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception error){}
        }
    }//GEN-LAST:event_jTableInfoMouseClicked

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        // TODO add your handling code here:
        // this code to read all data from Database
        try {
            String sql = "select * from employeeinfo";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTableInfo.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch(Exception error){}
        }
    }//GEN-LAST:event_btnReadActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton GenderClearRadio;
    private javax.swing.JRadioButton Male;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsertImage;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableInfo;
    private javax.swing.JTextField jeAge;
    private javax.swing.JTextField jeID;
    private javax.swing.JTextField jeName;
    private javax.swing.JTextField jePhone;
    private javax.swing.JTextField jePosition;
    private javax.swing.JTextField profilepic;
    private javax.swing.JLabel viewProfilePicture;
    // End of variables declaration//GEN-END:variables
    String filename = null;
    private ImageIcon viewprofile = null;
    private ImageIcon getProfileFdB = null;
    byte[] profilepicturedb = null;
    private String genders = null;
}
