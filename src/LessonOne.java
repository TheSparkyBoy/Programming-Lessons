public class LessonOne {
    public static void main(String [] args){
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    //functions
    public static void exercise1(){
        int variable = 0;
        variable = 3;
        variable = variable * 2;
        //What's the value does variable contain?
        System.out.println(variable);
    }

    public static void exercise2(){
        double variableD = 4.5;
        variableD += 3.5;
        variableD = variableD + 3.5;   
        variableD = variableD*2;
        //What's the value of variableD? 
        System.out.println(variableD);
    }

    public static void exercise3(){
        boolean variableB = false;
        variableB = true;
        variableB = !variableB;
        //what's the value of variableB?
        System.out.println(variableB);
    }

    public static void exercise4(){
        String variableS = "You";
        variableS = "I";
        variableS = variableS + " am human";
        System.out.println(variableS);
        //What's the value of variableS?
    }
}
