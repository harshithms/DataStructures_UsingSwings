package com.datastructures.swings;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.datastructures.swings.SinglyLinkedList.Node;

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField insertRear;
	private JTextField insertFront;
	private JTextField display;

	class Node 
	{
		Node prelink;
		int data;
		Node nextlink;
	}

	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 525, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(136, 21, 287, 18);
		contentPane.add(lblNewLabel);

		JLabel lblEnterTheElement = new JLabel("ENTER THE ELEMENT :");
		lblEnterTheElement.setForeground(new Color(255, 215, 0));
		lblEnterTheElement.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblEnterTheElement.setBounds(42, 60, 147, 18);
		contentPane.add(lblEnterTheElement);

		JLabel lblEnterTheElement_2 = new JLabel("ENTER THE ELEMENT :");
		lblEnterTheElement_2.setForeground(new Color(255, 215, 0));
		lblEnterTheElement_2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblEnterTheElement_2.setBounds(42, 103, 147, 18);
		contentPane.add(lblEnterTheElement_2);

		insertRear = new JTextField();
		insertRear.setBackground(new Color(128, 128, 128));
		insertRear.setForeground(new Color(255, 255, 255));
		insertRear.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		insertRear.setBounds(229, 60, 86, 20);
		contentPane.add(insertRear);
		insertRear.setColumns(10);

		JButton btnNewButton = new JButton("INSERT REAR");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Insert Rear operation
				Node temp;
				int elem = Integer.valueOf(insertRear.getText());
				Node newnode = new Node();
				newnode.prelink = null;
				newnode.data = elem;
				newnode.nextlink = null;
				if(first == null)
				{
					first = newnode;
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "Insertion @ Rear successull");
					insertRear.setText("");
				}
				else
				{
					temp = first;
					while(temp.nextlink != null)
					{
						temp = temp.nextlink;
					}
					temp.nextlink = newnode;
					newnode.prelink = temp;
					JOptionPane.showMessageDialog(contentPane, "Insertion @ Rear successull");
					insertRear.setText("");
				}
			}
		});
		btnNewButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnNewButton.setBounds(363, 57, 122, 25);
		contentPane.add(btnNewButton);

		insertFront = new JTextField();
		insertFront.setBackground(new Color(128, 128, 128));
		insertFront.setForeground(new Color(255, 255, 255));
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
				newnode.prelink = null;
				newnode.data = elem;
				newnode.nextlink = null;
				if(first == null)
				{
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "Insertion @ Front successfull");
					insertFront.setText("");
				}
				else
				{
					newnode.nextlink = first;
					first.prelink = newnode;
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "Insertion @ Front successfull");
					insertFront.setText("");
				}
			}
		});
		btnInsertFront.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnInsertFront.setBounds(363, 102, 123, 25);
		contentPane.add(btnInsertFront);

		JButton btnDeleteRear = new JButton("DELETE REAR");
		btnDeleteRear.setForeground(new Color(0, 0, 0));
		btnDeleteRear.setBackground(new Color(255, 255, 255));
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Delete Rear operation
				Node temp;
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.nextlink == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is " + first.data);
					first = null;
				}
				else
				{
					temp = first;
					while(temp.nextlink.nextlink != null)
					{
						temp = temp.nextlink;
					}
					JOptionPane.showMessageDialog(contentPane, "Element deleted is " + temp.nextlink.data);
					temp.nextlink = null;
				}
			}
		});
		btnDeleteRear.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnDeleteRear.setBounds(200, 143, 115, 25);
		contentPane.add(btnDeleteRear);

		JButton btnDeleteFront = new JButton("DELETE FRONT");
		btnDeleteFront.setBackground(new Color(255, 255, 255));
		btnDeleteFront.setForeground(new Color(0, 0, 0));
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Delete Front operation
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.nextlink == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is " + first.data);
					first = null;
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is " + first.data);
					first = first.nextlink;
					first.prelink = null;
				}
			}
		});
		btnDeleteFront.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnDeleteFront.setBounds(189, 189, 136, 25);
		contentPane.add(btnDeleteFront);

		JButton btnDisplay = new JButton("DISPLAY FORWARD");
		btnDisplay.setBackground(new Color(255, 255, 255));
		btnDisplay.setForeground(new Color(0, 0, 0));
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for DisplayForward operation
				Node temp;
				String msg = "";
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
					display.setText("");
				}
				else if(first.nextlink == null)
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
						temp = temp.nextlink;
					}
					display.setText(msg);
				}
			}
		});
		btnDisplay.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnDisplay.setBounds(70, 234, 147, 25);
		contentPane.add(btnDisplay);

		display = new JTextField();
		display.setBackground(new Color(128, 128, 128));
		display.setForeground(new Color(255, 255, 255));
		display.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		display.setColumns(10);
		display.setBounds(126, 280, 280, 20);
		contentPane.add(display);

		JButton btnDisplayReverse = new JButton("DISPLAY REVERSE");
		btnDisplayReverse.setBackground(new Color(255, 255, 255));
		btnDisplayReverse.setForeground(new Color(0, 0, 0));
		btnDisplayReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for DisplayReverse operation
				Node temp;
				String msg = "";
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
					display.setText("");
				}
				else if(first.nextlink == null)
				{
					msg = msg + first.data;
					display.setText(msg);
				}
				else
				{
					temp = first;
					while(temp.nextlink != null)
					{
						temp = temp.nextlink;
					}
					while(temp != null)
					{
						msg = msg + " " + temp.data;
						temp = temp.prelink;
					}
					display.setText(msg);
				}
			}
		});
		btnDisplayReverse.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnDisplayReverse.setBounds(297, 234, 143, 25);
		contentPane.add(btnDisplayReverse);
	}

}
