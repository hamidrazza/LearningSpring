package com.hamid;

import java.util.Scanner;

public class QuestionService {
    Question[] ques = new Question[5];
    Scanner in = new Scanner(System.in);
    String[] selections = new String[5];

    public QuestionService(){
        ques[0] = new Question(1,"Size of 'int': ", "2", "4", "6", "8", "4");
        ques[1] = new Question(2,"Size of 'float': ", "2", "4", "6", "8", "4");
        ques[2] = new Question(3,"Size of 'char': ", "2", "1", "6", "4", "1");
        ques[3] = new Question(4,"Size of 'string': ", "2", "4", "6", "8", "4");
        ques[4] = new Question(5,"Size of 'double': ", "2", "4", "6", "8", "8");
    }
    public void playQuiz(){
        int i = 0;
        for(Question q : ques){
            System.out.print("Q." + q.getId() + ": ");
            System.out.println(q.getQues());
            System.out.print(q.getOpt1() + "\t");
            System.out.print(q.getOpt2()+ "\t");
            System.out.print(q.getOpt3()+ "\t");
            System.out.println(q.getOpt4()+ "\t");

            System.out.print("Answer: ");
            selections[i++] = in.nextLine();
            System.out.println("----------------------");
        }
        System.out.println("------ANSWERS------");
        for (String s : selections){
            System.out.print(s + "\t");
        }

        int score = 0;

        for (int j = 0; j < 5; j++) {
            if(selections[j].equals(ques[j].getAnswer())){
                score++;
            }
        }

        System.out.println("| Score : " + score);
        System.out.println("----------------------");
    }
}
