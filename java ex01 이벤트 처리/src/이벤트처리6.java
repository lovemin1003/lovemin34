import java.awt.*;
import java.awt.event.*;
public class 이벤트처리6{
 public static void main(String args[]){
  Frame f=new Frame();
  f.setLayout(new FlowLayout());
  f.setVisible(true);
  f.setBounds(100,200,300,300); 
  TextField tf=new TextField(30);
  Button b=new Button("클릭");
  f.add(tf);f.add(b);
  b.addActionListener(new B3(tf,b));
 }
}
class B3 implements ActionListener{
 TextField tf;Button b;             
 B3(TextField tf, Button b){ this.tf=tf;  this.b=b; }      //하는 방식 알아야 한다.
 public void actionPerformed(ActionEvent e){
  String str=tf.getText();
  System.out.println(str);
  //b.setLabel("입력");
 } 
}
