package Run;


import java.io.IOException;


public class Main {


    public static void main(String[] args) throws IOException {
//        Scanner f = new Scanner(new FileInputStream("C:/Users/PC/Desktop/Nowy Dokument tekstowy.txt"));
//        while (f.hasNext()) {

//            System.out.println(f.next());
//        }

        System.out.println(aaa(1,55));
        System.out.println(aaa(55,1));
        System.out.println(aaa(7,13));
        System.out.println(aaa(7,14));
    }

        public static int[][][] createCube(){
            // write your code here
            int[][][] arr = new int[3][3][3];
            int a = 0;
            for (int i = 0; i < 3; i++) {

                for (int z = 0; z < 3; z++) {

                    for (int c = 0; c < 3; c++) {
                        arr[i][z][c] = a;System.out.println(a);
                        a++;

                    }
                }
           a = 0;
            }


            return arr;
        }



    public static boolean aaa(int a, int b){
        return (a+b+(a*b)) == 111;
    }
}

