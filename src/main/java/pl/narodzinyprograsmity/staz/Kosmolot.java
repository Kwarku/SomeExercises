package pl.narodzinyprograsmity.staz;

import java.util.InputMismatchException;

/**
 * This program draw space rocket for our rabbit friend.
 * <p>
 * Input:
 * On single line:
 * - size of rocket
 * - one of two options to ON or OFF shield. (Y to turn ON / N to turn OFF)
 * <p>
 * to separate this information use empty sign (space " ")
 */

public class Kosmolot{
    private static final String OUTSIDE_SHIELD_BOTTOM_ELEMENT = "/";
    private static final String OUTSIDE_SHIELD_TOP_ELEMENT = "\\";
    private static final String ROCKET_DECK_ELEMENT = "*";
    private static final String FREE_SPACE = " ";
    private static final String ENGINE_ELEMENT = ">";
    private static final String PEAK_ELEMENT = ">";


    private static final int SIZE_INDEX = 0;
    private static final int SHIELD_INDEX = 1;


    private static final int MAX_SIZE_RANGE = 75;
    private static final int MIN_SIZE_RANGE = 1;


    private int rocketSize;
    private boolean isShieldOn;
    private boolean isBottomElement;

    private String[] arguments;

    public Kosmolot(String[] argumnets) {
        this.arguments = argumnets;
        setValues();
        validateSize();
    }

    public static void main(String[] args) {
        Kosmolot kosmolot = new Kosmolot(args);
        kosmolot.draw();
    }


    public void draw() {
        drawUpRocketPart();
        drawDownRocketPart();
    }

    private void drawUpRocketPart() {
        isBottomElement = false;
        for (int levelNumber = 1; levelNumber <= rocketSize; levelNumber++) {
            drawLine(levelNumber, isBottomElement);
            goToNextLine();
        }
    }

    private void drawDownRocketPart() {
        isBottomElement = true;
        for (int levelNumber = rocketSize - 1; levelNumber >= 1; levelNumber--) {
            drawLine(levelNumber, isBottomElement);
            goToNextLine();
        }
    }

    private void drawLine(int levelNumber, boolean isBottomElement) {
        for (int packageNumber = 0; packageNumber < rocketSize; packageNumber++) {
            drawOnePackage(levelNumber, isBottomElement, packageNumber);
        }
    }

    private void drawOnePackage(int levelNumber, boolean isBottomElement, int packageNumber) {
        for (int position = 0; position < rocketSize; position++) {
            if (shouldDraw(levelNumber, position)) {
                if (isShieldOn) {
                    drawShieldRocket(levelNumber, isBottomElement, packageNumber, position);
                } else {
                    drawBoard();
                }
            } else {
                drawFreeSpace();
            }
        }
    }

    private boolean shouldDraw(int levelNumber, int position) {
        return position < levelNumber;
    }

    private void drawShieldRocket(int levelNumber, boolean isBottomElement, int packageNumber, int k) {
        if (isEngine(packageNumber, k)) {
            drawEngine();
        } else if (isShield(rocketSize, levelNumber, k)) {
            drawShield(isBottomElement);
        } else if (isRocketPeak(rocketSize, levelNumber, packageNumber, k)) {
            drawPeak();
        } else {
            drawBoard();
        }
    }


    private boolean isEngine(int packageNumber, int k) {
        return k == 0 && packageNumber == 0;
    }

    private boolean isRocketPeak(int size, int levelNumber, int packageNumber, int k) {
        return levelNumber == size && packageNumber == size - 1 && k == size - 1;
    }

    private boolean isShield(int size, int levelNumber, int k) {
        return k == levelNumber - 1 && levelNumber != size;
    }


    private void drawBoard() {
        System.out.print(ROCKET_DECK_ELEMENT);
    }

    private void drawFreeSpace() {
        System.out.print(FREE_SPACE);
    }

    private void drawEngine() {
        System.out.print(ENGINE_ELEMENT);
    }

    private void drawPeak() {
        System.out.print(PEAK_ELEMENT);
    }

    private void drawShield(boolean isBottomElement) {
        System.out.print(isBottomElement ? OUTSIDE_SHIELD_BOTTOM_ELEMENT : OUTSIDE_SHIELD_TOP_ELEMENT);
    }

    private void goToNextLine() {
        System.out.println();
    }


    private void setValues() {
       setRocketSize();
       setShieldOn();
    }

    private void setRocketSize() {
        int size;
        try {
            size = Integer.valueOf(arguments[SIZE_INDEX]);
            this.rocketSize = size;
        } catch (NumberFormatException e) {
            exitProgram();
        }
    }

    private void setShieldOn( ) {
        String element = "";
        try {
            element = arguments[SHIELD_INDEX];
            element = element.toUpperCase();
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            exitProgram();
        }

        switch (element) {
            case "Y":
                this.isShieldOn = true;
                break;
            case "N":
                this.isShieldOn = false;
                break;
            default:
                exitProgram();
        }
    }

    private void validateSize() {
        if (rocketSize > MAX_SIZE_RANGE || rocketSize < MIN_SIZE_RANGE) {
            exitProgram();
        }
    }



    private void exitProgram() {
        System.exit(0);
    }

}
