//package testiusb;/*
//    @wersion yu
//*/
//
//public class test_daima {
//}
//public class test04{
//    public static void main(String[] args) {
//        callphone con=new callphone();0
//        con.testWork(new tr() {
//            @Override
//            public int work(int n1, int n2) {
//                return n1+n2;
//            }
//        },2,3);
//        con.testWork(new tr() {//你匿名内部类的使用
//            @Override
//            public int work(int n1, int n2) {
//                return n1*n2;
//            }
//        },3,6);
//    }
//
//}
//
//
//interface tr{
//    public int work(int n1,int n2);
//}
//class callphone{
//    public void testWork(tr t,int n1,int n2){
//        int qq=t.work(n1,n2);
//        System.out.println("结果为"+qq);
//    }
//}

package testiusb;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//public class test04 {
//    public static void main(String[] args) {
//        Comparator
//        int arr[] = {1, 4, -2, 34, 5};
//        mp1(arr, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                int n1=(Integer)o1;
//                int n2=(Integer)o2;
//                return n1-n2;
//
//            }
//        });
//    }
//    public static void mp(int arr[]){
//        int temp=0;
//        for(int i=0;i<arr.length-1;i++){
//            for(int j=0;j<arr.length-i-1;j++){
//                if(arr[j]>arr[j+1]){
//                    temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//
//
//    }
//    public static void mp1(int arr[], Comparator c){
//        int temp=0;
//        for(int i=0;i<arr.length-1;i++){
//            for(int j=0;j<arr.length-i-1;j++){
//                if(c.compare(arr[j],arr[j+1])>0){
//                    temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//
//
//    }
//
//
//}

/*
package testiusb;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
       Book books[]=new Book[3];
       books[0]=new Book("你好",23);
       books[1]=new Book("你好啊",3);
       books[2]=new Book("你好啊啊",63);
       Arrays.sort(books, new Comparator() {
           @Override
           public int compare(Object o1, Object o2) {
               Book book1=(Book) o1;
               Book book2=(Book) o2;
               int q=book1.getPrice()-book2.getPrice();
               if(q>0){
                   return -1;
               }else{
                   return 1;
               }
//               return 0;
           }
       });
       System.out.println(Arrays.toString(books));
       Arrays.sort(books, new Comparator() {
           @Override
           public int compare(Object o1, Object o2) {
               Book book1=(Book) o1;
               Book book2=(Book) o2;
               return book1.getName().length()-book2.getName().length();
           }
       });
       System.out.println(Arrays.toString(books));
    }


}
class Book{
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
 */
/*
这个是对于输入的用户名是否在范围内
package testiusb;
import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        Scanner myscanner=new Scanner(System.in);
        String nane=myscanner.next();
        try {
            System.out.println(yong(nane));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static String yong(String nane){
        if(nane.length()>4||nane.length()<2){
            throw new RuntimeException("输入的用户名超出限制");
        }
        return nane;
    }

}

 */

/*
集合列表两种循环
package testiusb;

import java.util.*;

@SuppressWarnings({"all"})
public class test04 {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("小明", 12));
        list.add(new Dog("明", 11));
        list.add(new Dog("明", 191));
        list.add(new Dog("明", 1));
        list.add(new Dog("明", 17));
        System.out.println(list.get(0));
        for (Object o : list) {
            System.out.println(o);
        }
        Iterator iterator = list.iterator();
        System.out.println("不同的");
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);

        }

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                Dog dog1 = (Dog) list.get(j);
                Dog dog2 = (Dog) list.get(j + 1);
                if (dog1.getAge() > dog2.getAge()) {

                    list.set(j, dog2);
                    list.set(j + 1, dog1);
                }
            }

        }
        System.out.println(list);

    }
}

class Dog {

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
 */



/*

双向链表利用Node节点输出整个
package testiusb;


public class test04 {

    public static void main(String[] args) {
        Node jake=new Node("jake");
        Node hasp=new Node("je");
        Node h=new Node("jame");
        jake.next=hasp;
        hasp.next=h;
        h.lastt=hasp;
        hasp.lastt=jake;
        Node first=jake;
        Node last=h;
        while(true){
            if(first==null){
                break;
            }
            System.out.println(first);
            first=first.next;
        }

    }
}

class Node{
    public Object item;
    public Node next;
    public Node lastt;

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "nome="
                 + item ;
    }
}
 */

//HashSet数组
/*
package testiusb;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class test04 {

    public static void main(String[] args) {
        Set set=new HashSet();
        set.add("yu");
        set.add("yu");
        set.add("u");
        set.add("y");
        Iterator iterator=set.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);

        }
    }
}
 */
/*
//非常的重要我们要知道，要用debag配合着一起用就相当于://非常好用
0
1
2->join->jake
3
4

package testiusb;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class test04 {

    public static void main(String[] args) {
        Node[] tabe=new Node[16];
        System.out.println(tabe);
        Node join = new Node("join", null);
        tabe[2]=join;
        Node jake = new Node("jake", null);
        join.next=jake;
    }
}

class Node{
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}
 */
/*


比较麻烦的
package testiusb;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class test04 {

    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add("java");
        hashSet.add("ade");
        hashSet.add("hph");
        System.out.println(hashSet);
    }
}

 */