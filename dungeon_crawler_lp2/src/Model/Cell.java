/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Gustavo
 */
public class Cell {
    //1 wall
    //0 path
    
    int type;
    boolean visited;
    public Cell(){
        type = 1;
        visited = false;
    }
    public void setWall(){
        type = 1;
    }
    public void setUnvisited(){
        visited = false;
    }
    public void setVisited(){
        visited = true;
    }
    public void setPath(){
        type = 0;
    }
    public boolean isVisited(){
        return visited;
    }
    public void showCell(){
        System.out.print(type);
    }
   
    public boolean is_wall(){
        boolean result;
        result = (type==1) ? true : false;
        return result;
    }
    
    public boolean is_path(){
        boolean result;
        result = (type==0) ? true : false;
        return result;
    }
}
