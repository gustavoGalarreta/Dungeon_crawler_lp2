/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon_crawler_lp2;

/**
 *
 * @author Gustavo
 */
public class Cell {
    //1 wall
    //0 path
    
    int type;
    public Cell(){
        type = 1;
    }
    public void setWall(){
        type = 1;
    }
    public void setPath(){
        type = 0;
    }
    public void showCell(){
        System.out.print(type);
    }
   
    public boolean is_wall(){
        boolean result;
        result = (type==1) ? true : false;
        return result;
    }
}
