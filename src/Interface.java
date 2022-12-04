import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Interface {
	private JFrame frameMap = new JFrame("MapGame"); 
	private JLabel [][] tableauDeplacement = new JLabel [5][5];
	private boolean demarage = false;
	private boolean choiceWeapon = false;
	private JLabel actualiseDonneesPlayers = new JLabel();

	public void nameGamer(Player player, MapRPG map) {
		JFrame frame = new JFrame("GamerName");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 250);
		frame.add(new JLabel("Veux-tu garder le nom Tornaturo ou veux-tu rentrer ton nom?"), BorderLayout.NORTH);
		JTextField nameInput = new JTextField();
		frame.add(nameInput, BorderLayout.CENTER);
		JButton btn = new JButton("Changer mon nom :");
		JButton btnKeepName = new JButton("Garder Tornaturo");
	
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				player.changeNamePlayer(nameInput.getText());
				System.out.println(player);
				 frame.dispose();
				 mapGame(player, map);
			}	
		});
		btnKeepName.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();	
				mapGame(player, map);
			}		
		});
		frame.add(btn, BorderLayout.WEST);
		frame.add(btnKeepName, BorderLayout.EAST);
		frame.setVisible(true);
		
		DeplacementKeyXY deplacement = new DeplacementKeyXY();
		frameMap.addKeyListener(deplacement);
	}
	public void mapGame(Player player, MapRPG map) {
		JPanel panelAroundMap = new JPanel();
		frameMap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMap.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frameMap.setVisible(true);
		JPanel panel = new JPanel();
		Border linearBorder = BorderFactory.createRaisedBevelBorder();
		panel.setLayout(new GridLayout(5,5));
		frameMap.add(panel, BorderLayout.CENTER);
		
		panelAroundMap.setLayout(new BoxLayout(panelAroundMap, BoxLayout.Y_AXIS));
		actualiseDonneesPlayers.setText(player.toString());
		panelAroundMap.add(actualiseDonneesPlayers);
		frameMap.add(panelAroundMap, BorderLayout.NORTH);

		for (int x =0; x < tableauDeplacement.length; x++) {
			for (int y=0; y < tableauDeplacement.length; y++) {
				JLabel label = new JLabel(" ?");
				tableauDeplacement[x][y] = label;
				label.setBorder(linearBorder);
				panel.add(label);	
			}
		}
		demarage = true;
	}
	public void refresh(Player player) {
		if (demarage == true) {
			for (int x =0; x < tableauDeplacement.length; x++) {
				for (int y=0; y < tableauDeplacement.length; y++) {
					if (MapRPG.playerPositionX() == x  && MapRPG.playerPositionY() == y) {
						tableauDeplacement[x][y].setText(" you're there " + player.namePlayer());
						Border LoweredBevelBorder = BorderFactory.createLoweredBevelBorder();
						tableauDeplacement[x][y].setBorder(LoweredBevelBorder);

					}
					else {
						tableauDeplacement[x][y].setText(" ");
						Border linearBorder = BorderFactory.createRaisedBevelBorder();
						tableauDeplacement[x][y].setBorder(linearBorder);
					}	
				}
				
			}
			actualiseDonneesPlayers.setText(player.toString());

		}
		frameMap.validate();
	}
	
	public void weaponShopInterraction(ArrayList<Weapon> weapons, Player player, WeaponShop paramweapon) {
		if (demarage == true) {
		choiceWeapon = false;
		JFrame frame = new JFrame("weaponShopInterractions");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 250);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.add(new JLabel("Choisis ton arme :"), BorderLayout.NORTH);
		
		for (int i=0; i<weapons.size(); i++) {
		JCheckBox weaponCheck = new JCheckBox(weapons.get(i).toString());
		final int iWeapon = i ;
			weaponCheck.addActionListener(new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {
					paramweapon.changeValue(weapons.get(iWeapon), player);
					choiceWeapon = true;
					frame.dispose();
					paramweapon.changeBoolean();
				}
			});
			panel.add(weaponCheck);
		}
		frame.add(panel);
		frame.setVisible(true);
		while (choiceWeapon == false ) {
			System.out.println("alors tu choisis?!");
		}
	    }
	}
	public void DieOrNor(String winOrNot) {
		JFrame frame = new JFrame(winOrNot);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		JLabel label = new JLabel(winOrNot, SwingConstants.CENTER);
		frame.add(label);
		frame.setVisible(true);
		
	}
	
}
