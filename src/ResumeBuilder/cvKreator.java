
package ResumeBuilder;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;




@SuppressWarnings("serial")
public class cvKreator extends javax.swing.JFrame {


    public cvKreator() {
        initComponents();
		this.setResizable(false);
		this.setLocationRelativeTo(null);
    }
    public static int selekcija=0;
    public static String put;
    public static String imeFajla;



    private void initComponents() {
    	getContentPane().setBackground(Color.ORANGE); 

    	String[] bookTitles = new String[] {""};
		
		JComboBox<String> bookList = new JComboBox<>(bookTitles);
		add(bookList);
		bookList = new javax.swing.JComboBox<>();
        imeLabel = new javax.swing.JLabel();
        ime = new javax.swing.JTextField();
        adresaLabel = new javax.swing.JLabel();
        adresa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ocjene1 = new javax.swing.JTextField();
        srednjaSkolaLabel = new javax.swing.JLabel();
        srednjaSkola = new javax.swing.JTextField();
        prosjek1Label = new javax.swing.JLabel();
        prosjek2Label = new javax.swing.JLabel();
        prosjek2 = new javax.swing.JTextField();
        fakultet1Label = new javax.swing.JLabel();
        fakultet1 = new javax.swing.JTextField();
        university1Label = new javax.swing.JLabel();
        university1 = new javax.swing.JTextField();
        indeksLabel = new javax.swing.JLabel();
        indeks = new javax.swing.JTextField();
        masterLabel = new javax.swing.JLabel();
        master = new javax.swing.JTextField();
        university2Label = new javax.swing.JLabel();
        university2 = new javax.swing.JTextField();
        indeks2Label = new javax.swing.JLabel();
        indeks2 = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Potvrdi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        imeProjektaField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        opisProjektaField1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        imeProjektaField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        opisProjektaField2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        imeProjektaField3 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        opisProjektaField3 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        imeProjektaField4 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        opisProjektaField4 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        kontaktBroj = new javax.swing.JTextField();
        Pretrazi = new javax.swing.JButton();
        vjestineField = new javax.swing.JTextField();
        vjestineLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        datumFakultet2Field = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        datumFakultet1Field = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        datumSrednje = new javax.swing.JTextField();
        datumOsnovneLabel = new javax.swing.JLabel();
        datumOsnovne = new javax.swing.JTextField();
        JButton birac = new javax.swing.JButton();
        JFileChooser biracf= new javax.swing.JFileChooser();
        jLabel500= new javax.swing.JLabel();
        jLabel600= new javax.swing.JLabel();

        
        




        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        
        imeLabel.setText("Ime");
        ime.setText("Ivan Ivanovic");

        ime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        
        bookList.setToolTipText("resume");
        bookList.setToolTipText("Ivan Ivanovic");
        bookList.setSelectedIndex(-1);
        bookList.addItem("CV1");
        bookList.addItem("CV2");
        bookList.addItem("CV3");
        

        

    	bookList.addActionListener(event -> {
            // Get the source of the component, which is our combo
            // box.
            @SuppressWarnings("rawtypes")
			JComboBox comboBox1 = (JComboBox) event.getSource();

            // Print the selected items and the action command.
            Object selected = comboBox1.getSelectedItem();
            String command = event.getActionCommand();
         

            // Detect whether the action command is "comboBoxEdited"
            // or "comboBoxChanged"
            if ("comboBoxEdited".equals(command)) {

            } else if ("comboBoxChanged".equals(command)) {

            }

            
        	if (selected=="CV1") {
        		selekcija=1; 
            	jLabel600.setIcon(new ImageIcon("C:\\Users\\Win\\eclipse-workspace\\projekat\\cv1.jpg"));
        	}
        	if (selected=="CV2") {
        		selekcija=2;
            	jLabel600.setIcon(new ImageIcon("C:\\Users\\Win\\eclipse-workspace\\projekat\\cv2.jpg"));
        	}
        	if (selected=="CV3") {
        		selekcija=3;  
            	jLabel600.setIcon(new ImageIcon("C:\\Users\\Win\\eclipse-workspace\\projekat\\cv3.jpg"));
        	}
        	      	       
        });

    
  
        add(jLabel600);   
    	

    		
    	
        adresaLabel.setText("Osnovna skola");

        srednjaSkolaLabel.setText("Srednja skola");

        prosjek1Label.setText("Prosjek");

        prosjek2Label.setText("Prosjek");

        prosjek2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks2ActionPerformed(evt);
            }
        });

        fakultet1Label.setText("Graduation");

        fakultet1.setText("Unesi ime osnovnih studija");
        fakultet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                college1ActionPerformed(evt);
            }
        });

        university1Label.setText("Univerzitet");

        university1.setText("Unesi ime univerziteta");

        indeksLabel.setText("Indeks");

        indeks.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cgpa1KeyTyped(evt);
            }
        });

        
        masterLabel.setText("Master");

        master.setText("Unesi ime master studija");

        university2Label.setText("Univerzitet");

        university2.setText("Unesi ime univerziteta");

        indeks2Label.setText("Indeks");

        indeks2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cgpa2ActionPerformed(evt);
            }
        });
        
        

        emailLabel.setText("Email");

        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });

        jLabel1.setText("Dodaj svoja zaposlenja i projekte:");

        Potvrdi.setText("Potvrdi");
        Potvrdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	imeFajla= JOptionPane.showInputDialog(null, "Kako zelis da sacuvas fajl?","resume");
                potvrdiVrijednosti(evt);
            }
        });
        

        
        
       
        
        

    
        birac.setText("Izaberi sliku");
        
        birac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	biracf.setDialogTitle("Choose Your File");
                biracf.setFileSelectionMode(JFileChooser.FILES_ONLY);
                // below code selects the file 
                

                int returnval = biracf.showOpenDialog(biracf);
                if (returnval == JFileChooser.APPROVE_OPTION)	
                {
                    File file = biracf.getSelectedFile();
                    put= file.getAbsolutePath();
                    BufferedImage bi;


                    try {
                        // display the image in a Jlabel
                        bi = ImageIO.read(file);
                        Image img =bi.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                        jLabel500.setIcon(new ImageIcon(img));
                        jLabel500.setText("");
                        
                    } catch(IOException e) {
                       e.printStackTrace(); 
                     
                    }
                }
                
            }
            
            
            
            
            

            

            
            
    
        });
        

        
        
        jLabel2.setText("Zaposlenje");

        imeProjektaField1.setText("Naziv zaposlenja");

        opisProjektaField1.setColumns(20);
        opisProjektaField1.setRows(5);
        opisProjektaField1.setText("Unesi opis zaposlenja");
        jScrollPane1.setViewportView(opisProjektaField1);

        jLabel4.setText("Zaposlenje");

        imeProjektaField2.setText("Naziv zaposlenja");

        opisProjektaField2.setColumns(20);
        opisProjektaField2.setRows(5);
        opisProjektaField2.setText("Unesi opis zaposlenja");
        jScrollPane2.setViewportView(opisProjektaField2);


        imeProjektaField3.setText("Dodatne aktivnosti (volontiranja/prakse)");

        jLabel500.setText("[SLIKA]");
        
        opisProjektaField3.setColumns(20);
        opisProjektaField3.setRows(5);
        opisProjektaField3.setText("///////////////////////");
        jScrollPane3.setViewportView(opisProjektaField3);

        jLabel6.setText("Naslov");

        
        imeProjektaField4.setText("Unesi naslov projekta");

        opisProjektaField4.setColumns(20);
        opisProjektaField4.setRows(5);
        opisProjektaField4.setText("Unesi opis projekta");
        jScrollPane4.setViewportView(opisProjektaField4);
        
        jLabel600.setText("");

        add(jLabel600);

        

        jLabel7.setText("Kontakt telefon");

        kontaktBroj.setText("Unesi broj telefona");
        kontaktBroj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNumberActionPerformed(evt);
            }
        });

        Pretrazi.setText("Otkazi");
        Pretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseActionPerformed(evt);
            }
        });
        

        

        vjestineField.setText("Koje su tvoje vjestine?");

        vjestineLabel.setText("Vjestine");

        jLabel8.setText("Datum");

        datumFakultet2Field.setText("Od - do - Do");

        jLabel9.setText("Datum");

        datumFakultet1Field.setText("Od - do - Do");

        jLabel10.setText("Datum");

        datumSrednje.setText("Od - do - Do");

        datumOsnovneLabel.setText("Datum");

        datumOsnovne.setText("Od - do - Do");
        


        

      //ORGANIZACIJA LABEL-A U PROZORU!!!!!!! //ORGANIZACIJA LABEL-A U PROZORU!!!!!!!   
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(indeksLabel)
                            .addComponent(masterLabel)
                            .addComponent(university2Label)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(vjestineLabel))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(indeks2Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Pretrazi)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                                .addComponent(Potvrdi, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))

                            .addComponent(birac, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(master, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                            .addComponent(indeks, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                            .addComponent(university2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                            .addComponent(indeks2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                            .addComponent(kontaktBroj, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vjestineField)
                            .addComponent(datumFakultet2Field)
                            .addComponent(datumFakultet1Field, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imeLabel)
                            .addComponent(adresaLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel3))
                            .addComponent(prosjek1Label)
                            .addComponent(srednjaSkolaLabel)
                            .addComponent(prosjek2Label)
                            .addComponent(fakultet1Label)
                            .addComponent(university1Label)
                            .addComponent(emailLabel)
                            .addComponent(jLabel10)
                            .addComponent(datumOsnovneLabel))
                        
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adresa)
                            .addComponent(ime)
                            .addComponent(ocjene1)
                            .addComponent(srednjaSkola)
                            .addComponent(prosjek2)
                            .addComponent(fakultet1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                            .addComponent(university1)
                            .addComponent(email)
                            .addComponent(datumSrednje)
                            .addComponent(datumOsnovne))))

                
                .addGap(18, 18, 18)
                
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imeProjektaField1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imeProjektaField2))
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addComponent(jLabel500)
                        .addComponent(bookList)
                        .addComponent(jLabel600)


                        

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imeProjektaField3))
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()                           
                       .addComponent(jLabel6)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                        .addComponent(imeProjektaField4)) 
                    .addComponent(jScrollPane4))
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(jLabel500)
            .addComponent(bookList)
            .addComponent(jLabel600)



            
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ime)
                        .addComponent(jLabel1))
                    .addComponent(imeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    
                    
                    .addComponent(imeProjektaField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adresaLabel)
                            .addComponent(adresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            
                            .addComponent(ocjene1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prosjek1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)

                            
                            .addComponent(imeProjektaField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel500)



                            
                            .addComponent(imeProjektaField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(imeProjektaField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    
                    
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 5, Short.MAX_VALUE)
                                .addComponent(datumOsnovneLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(srednjaSkola)
                                    .addComponent(srednjaSkolaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                            		
                                .addComponent(datumOsnovne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(datumSrednje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(prosjek2)
                            
                            .addComponent(prosjek2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fakultet1)
                            .addComponent(fakultet1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(university1)
                            
                            .addComponent(university1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(datumFakultet1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(indeks)
                            
                            .addComponent(indeksLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(master)
                            .addComponent(masterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(university2)
                            .addComponent(university2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        		
                        		
                        		
                            .addComponent(datumFakultet2Field,  javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookList,javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel600, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                           
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE,30, javax.swing.GroupLayout.DEFAULT_SIZE))
                        
                        
                        
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(indeks2)
                            .addComponent(indeks2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kontaktBroj)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vjestineField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vjestineLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Pretrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Potvrdi, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        
                        .addComponent(birac)

                        .addComponent(bookList)
                        .addContainerGap())))
            
            
            
        );
        

        pack();

    }
    
    

    public Map<String, String> getDetails() {
        Map<String, String> details;                    //CUVA VRIJEDNOSTI IZ FORME
        details = new HashMap<String, String>();        //PROSLEDJUJE IH U  cvGenerator
        
        String candidateName = ime.getText();
        details.put("Ime" , candidateName);
        
        String Email;
        Email = email.getText();
        details.put("Email" , Email);
        
        String schoolX;
        schoolX = adresa.getText();
        details.put("OsnovnaSkola" , schoolX);
        
        String procenatX = ocjene1.getText();
        details.put("Prosjek" , procenatX);
        
        String datum1 = datumOsnovne.getText();
        details.put("Datum" , datum1);
        
        String schoolXII = srednjaSkola.getText();
        details.put("Srednja skola" , schoolXII);
        
        String datum1II = datumSrednje.getText();
        details.put("Datum" , datum1II);
        
        String procenatXII = prosjek2.getText();
        details.put("Procenat" , procenatXII);
        
        String fakultet = fakultet1.getText();
        details.put("GraduationCollege" , fakultet);
        
        String graduateUniversity = university1.getText();
        details.put("GraduateUniversity" , graduateUniversity);

        
        String graduationDate = datumFakultet1Field.getText();
        details.put("Datum diplomiranja" , graduationDate);
        
        String graduateCGPA = indeks.getText();
        details.put("GraduationCGPA", graduateCGPA);
        
        String postGraduateCollege = master.getText();
        details.put("PostGraduationCollege" , postGraduateCollege);
        
        String postGraduateUniversity = university2.getText();
        details.put("PostGraduateUniversity" , postGraduateUniversity);
        
        String postGraduationDate = datumFakultet2Field.getText();
        details.put("Post Graduation date" , postGraduationDate);
        
        String postGraduateCGPA = indeks2.getText();
        details.put("PostGraduateCGPA", postGraduateCGPA);
        
        String contactNo = kontaktBroj.getText();
        details.put("ContactNumber" , contactNo);
        
        String projectName1 = imeProjektaField1.getText();
        String projectDescription1 = opisProjektaField1.getText();
        details.put("ProjectName1" , projectName1);
        details.put("projectDescription1" , projectDescription1);
        
        String projectName2 = imeProjektaField2.getText();
        String projectDescription2 = opisProjektaField2.getText();
        details.put("ProjectName2" , projectName2);
        details.put("projectDescription2" , projectDescription2);
        

        
        String projectName4 = imeProjektaField4.getText();
        String projectDescription4 = opisProjektaField4.getText();
        details.put("ProjectName4" , projectName4);
        details.put("projectDescription4" , projectDescription4);
        
        String skills = vjestineField.getText();
        details.put("Skills" , skills);
        
        return details;
    }
    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void marks2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks2ActionPerformed

    private void college1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_college1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_college1ActionPerformed

    private void cgpa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cgpa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cgpa2ActionPerformed

    private void cgpa1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cgpa1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cgpa1KeyTyped


    private void potvrdiVrijednosti(java.awt.event.ActionEvent evt) {
        Map<String, String> details = getDetails();

       
            cvGenerator resume;
            resume = new cvGenerator(details);
            try {
                resume.createResume();
            } catch (IOException ex) {
                Logger.getLogger(cvKreator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
   
        

    

    private void contactNumberActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void BrowseActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {
    	
    }



    public class ComboBox{
    	
    	
    }
    
    
    public static void main(String args[]) {


    	


        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cvKreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cvKreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cvKreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cvKreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //      Kreiraj i prikazi formu
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new cvKreator().setVisible(true);
            }
        });
    }

    // DEKLARACIJE VARIJABLI
    
    private javax.swing.JButton Pretrazi;
    private javax.swing.JButton Potvrdi;
    private javax.swing.JTextField indeks;
    private javax.swing.JLabel indeksLabel;
    private javax.swing.JTextField indeks2;
    private javax.swing.JLabel indeks2Label;
    private javax.swing.JTextField fakultet1;
    private javax.swing.JLabel fakultet1Label;
    private javax.swing.JTextField master;
    private javax.swing.JLabel masterLabel;
    private javax.swing.JTextField kontaktBroj;
    private javax.swing.JTextField datumFakultet1Field;
    private javax.swing.JTextField datumFakultet2Field;
    private javax.swing.JTextField datumOsnovne;
    private javax.swing.JTextField datumSrednje;
    private javax.swing.JLabel datumOsnovneLabel;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel500;
    private javax.swing.JLabel jLabel600;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField ocjene1;
    private javax.swing.JTextField prosjek2;
    private javax.swing.JLabel prosjek2Label;
    private javax.swing.JTextField ime;
    private javax.swing.JLabel imeLabel;
    private javax.swing.JLabel prosjek1Label;
    private javax.swing.JTextArea opisProjektaField1;
    private javax.swing.JTextArea opisProjektaField2;
    private javax.swing.JTextArea opisProjektaField3;
    private javax.swing.JTextArea opisProjektaField4;
    private javax.swing.JTextField imeProjektaField1;
    private javax.swing.JTextField imeProjektaField2;
    private javax.swing.JTextField imeProjektaField3;
    private javax.swing.JTextField imeProjektaField4;
    private javax.swing.JTextField adresa;
    private javax.swing.JLabel adresaLabel;
    private javax.swing.JTextField srednjaSkola;
    private javax.swing.JLabel srednjaSkolaLabel;
    private javax.swing.JTextField vjestineField;
    private javax.swing.JLabel vjestineLabel;
    private javax.swing.JTextField university1;
    private javax.swing.JLabel university1Label;
    private javax.swing.JTextField university2;
    private javax.swing.JLabel university2Label;

}
