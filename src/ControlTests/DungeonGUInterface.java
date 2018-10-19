package ControlTests;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DungeonGUInterface {

	JFrame frame;
	public static void main(String[] args) {
		DungeonGUInterface dungeonInterface = new DungeonGUInterface();
		dungeonInterface.Dungeon();
	}
	
	public void Dungeon() {
		
		frame = new JFrame();
		frame.setTitle("Dungeon Interface");
		frame.setSize(200, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label1 = new JLabel();
		
		
		//Character Name
		JLabel charName = new JLabel("Character Name: ");
		JTextField nameInput = new JTextField(20);
		charName.setLabelFor(nameInput);
		
		nameInput.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		        label1.setText(nameInput.getText());
		    }
		});
		
		
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new GridLayout(3, 1));
		
		JButton enterButton = new JButton("Enter Dungoen");
		enterButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("");
				System.out.println("---- Entering Dungeon ----");
				System.out.println("");
				
				System.out.println("");
				System.out.println("---- ----");
				System.out.println("");
				
				label1.setText("BEWARE");
			}
		});
		
		JButton exitButton = new JButton("Exit Dungeon");
		exitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("");
				System.out.println("---- Exiting Dungeon ----");
				System.out.println("");
				
				System.out.println("");
				System.out.println("---- ----");
				System.out.println("");
				
				label1.setText("Mwahahaha");
			}
		});
		
		
		contentPane.add(enterButton);
		contentPane.add(exitButton);
		contentPane.add(label1);
		contentPane.add(charName);
		contentPane.add(nameInput);
		
		frame.pack();
		frame.setVisible(true);
	}
}
