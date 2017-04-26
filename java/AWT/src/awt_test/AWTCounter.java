package awt_test;
import java.awt.*;
import java.awt.event.*;

public class AWTCounter extends Frame implements ActionListener{
	private Label lblCount;
	private TextField tfCount;
	private Button btnCount;
	private int count = 0;
	private Button btnExitApp;
	public AWTCounter() {
		// sử dụng để đặt bố cục theo từ trái sang phải, từ trên xuống dưới
		setLayout(new FlowLayout()); 
		// tạo mới 1 Label . xong thêm vào khung chứa Frame
		lblCount = new Label("Counter");
		add(lblCount);
		// tạo mới 1 TextField với giá trị hiển thị là 0. độ rộng ô là 10
		tfCount = new TextField("0",10);
		// không cho phép chỉnh sửa TextField rồi thêm vào khung chứa
		tfCount.setEditable(false);
		add(tfCount);
		// tạo mới 1 Button rồi thêm vào khung chứa
		btnCount = new Button("Count");
		add(btnCount);
		// Khi Button được nhấn sẽ thực hiện
		btnCount.addActionListener(this);
		
		btnExitApp = new Button("Exit Program");
		add(btnExitApp);
		btnExitApp.addActionListener(this);
		
		// không cho thay đỗi kích thước Frame
		setResizable(false);
		// đặt title cho khung chứa
		setTitle("AWT Counter");
		// đặt kích thước 250x100 cho khung chứa
		setSize(250,100);
		
		// hiển thị khung chứa
		setVisible(true);
	}
	@Override 
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnExitApp)
		{
			System.exit(0);
		}
		if(e.getSource()==btnCount)
		{
			++count;
			tfCount.setText(count+"");
		}
	}
	
}
