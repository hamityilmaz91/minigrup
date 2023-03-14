package minigrup;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Interwiev {

 //ELİNİZDE
    //BİR LİSTE VAR VE BU LİSTEDEKİ TEKRARLI ELEMANLARI SİLMEK İSTİYORSUNUZ NE YAPARSINIZ?


    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(0);
        list.add(3);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(6);
        System.out.println(list);  //[1, 1, 2, 3, 3, 5, 6, 6]  ==>[1,2,3,5,6]

        // SET ile cozumu

        HashSet<Integer> hashSet=new HashSet<>(list);
        ArrayList<Integer> listtekrarsiz= new ArrayList<>(hashSet);
        System.out.println(listtekrarsiz);

        //Lambda
        System.out.println(list.stream().distinct().collect(Collectors.toList()));


        //3. Yol

        ArrayList<Integer>list2= new ArrayList<>();
        for (Integer w : list) {

            if(!(list2.contains(w))){
                list2.add(w);
            }

        }
        System.out.println("*************");
        System.out.println(list2);

        //4. Yol
        ArrayList<Integer>list3=new ArrayList<>();
        System.out.println("*****************************************************");
        System.out.println(list3.size());
        for (int i = 0; i < list.size(); i++) {

            int sayac=0;
            for (int j = 0; j < list3.size(); j++) {
                if(list.get(i)==list3.get(j)){
                    sayac++;
                }
            }
            if(sayac==0){
                list3.add(list.get(i));
            }

        }
        System.out.println("+++++++++++++++++++");
        System.out.println(list3);



    }// main



}//class
