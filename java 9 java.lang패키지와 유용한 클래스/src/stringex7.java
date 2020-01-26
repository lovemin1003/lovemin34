
public class stringex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String full = "너의 이름은";
		
		//full에서 " "의 위치를 찾아줌.
        int index = full.indexOf(" ");
        
        //full의 첫 글자부터 " "이 있는 곳까지 문자열을 추출한다.
        String file = full.substring(0,index);
        
        //" "의 다음 문자부터 시작해서 문자열의 끝까지 추출함.
        //full.substring(index+1, full.length());와 같아짐.
        String ext = full.substring(index+1);
        
        System.out.println(full+" 멋진 "+file);
        System.out.println(full+" 귀여운 "+ext);
        
	}

}
