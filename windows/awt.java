package windows;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URI;

/*  
 GUI : windows, 웹브라우져, 아이콘, 버튼
 CLI : CMD, Scanner, Linux, Database
 VUI : 음성 인터페이스 => 네이게이션, 스마트폰, AI
 NUI : 제스처, 시선, 생체인식, 지문
 AUI : 멀티미디어 관련된 사운드 인터페이스
  - Auditory User Interface
  - Application User Interface
  - Asset Under Investment
  - Attachment Unit Interface
 TUI : Text User interface
*/ 

//AWT : Abstract Window Toolkit
//Frame > Bound > Object
public class awt {
    public static void main(String[] args) {
	new awt_box().windows();
    }
}
class awt_box{
    Frame fr = null;
    public void windows() {
	this.fr = new Frame();	//Window 부분
	this.fr.setTitle("AWT 기초화면 출력해봄!!");	//타이틀 제목
	this.fr.setLayout(null);  //제작자가 원하는 위치에 오브젝트를 설정
	this.fr.setVisible(true); //Frame 화면을 출력
	this.fr.setBounds(250,250,500,500);	// (X축,Y축,가로크기,세로크기)
	
	Button btn = new Button("클릭!!");
	btn.setBounds(40,40,100,30);
	btn.setBackground(Color.black);	  //배경색상
	btn.setForeground(Color.white);	  //글자색상
	
	TextField tf = new TextField();
	tf.setBounds(40,80,200,30);
	
	TextField pw = new TextField();
	pw.setBounds(40,120,200,30);
	pw.setEchoChar('*');  //setEchoChar : 입력한 문자를 다른 문자로 출력하는 역활
	
	Label msg = new Label("경고 메세지가 출력 되는 공간!!");
	msg.setBounds(40,160,300,30);
	msg.setBackground(Color.pink);
	msg.setForeground(Color.BLUE);
	
	Checkbox cb = new Checkbox("자동 로그인");
	cb.setBounds(40,200,150,30);
		
	
	Choice cc = new Choice();
	cc.setBounds(40, 240, 100, 30);
	cc.add("SKT");
	cc.add("KT");
	cc.add("LGT");
	cc.add("알뜰폰");
	
	//radio를 출력 CheckboxGroup 설정을 하며, false:미체크, true:체크
	CheckboxGroup radio = new CheckboxGroup();
	Checkbox c1 = new Checkbox("동의함",false,radio);
	Checkbox c2 = new Checkbox("동의안함",true,radio);
	c1.setBounds(40,300,100,30);
	c2.setBounds(150,300,100,30);
	
	TextArea ta = new TextArea();
	ta.setBounds(40,350,300,100);
	
	
	Button btns = new Button("파일첨부");
	FileDialog fd = new FileDialog(this.fr, "첨부파일 선택",FileDialog.LOAD);
	btns.setBounds(150, 240, 100 ,30);	
	
	this.fr.add(btns);
	this.fr.add(ta);
	this.fr.add(c2);
	this.fr.add(c1);
	this.fr.add(cc);
	this.fr.add(cb);
	this.fr.add(msg);
	this.fr.add(pw);
	this.fr.add(tf);
	this.fr.add(btn);
	this.fr.addWindowListener(new event());
	
	//String pc = "shutdown /s /t 0";
	String pc = "cmd /c start";
	Button sh = new Button("네이버로 이");
	sh.setBounds(40, 450, 100, 30);
	this.fr.add(sh);
	
	sh.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
		try {
		Runtime.getRuntime().exec(pc + " https://www.naver.com/");
		}
		catch (Exception ex) {
		    System.out.println("컴퓨터 강제 종료 실패!!");
		}
	    }
	});
	
	
	btns.addActionListener(new ActionListener() {    
	    @Override
	    public void actionPerformed(ActionEvent e) {
		fd.setVisible(true);
	    }
	});
	
	
	btn.addActionListener(new ActionListener() {   
	    @Override
	    public void actionPerformed(ActionEvent e) {
		System.exit(0);		
	    }
	});
    }
}

class event extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e){
	System.exit(0);
    }
}


