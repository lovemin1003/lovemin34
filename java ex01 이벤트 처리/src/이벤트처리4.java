import java.awt.*;
import java.awt.event.*;
public class 이벤트처리4{
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
  Object obj=e.getSource();    //e.getSource는 현재 이벤트가 등록되어있는 컴포넌트의 주소를 가져온다.
  Button button=(Button)obj;                 //obj는 다형적 변수, Button 클래스의 부모로 오버라이딩 된 메서드
  System.out.println(button.getLabel()); //만 호출 할 수 있기 때문에 오버라이딩 되지 않은 메서드를 호출 하기
 }                                                      //위해 형변환 하고 그 다음 Button의 메서드를 부를 수 있다.
}
