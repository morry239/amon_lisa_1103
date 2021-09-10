package sempre_diritto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class SkyScrapersTest extends javax.swing.JFrame{
	
	private SkyScrapers skyscrapers;
	private JLabel jLSkyscraper;
	private JScrollPane jScrollPane1;
	private DefaultListModel jListWolkenkrazer;
	private JList jListalcobareno;
	private JButton jBZeigen;
	private JButton jBEnde;
	

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		    	SkyScrapersTest inst = new SkyScrapersTest();
			inst.setLocationRelativeTo(null);
			inst.setVisible(true);
		    }
		});

	}
	
	public SkyScrapersTest() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			getContentPane().setLayout(null);
		    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		    this.setTitle("Skyscrapers test");
		    {
		    	jScrollPane1 = new JScrollPane();
				getContentPane().add(jScrollPane1);
				jScrollPane1.setBounds(31, 31, 300, 175);
				{
					jListWolkenkrazer = new DefaultListModel();
					jListalcobareno = new JList();
				    jScrollPane1.setViewportView(jListalcobareno);
				    jListalcobareno.setModel(jListWolkenkrazer);
				    skyscrapers = new SkyScrapers();
				}
		    }
		    {
		    	jBZeigen = new JButton();
		    	getContentPane().add(jBZeigen);
		    	jBZeigen.setText("Zeigen");
		    	jBZeigen.setBounds(174, 230, 94, 23);
		    	jBZeigen.addActionListener(new ActionListener() {
		    		public void actionPerformed(ActionEvent evt) {
		    			jBZeigenActionPerformed(evt);
		    		}
		    	});
		    }
		    {
		    	jBEnde = new JButton();
		    	getContentPane().add(jBEnde);
		    	jBEnde.setText("Ende");
		    	jBEnde.setBounds(350, 230, 80, 23);
		    	jBEnde.addActionListener(new ActionListener() {
		    		public void actionPerformed(ActionEvent evt) {
		    			jBEndeActionPerformed(evt);
		    		}
		    	});
		    }
		    pack();
		    this.setSize(500, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void jBZeigenActionPerformed(ActionEvent evt) {
		
		int[] clues = {5100};
		//ich möchte Text zurückliefern, deswegen solvePuzzle
		int[][] result = SkyScrapers.solvePuzzle(clues);
		
		System.out.println(result);
//		skyscrapers.set(skyscrapers);
	}
	
	private void jBEndeActionPerformed(ActionEvent evt) {
		System.exit(0);
	}

}
