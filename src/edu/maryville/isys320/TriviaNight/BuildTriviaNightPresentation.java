package edu.maryville.isys320.TriviaNight;

import java.util.Scanner;

public class BuildTriviaNightPresentation {

	public static void main(String[] args) {
		try {
			Scanner console = new Scanner(System.in);
			String styleType = " CategorySet ";
			System.out.println("Please Write anyone CategorySet or RoundNumber style? ");
			styleType = console.nextLine();
			String fileName = "TriviaNightProject.pptx";
			SlideShowBuilder builder = new SlideShowBuilder();
			QuestionsManager qm = new QuestionsManager("data");
			
			String[] cat = qm.getCategories();
			String[] que = qm.getQuestions();
			String[] ans = qm.getAnswers();

			if (cat.length != 10) {
				System.out.println("Wrong Length of Category");
				System.exit(-1);
			}
			if (que.length != 100) {
				System.out.println("Wrong Length of Question amount");
				System.exit(-1);
			}
			if (ans.length != 100) {
				System.out.println("Wrong Length of Answer amount");
				System.exit(-1);
			}

			builder.buildSlideShow(cat, que, ans, fileName, styleType);
			// builder.printSlideShowInfo("TriviaNight.pptx");
		} catch (Exception ex) {
			System.out.println("Try Again");
		}
	}

}
//need to gather user input for type of trivia night