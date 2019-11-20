package student;

import java.util.Scanner;

import student.studentDAO.StudentDAO;
import student.studentDTO.StudentDTO;

public class Student {

	private Scanner sc = new Scanner(System.in);

	public Student() {
		menu();
	}

	public void menu() {

		while (true) {
			System.out.println("****************");
			System.out.println("  관리 ");
			System.out.println("****************");
			System.out.println(" 1. 입력 ");
			System.out.println(" 2. 검색 ");
			System.out.println(" 3. 삭제  ");
			System.out.println(" 4. 종료");
			System.out.println("****************");
			System.out.print(" 번호선택 : ");

			int select = sc.nextInt();

			switch (select) {
			case 1:
				insertArticle();
				break;
			case 2:
			case 3:
				deleteArticle();
				break;
			case 4:
				exit();
			default:
				System.out.println("잘못된 키 입력!!!");
			}
		}

	}

	private void exit() {
		sc.close();
		System.out.println("프로그램이 종료 됩니다.");
		System.exit(0);
	}

	private void insertArticle() {
		int code = codeInput();
		
		if(code == 4) {
			return;
		}
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		String value = valueInput(code);
		
		StudentDTO dto = new StudentDTO(name, value, code);
		StudentDAO dao = new StudentDAO();
		
		boolean check = dao.insert(dto);
		
		if(check) {
			System.out.println(name + "님의 정보가 추가 되었습니다.");
		}else {
			System.out.println("추가를 하지 못했습니다...");
		}
	}
	
	private int codeInput() {
		System.out.println("****************");
		System.out.println("   1. 학생      ");
		System.out.println("   2. 교수      ");
		System.out.println("   3. 관리자    ");
		System.out.println("   4. 이전메뉴  ");
		System.out.println("****************");
		System.out.print("   번호선택 : ");
		
		int code = sc.nextInt();
		
		return code;
	}
	
	private String valueInput(int code) {
		if(code == 1) {
			System.out.print("학번 입력 : ");
		}else if(code== 2) {
			System.out.print("과목 입력 : ");
		}else {
			System.out.print("부서 입력 : ");
		}
		
		String value = sc.next();
		
		return value;
	}
	
	public void deleteArticle() {
		System.out.print("삭제할 이름 입력 : ");
		String name = sc.next();
		
		StudentDAO dao = new StudentDAO();
		
		int check = dao.delete(name);
		
		
		if(check != 0) {
			System.out.println(name + "님의 정보가 삭제 되었습니다.");
		}else {
			System.out.println("입력이 잘못되었습니다.");
		}
		
	}
	
}

















