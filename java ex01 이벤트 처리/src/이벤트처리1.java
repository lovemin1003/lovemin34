import java.awt.*;
import java.awt.event.*;
public class �̺�Ʈó��1{
 public static void main(String args[]){
  Frame f=new Frame();
  f.setLayout(new FlowLayout());
  f.setVisible(true);
  f.setBounds(100,200,300,300);
  Choice ColorChooser = new Choice();
   ColorChooser.add("Green");
   ColorChooser.add("Red");
   ColorChooser.add("Blue");
  f.add(ColorChooser); 
  Button b=new Button("���õȰ���?");
  f.add(b);
  b.addActionListener(                // <--- ��ư ������Ʈ�� �̺�Ʈ�� ����ߴ�.
  new ActionListener(){
   public void actionPerformed(ActionEvent e){
   //System.out.println("Action�̺�Ʈ�߻��Ǹ��ڵ�ȣ��Ǵ¸޼���");
   System.out.println(ColorChooser.getSelectedItem());       //<-- ��ư�� ������ ���õ� ������ �̸��� CMD
   }                                                                                //â�� ���´�.
  }
  );
 }
}
