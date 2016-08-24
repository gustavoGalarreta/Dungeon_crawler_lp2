/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon_crawler_lp2;
import java.util.Random;

/**
 *
 * @author Gustavo
 */
public class Maze {
    //attr
    int height;
    int width;
    Cell maze[][];
    //TBD start, next
    
    //contructor
    // -----------
    //|11111111111|
    //|10000000001|
    //|10000000001|
    //|11111111111|
    // -----------
    public Maze(){
        Random randomGenerator = new Random();
        int randomSize = randomGenerator.nextInt(15);
        height = width = 2*randomSize +1;
        maze = new Cell[width][width];
        for(int row = 0; row < height; row++)
            for(int col = 0; col < width; col++){
                maze[row][col] = new Cell();
                if (row == 0 || row == height-1)
                    maze[row][col].setWall();
                else
                    if (col == 0 || col == width-1)
                        maze[row][col].setWall();
                    else
                        if ( (col % 2 == 0 || row % 2== 0) && !(col % 2 == 0 && row % 2 == 0))
                            maze[row][col].setWall();
                        else
                            maze[row][col].setPath();
                    }
    }
    //sets and gets
    public void setHeight(int value){
        height = value;
    }
    public void setWidth(int value){
        width = value;
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    //methods
    public void showMaze(){
        for(int row = 0; row < getHeight(); row++){
            System.out.println("");
            for(int col = 0; col < getWidth(); col++)
                maze[row][col].showCell();
        }
    }
    public void generateMaze(){
        
    }
}
