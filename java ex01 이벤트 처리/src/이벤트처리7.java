
import java.awt.*;
import java.awt.event.*;
public class �̺�Ʈó��7{
 public static void main(String args[]){
  Frame f=new Frame();
  f.setLayout(new FlowLayout());
  f.setVisible(true);
  f.setBounds(100,200,300,300); 
  TextField tf=new TextField(30);
  Button b=new Button("Ŭ��");
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
  Object obj=e.getSource(); ////e.getSource�� ���� �׼��̺�Ʈ(ActionEvent)�� ��ϵǾ� �ִ� ������Ʈ�� 
  Button b=(Button)obj;           // �ּҸ� ���� �´�.(���� b�� ��ϵǾ��ִ�.)
  b.setLabel("�䳢");
 } 
}
