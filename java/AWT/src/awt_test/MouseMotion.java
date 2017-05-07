package awt_test;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
public class MouseMotion extends Frame implements MouseListener, MouseMotionListener{

	private TextField tfMouseClickX;
	private TextField tfMouseClickY;
	private TextField tfMousePositionX;
	private TextField tfMousePositionY;
	
	public MouseMotion() {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		
		add(new Label("X-Click"));
		
		tfMouseClickX = new TextField(10);
		tfMouseClickX.setEditable(false);
		add(tfMouseClickX);
		
		add(new Label("Y-Click"));
		
		tfMouseClickY = new TextField(10);
		tfMouseClickY.setEditable(false);
		add(tfMouseClickY);
		
		add(new Label("X-Position"));
		
		tfMousePositionX = new TextField(10);
		tfMousePositionX.setEditable(false);
		add(tfMousePositionX);
		
		add(new Label("X-Position"));
		
		tfMousePositionY = new TextField(10);
		tfMousePositionY.setEditable(false);
		add(tfMousePositionY);
		
		addMouseListener(this);
		addMouseMotionListener(this);
		
		setTitle("MouseMotion Demo");
		setSize(360,120);
		setVisible(true);
	}
	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		tfMousePositionX.setText(e.getX()+"");
		tfMousePositionY.setText(e.getY()+"");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		tfMouseClickX.setText(e.getX() +"");
		tfMouseClickY.setText(e.getY()+"");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
