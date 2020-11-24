package org.witch.bongo.nativelisteners;

import javax.swing.JLabel;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.witch.bongo.components.KeyboardPaw;

public class GlobalKeyListener implements NativeKeyListener
{

	private int key1;
	private int key2;
	private int key3;
	private int key4;
	private int key5;
	private int key6;
	
	private KeyboardPaw paw;
	private JLabel lastKey;
	
	public GlobalKeyListener(int key1, int key2, int key3, int key4, int key5, int key6, KeyboardPaw paw, JLabel lastKey)
	{
		this.key1 = key1;
		this.key2 = key2;
		this.key3 = key3;
		this.key4 = key4;
		this.key5 = key5;
		this.key6 = key6;
		this.paw = paw;
		this.lastKey = lastKey;
	}
	
	public void resetKeys(int key1, int key2, int key3, int key4, int key5, int key6)
	{
		paw.setIndexPressed(false);
		paw.setMiddlePressed(false);
		paw.repaint();
		this.key1 = key1;
		this.key2 = key2;
		this.key3 = key3;
		this.key4 = key4;
		this.key5 = key5;
		this.key6 = key6;
	}
	
	public void nativeKeyPressed(NativeKeyEvent e)
	{
		//System.out.println("Code: " + e.getKeyCode());
		lastKey.setText(e.getKeyCode() + "");
		if(e.getKeyCode() == key1)
		{
			paw.setMiddlePressed(true);
			paw.repaint();
		}
		else if(e.getKeyCode() == key2)
		{
			paw.setIndexPressed(true);
			paw.repaint();
		}
		if(e.getKeyCode() == key3)
		{
			paw.setMiddlePressed(true);
			paw.repaint();
		}
		else if(e.getKeyCode() == key4)
		{
			paw.setIndexPressed(true);
			paw.repaint();
		}
		if(e.getKeyCode() == key5)
		{
			paw.setMiddlePressed(true);
			paw.repaint();
		}
		else if(e.getKeyCode() == key6)
		{
			paw.setIndexPressed(true);
			paw.repaint();
		}
	}

	public void nativeKeyReleased(NativeKeyEvent e)
	{
		if(e.getKeyCode() == key1)
		{
			paw.setMiddlePressed(false);
			paw.repaint();
		}
		else if(e.getKeyCode() == key2)
		{
			paw.setIndexPressed(false);
			paw.repaint();
		}
		else if(e.getKeyCode() == key3)
		{
			paw.setMiddlePressed(false);
			paw.repaint();
		}
		else if(e.getKeyCode() == key4)
		{
			paw.setIndexPressed(false);
			paw.repaint();
		}
		else if(e.getKeyCode() == key5)
		{
			paw.setMiddlePressed(false);
			paw.repaint();
		}
		else if(e.getKeyCode() == key6)
		{
			paw.setIndexPressed(false);
			paw.repaint();
		}
	}

	public void nativeKeyTyped(NativeKeyEvent e)
	{
	}
}
