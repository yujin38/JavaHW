class Point {
    static int x;
    static int y;
    void move(int x, int y){
        if(x>0 && y>0){
            this.x = x;
            this.y = y;
        } else {
            this.x = 0;
            this.y = 0;
        }
        toString();
    }
}

class PositivePoint extends Point{
    PositivePoint(){ }
    PositivePoint(int x, int y) {
        super.move(x, y);
    }
    void move(int x, int y) {
        if(x>0 && y>0){
            this.x = x;
            this.y = y;
            toString();
        }
        else{
            toString();
        }
    }
    public String toString() {
        return "(" + x + ", " + y + ")의 점";
    }
    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();
        p.move(10, 10);
        System.out.println((p.toString() + "입니다."));

        p.move(-5, 5);
        System.out.println(p.toString() + "입니다.");

        PositivePoint p2 = new PositivePoint(-10, -10);
        System.out.println(p2.toString() + "입니다.");
    }
}
