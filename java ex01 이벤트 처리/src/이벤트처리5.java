import java.awt.*;
import java.awt.event.*;
public class �̺�Ʈó��5{
 public static void main(String args[]){
  Frame f=new Frame();
  f.setLayout(new FlowLayout());
  f.setVisible(true);
  f.setBounds(100,200,300,300); 
  Button b1=new Button("abc");
  Button b2=new Button("def");
  f.add(b1);f.add(b2);
  B2 obj=new B2();                       //<--- BŬ���� ��ü ����.
  b1.addActionListener(obj);  // Button�� �޼��� addActionListener�� ���� �Ű������� ActionListener�� 
  b2.addActionListener(obj); //�ּҰ� �;��ϴµ� ActionListener�� interface�� ��ü���� �� �� ����.  
 }                           // interface�� �ּҰ� ���� �ڸ����� �װ��� ������ü(�ڼ�)�� �ּҰ� �� �� �����Ƿ� 
}                             //obj�� �־��ش�.
class B2 implements ActionListener{
 public void actionPerformed(ActionEvent e){    // Ŭ���� B�� �θ��� ActionListnener�� �߻�޼��带 ��
                                                                                    //�����̵� �ߴ�.
 Object obj=e.getSource();
 Button button=(Button)obj;
 System.out.println(button.getLabel());
 
 } 
}
