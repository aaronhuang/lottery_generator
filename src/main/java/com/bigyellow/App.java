package com.bigyellow;

import java.util.Arrays;

/**
 * Hello world!
 * 
 */
public class App {
	
	public static void main(String[] args) {

		System.out.println("Good Luck !");
		int notes = 1;
		if (args != null && args.length > 0) {
			notes = Integer.parseInt(args[0]);
			System.out.println("Lucky boy is generating " + notes
					+ "set lucky numbers for you ~");
			System.out.println("\n \n ");
		}

		ShuangSeQiuRandom shuangseqiu = new ShuangSeQiuRandom();

		for (int i = 0; i < notes; i++) {
			int[] result = shuangseqiu.generateRandom();

			int[] red = new int[ShuangSeQiuRandom.RED_BALL_LENGTH];
			int[] blue = new int[ShuangSeQiuRandom.BLUE_BALL_LENGTH];
			red = Arrays.copyOfRange(result, 0,
					ShuangSeQiuRandom.RED_BALL_LENGTH);
			blue = Arrays.copyOfRange(result,
					ShuangSeQiuRandom.RED_BALL_LENGTH,
					ShuangSeQiuRandom.RED_BALL_LENGTH
							+ ShuangSeQiuRandom.BLUE_BALL_LENGTH);

			Arrays.sort(red);
			System.out.println(Arrays.toString(red) + " | "
					+ Arrays.toString(blue));
			System.out.println("\n");
		}
		
		System.out.println("\n");
		

	}
}
