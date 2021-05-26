package Modul5;

public class LimitingRectangle {
    int [][] points;
    int minX;
    int minY;
    int maxX;
    int maxY;


    LimitingRectangle(int[][] points) {
        this.points = points;
    }


    int getMinX() {
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] < minX) {
                minX = points[i][0];
            }
        }
        return minX;
    }


    int getMinY() {
        for (int i = 0; i < points.length; i++) {
            if (points[i][1] < minY) {
                minY = points[i][1];
                }
        }
        return minY;
    }

    int getMaxX() {
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] > maxX) {
                maxX = points[i][0];
            }
        }
        return maxX;
    }

    int getMaxY(){
        for (int i=0; i < points.length; i++){
            if (points[i][1]>maxY) {maxY=points[i][1];}
        }
        return maxY;
    }

    int getWidth() {
        return this.getMaxX() - this.getMinX();
    }


       int getHeight() {
        return this.getMaxY()-this.getMinY();
    }

    String getBorders() {
        return getMinY() + ", "+getMaxY() + ", " + getMinX() + ", " + getMaxX();
    }
}
 class LimitingRectangleTest {
     public static void main(String[] args) {
         LimitingRectangle R = new LimitingRectangle(new int[][]{{-1, -2}, {3, 4}});
         System.out.println("min y "+R.getMinY());
         System.out.println("max y "+R.getMaxY());
         System.out.println("min x "+R.getMinX());
         System.out.println("max x "+R.getMaxX());
         System.out.println("width "+R.getWidth());
         System.out.println("height "+R.getHeight());
         System.out.println(R.getBorders());
     }
 }