package com.datastructures.swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField display;
	private int s[];
	private int size;
	private int top = -1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 525, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(153, 50, 204));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		lblNewLabel.setBounds(172, 22, 175, 19);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1_1 = new JLabel("ENTER STACK SIZE :");
		lblNewLabel_1_1.setForeground(new Color(220, 20, 60));
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(101, 66, 132, 18);
		contentPane.add(lblNewLabel_1_1);

		length = new JTextField();
		length.setForeground(new Color(85, 107, 47));
		length.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		length.setColumns(10);
		length.setBounds(292, 65, 86, 20);
		contentPane.add(length);

		JLabel lblNewLabel_1_1_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_1_1_1.setForeground(new Color(220, 20, 60));
		lblNewLabel_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(52, 142, 131, 18);
		contentPane.add(lblNewLabel_1_1_1);

		element = new JTextField();
		element.setForeground(new Color(85, 107, 47));
		element.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		element.setColumns(10);
		element.setBounds(216, 141, 86, 20);
		contentPane.add(element);

		JButton btnCreateStack = new JButton("CREATE STACK");
		btnCreateStack.setBackground(new Color(255, 255, 255));
		btnCreateStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for creating stack size
				size = Integer.valueOf(length.getText());
				s = new int[size];
				String message = "Stack of size " + size + " is created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		btnCreateStack.setForeground(new Color(255, 127, 80));
		btnCreateStack.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnCreateStack.setBounds(191, 96, 143, 23);
		contentPane.add(btnCreateStack);

		JButton btnPush = new JButton("PUSH");
		btnPush.setBackground(new Color(255, 255, 255));
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for push operation
				int elem;
				if(top == size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Push not possible");
					element.setText("");
				}
				else
				{
					elem = Integer.valueOf(element.getText());
					++top;
					s[top] = elem;
					JOptionPane.showMessageDialog(contentPane, "Push Successfull");
					element.setText("");
				}
			}
		});
		btnPush.setForeground(new Color(199, 21, 133));
		btnPush.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnPush.setBounds(340, 138, 86, 27);
		contentPane.add(btnPush);

		JButton btnPop = new JButton("POP");
		btnPop.setBackground(new Color(255, 255, 255));
		btnPop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for pop operation
				if(top == -1)
				{
					JOptionPane.showMessageDialog(contentPane, "Pop not possible");
				}
				else
				{
					String message = "Element deleted is " + s[top];
					JOptionPane.showMessageDialog(contentPane, message);
					top--;
				}
			}
		});
		btnPop.setForeground(new Color(255, 0, 0));
		btnPop.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnPop.setBounds(216, 185, 86, 27);
		contentPane.add(btnPop);

		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.setBackground(new Color(255, 255, 255));
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display operation
				String msg = "";
				if(top == -1)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else
				{
					for(int i=top; i>=0; i--)
					{
						msg = msg + " " + s[i];
					}
					display.setText(msg);
				}
			}
		});
		btnDisplay.setForeground(new Color(255, 0, 255));
		btnDisplay.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnDisplay.setBounds(205, 223, 106, 27);
		contentPane.add(btnDisplay);

		display = new JTextField();
		display.setForeground(new Color(85, 107, 47));
		display.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		display.setColumns(10);
		display.setBounds(147, 269, 223, 20);
		contentPane.add(display);
	}
}
