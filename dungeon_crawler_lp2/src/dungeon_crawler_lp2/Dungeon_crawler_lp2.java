/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon_crawler_lp2;
import Model.Maze;
import java.math.MathContext;

/**
 *
 * @author Gustavo
 */
public class Dungeon_crawler_lp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Maze maze = Maze.generateMaze();
        maze.showMaze();
    }
    
}
