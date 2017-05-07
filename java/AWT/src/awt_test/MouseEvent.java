package awt_test;

import java.awt.*;
import java.awt.event.*;
public class MouseEvent extends Frame implements MouseListener{
	private TextField tfMouseX;
	private TextField tfMouseY;
	public MouseEvent() {
		setLayout(new FlowLayout());
		
		add(new Label("X - Click"));
		
		tfMouseX = new TextField(10);
		tfMouseX.setEditable(false);
		add(tfMouseX);
		
		add(new Label("Y - Click"));
		
		tfMouseY = new TextField(10);
		tfMouseY.setEditable(false);
		add(tfMouseY);
		
		addMouseListener(this);
		setTitle("MouseEvent Demo");
		setSize(350,100);
		setVisible(true);
	}
	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		tfMouseX.setText(e.getX()+"");
		tfMouseY.setText(e.getY()+"");
	}
	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
