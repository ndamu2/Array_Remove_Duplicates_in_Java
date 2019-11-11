import org.w3c.dom.ls.LSOutput;

public class Main {

        public static void main(String[]args)
        {
            int[] intArray={20,100,10,80,70,10,-12,10,15,300,7,6,2,18,19,21,9,0};int i;
            int[] newArray={20,100,80,70,10,-12,15,300,7,6,2,18,19,21,9,0};

            for(i=0;i < newArray.length-1;i++){
                System.out.println(intArray[i]+"");
                System.out.println("this is new array  :"+newArray[i]+"");

            }
            }
}
