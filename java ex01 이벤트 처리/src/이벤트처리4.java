import java.awt.*;
import java.awt.event.*;
public class �̺�Ʈó��4{
 public static void main(String args[]){
  Frame f=new Frame();
  f.setLayout(new FlowLayout());
  f.setVisible(true);
  f.setBounds(100,200,300,300); 
  Button b1=new Button("abc");
  Button b2=new Button("def");
  f.add(b1);f.add(b2);
  B1 obj=new B1();
  b1.addActionListener(obj);
  b2.addActionListener(obj);
 }
}
class B1 implements ActionListener{
 public void actionPerformed(ActionEvent e){
  Object obj=e.getSource();    //e.getSource�� ���� �̺�Ʈ�� ��ϵǾ��ִ� ������Ʈ�� �ּҸ� �����´�.
  Button button=(Button)obj;                 //obj�� ������ ����, Button Ŭ������ �θ�� �������̵� �� �޼���
  System.out.println(button.getLabel()); //�� ȣ�� �� �� �ֱ� ������ �������̵� ���� ���� �޼��带 ȣ�� �ϱ�
 }                                                      //���� ����ȯ �ϰ� �� ���� Button�� �޼��带 �θ� �� �ִ�.
}
