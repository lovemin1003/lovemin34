import java.awt.*;
import java.awt.event.*;
public class 이벤트처리5{
 public static void main(String args[]){
  Frame f=new Frame();
  f.setLayout(new FlowLayout());
  f.setVisible(true);
  f.setBounds(100,200,300,300); 
  Button b1=new Button("abc");
  Button b2=new Button("def");
  f.add(b1);f.add(b2);
  B2 obj=new B2();                       //<--- B클래스 객체 생성.
  b1.addActionListener(obj);  // Button의 메서드 addActionListener를 보면 매개변수에 ActionListener의 
  b2.addActionListener(obj); //주소가 와야하는데 ActionListener는 interface로 객체생성 할 수 없다.  
 }                           // interface의 주소가 들어가는 자리에는 그것의 구현객체(자손)의 주소가 들어갈 수 있으므로 
}                             //obj를 넣어준다.
class B2 implements ActionListener{
 public void actionPerformed(ActionEvent e){    // 클래스 B가 부모인 ActionListnener의 추상메서드를 오
                                                                                    //버라이딩 했다.
 Object obj=e.getSource();
 Button button=(Button)obj;
 System.out.println(button.getLabel());
 
 } 
}
