package com.dev.practice.linkedlist.doublylinkedlist;

class DoublyLinkedList {

	public Node getNewNodes(int i) {
		Node node = new Node();
		node.data = i;
		node.next = null;
		node.previous = null;

		return node;
	}

	public Node insert(int i, Node head) {
		if (head == null) {
			return getNewNodes(i);
		}
		Node node = head;
		while (node.next != null) {
			node = node.next;
		}
		Node newNode = getNewNodes(i);
		newNode.previous = node;
		node.next = newNode;
		return head;
	}

	public Node insertAtStart(Node head, int i) {
		if (head == null) {
			return getNewNodes(i);
		}

		Node t = getNewNodes(i);
		t.previous = t;
		t.next = head;

		return t;
	}

	public Node insertAtGivenPosition(Node head, int data, int position) {
		if (head == null) {
			if (position == 1)
				return getNewNodes(data);
			else
				return null;
		}

		// insert at first position
		if (position == 1) {
			Node t = getNewNodes(data);
			head.previous = t;
			t.next = head;
			return t;
		}

		// insert in middle
		Node node = head;
		while (node != null && position > 2) {
			node = node.next;
			position--;
		}

		if (node == null) {
			System.out.println("Position is not valid");
			return head;
		}

		Node t = getNewNodes(data);
		t.next = node.next;
		t.previous = node;
		if (node.next != null) {
			node.next.previous = t;
		}
		node.next = t;
		return head;
	}

	public Node deleteFirstNode(Node head) {
		if (head == null) {
			return null;
		}

		if (head.next != null) {
			head.next.previous = null;
		}

		return head.next;
	}

	public Node deleteNode(Node head, int data) {
		if (head == null) {
			return head;
		}
		if (head.data == data) {
			if (head.next != null) {
				head.next.previous = null;
			}
			return head.next;
		}

		Node node = head;

		while (node != null) {
			if (node.data == data) {
				break;
			}
			node = node.next;
		}

		if (node == null) {
			System.out.println("Element doesn't exist in the list");
			return head;
		}

		if (node.next != null) {
			node.next.previous = node.previous;
		}

		node.previous.next = node.next;

		return head;
	}

	public Node deleteAtGivenPosition(Node head, int position) {
		if (head == null) {
			return head;
		}

		// delete from first position
		if (position == 1) {
			if (head.next != null) {
				head.next.previous = null;
			}
			return head.next;
		}

		// insert in middle
		Node node = head;
		while (node != null && position > 1) {
			node = node.next;
			position--;
		}

		if (node == null) {
			System.out.println("Position is not valid");
			return head;
		}

		if (node.next != null) {
			node.next.previous = node.previous;
		}
		node.previous.next = node.next;

		return head;
	}

	public void printAll(Node node) {
		if (node == null) {
			return;
		}
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

}

class Node {
	int data;
	Node next;
	Node previous;
}

public class DoublyLinkedListExample {

	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		Node head = null;

		head = doublyLinkedList.insert(40, head);
		head = doublyLinkedList.insert(50, head);
		head = doublyLinkedList.insert(60, head);
		head = doublyLinkedList.insert(70, head);
		head = doublyLinkedList.insert(80, head);
		doublyLinkedList.printAll(head);
		
		head = doublyLinkedList.insertAtStart(head, 20);
		head = doublyLinkedList.insertAtStart(head, 10);
		head = doublyLinkedList.insertAtGivenPosition(head, 30, 3);
		head = doublyLinkedList.insertAtGivenPosition(head, 10, 1);
		head = doublyLinkedList.insertAtGivenPosition(head, 20, 2);
		head = doublyLinkedList.insertAtGivenPosition(head, 20, 2);
		doublyLinkedList.printAll(head);
		
		head = doublyLinkedList.deleteFirstNode(head);
		head = doublyLinkedList.deleteNode(head, 20);
		head = doublyLinkedList.deleteFirstNode(head);
		head = doublyLinkedList.deleteAtGivenPosition(head, 2);
		
		doublyLinkedList.printAll(head);
	}

}
