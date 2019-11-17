import java.text.ChoiceFormat;

public class ChoiceFormats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double[]점수= {50,60,70,80,90};
		String[] 성적 = {"f","d","c","b","a"};
		
		int [] 결과= {23,52,64,78,96,65,85};
		
		ChoiceFormat cho1 = new ChoiceFormat(점수,성적);
		
		for (int i=0; i<결과.length; i++)
		{
			System.out.println(cho1.format(결과[i]));
		}
		
		System.out.println("다음");
		String 성적2 = "50#f|60#d|70#c|80#b|90#a";
		
		int [] 결과2= {23,64,78,96,65,85};
		
		ChoiceFormat cho2 = new ChoiceFormat(성적2);
		
		for (int i=0; i<결과.length; i++)
		{
			System.out.println(cho2.format(결과[i]));
		}
		

	}

}
