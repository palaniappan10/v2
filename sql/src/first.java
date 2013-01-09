import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.ScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class first extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					first frame = new first();
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
	public first() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField, 30, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField, 655, SpringLayout.WEST, contentPane);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSqlizeIt = new JButton("SQLIZE IT");
		btnSqlizeIt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
				
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnSqlizeIt, 6, SpringLayout.SOUTH, textField);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnSqlizeIt, 0, SpringLayout.WEST, textField);
		contentPane.add(btnSqlizeIt);
		
		JButton btnExcelIt = new JButton("EXCEL IT");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnExcelIt, 6, SpringLayout.EAST, btnSqlizeIt);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnExcelIt, 0, SpringLayout.SOUTH, btnSqlizeIt);
		contentPane.add(btnExcelIt);
		JTable table = new JTable();
		
		ScrollPane scrollPane = new ScrollPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, scrollPane, 6, SpringLayout.SOUTH, btnSqlizeIt);
		sl_contentPane.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, scrollPane, 309, SpringLayout.SOUTH, btnSqlizeIt);
		sl_contentPane.putConstraint(SpringLayout.EAST, scrollPane, 655, SpringLayout.WEST, contentPane);
		scrollPane.add(table);
		contentPane.add(scrollPane);
		
		
		//contentPane.add(table);
	}
}
