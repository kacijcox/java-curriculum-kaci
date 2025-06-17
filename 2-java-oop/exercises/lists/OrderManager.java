
package lists;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class OrderManager {
	private int currentOrderNumber;
	private ArrayList<MenuItem> currentOrder = new ArrayList<>();
	private Stack<MenuItem> undoActions = new Stack<>();
	private Stack<MenuItem> redoActions = new Stack<>();
	private Queue<String> kitchenQue = new LinkedList<>();

	public OrderManager(int currentOrderNumber, ArrayList<MenuItem> currentOrder, Stack<MenuItem> undoItems, Stack<MenuItem> redoItems, Queue<String> kitchenQue) {
		this.currentOrderNumber = currentOrderNumber;
		this.currentOrder = currentOrder;
		this.undoActions = undoItems;
		this.redoActions = redoItems;
		this.kitchenQue = kitchenQue;
	}

	public void addToOrder(MenuItem menuItem) {
		if (menuItem != null) {
			currentOrder.add(menuItem);
			undoActions.push(menuItem);
			redoActions.clear();
		}
	}

	public void removeFromOrder(MenuItem menuItem) {
		if (menuItem != null && currentOrder.contains(menuItem)) {
			currentOrder.remove(menuItem);
		}
	}

	public void undo() {
		if (!undoActions.isEmpty()) {
			MenuItem lastItem = undoActions.pop();
			redoActions.push(lastItem);
			currentOrder.remove(lastItem);
		} else {
			System.out.println("nothing to undo");
		}
	}

	public void redo() {
		if (!redoActions.isEmpty()) {
			MenuItem itemToRedo = redoActions.pop();
			undoActions.push(itemToRedo);
			currentOrder.add(itemToRedo);
		} else {
			System.out.println("nothing to redo");
		}
	}

	public void returnOrder() {
		for (MenuItem item : currentOrder) {
			kitchenQue.offer(item.getItemName());
		}
		currentOrder.clear();
		undoActions.clear();
		redoActions.clear();
		currentOrderNumber++;
	}

	public int getCurrentOrderNumber() {
		return currentOrderNumber;
	}

	public void setCurrentOrderNumber(int currentOrderNumber) {
		this.currentOrderNumber = currentOrderNumber;
	}

	public Queue<String> getKitchenQue() {
		return kitchenQue;
	}

	public void setKitchenQue(Queue<String> kitchenQue) {
		this.kitchenQue = kitchenQue;
	}

	public Stack<MenuItem> getRedoItems() {
		return redoActions;
	}

	public void setRedoItems(Stack<MenuItem> redoItems) {
		this.redoActions = redoItems;
	}

	public Stack<MenuItem> getUndoActions() {
		return undoActions;
	}

	public void setUndoActions(Stack<MenuItem> undoActions) {
		this.undoActions = undoActions;
	}

	public ArrayList<MenuItem> getCurrentOrder() {
		return currentOrder;
	}

	public void setCurrentOrder(ArrayList<MenuItem> currentOrder) {
		this.currentOrder = currentOrder;
	}
}