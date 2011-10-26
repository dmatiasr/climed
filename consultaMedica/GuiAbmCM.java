/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ABM.java
 *
 * Created on 17/10/2011, 10:43:16
 */
package consultaMedica;

import java.awt.event.ActionListener;

/**
 *
 * @author mariano
 */
public class GuiAbmCM extends javax.swing.JFrame {

	/** Creates new form ABM */
	public GuiAbmCM() {
		initComponents();
		this.setResizable(false);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jlMjeAUsuario = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		Alta = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		Modif = new javax.swing.JButton();
		Buscar = new javax.swing.JButton();
		Baja = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("ABM Consulta Médica");

		jlMjeAUsuario.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
		jlMjeAUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jlMjeAUsuario.setText("Haga clic en la opción deseada:");
		jlMjeAUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

		jPanel1.setBackground(new java.awt.Color(168, 168, 168));
		jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 77, 0)));

		Alta.setText("Alta");
		Alta.setName("Alta");
		Baja.setText("Baja");
		Baja.setName("Baja");
		Modif.setText("Modificación");
		Modif.setName("Modif");
		Buscar.setText("Buscar");
		Buscar.setName("Buscar");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(Alta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(Alta)
						.addContainerGap())
		);

		jPanel2.setBackground(new java.awt.Color(168, 168, 168));
		jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(254, 107, 3)));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(Baja)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(Modif)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(Buscar)
						.addContainerGap(12, Short.MAX_VALUE))
		);

		jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Baja, Buscar, Modif});

		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(Modif)
								.addComponent(Baja)
								.addComponent(Buscar))
								.addContainerGap())
		);

		jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Baja, Buscar, Modif});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(28, 28, 28)
										.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
										.addGroup(layout.createSequentialGroup()
												.addComponent(jlMjeAUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
												.addGap(16, 16, 16))))
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(12, 12, 12)
						.addComponent(jlMjeAUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(18, Short.MAX_VALUE))
		);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	public void setActionListeners(ActionListener al) {
		this.Alta.addActionListener(al);
		this.Baja.addActionListener(al);
		this.Buscar.addActionListener(al);
		this.Modif.addActionListener(al);
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton Alta;
	private javax.swing.JButton Baja;
	private javax.swing.JButton Buscar;
	private javax.swing.JButton Modif;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JLabel jlMjeAUsuario;
	// End of variables declaration//GEN-END:variables
}
