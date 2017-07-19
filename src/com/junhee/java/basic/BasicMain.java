package com.junhee.java.basic;
//내장 컬렉션 임포트 
import java.util.ArrayList;
import java.util.Scanner;
import javax.activation.DataSource;
// 패키지 임포트 
import com.junhee.java.bbs.Bbs;

public class BasicMain {

	public static void main(String args[]) {
		// 데이터의 길이를 모르고, 저장/삭제 시 유용한 List 컬렉션의 ArrayList 클래스 사용 
		ArrayList<Bbs> datas = new ArrayList<>();
		// 사용자의 입력값을 받기 위해 Scanner 사용 
		Scanner scanner = new Scanner(System.in);
		// while (true) { } 은 무한루프를 실행하게 됨 
		while (true) {
			// 초기 사용자에게 명령법 설명 
			System.out.println("명령어를 입력하세요 : 1. 입력 // 2. 목록 // 3. 상세보기 // 4. 삭제 // 5. 종료");
			String command = scanner.nextLine();

			if (command.equals("1")) {

				Bbs bbs = new Bbs();

				System.out.println("제목을 입력하세요.");
				bbs.title = scanner.nextLine();

				System.out.println("이름을 입력하세요.");
				bbs.author = scanner.nextLine();

				System.out.println("내용을 입력하세요.");
				bbs.content = scanner.nextLine();

				bbs.initDate();
				datas.add(bbs);

			} else if (command.equals("2")) {
				
				System.out.println("------------ list --------------");
				// 향상된 for문을 사용하여 배열로 저장된 객체들의 속성 출력 
				for (Bbs item : datas) {
					System.out.print(item.title);
					System.out.print(" ");
					System.out.println(item.date);
				}
			} else if (command.equals("3")) {
				
				System.out.println("몇 번째 글을 보고 싶으십니까?");
				// scanner.nextInt();의 경우, enter가 한번 더 입력되기 때문에 의도적 타입 캐스팅함 
				String temp = scanner.nextLine();
				int result = Integer.parseInt(temp);
				System.out.println(datas.get(result).content);
				System.out.println(datas.get(result).date);

			} else if (command.equals("4")) {
				
				System.out.println("몇 번째 글을 삭제하고 싶으십니까?");
				int deleteWhat = scanner.nextInt();
				System.out.println(datas.remove(deleteWhat));
				System.out.println("삭제가 완료되었습니다.");
				
			} else if (command.equals("5")) {
				System.out.println("------- Exit ------");
				break;
			}
			System.out.println("-----------Re-------------");
		}
	}
}
	// 배열의 타입이 'class' 타입 

	/*
	 * System.out.println("---------- output ----------");
	 * System.out.println("제목 : " + bbs.title); System.out.println("제목 : " +
	 * bbs.author); System.out.println("제목 : " + bbs.content);
	 * 
	 */
	// bbs 인스턴스 자체를 배열에 넣음.
	// dats
	
	// switch 문 :
	// case 1 : 
	// case 2 : 
		//default :
			

	/*
	 * bbs.author = scanner.nextLine(System.in); bbs.title =
	 * scanner.nextLine(System.in); bbs.date = System.currentTimeMillis();
	 * bbs.content = scanner.nextLine();
	 */


