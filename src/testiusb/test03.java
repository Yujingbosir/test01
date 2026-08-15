package testiusb;

public class test03 {
    public static void main(String[] args){
        CellPerson cellPerson = new CellPerson();
        cellPerson.er();
        CellPerson.zt ty=cellPerson.new zt();
        ty.cv();


    }
}
interface Bell{
    void ring();
}
class CellPerson{
    private int n1=1;

        class zt{
            private int n1=6;
            public void cv(){
                System.out.println(n1+" "+CellPerson.this.n1);
            }




    }
    public void er(){
        zt ww = new zt();
        ww.cv();

    }
}
