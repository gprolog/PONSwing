package com.njj.apps;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class App {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

		String windows="com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
		 UIManager.setLookAndFeel(windows);
		
		JFrame frame = new JFrame("贝尔PON口割接工具");
		// Setting the width and height of frame
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		// 添加面板
		frame.add(panel);
		/*
		 * 调用用户定义的方法并添加组件到面板
		 */
		placeComponents(panel);

		// 设置界面可见
		frame.setVisible(true);
	}

	private static void placeComponents(JPanel panel) {


		panel.setLayout(null);
		JLabel userLabel = new JLabel("请选择割接类型：");
		userLabel.setFont(new Font("微软雅黑",1,20));
		userLabel.setBounds(50, 50, 200, 30);
		JLabel choseLabel = new JLabel("您的选择：");
		choseLabel.setFont(new Font("微软雅黑",1,20));
		choseLabel.setBounds(50, 330, 400, 30);
		JButton eponButton = new JButton("EPON 7342");
		eponButton.setBounds(150, 100, 200, 200);
		eponButton.setFont(new Font("微软雅黑",0,18));
		JButton gponButton = new JButton("GPON 7360");
		gponButton.setBounds(450, 100, 200, 200);
		gponButton.setFont(new Font("微软雅黑",0,18));
		JButton startButton = new JButton("开始");
		startButton.setBounds(250, 400, 300, 50);
		startButton.setFont(new Font("微软雅黑",0,18));
		JLabel copyLabel = new JLabel("©2017 Nijingjing. All rights reserved. ");
		copyLabel.setFont(new Font("微软雅黑",1,20));
		copyLabel.setBounds(220, 500, 400, 30);
		panel.add(userLabel);
		panel.add(choseLabel);
		panel.add(eponButton);
		panel.add(gponButton);
		panel.add(startButton);
		panel.add(copyLabel);
	}

}
