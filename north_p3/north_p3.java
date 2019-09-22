package north_p3;

import java.util.Scanner;
public class popularityPoll {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String[] topics = new String[5];
		int [][] responses = new int[5][10];
		int i, j, k;
		int[] average = new int[5];
		int hi = 0, lo = 0;
		int[] sum = new int[5+1];
		String topicHi = null, topicLo = null;
		
		topics[0] = "Food";
		topics[1] = "Sports";
		topics[2] = "School";
		topics[3] = "Politics";
		topics[4] = "Environment";
		
		System.out.println("This program is a poll of issues that up to ten people can\n"
				+ "answer on five topics. Please rate your answer with a number (1 to 10)\n"
				+ "with 1 being the least important to 10 being the most important.\n\n");
		
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 10; j++) 
			{
				System.out.println("User #:" + (j + 1) + " please enter a number from 1 to 10 on how you\n"
						+ "feel about " + topics[i] + ": ");
				responses[i][j] = scnr.nextInt();
				average[i] = average[i] + responses[i][j];
				sum[i] = sum[i] + responses[i][j];
			}
			average[i] = average[i] / 10;
		}
		for (k = 0; k < 5; k++)
		{
			
			if(sum[k+1] < sum[k])
			{
				hi = sum[k];
				topicHi = topics[k];
			}
			else
			{
				hi = sum[k + 1];
				topicHi = topics[k];
			}
			if(sum[k + 1] > sum[k])
			{
				lo = sum[k];
				topicLo = topics[k];
			}
			else
			{
				lo = sum[k+1]; 
				topicLo = topics[k];
			}
		}
			
		System.out.println("\n\nHere are the results:\n\n");
		
		System.out.println(" 		1	2	3	4	5	6	7	8	9	10");
		System.out.println(topics[0] + ": 		" + responses[0][0] + " 	" + responses[0][1] + " 	" + responses[0][2] + " 	" + responses[0][3] + " 	" + responses[0][4] + " 	" + responses[0][5] + " 	" + responses[0][6] + " 	" + responses[0][7] + " 	" + responses[0][8] + " 	" + responses[0][9] + " 	Average: " + average[0]);
		System.out.println(topics[1] + ": 	" + responses[1][0] + " 	" + responses[1][1] + " 	" + responses[1][2] + " 	" + responses[1][3] + " 	" + responses[1][4] + " 	" + responses[1][5] + " 	" + responses[1][6] + " 	" + responses[1][7] + " 	" + responses[1][8] + " 	" + responses[1][9] + " 	Average: " + average[1]);
		System.out.println(topics[2] + ": 	" + responses[2][0] + " 	" + responses[2][1] + " 	" + responses[2][2] + " 	" + responses[2][3] + " 	" + responses[2][4] + " 	" + responses[2][5] + " 	" + responses[2][6] + " 	" + responses[2][7] + " 	" + responses[2][8] + " 	" + responses[2][9] + " 	Average: " + average[2]);
		System.out.println(topics[3] + ": 	" + responses[3][0] + " 	" + responses[3][1] + " 	" + responses[3][2] + " 	" + responses[3][3] + " 	" + responses[3][4] + " 	" + responses[3][5] + " 	" + responses[3][6] + " 	" + responses[3][7] + " 	" + responses[3][8] + " 	" + responses[3][9] + " 	Average: " + average[3]);
		System.out.println(topics[4] + ": 	" + responses[4][0] + " 	" + responses[4][1] + " 	" + responses[4][2] + " 	" + responses[4][3] + " 	" + responses[4][4] + " 	" + responses[4][5] + " 	" + responses[4][6] + " 	" + responses[4][7] + " 	" + responses[4][8] + " 	" + responses[4][9] + " 	Average: " + average[4]);
		
		System.out.println("The most popular topic was: " + topicHi + " with a total score of: " + hi + " points!");
		System.out.println("The least popular topic was: " + topicLo + " with a total score of: " + lo + " points...");
		
	}

}