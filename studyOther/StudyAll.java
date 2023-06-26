package main.java;

import java.util.ArrayList;

public class StudyAll {
    public static void main(String[] args) {
        HelloWorld hw = new PrintHW();
        hw.print();
    }
}
interface HelloWorld{
    final String HELLO = "Hello";
    final String WORLD = "World";
    abstract void print();
}
class PrintHW implements HelloWorld{
    private ArrayList<String> helloWorld;
    public void setHelloWorld(){
        helloWorld = new ArrayList<>();
        helloWorld.add(HELLO);
        helloWorld.add(WORLD);
    }
    @Override
    public void print() {
        setHelloWorld();
        System.out.println(helloWorld.get(0) + " " + helloWorld.get(1));
    }
}