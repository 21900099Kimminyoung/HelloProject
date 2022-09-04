package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD{
    ArrayList <Word> list;
    Scanner s;
    WordCRUD(Scanner s){
        list = new ArrayList<>();
        this.s = s;
    }
    @Override
    public Object add() {//새로운 단어를 입력받는 부분
        System.out.print("=> 난이도(1,2,3) & 새 단어 입력 : ");
        int level = s.nextInt();
        String word = s.nextLine();
        System.out.print("뜻 입력 : ");
        String meaning = s.nextLine();
        return new Word(0,level,word,meaning);
    }

    public void addWord(){//list에 추가 하는 부분
        Word one = (Word)add();
        list.add(one);
        System.out.println("새 단어가 단어장에 추가되었습니다 !!!");
    }

    @Override
    public int update(Object obj) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    @Override
    public void select(int id) {

    }

    public void listAll(){
        System.out.println("--------------------------------");
        for(int i = 0; i<list.size();i++){
            System.out.print(i+1+" ");
            System.out.println(list.get(i).toString());
        }
        System.out.println("--------------------------------");
    }
}
