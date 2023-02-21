package pl.czujsi;

import java.util.Scanner;

public class Run {
    DarkElf darkElf = new DarkElf();
    WhiteElf whiteElf = new WhiteElf();
    public void RunGame(){
        System.out.println("Please enter your name adventure: ");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Welcome brave " + name);

        System.out.println("Path that you have chosen is dangerous and probably will end your life." + "\r\n"
                + "However I hope that your end will not come with long pain and agony created by demons in this maze brave " + name + "\r\n"
                + "HAHAHAHAHAHAHAHAHA");

        System.out.println("""
                There is no way back, chose wisely\r
                You can go few steps straight, right or left\r
                God idea could be to watch around every time before you need to move""");

        System.out.println("""
                Enter: \r
                1 To go forward\r
                2 To go left\r
                3 To go right\r
                4 To look around first\r
                Remember anything you pick can bring unexpected consequences""");
        String option1 = scanner.nextLine();
        if(option1.equals("1")){
            System.out.println("""
                    You are going straight but tunnel that you have chosen is closing behind you, now you have only one way to go further to the next cross way.\r
                    After few minutes of walking you can see a figure in the distance\r
                    """);
                    //+ "You can choose 'A' to attack fast and increase You chances for winning or 'T' to go and talk" + "\r\n"
                    //+ "Remember anything you pick can bring unexpected consequences");
        }

    }
}
