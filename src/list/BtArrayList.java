package list;

import accessModifier.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class BtArrayList{
    ArrayList<Integer>arrayList =new ArrayList();

    public void add(int index,int element){
        arrayList.add(index,element);
    }

    public void remove(int index){
        arrayList.remove(index);
    }

    public boolean constains(int element){
        if (arrayList.contains(element)){
            return true;
        }
        return false;
    }

    public void getIndex(int i){
        System.out.println(arrayList.get(i));
    }

    public void clear(){
        arrayList.clear();
    }

    public static void main(String[] args) {
        BtArrayList btArrayList=new BtArrayList();
        for (int i=0;i<10;i++){
            btArrayList.arrayList.add(i);
        }
        btArrayList.add(5,20);
        btArrayList.remove(6);
        btArrayList.constains(20);
        btArrayList.getIndex(8);
        for (Integer list:btArrayList.arrayList){
            System.out.println(list);
        }
    }
}
