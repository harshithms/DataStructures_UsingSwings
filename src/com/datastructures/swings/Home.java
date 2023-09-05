package com.datastructures.swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 325);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(173, 255, 47));
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 15));
		lblNewLabel.setBounds(125, 28, 231, 19);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ARRAY");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Place Array window opening code here
				new Array().setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 205));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnNewButton.setBounds(100, 79, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnStack = new JButton("STACK");
		btnStack.setBackground(new Color(255, 255, 255));
		btnStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Place Stack window opening code here
				new Stack().setVisible(true);
			}
		});
		btnStack.setForeground(new Color(255, 69, 0));
		btnStack.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnStack.setBounds(287, 79, 89, 23);
		contentPane.add(btnStack);
		
		JButton btnQueue = new JButton("QUEUE");
		btnQueue.setBackground(new Color(255, 255, 255));
		btnQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Place Queue window opening code here
				new Queue().setVisible(true);
			}
		});
		btnQueue.setForeground(new Color(0, 139, 139));
		btnQueue.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnQueue.setBounds(25, 147, 89, 23);
		contentPane.add(btnQueue);
		
		JButton btnCircularQueue = new JButton("CIRCULAR QUEUE");
		btnCircularQueue.setBackground(new Color(255, 255, 255));
		btnCircularQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Place Circular Queue window opening code here
				new CircularQueue().setVisible(true);
			}
		});
		btnCircularQueue.setForeground(new Color(47, 79, 79));
		btnCircularQueue.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnCircularQueue.setBounds(307, 145, 156, 27);
		contentPane.add(btnCircularQueue);
		
		JButton btnSinglyLinkedList = new JButton("SINGLY LINKED LIST");
		btnSinglyLinkedList.setBackground(new Color(255, 255, 255));
		btnSinglyLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Place Singly Linked List window opening code here
				new SinglyLinkedList().setVisible(true);
			}
		});
		btnSinglyLinkedList.setForeground(new Color(128, 0, 0));
		btnSinglyLinkedList.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnSinglyLinkedList.setBounds(36, 220, 182, 27);
		contentPane.add(btnSinglyLinkedList);
		
		JButton btnDoublyLinkedList = new JButton("DOUBLY LINKED LIST");
		btnDoublyLinkedList.setBackground(new Color(255, 255, 255));
		btnDoublyLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Place Doubly Linked List window opening code here
				new DoublyLinkedList().setVisible(true);
			}
		});
		btnDoublyLinkedList.setForeground(new Color(255, 0, 0));
		btnDoublyLinkedList.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnDoublyLinkedList.setBounds(268, 220, 182, 27);
		contentPane.add(btnDoublyLinkedList);
	}
}
