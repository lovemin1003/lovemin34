import java.awt.*;
import java.awt.event.*;
public class 이벤트처리1{
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
  Button b=new Button("선택된것은?");
  f.add(b);
  b.addActionListener(                // <--- 버튼 컴포넌트에 이벤트를 등록했다.
  new ActionListener(){
   public void actionPerformed(ActionEvent e){
   //System.out.println("Action이벤트발생되면자동호출되는메서드");
   System.out.println(ColorChooser.getSelectedItem());       //<-- 버튼을 누르면 선택된 색깔의 이름이 CMD
   }                                                                                //창에 나온다.
  }
  );
 }
}
