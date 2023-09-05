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

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField display;
	private int cq[];
	private int size;
	private int r = -1;
	private int f = 0;
	private int count = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 525, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 20, 147));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblQueueStructure = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
		lblQueueStructure.setForeground(new Color(255, 215, 0));
		lblQueueStructure.setFont(new Font("Algerian", Font.BOLD, 14));
		lblQueueStructure.setBounds(136, 24, 249, 19);
		contentPane.add(lblQueueStructure);

		JLabel lblNewLabel_1_1 = new JLabel("ENTER QUEUE SIZE :");
		lblNewLabel_1_1.setForeground(new Color(124, 252, 0));
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(62, 68, 138, 18);
		contentPane.add(lblNewLabel_1_1);

		length = new JTextField();
		length.setForeground(new Color(255, 0, 0));
		length.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		length.setColumns(10);
		length.setBounds(275, 68, 86, 20);
		contentPane.add(length);

		JButton btnCreateQueue = new JButton("CREATE QUEUE");
		btnCreateQueue.setBackground(new Color(255, 255, 255));
		btnCreateQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for creating queue size
				size = Integer.valueOf(length.getText());
				cq = new int[size];
				JOptionPane.showMessageDialog(contentPane, "Queue of size " + size + " is created");
			}
		});
		btnCreateQueue.setForeground(new Color(153, 50, 204));
		btnCreateQueue.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnCreateQueue.setBounds(185, 99, 143, 23);
		contentPane.add(btnCreateQueue);

		JLabel lblNewLabel_1_1_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_1_1_1.setForeground(new Color(124, 252, 0));
		lblNewLabel_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(62, 146, 138, 18);
		contentPane.add(lblNewLabel_1_1_1);

		element = new JTextField();
		element.setForeground(new Color(255, 0, 0));
		element.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		element.setColumns(10);
		element.setBounds(226, 146, 86, 20);
		contentPane.add(element);

		JButton btnInsert = new JButton("INSERT");
		btnInsert.setBackground(new Color(255, 255, 255));
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion operation
				int elem;
				if(count == size)
				{
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
					element.setText("");
				}
				else
				{
					elem = Integer.valueOf(element.getText());
					r = (r+1)%size;
					cq[r] = elem;
					count++;
					JOptionPane.showMessageDialog(contentPane, "Insertion Successfull");
					element.setText("");
				}
			}
		});
		btnInsert.setForeground(new Color(32, 178, 170));
		btnInsert.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnInsert.setBounds(353, 142, 97, 27);
		contentPane.add(btnInsert);

		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBackground(new Color(255, 255, 255));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion operation
				if(count == 0)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else
				{
					String message = "Element deleted is " + cq[f];
					JOptionPane.showMessageDialog(contentPane, message);
					f = (f+1)%size;
					count--;
				}
			}
		});
		btnDelete.setForeground(new Color(128, 0, 128));
		btnDelete.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnDelete.setBounds(215, 186, 97, 27);
		contentPane.add(btnDelete);

		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.setBackground(new Color(255, 255, 255));
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display operation
				String msg = "";
				int f1 = f;
				if(count == 0)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else
				{
					for(int i=1; i<=count; i++)
					{
						msg = msg + " " + cq[f1];
						f1 = (f1+1)%size;
					}
					display.setText(msg);
				}
			}
		});
		btnDisplay.setForeground(new Color(107, 142, 35));
		btnDisplay.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnDisplay.setBounds(199, 224, 129, 27);
		contentPane.add(btnDisplay);

		display = new JTextField();
		display.setForeground(new Color(255, 0, 0));
		display.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		display.setColumns(10);
		display.setBounds(153, 268, 223, 20);
		contentPane.add(display);
	}

}
