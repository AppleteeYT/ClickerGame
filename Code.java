import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class GUI extends JFrame implements ActionListener {
	int secPassed = 0;
	boolean messageGone;
	boolean bu1, bu2, bu3, bu4, bu5, bu6;
	long clicked = 0;
	int multipluyer = 1, nextLevel = 100;
	JButton shop = new JButton("Shop");
	JButton btn = new JButton("Click Me");
	JButton backShop = new JButton("Back");
	JButton buy1 = new JButton("Double Click");
	JButton buy2 = new JButton("Triple Click");
	JButton buy3 = new JButton("Quadruple Click");
	JButton buy4 = new JButton("Five Clicks");
	JButton buy5 = new JButton("Six Clicks");
	JButton buy6 = new JButton("Seven Clicks");
	JLabel l = new JLabel("0");
	JLabel note = new JLabel("Just Click On The 'Click Me' Button To Earn Points!");
	JLabel b1 = new JLabel("Cost: 100");
	JLabel b2 = new JLabel("Clicks: 700");
	JLabel b3 = new JLabel("Clicks: 2000");
	JLabel b4 = new JLabel("Clicks: 5000");
	JLabel b5 = new JLabel("Clicks: 15000");
	JLabel b6 = new JLabel("Clicks: 1000000");
	boolean done = false;

	public GUI() {
		btn.setFocusPainted(false);
		shop.setFocusPainted(false);
		buy1.setFocusPainted(false);
		buy2.setFocusPainted(false);
		buy3.setFocusPainted(false);
		buy4.setFocusPainted(false);
		buy5.setFocusPainted(false);
		buy6.setFocusPainted(false);
		l.setFont(l.getFont().deriveFont((float) 32.0));
		l.setHorizontalAlignment(JLabel.CENTER);
	    l.setVerticalAlignment(JLabel.CENTER);
	    ImageIcon img = new ImageIcon("D:/Games/Clicker Game/icon.png");
	    setIconImage(img.getImage());
	    
	    note.setHorizontalAlignment(JLabel.CENTER);
	    note.setVerticalAlignment(JLabel.CENTER);
		
		btn.setBorder(null);
		btn.setBounds(200, 50, 100, 30);
		btn.setBackground(new Color(3, 59, 90));
		btn.setForeground(Color.WHITE);
		btn.setHorizontalTextPosition(SwingConstants.CENTER);
		btn.getModel().addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				ButtonModel model = (ButtonModel) e.getSource();
				if (model.isRollover()) {
					btn.setBackground(new Color(3, 59, 90).brighter());
				} else if (model.isPressed()) {
					btn.setBackground(Color.BLACK);
				} else {
					btn.setBackground(new Color(3, 59, 90));
				}
			}
		});
		shop.setBorder(null);
		shop.setBackground(new Color(3, 59, 90));
		shop.setForeground(Color.WHITE);
		shop.setHorizontalTextPosition(SwingConstants.CENTER);
		shop.getModel().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				ButtonModel model = (ButtonModel) e.getSource();
				if (model.isRollover()) {
					shop.setBackground(new Color(3, 59, 90).brighter());
				} else if (model.isPressed()) {
					shop.setBackground(Color.BLACK);
				} else {
					shop.setBackground(new Color(3, 59, 90));
				}
			}
		});
		shop.setBounds(30, 50, 100, 30);
		l.setBounds(-85, 80, 500, 50);
		shop.setActionCommand("shop");
		btn.setActionCommand("click");
		backShop.setActionCommand("backShop");

		buy1.setBorder(null);
		buy1.setBackground(new Color(3, 59, 90));
		buy1.setForeground(Color.WHITE);
		buy1.setHorizontalTextPosition(SwingConstants.CENTER);
		buy1.getModel().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				ButtonModel model = (ButtonModel) e.getSource();
				if (model.isRollover()) {
					buy1.setBackground(new Color(3, 59, 90).brighter());
				} else if (model.isPressed()) {
					buy1.setBackground(Color.BLACK);
				} else {
					buy1.setBackground(new Color(3, 59, 90));
				}
			}
		});
		buy1.setActionCommand("buy1");

		buy2.setBorder(null);
		buy2.setBackground(new Color(3, 59, 90));
		buy2.setForeground(Color.WHITE);
		buy2.setHorizontalTextPosition(SwingConstants.CENTER);
		buy2.getModel().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				ButtonModel model = (ButtonModel) e.getSource();
				if (model.isRollover()) {
					buy2.setBackground(new Color(3, 59, 90).brighter());
				} else if (model.isPressed()) {
					buy2.setBackground(Color.BLACK);
				} else {
					buy2.setBackground(new Color(3, 59, 90));
				}
			}
		});
		buy2.setActionCommand("buy2");

		buy3.setActionCommand("buy3");
		buy3.setBorder(null);
		buy3.setBackground(new Color(3, 59, 90));
		buy3.setForeground(Color.WHITE);
		buy3.setHorizontalTextPosition(SwingConstants.CENTER);
		buy3.getModel().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				ButtonModel model = (ButtonModel) e.getSource();
				if (model.isRollover()) {
					buy3.setBackground(new Color(3, 59, 90).brighter());
				} else if (model.isPressed()) {
					buy3.setBackground(Color.BLACK);
				} else {
					buy3.setBackground(new Color(3, 59, 90));
				}
			}
		});

		buy4.setActionCommand("buy4");
		buy4.setBorder(null);
		buy4.setBackground(new Color(3, 59, 90));
		buy4.setForeground(Color.WHITE);
		buy4.setHorizontalTextPosition(SwingConstants.CENTER);
		buy4.getModel().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				ButtonModel model = (ButtonModel) e.getSource();
				if (model.isRollover()) {
					buy4.setBackground(new Color(3, 59, 90).brighter());
				} else if (model.isPressed()) {
					buy4.setBackground(Color.BLACK);
				} else {
					buy4.setBackground(new Color(3, 59, 90));
				}
			}
		});

		buy5.setActionCommand("buy5");
		buy5.setBorder(null);
		buy5.setBackground(new Color(3, 59, 90));
		buy5.setForeground(Color.WHITE);
		buy5.setHorizontalTextPosition(SwingConstants.CENTER);
		buy5.getModel().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				ButtonModel model = (ButtonModel) e.getSource();
				if (model.isRollover()) {
					buy5.setBackground(new Color(3, 59, 90).brighter());
				} else if (model.isPressed()) {
					buy5.setBackground(Color.BLACK);
				} else {
					buy5.setBackground(new Color(3, 59, 90));
				}
			}
		});

		buy6.setActionCommand("buy6");
		buy6.setBorder(null);
		buy6.setBackground(new Color(3, 59, 90));
		buy6.setForeground(Color.WHITE);
		buy6.setHorizontalTextPosition(SwingConstants.CENTER);
		buy6.getModel().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				ButtonModel model = (ButtonModel) e.getSource();
				if (model.isRollover()) {
					buy6.setBackground(new Color(3, 59, 90).brighter());
				} else if (model.isPressed()) {
					buy6.setBackground(Color.BLACK);
				} else {
					buy6.setBackground(new Color(3, 59, 90));
				}
			}
		});

		backShop.setBorder(null);
		backShop.setBackground(new Color(3, 59, 90));
		backShop.setForeground(Color.WHITE);
		backShop.setHorizontalTextPosition(SwingConstants.CENTER);
		backShop.getModel().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				ButtonModel model = (ButtonModel) e.getSource();
				if (model.isRollover()) {
					backShop.setBackground(new Color(3, 59, 90).brighter());
				} else if (model.isPressed()) {
					backShop.setBackground(Color.BLACK);
				} else {
					backShop.setBackground(new Color(3, 59, 90));
				}
			}
		});

		btn.addActionListener(this);
		shop.addActionListener(this);
		// JPanel bounds
		// Adding to JFrame
		add(btn);
		add(shop);
		add(l);
		add(note);

		// JFrame properties
		setSize(350, 400);
		setBackground(Color.WHITE);
		setTitle("Click Game");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("click")) {
			if(clicked < 1) {
				remove(note);repaint();
				messageGone = true;
			}
			for (int i = 0; i < multipluyer; i++) {
				clicked++;
				if(clicked == nextLevel) { 
					add(note);
					Timer timer = new Timer();
					TimerTask task = new TimerTask() {
						public void run() {
							secPassed++;
							remove(note);repaint();
							messageGone = true;
						}
					};
					timer.scheduleAtFixedRate(task, 5000, 5000);
					nextLevel *= 5;
					note.setText("Good Job You Have Earned " + clicked + " Points, Well Done");
				}
			}
			l.setText("" + clicked);
		} else if (e.getActionCommand().equals("shop")) {
			getContentPane().removeAll();
			repaint();
			buy1.setBounds(10, 50, 150, 30);
			buy2.setBounds(10, 90, 150, 30);
			buy3.setBounds(10, 130, 150, 30);
			buy4.setBounds(10, 170, 150, 30);
			buy5.setBounds(10, 210, 150, 30);
			buy6.setBounds(10, 250, 150, 30);
			b1.setBounds(200, 50, 150, 30);
			b2.setBounds(200, 90, 150, 30);
			b3.setBounds(200, 130, 150, 30);
			b4.setBounds(200, 170, 150, 30);
			b5.setBounds(200, 210, 150, 30);
			b6.setBounds(200, 250, 150, 30);
			backShop.setBounds(90, 290, 150, 30);
			add(backShop);
			add(b1);
			add(b2);
			add(b3);
			add(b4);
			add(b5);
			add(b6);
			repaint();
			if (bu1 == false) {
				add(buy1);
			}
			if (bu2 == false) {
				add(buy2);
			}
			if (bu3 == false) {
				add(buy3);
			}
			if (bu4 == false) {
				add(buy4);
			}
			if (bu5 == false) {
				add(buy5);
			}
			if (bu6 == false) {
				add(buy6);
			}
			setLayout(null);
			buy1.addActionListener(this);
			buy2.addActionListener(this);
			buy3.addActionListener(this);
			buy4.addActionListener(this);
			buy5.addActionListener(this);
			buy6.addActionListener(this);
			backShop.addActionListener(this);
		} else if (e.getActionCommand().equals("backShop")) {
			getContentPane().removeAll();
			repaint();
			add(btn);
			add(shop);
			add(l);
			if(!messageGone) {
				add(note);
				messageGone = false;
			}
			repaint();
		} else if (e.getActionCommand().equals("buy1")) {
			if (clicked >= 100) {
				clicked -= 100;
				l.setText("" + clicked);
				b1.setText("Bought");
				multipluyer = 2;
				remove(buy1);
				repaint();
				bu1 = true;
			}
		} else if (e.getActionCommand().equals("buy2")) {
			if (clicked >= 700) {
				clicked -= 700;
				l.setText("" + clicked);
				b2.setText("Bought");
				multipluyer = 3;
				remove(buy2);
				repaint();
				bu2 = true;
				Timer(5000);
				bossBegin();
			}
		} else if (e.getActionCommand().equals("buy3")) {
			if (clicked >= 2000) {
				clicked -= 2000;
				l.setText("" + clicked);
				b3.setText("Bought");
				multipluyer = 4;
				remove(buy3);
				repaint();
				bu3 = true;
			}
		} else if (e.getActionCommand().equals("buy4")) {
			if (clicked >= 5000) {
				clicked -= 5000;
				l.setText("" + clicked);
				b4.setText("Bought");
				multipluyer = 5;
				remove(buy4);
				repaint();
				bu4 = true;
			}
		} else if (e.getActionCommand().equals("buy5")) {
			if (clicked >= 15000) {
				clicked -= 15000;
				l.setText("" + clicked);
				b5.setText("Bought");
				multipluyer = 5;
				remove(buy5);
				repaint();
				bu5 = true;
			}
		} else if (e.getActionCommand().equals("buy6")) {
			if (clicked >= 1000000) {
				clicked -= 1000000;
				l.setText("" + clicked);
				b6.setText("Bought");
				multipluyer = 6;
				remove(buy6);
				repaint();
				bu6 = true;
			}
		}
	}

	private void bossBegin() {
		int placeX = (int) (Math.random() * 350) + 1;
		int placeY = (int) (Math.random() * 400) + 1;
		
		JButton b1 = new JButton("NOW");
		b1.setFocusPainted(false);
		add(b1);
		Timer(1000);
	}

	private void Timer(int sec) {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			public void run() {
				secPassed++;
			}
		};
		timer.scheduleAtFixedRate(task, sec, sec);
	}
}
