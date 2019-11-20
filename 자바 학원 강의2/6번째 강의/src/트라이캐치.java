import java.io.*;

public class 트라이캐치 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		read();
		String fm = "abc.txt";
		try {
			read(fm);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void read(String fm) throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader in = new FileReader(fm);
		BufferedReader br = new BufferedReader(in);
		System.out.println(br.readLine());

	}

	public static void read() {
		String fm = "abc1.txt";
		try {
			FileReader in = new FileReader(fm);
			BufferedReader br = new BufferedReader(in);
			System.out.println(br.readLine());
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
			System.out.println("파일이 없음.");
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.out.println("예기치 않은 예외임.");
		}
	}

}
