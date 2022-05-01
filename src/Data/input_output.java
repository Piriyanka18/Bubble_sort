package Data;
import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.util.function.Supplier;

//import com.sun.tools.javac.util.List;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class input_output {

	private JFrame frame;
	private JTextField text1;
	private int[] Number;
	String answerLabel="";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					input_output window = new input_output();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public input_output() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblinput = new JLabel("INPUT");
		lblinput.setBounds(23, 21, 70, 21);
		lblinput.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblinput);
		
		text1 = new JTextField();
		text1.setBounds(109, 21, 232, 33);
		frame.getContentPane().add(text1);
		text1.setColumns(10);
		
		JLabel lbloutput = new JLabel("OUTPUT");
		lbloutput.setBounds(23, 95, 80, 21);
		lbloutput.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lbloutput);
		
		
		
		JLabel lab1 = new JLabel("");
		lab1.setBackground(Color.WHITE);
		lab1.setBounds(109, 83, 235, 33);
		frame.getContentPane().add(lab1);
		
		JButton btnrun = new JButton("Bubblesort");
		btnrun.setBackground(Color.LIGHT_GRAY);
		btnrun.setBounds(62, 173, 113, 33);
		btnrun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bubble();
				lab1.setText(answerLabel);
				
				
			}

			
		});
		frame.getContentPane().add(btnrun);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text1.setText(null);
				lab1.setText(null);
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(239, 173, 102, 33);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\project\\Java\\images\\login-backgrounds-128292-582669-5455043.png"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel);
	}
	
	

	private void bubble() {
		String value;
		String []array;
		value = text1.getText();
		array =value.split(",");
		int[] NumberArray=new int[array.length];
//		List<Integer> list = new ArrayList<Integer>();

		for(int i= 0 ; i < array.length;i++) {
			NumberArray[i] = Integer.parseInt(array[i]);
			System.out.println(Integer.parseInt(array[i]));
			System.out.println(NumberArray[i]);
		}
		
		bubblesort(NumberArray,NumberArray.length);
	}
	
	 private void bubblesort(int array[] , int size) {
		int temp;
		
		for(int pass = 1; pass < size; pass++) {
			for (int i=0 ; i<size - pass; i++) {
				if(array[i] > array[i+1])
				{
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		}
		
		
		 for (int num: array) {
		      answerLabel += String.valueOf(num)+" ";
		    }
		 System.out.println(answerLabel);	
	
	}
}
