package com.ruthtech.arrayproblems;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.ruthtech.arrays.MyList;

public class MyListTest {

    @Test
    public void testMyList() {
        MyList<Integer> list = new MyList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
       
        assertEquals(2 , list.get(1));
        assertEquals(3 , list.get(2));        
        assertEquals(4, list.get(4));

       
        
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
        	list.get(6);
        });

        //list.get(6);
    }


    @Test
    public void testNegative() {
        MyList<Integer> list = new MyList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
      //  list.get(-1);
    }

    @Test
    public void testList() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        assertEquals(4 ,list.get(4));
        assertEquals(2 , list.get(1));
        assertEquals(3 ,list.get(2));

       // list.get(6);
    }



}