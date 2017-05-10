package datastruct.controller;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import datastruct.model.Customer;
import datastruct.model.Notebooks;

public class StructureController 
{
	private Queue<Customer> customerQueue;
	private Stack<Notebooks> notebookStack;
	
	public StructureController()
	{
		customerQueue = new PriorityQueue<Customer>();
		notebookStack = new Stack<Notebooks>();
	}
	
	public void start()
	{
		queueActions();
		stackActions();
	}
	
	public void queueActions()
	{
		customerQueue.add(new Customer());
		customerQueue.remove();
		customerQueue.add(new Customer());
		customerQueue.add(new Customer());
		customerQueue.poll();
	}
	
	public void stackActions()
	{
		notebookStack.push(new Notebooks());
		notebookStack.pop();
		notebookStack.peek();
	}
	
	
}
