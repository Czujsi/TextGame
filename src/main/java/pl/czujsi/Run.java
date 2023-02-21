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
    }
}
