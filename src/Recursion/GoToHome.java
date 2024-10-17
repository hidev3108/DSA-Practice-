package Recursion;

public class GoToHome {
    public static void main(String[] args) {
        int starting = 0 ;
        int homeStep = 10 ;
        goHome(starting,5);
    }
    // moving to home in  recursion pattern
    // base if reach home print stop home is here
    // suppose steps you taking x,x+1,x+2 ......
    // if home at 10 steps


    //Let x=currentStep , x+1 = homeStep
    public static void goHome(int currentStep, int homeStep) {
        if (currentStep >= homeStep) {
            System.out.println("Stop here you are at home");
            return;
        }
        goHome(currentStep + 1, homeStep);
    }

}
