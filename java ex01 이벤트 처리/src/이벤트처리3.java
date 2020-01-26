import java.awt.*;
import java.awt.event.*;
public class 이벤트처리3{
 public static void main(String args[]){
  Frame f=new Frame();
  f.setLayout(new FlowLayout());
  f.setVisible(true);
  f.setBounds(100,200,300,300); 
  Button b1=new Button("abc");
  Button b2=new Button("def");
  f.add(b1);
  f.add(b2);
  b1.addActionListener(null);
  b2.addActionListener(null);
 }
}
class B implements ActionListener
{
 public void actionPerformed(ActionEvent e)
 {
  Object obj=e.getSource();
  Button button=(Button)obj;
  System.out.println(button.getLabel());
 } 
}
