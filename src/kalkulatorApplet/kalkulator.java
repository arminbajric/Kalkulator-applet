package kalkulatorApplet;
import java.awt.event.*;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
public  class kalkulator extends Applet implements MouseListener,ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
<applet code="kalkulator.class" width=300 height=200>
Ballet
**/
	 Button zagrada1,zagrada2,jedan,dva,tri,cetri,pet,sest,sedam,osam,devet,nula,jednako,puta,plus,minus,podjeljeno,kvadrat,korijen;
	 Button reset;
	  TextField izraz = null,rezultat=null;
 Thread t=new Thread();
 public char[] exp=new char[100];
 public int klikCount=0;
public String str="";
public String exp1="" ;
int rezS=0,rezO=0,rezM=1,rezD=1,rezKv=1,rezK=1;
	public void init() {
		addMouseListener(this);
	kontejner();

	}
	public void start()
	{
		
	}
	public void run()
	{
		
	}
	
	public void paint(Graphics g)
	{
		
			if(comm=="Clr")
			{
				izraz.setText("");
			}
			else if(comm=="("||comm==")"||comm=="1"||comm=="2"||comm=="3"||comm=="4"||comm=="5"||comm=="6"||comm=="7"||comm=="8"||comm=="9"||comm=="0"||comm=="+"||comm=="-"||comm=="/"||comm=="*")
			{
				exp1=exp1+comm;
				izraz.setText(" ");
				izraz.setText(exp1);
			}
			else if(comm=="=")
			{
				ScriptEngineManager mgr = new ScriptEngineManager();
			    ScriptEngine engine = mgr.getEngineByName("JavaScript");
			    String foo = izraz.getText();
			    String rez = null;
				try {
					rez = String.valueOf(engine.eval(foo));
				} catch (ScriptException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    izraz.setText(rez);
			    exp1=rez;
			}
		
	
		
		
		
		
		//kontejner();
	}
	
	public void mouseClicked(MouseEvent jedan) {
		// TODO Auto-generated method stub
		//str=jedan.getSource().toString();
		//repaint();

	}
	public void mouseClicked1(MouseEvent e) {
		// TODO Auto-generated method stub
		
		str="2";
		repaint();
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void kontejner()
	{
		
		
		izraz=new TextField("0",22);
		add(izraz);
		
		 
		  jedan=new Button("1");


			dva=new Button("2");
			tri=new Button("3");
			cetri=new Button("4");
			pet=new Button("5");
			sest=new Button("6");
			sedam=new Button("7");
			osam=new Button("8");
			devet=new Button("9");
			nula=new Button("0");
			reset=new Button("Clr");
			puta=new Button("*");
			podjeljeno=new Button("/");
			
			korijen=new Button("sqrt");
			zagrada1=new Button("(");
			zagrada2=new Button(")");
			plus=new Button("+");
			minus=new Button("-");
			jednako=new Button("=");
			add(jedan);
			add(dva);
			add(tri);
			add(cetri);
			add(pet);
			add(sest);
			add(sedam);
			add(osam);
			add(devet);
			add(nula);
			add(reset);
			add(plus);
			add(minus);
			add(puta);
			add(podjeljeno);
			
			add(zagrada1);
			add(zagrada2);
			add(jednako);
			jednako.addActionListener(this);
			dva.addActionListener(this);
			tri.addActionListener(this);
			cetri.addActionListener(this);
			jedan.addActionListener(this);
			pet.addActionListener(this);
			sest.addActionListener(this);
			sedam.addActionListener(this);
			osam.addActionListener(this);
			devet.addActionListener(this);
			nula.addActionListener(this);
			plus.addActionListener(this);
			minus.addActionListener(this);
			puta.addActionListener(this);
			podjeljeno.addActionListener(this);
			reset.addActionListener(this);
			korijen.addActionListener(this);
			zagrada1.addActionListener(this);
			zagrada2.addActionListener(this);
	}
	/**
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comm=e.getActionCommand();
		
		if(comm=="+")
		{
			rezS=rezS+Integer.parseInt(izraz.getText().toString());
			str=String.valueOf(rezS);
			izraz.setText(""+'\u0000');
			repaint();
		}
		else if(comm=="1"||comm=="2"||comm=="3"||comm=="4"||comm=="5"||comm=="6"||comm=="7"||comm=="8"||comm=="9"||comm=="0")
		{
		str=comm;
		repaint();
		}	
		
	}
	**/
	String comm;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
 comm=e.getActionCommand();
		repaint();
		
	
	}
	
}
