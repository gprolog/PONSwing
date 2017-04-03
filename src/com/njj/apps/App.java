package com.njj.apps;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class App {

	private static JFrame frame;
	private static JPanel panel;
	private static JLabel userLabel;
	private static JLabel choseLabel;
	private static JLabel changeLabel;
	private static JLabel copyLabel;
	private static JButton eponButton;
	private static JButton gponButton;
	private static JButton startButton;
	private static boolean pon = false;
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

		String windows="com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
		 UIManager.setLookAndFeel(windows);
		 frame = new JFrame();
		 frame.setTitle("贝尔PON口割接工具");
		 frame.setSize(800, 600);
		 frame.setLocationRelativeTo(null);
		 frame.setResizable(false);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		 frame.add(panel);
		placeComponents();
		setListener();
		frame.setVisible(true);


	}
	
	private static void placeComponents() {


		panel.setLayout(null);
		userLabel = new JLabel("请选择割接类型：");
		userLabel.setFont(new Font("微软雅黑",1,20));
		userLabel.setBounds(50, 50, 200, 30);
		choseLabel = new JLabel("您的选择：");
		choseLabel.setFont(new Font("微软雅黑",1,20));
		choseLabel.setBounds(50, 330, 400, 30);
		changeLabel = new JLabel("EPON 7342");
		changeLabel.setFont(new Font("微软雅黑",1,20));
		changeLabel.setBounds(150, 330, 400, 30);
		eponButton = new JButton("EPON 7342");
		eponButton.setBounds(150, 100, 200, 200);
		eponButton.setFont(new Font("微软雅黑",0,18));
		gponButton = new JButton("GPON 7360");
		gponButton.setBounds(450, 100, 200, 200);
		gponButton.setFont(new Font("微软雅黑",0,18));
		startButton = new JButton("开始");
		startButton.setBounds(250, 400, 300, 50);
		startButton.setFont(new Font("微软雅黑",0,18));
		copyLabel = new JLabel("©2017 Nijingjing. All rights reserved. ");
		copyLabel.setFont(new Font("微软雅黑",1,20));
		copyLabel.setBounds(220, 500, 400, 30);
		panel.add(userLabel);
		panel.add(choseLabel);
		panel.add(changeLabel);
		panel.add(eponButton);
		panel.add(gponButton);
		panel.add(startButton);
		panel.add(copyLabel);
		
		
		

		
	}
	
	private static void setListener(){
		eponButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				changeLabel.setText("EPON 7342");
				pon = false;
				
			}
		});
		
		gponButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				changeLabel.setText("GPON 7360");
				pon = true;
			}
		});
		
		startButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(pon){
					
				}else{
					frame.setVisible(false);
					EponFrame eFrame = new EponFrame();
					eFrame.setVisible(true);
					
				}
				
			}
		});
		
	}





}
