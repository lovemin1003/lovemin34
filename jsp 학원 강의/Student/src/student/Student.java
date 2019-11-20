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
			System.out.println("  ���� ");
			System.out.println("****************");
			System.out.println(" 1. �Է� ");
			System.out.println(" 2. �˻� ");
			System.out.println(" 3. ����  ");
			System.out.println(" 4. ����");
			System.out.println("****************");
			System.out.print(" ��ȣ���� : ");

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
				System.out.println("�߸��� Ű �Է�!!!");
			}
		}

	}

	private void exit() {
		sc.close();
		System.out.println("���α׷��� ���� �˴ϴ�.");
		System.exit(0);
	}

	private void insertArticle() {
		int code = codeInput();
		
		if(code == 4) {
			return;
		}
		
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		String value = valueInput(code);
		
		StudentDTO dto = new StudentDTO(name, value, code);
		StudentDAO dao = new StudentDAO();
		
		boolean check = dao.insert(dto);
		
		if(check) {
			System.out.println(name + "���� ������ �߰� �Ǿ����ϴ�.");
		}else {
			System.out.println("�߰��� ���� ���߽��ϴ�...");
		}
	}
	
	private int codeInput() {
		System.out.println("****************");
		System.out.println("   1. �л�      ");
		System.out.println("   2. ����      ");
		System.out.println("   3. ������    ");
		System.out.println("   4. �����޴�  ");
		System.out.println("****************");
		System.out.print("   ��ȣ���� : ");
		
		int code = sc.nextInt();
		
		return code;
	}
	
	private String valueInput(int code) {
		if(code == 1) {
			System.out.print("�й� �Է� : ");
		}else if(code== 2) {
			System.out.print("���� �Է� : ");
		}else {
			System.out.print("�μ� �Է� : ");
		}
		
		String value = sc.next();
		
		return value;
	}
	
	public void deleteArticle() {
		System.out.print("������ �̸� �Է� : ");
		String name = sc.next();
		
		StudentDAO dao = new StudentDAO();
		
		int check = dao.delete(name);
		
		
		if(check != 0) {
			System.out.println(name + "���� ������ ���� �Ǿ����ϴ�.");
		}else {
			System.out.println("�Է��� �߸��Ǿ����ϴ�.");
		}
		
	}
	
}

















