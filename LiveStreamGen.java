package LiveStreamModule;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LiveStreamGen extends JFrame implements ActionListener {

	private JPanel panel;
	private String[] genStrings = { "Single", "Double", "Triple" };
	private JComboBox<String> selector;
	private JLabel titlelb, posterlb, channellb, srclb;
	private JTextField title, poster, channel, src;
	private JButton buttonGenerate;
	private JTextArea box;
	private StreamGenerator gen = new StreamGenerator();
	static JFrame parent;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LiveStreamGen() {
		init();
	}

	public void init() {
		parent= this;
		panel = new JPanel();
		selector = new JComboBox<String>(genStrings);
		selector.addActionListener(this);
		JPanel fPanel = new JPanel();
		buttonGenerate = new JButton("Generate");
		box = new JTextArea();
		titlelb = new JLabel("Title");
		title = new JTextField();
		posterlb = new JLabel("Poster");
		poster = new JTextField(gen.getDefaultPoster());
		channellb = new JLabel("Channel");
		channel = new JTextField();
		srclb = new JLabel("SRC");
		src = new JTextField();
		fPanelAddAll(fPanel, titlelb, title, posterlb, poster, channellb, channel, srclb, src);
		fPanel.setLayout(new GridLayout(4, 1));
		buttonGenerate.addActionListener(this);
		JScrollPane spanel = new JScrollPane();
		spanel.getViewport().add(box);
		addAll(selector, fPanel, buttonGenerate, spanel);
		panel.setLayout(new GridLayout(4, 1));
		setTitle("Live Stream Generator");
		add(panel);
		setSize(400, 350);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void addAll(Component... c) {
		for (int i = 0; i < c.length; i++) {
			panel.add(c[i]);
		}
	}

	public void fPanelAddAll(JPanel f, Component... c) {
		for (int i = 0; i < c.length; i++) {
			f.add(c[i]);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttonGenerate) {
			switch (selector.getSelectedIndex()) {
			case 0:
				box.setText(null);
				ArrayList<String> list = gen.createSingle(title.getText(), poster.getText(), channel.getText(),
						src.getText());
				for (int i = 0; i < list.size(); i++) {
					box.append(list.get(i));
					box.append("\n");
				}

				break;
			case 1:
				box.setText(null);
				ArrayList<String> list1 = gen.createDouble(title.getText(), poster.getText(), channel.getText(),
						src.getText());
				for (int i = 0; i < list1.size(); i++) {
					box.append(list1.get(i));
					box.append("\n");
				}
				break;
			case 2:
				box.setText(null);
				ArrayList<String> list2 = gen.createTriple(title.getText(), poster.getText(), channel.getText(),
						src.getText());
				for (int i = 0; i < list2.size(); i++) {
					box.append(list2.get(i));
					box.append("\n");
				}
				break;

			}
		}

	}

	public static void main(String[] args) {
		new LiveStreamGen();
	}

}
