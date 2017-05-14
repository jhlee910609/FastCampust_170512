package com.junhee.java.basic;

import java.util.ArrayList;
import java.util.Scanner;

import javax.activation.DataSource;

import com.junhee.java.bbs.Bbs;

public class BasicMain {

	public static void main(String args[]) {
		
		ArrayList<Bbs> datas = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		
		
		for(int i = 0; i < 3; i++) {
			Bbs bbs = new Bbs();
			
			System.out.println("제목을 입력하세요.");
			bbs.title = scanner.nextLine();

			System.out.println("이름을 입력하세요.");
			bbs.author = scanner.nextLine();

			System.out.println("내용을 입력하세요.");
			bbs.content = scanner.nextLine();

			bbs.initDate();
			datas.add(bbs);
		}
		
		for (Bbs item : datas) {
			System.out.print(item.title);
			System.out.print(" ");
			System.out.println(item.date);
		}

		// 배열의 타입이 'class' 타
		
		
/*
		System.out.println("---------- output ----------");
		System.out.println("제목 : " + bbs.title);
		System.out.println("제목 : " + bbs.author);
		System.out.println("제목 : " + bbs.content);
		
*/		// bbs 인스턴스 자체를 배열에 넣음.
		// dats
		
	
		
				
				

		/*
		 * bbs.author = scanner.nextLine(System.in); bbs.title =
		 * scanner.nextLine(System.in); bbs.date = System.currentTimeMillis();
		 * bbs.content = scanner.nextLine();
		 */

	}
}
