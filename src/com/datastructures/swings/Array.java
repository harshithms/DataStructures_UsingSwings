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

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField insertposition;
	private JTextField deleteposition;
	private JTextField display;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 525, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(107, 142, 35));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(238, 232, 170));
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 14));
		lblNewLabel.setBounds(165, 21, 183, 18);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH :");
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNewLabel_1.setBounds(72, 61, 154, 18);
		contentPane.add(lblNewLabel_1);

		length = new JTextField();
		length.setForeground(new Color(255, 140, 0));
		length.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		length.setBounds(289, 61, 86, 20);
		contentPane.add(length);
		length.setColumns(10);

		JButton btnNewButton = new JButton("CREATE ARRAY");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Creating Array Length
				int len = Integer.valueOf(length.getText());
				arr = new int[len];
				String message = "Array of length " + len + " is created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		btnNewButton.setForeground(new Color(138, 43, 226));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnNewButton.setBounds(184, 90, 143, 23);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN INTEGER ELEMENT");
		lblNewLabel_1_1.setForeground(Color.YELLOW);
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(10, 135, 193, 18);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("POSITION");
		lblNewLabel_1_1_1.setForeground(Color.YELLOW);
		lblNewLabel_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(314, 135, 66, 18);
		contentPane.add(lblNewLabel_1_1_1);

		element = new JTextField();
		element.setForeground(new Color(255, 140, 0));
		element.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		element.setColumns(10);
		element.setBounds(213, 135, 86, 20);
		contentPane.add(element);

		insertposition = new JTextField();
		insertposition.setForeground(new Color(255, 140, 0));
		insertposition.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		insertposition.setColumns(10);
		insertposition.setBounds(393, 135, 86, 20);
		contentPane.add(insertposition);

		JButton btnNewButton_1 = new JButton("INSERT");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Insert Element
				int elem = Integer.valueOf(element.getText());
				int pos = Integer.valueOf(insertposition.getText());
				int len = Integer.valueOf(length.getText());
				if(pos<=len-1)
				{
					arr[pos] = elem;
					String message = "Element " + elem + " inserted @ position " + pos;
					JOptionPane.showMessageDialog(contentPane, message);
					element.setText("");
					insertposition.setText("");
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
				}
			}
		});
		btnNewButton_1.setForeground(new Color(255, 0, 255));
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnNewButton_1.setBounds(195, 164, 127, 23);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel_1_1_2 = new JLabel("ENTER THE POSITION");
		lblNewLabel_1_1_2.setForeground(Color.YELLOW);
		lblNewLabel_1_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNewLabel_1_1_2.setBounds(46, 210, 143, 18);
		contentPane.add(lblNewLabel_1_1_2);

		deleteposition = new JTextField();
		deleteposition.setForeground(new Color(255, 140, 0));
		deleteposition.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		deleteposition.setColumns(10);
		deleteposition.setBounds(213, 209, 86, 20);
		contentPane.add(deleteposition);

		JButton btnNewButton_1_1 = new JButton("DELETE");
		btnNewButton_1_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Delete Element
				int pos = Integer.valueOf(deleteposition.getText());
				arr[pos] = 0;
				String message = "Element deleted @ the position " + pos;
				JOptionPane.showMessageDialog(contentPane, message);
				deleteposition.setText("");
			}
		});
		btnNewButton_1_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnNewButton_1_1.setBounds(335, 208, 127, 23);
		contentPane.add(btnNewButton_1_1);

		JButton btnNewButton_1_1_1 = new JButton("DISPLAY");
		btnNewButton_1_1_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Display
				String msg = "";
				for(int i=0; i<=arr.length-1; i++)
				{
					msg = msg + " " + arr[i];
				}
				display.setText(msg);
			}
		});
		btnNewButton_1_1_1.setForeground(new Color(139, 69, 19));
		btnNewButton_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnNewButton_1_1_1.setBounds(195, 246, 127, 23);
		contentPane.add(btnNewButton_1_1_1);

		display = new JTextField();
		display.setForeground(new Color(255, 140, 0));
		display.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		display.setColumns(10);
		display.setBounds(146, 280, 229, 20);
		contentPane.add(display);
	}

}
