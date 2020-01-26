
import java.awt.*;
import java.awt.event.*;
public class 이벤트처리7{
 public static void main(String args[]){
  Frame f=new Frame();
  f.setLayout(new FlowLayout());
  f.setVisible(true);
  f.setBounds(100,200,300,300); 
  TextField tf=new TextField(30);
  Button b=new Button("클릭");
  f.add(tf);f.add(b);
  b.addActionListener(new B4(tf));
 }
}
class B4 implements ActionListener{
 TextField tf;
 B4(TextField tf){ this.tf=tf; }
 public void actionPerformed(ActionEvent e){
  String str=tf.getText();
  System.out.println(str);
  Object obj=e.getSource(); ////e.getSource는 현재 액션이벤트(ActionEvent)가 등록되어 있는 컴포넌트의 
  Button b=(Button)obj;           // 주소를 가져 온다.(현재 b에 등록되어있다.)
  b.setLabel("토끼");
 } 
}
