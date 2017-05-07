package awt_test;

import java.awt.*;
import java.awt.event.*;
public class WindowEvent extends Frame implements ActionListener, WindowListener {
	private TextField tfCount;
	private Button btnCount;
	private int count =0 ;
	public WindowEvent() {
		setLayout(new FlowLayout());
		add(new Label("Count"));
		
		tfCount = new TextField("0",10);
		tfCount.setEditable(false);
		add(tfCount);
		btnCount = new Button("Count");
		add(btnCount);
		
		btnCount.addActionListener(this);
		addWindowListener(this);
		setTitle("WindowEvent Demo");
		setSize(250,100);
		setVisible(true);
	}
	@Override
	public void windowOpened(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	@Override
	public void windowClosed(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		++count;
		tfCount.setText(count+"");
	}
	
}
