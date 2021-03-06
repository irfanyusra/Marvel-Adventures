/**
*The "Pipe" class.
*Instructor: Mr. Sayed
*Assignment Name: Game - Final Project 
*Class: ICS 4U0-B
*@Author Yusra Irfan 
*@Version 1.4 
*Date of Submission: 16th June 2016
 */

package mainPackage.tile;

import java.awt.Graphics;

import mainPackage.Game;
import mainPackage.Map;
import mainPackage.Id;

public class Pipe extends Tile {
	
	/**
	 * Pipe Constructor 
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param id
	 * @param map
	 */
	public Pipe(int x, int y, int width, int height, Id id,
			Map map ) {
		super(x, y, width, height, id, map);
	}

	/**
	 * Paint Method
	 */
	public void paint(Graphics g) {
		g.drawImage(Game.getPipe().getBufferedImage(), getxTile(), getyTile(), getWidth(), getHeight(), null);
	}

	/**
	 * Update Method
	 */
	public void update() {
		
	}

}
