package windows;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//awt로 아이디 및 패스워드를 검토 프로세서 만들기
public class awt_login {
    public static void main(String[] args) {
	new client_login();
    }
}
class client_login{
    Frame f = null;
    TextField mid = null;
    TextField mpass = null;
    Button btn = null;
    Label msg = null;	//결과값을 출력하기 위함
    
    public client_login() {
	this.f = new Frame();
	this.f.setTitle("ERP 로그인");
	this.f.setLayout(null);
	this.f.setSize(450,170);
	this.f.setVisible(true);
	this.f.addWindowListener(new event());
	this.user_login();
    }
    public void user_login() {
	this.mid = new TextField();
	this.mpass = new TextField();
	this.mpass.setEchoChar('●');
	this.mid.setBounds(20,40,400,30);
	this.mpass.setBounds(20,70,400,30);
	this.btn = new Button("로그인");
	this.btn.setBounds(20,110,400,30);
	
	this.msg = new Label();
	this.msg.setBounds(20,140,400,30);
	
	this.f.add(msg);
	this.f.add(btn);
	this.f.add(mid);
	this.f.add(mpass);
	
	this.btn.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
		String id = mid.getText();
		String pw = mpass.getText();
		
		if(id.equals("") || pw.equals("") ) {
		    msg.setText("아이디 및 패스워드를 입력하세요");
		}
		else if(id.equals("hong") && pw.equals("a1234")) {
		    msg.setText("로그인 되셨습니다.");
		}
		else {
		    msg.setText("회원정보가 확인 되지 않음");
		}
	    }
	});
	
    }
    
    
    class event extends WindowAdapter{
	    @Override
	    public void windowClosing(WindowEvent e){
		System.exit(0);
	    }
    }

}
