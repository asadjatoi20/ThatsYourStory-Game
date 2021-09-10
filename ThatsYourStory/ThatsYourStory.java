import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.FileReader;

import javax.swing.*;

public class ThatsYourStory {
	static JFrame storyWindow;
	static String stringValue ="x";
	static int intValue = 0;
	static JFrame mainFrame;  // used for making the interface interactive
	

	public static void searchStory() {
		
		// below are some stories
		String story1 = "Tired of the bragging of a speedy hare, \n"
				+ "\na tortoise challenges it to a race. "
				+ "\nThe overconfident hare accepts the competition and"
				+ "\nruns as fast as it can after the race begins. "
				+ "\nSoon it gets tired and decides to rest, "
				+ "\nthinking that there’s plenty of time to relax "
				+ "\nbefore tortoise can catch up with it. "
				+ "\nMeanwhile, the tortoise continues to walk slowly, "
				+ "\nuntil it reaches the finish line. The overslept hare"
				+ "\nwakes up, only to be shocked that a slow moving"
				+ "\ntortoise beat it in the race."
				+ "\nMoral: Slow and steady 1 wins the race.";
		
		String story2 = "A farmer had a duck, which laid 10 eggs. \r\n" + 
				"Soon, they all hatched. Of the ten, \r\n" + 
				"nine ducklings looked like the mom. \r\n" + 
				"The tenth one was big, gray and ugly. \r\n" + 
				"All the other ducklings made fun of the ugly one.\r\n" + 
				"Unhappy in the farm, the poor duckling ran away to a river nearby.\r\n" + 
				"There he sees white, beautiful swans. Afraid and lost, \r\n" + 
				"he wanted to drown in the river. But when he looked at his\r\n" + 
				"reflection in the river, he realized that he was not an\r\n" + 
				"ugly duckling, but a beautiful swan!\r\n" + 
				"Moral: You are beautiful just the way you are.";


		String story3 = "On a hot summer day,  fox comes upon an orchard \r\n" + 
				"and sees a bunch of ripened grapes. It thinks: \r\n" + 
				"“Just what I need to quench my thirst.” \r\n" + 
				"It moves back a few paces, runs, and jumps but \r\n" + 
				"falls short of reaching the grapes. It tries in \r\n" + 
				"different ways to reach the bunch of grapes, but in vain.\r\n" + 
				"It finally gives up, and says to himself \r\n" + 
				"“I am sure they are sour anyway.”\r\n" + 
				"Moral: It is easy to despise what you cannot get your hands on.";
		
		
		String story4 = "After a feast, 2 cats see a piece of cake \r\n" + 
				"and start fighting for it. A monkey sees this \r\n" + 
				"as an opportunity for gain and offers to help them \r\n" + 
				"The monkey divides the cake into two parts but \r\n" + 
				"shakes its head saying they are unequal. \r\n" + 
				"He takes a bite of one piece and then the other,\r\n" + 
				"but still finds them unequal. He continues doing\r\n" + 
				"so until there is no more cake left, \r\n" + 
				"leaving the poor little cats disappointed.\r\n" + 
				"Moral: When you quarrel amongst yourselves, someone else gains from it.";
 
		String story5 = "A wolf was having a tough time getting hold of 5 sheeps for meal.\r\n" + 
				"It decides to attack them discreetly by dressing itself in \r\n" + 
				"sheepskin. Soon, it starts leading the sheep one-by-one\r\n" + 
				"to a corner and eats them all.\r\n" + 
				"Moral: Appearances are deceptive";
		
		
		// Decoration for the window
		
		mainFrame.setVisible(false);
		// this method will hide the mainScreen
		// to avoid confusing the user
	//	GTerm storyWiindow = new GTerm(0,0);
		//Since in this method the output will be displayed too therefore using GTerm
		// This method contains the logic to find the story and then print it on the interactive
		// Window
		storyWindow = new JFrame();
		// The Output will contain the images too since the Software is used foor kids story
		// to make most of the applications stories with images are used
		
		storyWindow.setTitle("Story");
		storyWindow.setVisible(true);
		storyWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//GTerm storyWindow size is set to maximum available size using above method 
		// in argument JFrame is used because it contais the attribute of maximum
		// dimensions

		storyWindow.setLocationRelativeTo(null);
		storyWindow.setLayout(null);
		ImageIcon img = new ImageIcon("House.JPG");
		JLabel imageHolder = new JLabel(img);
		storyWindow.setContentPane(imageHolder);
		//Above lines are used To give an interactive background picture
		
		storyWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		storyWindow.setResizable(false);
		
		int i = 1;
		String[] words1 = story1.split(" "); // story keywords are here
		String[] words2 = story2.split(" ");
		String[] words3 = story3.split(" ");
		String[] words4 = story4.split(" ");
		String[] words5 = story5.split(" ");
		boolean isDisplayed = false; // this boolean variable will look after if a story is already displayed then others 
									// shall not
		boolean isFound = false;
		for(int j=0; j<words1.length && !isDisplayed; j++) {
			if(isFound) {
				// if word matched then print the picture and story
				ImageIcon storyImg = new ImageIcon("1.JPG");
				JLabel imgHelper = new JLabel(storyImg);
				imgHelper.setBounds(75,70,620,500);
				storyWindow.add(imgHelper);
				
				JTextArea storyArea = new JTextArea();
				storyArea.setFont(new Font("Gabriola", Font.BOLD, 23));
				JScrollPane scrollPane = new JScrollPane(storyArea);
				scrollPane.setBounds(850,50,450,500);

				// SCrollPane is used to add ScrollPane in TextArea
				storyArea.setText(story1);
				
				
				
				storyWindow.add(scrollPane);
				isDisplayed = true;
						
				break;
			}
		
			if(stringValue.equals("x")) {
				// meaning that action field is empty then numeric field is compared
				
				if(words1[j].equalsIgnoreCase(intValue+"")) {
					isFound = true;
				}
			}
			if(stringValue.equalsIgnoreCase(words1[j])) {
				isFound = true;
				/// add break
				
			}	
		}
		
		////// Above code will compare keywords in story 1
		for(int j=0; j<words2.length && !isDisplayed; j++) {
			if(isFound) {
				// if word matched then print the picture and story
				ImageIcon storyImg = new ImageIcon("2.JPG");
				JLabel imgHelper = new JLabel(storyImg);
				imgHelper.setBounds(75,70,620,500);
				storyWindow.add(imgHelper);
				
				JTextArea storyArea = new JTextArea();
				storyArea.setFont(new Font("Gabriola", Font.BOLD, 23));
				JScrollPane scrollPane = new JScrollPane(storyArea);
				scrollPane.setBounds(850,50,450,500);
				// SCrollPane is used to add ScrollPane in TextArea
				storyArea.setText(story2);
				
				
				
				storyWindow.add(scrollPane);
				isDisplayed = true;		
				break;
			}
		
			if(stringValue.equals("x")) {
				// meaning that action field is empty then numeric field is compared
				
				if(words2[j].equalsIgnoreCase(intValue+"")) {
					isFound = true;
				}
			}
			if(stringValue.equalsIgnoreCase(words2[j])) {
				isFound = true;
				/// add break
				
			}	
		}
		
		// above code will compare keywrods in story 2
		
		for(int j=0; j<words3.length && !isDisplayed; j++) {
			if(isFound) {
				// if word matched then print the picture and story
				ImageIcon storyImg = new ImageIcon("3.JPG");
				JLabel imgHelper = new JLabel(storyImg);
				imgHelper.setBounds(75,70,620,500);
				storyWindow.add(imgHelper);
				
				JTextArea storyArea = new JTextArea();
				storyArea.setFont(new Font("Gabriola", Font.BOLD, 23));
				JScrollPane scrollPane = new JScrollPane(storyArea);
				scrollPane.setBounds(850,50,450,500);
				
				storyArea.setText(story3);
				
				
				
				storyWindow.add(scrollPane);
				isDisplayed = true;		
				break;
			}
		
			if(stringValue.equals("x")) {
				// meaning that action field is empty then numeric field is compared
				
				if(words3[j].equalsIgnoreCase(intValue+"")) {
					isFound = true;
				}
			}
			if(stringValue.equalsIgnoreCase(words3[j])) {
				isFound = true;
				/// add break
				
			}	
		}
		
		// the above code will compare kewords for story 3
		
		for(int j=0; j<words4.length && !isDisplayed; j++) {
			if(isFound) {
				// if word matched then print the picture and story
				ImageIcon storyImg = new ImageIcon("4.JPG");
				JLabel imgHelper = new JLabel(storyImg);
				imgHelper.setBounds(75,70,620,500);
				storyWindow.add(imgHelper);
				
				JTextArea storyArea = new JTextArea();
				storyArea.setFont(new Font("Gabriola", Font.BOLD, 23));
				JScrollPane scrollPane = new JScrollPane(storyArea);
				scrollPane.setBounds(850,50,450,500);
				
				storyArea.setText(story4);
				
				
				
				storyWindow.add(scrollPane);
				isDisplayed = true;		
				break;
			}
		
			if(stringValue.equals("x")) {
				// meaning that action field is empty then numeric field is compared
				
				if(words4[j].equalsIgnoreCase(intValue+"")) {
					isFound = true;
				}
			}
			if(stringValue.equalsIgnoreCase(words4[j])) {
				isFound = true;
				/// add break
				
			}	
		}
		
		// above code will compare keywords for story 4
		
		for(int j=0; j<words5.length && !isDisplayed; j++) {
			if(isFound) {
				// if word matched then print the picture and story
				ImageIcon storyImg = new ImageIcon("7.JPG");
				JLabel imgHelper = new JLabel(storyImg);
				imgHelper.setBounds(75,70,620,500);
				storyWindow.add(imgHelper);
				
				JTextArea storyArea = new JTextArea();
				storyArea.setFont(new Font("Gabriola", Font.BOLD, 23));
				JScrollPane scrollPane = new JScrollPane(storyArea);
				scrollPane.setBounds(850,50,450,500);
				
				storyArea.setText(story5);
				
				
				
				storyWindow.add(scrollPane);
				isDisplayed = true;		
				break;
			}
		
			if(stringValue.equals("x")) {
				// meaning that action field is empty then numeric field is compared
				
				if(words5[j].equalsIgnoreCase(intValue+"")) {
					isFound = true;
				}
			}
			if(stringValue.equalsIgnoreCase(words5[j])) {
				isFound = true;
				/// add break
				
			}	
		}
		
		// above code will compare keywords for story 5
		
		
		
		// Code for interacctive Usefull Buttons Below
		
		JButton home = new JButton("Home"); // This button will take the kid back to main Screen
		home.setBounds(570,580,100,50);
		home.setFont(new Font("Gabriola", Font.BOLD, 23));
		home.setBackground(new Color(88, 204, 202));
		storyWindow.add(home);
		home.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				storyWindow.setVisible(false);
				mainFrame.setVisible(false);
				
				// Pictured screen is been hidden closing the GTerm window
				// as well so that they shall not interfere in between
				// avoid the misconduction
				//storyWiindow.close();
				
				// Calling the mainScreen Method so that the interface shall reappear
				mainScreen();
			}
			
		});
		
		
		JButton close = new JButton("Close"); // This button will terminate the whole app
		close.setBounds(720,580,100,50);
		close.setFont(new Font("Gabriola", Font.BOLD, 23));
		// argument passed in font are FontName , FontStyle, FontSize
		close.setBackground(new Color(88, 204, 202));
		// arguments passed in Color are RGB color combination 
		// one can find RGB of colors from Google Color Picker
		storyWindow.add(close);
		close.addActionListener(new ActionListener() {
			// whe button is pressed
			@Override
			public void actionPerformed(ActionEvent e) { 
				// TODO Auto-generated method stub
				storyWindow.setVisible(false);
				//Hidding the Picture Scree
				//storyWiindow.close();
				// Closing the window
				// and also terminating the program;
				System.exit(0);
			}
			
		});
		
		
		//storyWiindow.setVisible(false);
		//storyWiindow.close();
		// Closing the GTerm window and making it invisible for now
		// AFter adding the buttons, picture and printlns the window will be setVisible again
		// for better alignment
		
		
		
		
		
		
		//storyWiindow.setVisible(true);
		//storyWiindow.close();
		
		
	}
	public static JFrame mainScreen() {
		// this method will show a interactive Home Window
		JFrame frame = new JFrame("ThatsYourStory");
		mainFrame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		ImageIcon image = new ImageIcon("StoryTell.JPG");
		JLabel imageHolder = new JLabel(image);
		frame.setContentPane(imageHolder);
		frame.setLayout(null);
		// Font arguments are same as described above i-e  FontName, FontStyle, FontSize
		Font font = new Font("Gabriola", Font.BOLD, 22);
		Font fontLabel = new Font("Gabriola", Font.BOLD, 75);
		
		
		
		JLabel title = new JLabel("That's Your Story");
		title.setFont(fontLabel);
		title.setForeground(new Color(209, 95, 33));
		title.setBounds(780,180,500,200);
		
		JButton search = new JButton("Search Story");
		search.setBounds(880,370,130,50);
		search.setFont(font);
		search.setForeground(Color.black);
		search.setBackground(new Color(65, 176, 67));
		search.addActionListener(new ActionListener(){
			// When search button is clicked the program will use GTerm Library
			// to take input from the user
			public void actionPerformed(ActionEvent e){
				searchScreen();	 // Method that uses GTerm Library
			}
		});
		
		

		
		JButton exit = new JButton("Exit");
		exit.setBounds(880,470,130,50);
		exit.setFont(font);
		exit.setForeground(Color.black);
		exit.setBackground(new Color(65, 176, 67));
		exit.addActionListener(new ActionListener(){
			// When exit button is clicked the program terminates
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
		
		frame.add(title);
		frame.add(search);
		frame.add(exit);
		frame.setVisible(true);
		
		return frame;
	}
	public static void searchScreen() {
		//GTerm mainFraem = new GTerm(0,0); // the size of the Window is defined later
		// GTerm library is used to take input and show output only
		// For interactive window other components are used
		// in below code Font and Color class are used to change the usual fonts and color
		
		mainFrame.setTitle("Input");
		mainFrame.setVisible(true);
		mainFrame.setSize(500,500);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setLayout(null);
		
		 // first we will add All components in GTerm window 
		// then will set it Visible for better alignment
		
		//mainFraem.setVisible(false);
		//mainFraem.close();
		// Closing and making it hidden for now in order to keep all other components added first  
		mainFrame.setLayout(null);
		// Above lines represent some basic properties to be set for a Window
		
		JLabel action = new JLabel("Enter Action/Character");
		action.setBounds(160,70,170,40);
		action.setFont(new Font("Gabriola", Font.BOLD, 20));
		mainFrame.add(action);
		
		JTextField actionField = new JTextField();
		actionField.setBounds(190, 100, 100, 40);
		actionField.setFont(new Font("Gabriola", Font.BOLD, 20));
		mainFrame.add(actionField);
		
		// First TextField to obtain the character or action as input
		
		JLabel num = new JLabel("Enter Numberical Input");
		num.setBounds(160,170,170,40);
		num.setFont(new Font("Gabriola", Font.BOLD, 20));
		mainFrame.add(num);
		
		
		
		JTextField numField = new JTextField();
		numField.setBounds(190, 200, 100, 40);
		numField.setFont(new Font("Gabriola", Font.BOLD, 20));
		mainFrame.add(numField);
		
		// Second TextField to obtain the numerical input 
		
		
		JButton search = new JButton("Search");
		search.setBounds(190,300,100,40);
		search.setFont(new Font("Gabriola", Font.BOLD, 20));
		search.setBackground(new Color(142, 171, 150));
		mainFrame.add(search);
		search.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(actionField.getText().equals("") && numField.getText().equals("") ) {
					JOptionPane.showMessageDialog(null, "Both Fields Can't be Empty");
					// if both fields are empty
				}
				
				if(actionField.getText().equals("")) {
					stringValue = "x";
					intValue = Integer.parseInt(numField.getText());
					//String value converted into Integer using parse method
					// if text field is empty place x in textVariable to match conditions
					// and obtain the numerical value
					// when text is not inserted searchstory with numerical value
					mainFrame.setVisible(false);
					searchStory();
					// if text field is empty search using numeric field
				}
				else {
					stringValue = actionField.getText();
					if(numField.getText().equals("")) {
						int value = 1;
					}
					else {
						intValue = Integer.parseInt(numField.getText());
						// Terminating the Input Winndow here
					}
					mainFrame.setVisible(false);
					searchStory();
				}
				
			}	
			
		});
		
		

		//mainFraem.setVisible(true);
		//mainFraem.close();
		
	}
	public static void main(String[] args) {
		mainScreen();
		// Starting from main screen the starting screen and then based upon every action
		// the flow of program is uttered
		//the program is integrated finely
	}

}
