package com.java.lessons.hometasks.hometask2;

public class Main {
    //Creating global variables
    public static byte globalVarByte = 87;
    public static int globalVarInt = 877733024;
    public static double globalVarDouble = 28.0002d;
    public static char globalVarChar = 'd';

    //Creating global wrappers
    public static Byte globalWrapByte = 90;
    public static Integer globalWrapInteger = 998766554;
    public static Double globalWrapDouble = 7884.004d;
    public static Character globalWrapCharacter = 'a';

    public static void main(String[] args) {
        //Creating local variables
        short localVarShort = 23884;
        long localVarLong = 88884466672221L;
        float localVarFloat = 45.5f;
        boolean localVarBoolean = true;

        //Creating local wrappers
        Short localWrapShort = 18004;
        Long localWrapLong = 1224888853329L;
        Float localWrapFloat = 46.8f;
        Boolean localWrapBoolean = false;

        //Redefining variables
        //globalVarByte = (byte) localVarShort;
        //localVarLong = globalVarChar; Character => Long
        //globalVarInt = (int) localVarFloat;
        //localVarLong = globalVarInt;

        //Creating objects and using Getters and Setters
        SecondClass globalVariables = new SecondClass();
        globalVariables.setVarByte((byte) 116);
        globalVariables.getVarByte();
        globalVariables.setVarShort((short) 13642);
        globalVariables.getVarShort();
        globalVariables.setVarInt(709331553);
        globalVariables.getVarInt();
        globalVariables.setVarLong(82300482766415L);
        globalVariables.getVarLong();
        globalVariables.setVarFloat(2.3f);
        globalVariables.getVarFloat();
        globalVariables.setVarDouble(2.0005d);
        globalVariables.getVarDouble();
        globalVariables.setVarChar('s');
        globalVariables.getVarChar();
        globalVariables.setVarBoolean(true);
        globalVariables.getVarBoolean();

        SecondClass globalWrappers = new SecondClass();
        globalWrappers.setWrapByte((byte) 127);
        globalVariables.getWrapByte();
        globalWrappers.setWrapShort((short) 15999);
        globalWrappers.getWrapShort();
        globalWrappers.setWrapInteger(848837121);
        globalWrappers.getWrapInteger();
        globalWrappers.setWrapLong(8364556484940L);
        globalWrappers.getWrapLong();
        globalWrappers.setWrapFloat(634.6f);
        globalWrappers.getWrapFloat();
        globalWrappers.setWrapDouble(9931.0005);
        globalWrappers.getWrapDouble();
        globalWrappers.setWrapCharacter('i');
        globalWrappers.getWrapCharacter();
        globalWrappers.setWrapBoolean(false);
        globalWrappers.getWrapBoolean();

        //Data output
        System.out.println("Global variable byte from first class: " + globalVarByte);
        System.out.println("Global variable int from first class: " + globalVarInt);
        System.out.println("Global variable double from first class: " + globalVarDouble);
        System.out.println("Global variable char from first class: " + globalVarChar);
        System.out.println();

        System.out.println("Global wrapper Byte from first class: " + globalWrapByte);
        System.out.println("Global wrapper Integer from first class: " + globalWrapInteger);
        System.out.println("Global wrapper Double from first class: " + globalWrapDouble);
        System.out.println("Global wrapper Character from first class: " + globalWrapCharacter);
        System.out.println();

        System.out.println("Local variable short: " + localVarShort);
        System.out.println("Local variable long: " + localVarLong);
        System.out.println("Local variable float: " + localVarFloat);
        System.out.println("Local variable boolean: " + localVarBoolean);
        System.out.println();

        System.out.println("Local wrapper Short: " + localWrapShort);
        System.out.println("Local wrapper Long: " + localWrapLong);
        System.out.println("Local wrapper Float: " + localWrapFloat);
        System.out.println("Local wrapper Boolean: " + localWrapBoolean);
        System.out.println();

        System.out.println("Global variable byte from second class: " + globalVariables.getVarByte());
        System.out.println("Global variable short from second class: " + globalVariables.getVarShort());
        System.out.println("Global variable int from second class: " + globalVariables.getVarInt());
        System.out.println("Global variable long from second class: " + globalVariables.getVarLong());
        System.out.println("Global variable float from second class: " + globalVariables.getVarFloat());
        System.out.println("Global variable double from second class: " + globalVariables.getVarDouble());
        System.out.println("Global variable char from second class: " + globalVariables.getVarChar());
        System.out.println("Global variable boolean from second class: " + globalVariables.getVarBoolean());
        System.out.println();

        System.out.println("Global wrapper Byte from second class: " + globalWrappers.getWrapByte());
        System.out.println("Global wrapper Short from second class: " + globalWrappers.getWrapShort());
        System.out.println("Global wrapper Integer from second class: " + globalWrappers.getWrapInteger());
        System.out.println("Global wrapper Long from second class: " + globalWrappers.getWrapLong());
        System.out.println("Global wrapper Float from second class: " + globalWrappers.getWrapFloat());
        System.out.println("Global wrapper Double from second class: " + globalWrappers.getWrapDouble());
        System.out.println("Global wrapper Character from second class: " + globalWrappers.getWrapCharacter());
        System.out.println("Global wrapper Boolean from second class: " + globalWrappers.getWrapBoolean());
    }
}
