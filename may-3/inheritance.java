class Base{
    //attributes
    int x;
   
//methods
int getX(){
    return this.x;
}
void setX(int x){
    this.x=x;
    
}
}
class Derived extends Base{
    int y;

    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y=y;
    }
}

public class inheritance{
    public static void main(String[] args){
        Derived d=new Derived();
        d.setY(100);
        System.out.println(d.getY());
        d.setX(500);
        System.out.println(d.getX());
    }
}