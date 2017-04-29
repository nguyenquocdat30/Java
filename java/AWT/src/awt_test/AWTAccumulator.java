package awt_test;
import java.awt.*;
import java.awt.event.*;

public class AWTAccumulator extends Frame implements ActionListener{
	private Label lblInput;
	private Label lblOutput;
	private TextField tfInput;
	private TextField tfOutput;
	private Button btnExit;
	private int sum;
	public AWTAccumulator() {
		sum = 0;
		setLayout(new FlowLayout());
		
		lblInput = new Label("Nhap So Nguyen : ");
		add(lblInput);
		
		tfInput = new TextField(10);
		add(tfInput);
		tfInput.addActionListener(this);
		
		lblOutput = new Label("Tong La : ");
		add(lblOutput);
		
		tfOutput = new TextField(10);
		tfOutput.setEditable(false); // read-only
		add(tfOutput);
		
		btnExit = new Button("Exit Application");
		add(btnExit);
		btnExit.addActionListener(this);
		
		setTitle("AWT Accumulator");
		setSize(250,120);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == btnExit)
		{
			System.exit(0);
		}
		else if(e.getSource()== tfInput)
		{
			int numberIn = Integer.parseInt(tfInput.getText());
			sum+= numberIn;
			tfInput.setText("");
			tfOutput.setText(sum+"");
		}
	}
}
