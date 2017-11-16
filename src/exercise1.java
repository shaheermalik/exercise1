
public class exercise1 {
    public static void main(String [] args ) {

        for (int i = 0; i<= 9 ; i++) {
            for (int j =1; j <=10; j++) {
                int number = j + i * 10;
                if (number % 2 != 0)
                    System.out.print ( number + " " );
            }
            System.out.println();
        }



        System.out.println("   ");

        int j = 0;

        while (j <= 100) {
            System.out.print ( " " + j );
            j+=2;

            if (j % 10==0)

                System.out.println ();
        }



        System.out.println("  ");
        System.out.println ("  ");

        int g=5;

        int pydCountValue=g-1;
        int h=0;
        int count = 1;


        while (count<=g) {
            for (int c = 0; c < pydCountValue; ++c) {
                System.out.print(" ");
            }

            while (h < count*2-1) {
                System.out.print("*");
                h++;
            }

            h=0;
            pydCountValue-=1;
            System.out.println();
            count++;
        }

        count=1;
        while (count<g){
            for (int c=0; c<count;++c) {
                System.out.print(" ");
            }
            for(int c=0;c<2*(g-count)-1;c++){
                System.out.print("*");
            }
            System.out.println();
            count++;

        }




    }
}
