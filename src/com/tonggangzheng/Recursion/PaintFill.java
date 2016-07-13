package com.tonggangzheng.Recursion;

/**
 * Created by Tong on 7/9/16.
 */
public class PaintFill {
    enum Color{
        Black, White, Red, Yellow, Green
    }

   private boolean paintFill(Color[][] screen, int x, int y, Color oldColor, Color newColor){
        if(x<0 || x>screen[0].length || y<0 || y>screen.length){
            return false; // out of boundary
        }

        if(screen[y][x] == oldColor){
            paintFill(screen, x-1, y, oldColor, newColor);
            paintFill(screen, x+1, y, oldColor, newColor);
            paintFill(screen, x, y-1, oldColor, newColor);
            paintFill(screen, x, y+1, oldColor, newColor);
        }

        return true;
    }

    public boolean paintFill(Color[][] screen, int x, int y, Color newColor){
        return paintFill(screen, x, y, screen[y][x], newColor);
    }
}
