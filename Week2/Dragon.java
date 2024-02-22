public class Dragon {
    int x , y, width, height;
    public Dragon (int x1, int y1, int w, int h){
        x = x1;
        y = y1;
        width = w;
        height = h;
    }

    void moveLeft(){
        if (x>0)
        x = x-1;

        PrintPosition();
        detectCollision();
    }


    void moveRight(){
        if (x<width)
        x = x+1;
        
        PrintPosition();
        detectCollision();
    }

    void moveUp(){
        if(y>0)
        y = y-1;

        PrintPosition();
        detectCollision();
    }

    void moveDown(){
        if(y<height)
        y = y+1;

        PrintPosition();
        detectCollision();
    
    }

    void PrintPosition(){
        System.out.printf("(%d %d)\n", x, y);
    }

    void detectCollision(){
        if(x<=0 || y<=0 || x>=width || y>height )
        System.out.println("Game over ");
    }

    public static void main(String[] args) {
        Dragon d = new Dragon(1, 2,20, 10);
        d.PrintPosition();
        d.moveRight();
        d.moveDown();
    }
}

