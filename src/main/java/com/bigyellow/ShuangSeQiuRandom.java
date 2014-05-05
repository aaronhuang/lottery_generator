/** Copyright (C) 2009, ST Electronics Info-Comm Systems PTE. LTD
 * All rights reserved.
 *
 * This software is confidential and proprietary property of 
 * ST Electronics Info-Comm Systems PTE. LTD.
 * The user shall not disclose the contents of this software and shall
 * only use it in accordance with the terms and conditions stated in
 * the contract or license agreement with ST Electronics Info-Comm Systems PTE. LTD.
 *
 * Project Name : ERS (Emergency Response System)
 * File Name    : ShuangSeQiuRandom.java
 *
 * <p> History : <br><br>
 *
 * SNo / CR PR_No / Modified by / Date Modified / Comments <br>
 * --------------------------------------------------------------------------------
 *  
 */
package com.bigyellow;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author huang.zhengyu@wuxi.stee.stengg.com.cn
 * @version 1.0
 * @date 2014-5-5
 */
public class ShuangSeQiuRandom {

	public static final int MAX_RED_BALL = 33;
	public static final int MAX_BLUE_BALL = 16;

	public static final int RED_BALL_LENGTH = 6;
	public static final int BLUE_BALL_LENGTH = 1;

	public Random random = new Random();

	public int[] generateRandom() {
		
		int[] result = new int[RED_BALL_LENGTH + BLUE_BALL_LENGTH];

		List<Integer> redBallList = new ArrayList<Integer>();
		for (int i = 1; i <= MAX_RED_BALL; i++) {
			redBallList.add(i);
		}

		for (int round = 0; round < RED_BALL_LENGTH; round++) {
			result[round] = rotateRedBall(redBallList);
		}

		redBallList.clear();
		for (int i = 1; i <= MAX_BLUE_BALL; i++) {
			redBallList.add(i);
		}

		for (int round = RED_BALL_LENGTH; round < RED_BALL_LENGTH
				+ BLUE_BALL_LENGTH; round++) {
			result[round] = rotateRedBall(redBallList);
		}

		return result;
	}

	/**
	 * @param redBallList
	 * @return
	 */
	private int rotateRedBall(List<Integer> redBallList) {
		int pos = this.random.nextInt(redBallList.size());
		int result = redBallList.get(pos);
		redBallList.remove(pos);
		return result;
	}

}
