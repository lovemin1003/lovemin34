import java.awt.*;
import java.awt.event.*;
public class �̺�Ʈó��2{
 public static void main(String args[]){
  Frame f=new Frame();
  f.setLayout(new FlowLayout());
  f.setVisible(true);
  f.setBounds(100,200,300,300); 
  Button b1=new Button("abc");
  Button b2=new Button("def");
  f.add(b1);f.add(b2);
  b1.addActionListener(
   new ActionListener(){
   public void actionPerformed(ActionEvent e){
    System.out.println(b1.getLabel());     // <-- ��ư b1�� ������ �����´�.
   }
   }
  );
  b2.addActionListener(
   new ActionListener(){
   public void actionPerformed(ActionEvent e){
    System.out.println(b2.getLabel());     // <--- ��ư b2�� ������ �����´�.
   }
   }
  );
 }
}
