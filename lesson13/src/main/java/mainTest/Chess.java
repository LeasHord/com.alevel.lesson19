package mainTest;

public class Chess {
    public static void main(String[] args) {



    }
    public static boolean chess (int firstPos, int secPos, int nextStep1, int nextStep2){
     boolean step = false;
     int [][] desk = new int[10][10];
     int step1 = 1;
     int step2 = 2;
    for(int i = 0; i < desk.length; i++){
        for (int j = 0; j < desk.length; j++){
            if((nextStep1 - firstPos == step1 & nextStep2 - secPos == step2) ||(nextStep1 - firstPos == step2 & nextStep2 - secPos == step1)){
                if(nextStep1 < desk.length & nextStep2 < desk.length){
                    step = true;
                }
            }
        }
    }

        return step;
    }
}
