package testiusb;
import java.util.Scanner;




public class test04 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int q= scanner.nextInt();
        int []arr=new int[q];
        System.out.println(arr);

    }
}
interface we<U,t>{
    public void r();
    default void hi(){

    }
}
interface by extends we<String, Integer> {

}
class b implements by {

    @Override
    public void r() {

    }
}

class y<U,I> {
    public <M,O>void ty(M m,O o){

    }

        }