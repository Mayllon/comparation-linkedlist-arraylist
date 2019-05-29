package com.sample;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ComparationLinkedlistArraylistApplicationTests {

	public static final int QUANTITY_OBJECT = 10000000;
	public static final int INDEX_ARRAY = 888888;
	static ArrayList<Integer> arrayListOfInteger;
	static LinkedList<Integer> linkedListOfInteger;

	@BeforeClass
	public static void load() {
		arrayListOfInteger = new ArrayList<Integer>();
		linkedListOfInteger = new LinkedList<Integer>();
		for(int i = 0; i < 1000000;i++) {
			arrayListOfInteger.add(i);
			linkedListOfInteger.add(i);
		}
	}
	
	@Test
	public void addObjectArrayList() {
		arrayListOfInteger = new ArrayList<Integer>();
		for(int i = 0; i < QUANTITY_OBJECT;i++) {
			arrayListOfInteger.add(i);
		}
	}
	@Test
	public void addObjectLinkedList() {
		linkedListOfInteger = new LinkedList<Integer>();
		for(int i = 0; i < QUANTITY_OBJECT;i++) {
			linkedListOfInteger.add(i);
		}
	}
	@Test
	public void insertObjectArrayList() {
		for(int i = 0; i < 100;i++)
			arrayListOfInteger.add(INDEX_ARRAY + i, 900);
		System.out.println(arrayListOfInteger.size());
	}
	@Test
	public void insertObjectLinkedList() {
		for(int i = 0; i < 100;i++)
			linkedListOfInteger.add(INDEX_ARRAY + i, 900);
		System.out.println(linkedListOfInteger.size());
	}
	@Test
	public void removeObjectArrayList() {
		for(int i = 0; i < 100;i++)
			arrayListOfInteger.remove(INDEX_ARRAY + i);
	}
	@Test
	public void removeObjectLinkedList() {
		for(int i = 0; i < 100;i++)
			linkedListOfInteger.remove(INDEX_ARRAY + i);
	}
	@Test
	public void replaceObjectArrayList() {
		for(int i = 0; i < 100;i++)
			arrayListOfInteger.set(INDEX_ARRAY + i, 88888);
	}
	@Test
	public void replaceObjectLinkedList() {
		for(int i = 0; i < 100;i++)
			linkedListOfInteger.set(INDEX_ARRAY + i, 88888);
	}
	@Test
	public void readObjectArrayList() {
		for(int i = 0; i < 100;i++)
			arrayListOfInteger.get(INDEX_ARRAY + i);
	}
	@Test
	public void readObjectLinkedList() {
		for(int i = 0; i < 100;i++)
			linkedListOfInteger.get(INDEX_ARRAY + i);
	}
}
