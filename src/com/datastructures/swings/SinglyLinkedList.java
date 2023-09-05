package com.datastructures.swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField insertRear;
	private JTextField insertFront;
	private JTextField display;

	class Node 
	{
		int data;
		Node link;
	}

	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 525, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 165, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(126, 21, 280, 18);
		contentPane.add(lblNewLabel);

		JLabel lblEnterTheElement = new JLabel("ENTER THE ELEMENT :");
		lblEnterTheElement.setForeground(new Color(75, 0, 130));
		lblEnterTheElement.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblEnterTheElement.setBounds(42, 60, 147, 18);
		contentPane.add(lblEnterTheElement);

		JLabel lblEnterTheElement_2 = new JLabel("ENTER THE ELEMENT :");
		lblEnterTheElement_2.setForeground(new Color(75, 0, 130));
		lblEnterTheElement_2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblEnterTheElement_2.setBounds(42, 103, 147, 18);
		contentPane.add(lblEnterTheElement_2);

		insertRear = new JTextField();
		insertRear.setForeground(new Color(47, 79, 79));
		insertRear.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		insertRear.setBounds(229, 60, 86, 20);
		contentPane.add(insertRear);
		insertRear.setColumns(10);

		JButton btnNewButton = new JButton("INSERT REAR");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Insert Rear operation
				Node temp;
				int elem = Integer.valueOf(insertRear.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				if(first == null)
				{
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "Insertion @ Rear successull");
					insertRear.setText("");
				}
				else
				{
					temp = first;
					while(temp.link != null)
					{
						temp = temp.link;
					}
					temp.link = newnode;
					JOptionPane.showMessageDialog(contentPane, "Insertion @ Rear successull");
					insertRear.setText("");
				}
			}
		});
		btnNewButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		btnNewButton.setBounds(367, 57, 122, 25);
		contentPane.add(btnNewButton);

		insertFront = new JTextField();
		insertFront.setForeground(new Color(47, 79, 79));
		insertFront.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		insertFront.setColumns(10);
		insertFront.setBounds(229, 103, 86, 20);
		contentPane.add(insertFront);

		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.setBackground(new Color(255, 255, 255));
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Insert Front operation
				int elem = Integer.valueOf(insertFront.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				if(first == null)
				{
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "Insertion @ Front successfull");
					insertFront.setText("");
				}
				else
				{
					newnode.link = first;
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "Insertion @ Front successfull");
					insertFront.setText("");
				}
			}
		});
		btnInsertFront.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		btnInsertFront.setBounds(367, 100, 132, 25);
		contentPane.add(btnInsertFront);

		JButton btnDeleteRear = new JButton("DELETE REAR");
		btnDeleteRear.setBackground(new Color(255, 255, 255));
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Delete Rear operation
				Node temp;
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is " + first.data);
					first = null;
				}
				else
				{
					temp = first;
					while(temp.link.link != null)
					{
						temp = temp.link;
					}
					JOptionPane.showMessageDialog(contentPane, "Element deleted is " + temp.link.data);
					temp.link = null;
				}
			}
		});
		btnDeleteRear.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		btnDeleteRear.setBounds(200, 143, 122, 25);
		contentPane.add(btnDeleteRear);

		JButton btnDeleteFront = new JButton("DELETE FRONT");
		btnDeleteFront.setBackground(new Color(255, 255, 255));
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Delete Front operation
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is " + first.data);
					first = null;
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is " + first.data);
					first = first.link;
				}
			}
		});
		btnDeleteFront.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		btnDeleteFront.setBounds(189, 189, 147, 25);
		contentPane.add(btnDeleteFront);

		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.setBackground(new Color(255, 255, 255));
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Display operation
				Node temp;
				String msg = "";
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
					display.setText("");
				}
				else if(first.link == null)
				{
					msg = msg + first.data;
					display.setText(msg);
				}
				else
				{
					temp = first;
					while(temp != null)
					{
						msg = msg + " " + temp.data;
						temp = temp.link;
					}
					display.setText(msg);
				}
			}
		});
		btnDisplay.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		btnDisplay.setBounds(202, 233, 113, 25);
		contentPane.add(btnDisplay);

		display = new JTextField();
		display.setBackground(new Color(255, 255, 255));
		display.setForeground(new Color(47, 79, 79));
		display.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		display.setColumns(10);
		display.setBounds(126, 280, 264, 20);
		contentPane.add(display);
	}
}
