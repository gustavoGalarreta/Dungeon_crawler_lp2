/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Marco
 */
public class Entity {
    private int max_life;
    private int actual_life;
    private int x;
    private int y;
    
    public Entity(int max_life){
        this.max_life = max_life;
        x = 0;
        y = 0;
    }
    
    public void receive_damage(int damage){
        actual_life -= damage;
        if(actual_life < 0) actual_life = 0;
    }
    
    public void healing(int life_points){
        actual_life += life_points;
        if(actual_life > max_life) actual_life = max_life;
    }
    
    public void move(int x, int y){
        setX(x);
        setY(y);
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * @return the max_life
     */
    public int getMax_life() {
        return max_life;
    }

    /**
     * @param max_life the max_life to set
     */
    public void setMax_life(int max_life) {
        this.max_life = max_life;
    }

    /**
     * @return the actual_life
     */
    public int getActual_life() {
        return actual_life;
    }

    /**
     * @param actual_life the actual_life to set
     */
    public void setActual_life(int actual_life) {
        this.actual_life = actual_life;
    }  
}
