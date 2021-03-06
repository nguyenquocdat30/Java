package awtDemo;
import java.awt.*;
import java.awt.event.*;

public class PhepToanAWT extends Frame implements ActionListener,WindowListener{
	private TextField txtA;
	private TextField txtB;
	private TextField txtKq;
	private Button btnCong;
	private Button btnTru;
	private Button btnNhan;
	private Button btnChia;
	private double ketQua;
	// get set cho ketQua
	public double getKetQua() {
		return ketQua;
	}
	public void setKetQua(double ketQua) {
		this.ketQua = ketQua;
	}
	
	public PhepToanAWT() {
		setKetQua(0);
		setLayout(new FlowLayout());
		
		add(new Label("a = "));
		txtA = new TextField(10);
		add(txtA);
		
		add(new Label("b = "));
		txtB = new TextField(10);
		add(txtB);
		
		btnCong = new Button("+");
		add(btnCong);
		btnCong.addActionListener(this);
		
		btnTru = new Button("-");
		add(btnTru);
		btnTru.addActionListener(this);
		
		btnNhan = new Button("*");
		add(btnNhan);
		btnNhan.addActionListener(this);
		
		btnChia = new Button("/");
		add(btnChia);
		btnChia.addActionListener(this);
		
		add(new Label("Ket Qua :"));
		txtKq = new TextField(10);
		txtKq.setEditable(false);
		add(txtKq);
		
		addWindowListener(this);
		
		setTitle("Phep Toan");
		setSize(280,100);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double tempA = 0;
		double tempB = 0;
		tempA = Double.parseDouble(txtA.getText());
		tempB = Double.parseDouble(txtB.getText());
		if(e.getSource()==btnCong)
		{
			setKetQua(tempA + tempB);
			txtKq.setText(getKetQua()+"");
		}
		else if(e.getSource()==btnTru)
		{
			setKetQua(tempA - tempB);
			txtKq.setText(getKetQua()+"");
		}
		else if(e.getSource()==btnNhan)
		{
			setKetQua(tempA * tempB);
			txtKq.setText(getKetQua()+"");
		}
		else if(e.getSource()==btnChia)
		{
			if(tempB == 0)
			{
				txtKq.setText("Error");
			}
			else
			{
				setKetQua(tempA / tempB);
				txtKq.setText(getKetQua()+"");
			}
		}
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
