import java.awt.EventQueue;import javax.swing.JFrame;import javax.swing.JLabel;import java.awt.Font;import javax.swing.JButton;
import java.awt.event.ActionListener;import java.awt.event.ActionEvent;import java.awt.Color;import javax.swing.JOptionPane;
import javax.swing.JTextField;import com.ibm.db2.jcc.am.Connection;import javax.swing.JPasswordField;import java.awt.SystemColor;
import java.sql.DriverManager;import java.sql.PreparedStatement;import java.awt.BorderLayout;import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;class update extends JFrame {private JPanel contentPane;private JTextField textField;
private JTextField textField_1;public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {public void run() {try {update frame = new update();
frame.setVisible(true);} catch (Exception e) {e.printStackTrace();}}});}public update() {setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 450, 300);contentPane = new JPanel();contentPane.setBackground(Color.BLUE);
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));setContentPane(contentPane);contentPane.setLayout(null);
JLabel lblUpdateStudentDetails = new JLabel("UPDATE STUDENT DETAILS");lblUpdateStudentDetails.setForeground(Color.WHITE);
lblUpdateStudentDetails.setFont(new Font("Tahoma", Font.BOLD, 29));lblUpdateStudentDetails.setBounds(10, 23, 412, 37);
contentPane.add(lblUpdateStudentDetails);JLabel lblNewLabel = new JLabel("ROLL NUMBER");lblNewLabel.setForeground(Color.WHITE);
lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));lblNewLabel.setBounds(10, 84, 196, 25);contentPane.add(lblNewLabel);
textField = new JTextField();textField.setColumns(10);textField.setBounds(217, 82, 172, 25);contentPane.add(textField);
JLabel lblStudentName = new JLabel("STUDENT NAME");lblStudentName.setForeground(Color.WHITE);
lblStudentName.setFont(new Font("Tahoma", Font.BOLD, 25));lblStudentName.setBounds(10, 119, 209, 25);
contentPane.add(lblStudentName);textField_1 = new JTextField();textField_1.setColumns(10);textField_1.setBounds(217, 119, 172, 25);
contentPane.add(textField_1);JButton btnNewButton_1 = new JButton("UPDATE STUDENT");btnNewButton_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {String n, d;d = textField.getText();n = textField_1.getText();
try{Class.forName("com.ibm.db2.jcc.DB2Driver");Connection con = (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/srittam", 
"db2admin", "ibmlabsrm#3");PreparedStatement ps = con.prepareStatement("Update java set name =(?) where roll =(?)");
ps.setString(1, n);ps.setString(2, d);ps.executeUpdate();}catch(Exception e1){e1.printStackTrace();}}});
btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));btnNewButton_1.setBounds(77, 177, 228, 23);contentPane.add(btnNewButton_1);}}
class delete extends JFrame {private JPanel contentPane;private JTextField textField;public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {public void run() {try {delete frame = new delete();
frame.setVisible(true);} catch (Exception e) {e.printStackTrace();}}});}public delete() {setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 450, 300);contentPane = new JPanel();contentPane.setBackground(Color.BLUE);
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));setContentPane(contentPane);contentPane.setLayout(null);
JLabel lblUpdateStudentDetails = new JLabel("UPDATE STUDENT DETAILS");lblUpdateStudentDetails.setForeground(Color.WHITE);
lblUpdateStudentDetails.setFont(new Font("Tahoma", Font.BOLD, 29));lblUpdateStudentDetails.setBounds(10, 23, 412, 37);
contentPane.add(lblUpdateStudentDetails);JLabel lblNewLabel = new JLabel("ROLL NUMBER");lblNewLabel.setForeground(Color.WHITE);
lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));lblNewLabel.setBounds(10, 84, 196, 25);contentPane.add(lblNewLabel);
textField = new JTextField();textField.setColumns(10);textField.setBounds(217, 82, 172, 25);contentPane.add(textField);
JButton btnNewButton_2 = new JButton("DELETE STUDENT");btnNewButton_2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {String n, d;d = textField.getText();try{Class.forName("com.ibm.db2.jcc.DB2Driver");
Connection con = (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/srittam", "db2admin", "ibmlabsrm#3");
PreparedStatement ps = con.prepareStatement("Delete from java WHERE roll =?");ps.setString(1, d);ps.executeUpdate();}
catch(Exception e1){e1.printStackTrace();}}});btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
btnNewButton_2.setBounds(81, 175, 228, 23);contentPane.add(btnNewButton_2);}}class insert extends JFrame {private JPanel contentPane;
private JTextField textField;private JTextField textField_1;public static void main(String[] args) {EventQueue.invokeLater(new Runnable() {
public void run() {try {insert frame = new insert();frame.setVisible(true);} catch (Exception e) {e.printStackTrace();}}});}
public insert() {setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);setBounds(100, 100, 450, 300);contentPane = new JPanel();
contentPane.setBackground(Color.BLUE);contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));setContentPane(contentPane);
contentPane.setLayout(null);JLabel lblInsertStudentDetails = new JLabel("INSERT STUDENT DETAILS");
lblInsertStudentDetails.setForeground(Color.WHITE);lblInsertStudentDetails.setFont(new Font("Tahoma", Font.BOLD, 29));
lblInsertStudentDetails.setBounds(10, 21, 412, 37);contentPane.add(lblInsertStudentDetails);JLabel lblNewLabel = new JLabel("ROLL NUMBER");
lblNewLabel.setForeground(Color.WHITE);lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));lblNewLabel.setBounds(10, 83, 196, 25);
contentPane.add(lblNewLabel);JLabel lblStudentName = new JLabel("STUDENT NAME");lblStudentName.setForeground(Color.WHITE);
lblStudentName.setFont(new Font("Tahoma", Font.BOLD, 25));lblStudentName.setBounds(10, 118, 209, 25);contentPane.add(lblStudentName);
JButton btnNewButton = new JButton("INSERT STUDENT");btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {String n, d;d = textField.getText();n = textField_1.getText();try
{Class.forName("com.ibm.db2.jcc.DB2Driver");Connection con = (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/srittam", 
"db2admin", "ibmlabsrm#3");PreparedStatement ps = con.prepareStatement("Insert into java values(?,?)");ps.setString(1, d);
ps.setString(2, n);ps.executeUpdate();}catch(Exception e1){e1.printStackTrace();}}});btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
btnNewButton.setBounds(90, 181, 228, 23);contentPane.add(btnNewButton);textField = new JTextField();textField.setBounds(217, 81, 172, 25);
contentPane.add(textField);textField.setColumns(10);textField_1 = new JTextField();textField_1.setColumns(10);textField_1.setBounds(217, 
118, 172, 25);contentPane.add(textField_1);}}public class attendance {private JFrame frame;public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {public void run() {try {attendance window = new attendance();window.frame.setVisible(true);
} catch (Exception e) {e.printStackTrace();}}});}public attendance() {initialize();}private void initialize() {frame = new JFrame();
frame.getContentPane().setBackground(Color.BLUE);frame.setBounds(100, 100, 450, 300);frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);JLabel lblNewLabel = new JLabel("STUDENT DETAILS");lblNewLabel.setForeground(Color.WHITE);
lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));lblNewLabel.setBounds(63, 24, 291, 37);frame.getContentPane().add(lblNewLabel);
JButton btnNewButton = new JButton("INSERT STUDENT");btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
btnNewButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
frame.dispose();insert in=new insert();in.setVisible(true);}});btnNewButton.setBounds(103, 82, 228, 23);
frame.getContentPane().add(btnNewButton);JButton btnNewButton_1 = new JButton("UPDATE STUDENT");
btnNewButton_1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
frame.dispose();update up=new update();up.setVisible(true);}});btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
btnNewButton_1.setBounds(103, 127, 228, 23);frame.getContentPane().add(btnNewButton_1);JButton btnNewButton_2 = new JButton("DELETE STUDENT");
btnNewButton_2.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
frame.dispose();delete dl=new delete();dl.setVisible(true);}});btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
btnNewButton_2.setBounds(103, 170, 228, 23);frame.getContentPane().add(btnNewButton_2);}}