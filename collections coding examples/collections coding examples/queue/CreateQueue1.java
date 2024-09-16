package com.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

//write a java programe create queue by using Linked lsit
public class CreateQueue1 {

	public static void main(String[] args) {
		
		Queue<String> queue= new LinkedList<String>();
		 
		queue.add("welcome");
		queue.add("to ");
		queue.add("excelr");
		queue.add("learn");
		queue.add("full");
		queue.add("stack");
		queue.add("java");
		System.out.println("printing que elements  :"+queue);
		
	}
}
