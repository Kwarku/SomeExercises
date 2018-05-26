package pl.narodzinyprograsmity.staz;

/**
 * This program draw cheeseboard.
 * <p>
 * Input:
 * On single line:
 * -width of element,
 * -height of element,
 * -number of element in one row,
 * -number of element in one column,
 * -sign of first element(white),
 * -sign of second element(black)
 * <p>
 * to separate this information use empty sign (space " ")
 */

public class Szachownica {
    private static final int WIDTH_OF_ELEMENT = 0;
    private static final int HEIGHT_OF_ELEMENT = 1;
    private static final int AREA_WIDTH = 2;
    private static final int AREA_HEIGHT = 3;


    private static final int SIGN_OF_WHITE_ELEMENT = 4;
    private static final int SIGN_OF_BLACK_ELEMENT = 5;


    private static final int MINIMUM_VALUE = 1;
    private static final int MAXIMUM_VALUE = 15;


    private int elementWidth;
    private int elementHeight;
    private int arenaWidth;
    private int arenaHeight;
    private String whiteElement;
    private String blackElement;


    private String[] arguments;

    public Szachownica(String[] arguments) {
        this.arguments = arguments;
        setAllValues();
    }

    public static void main(String[] args) {
        Szachownica szachownica = new Szachownica(args);
        szachownica.draw();
    }

    public void draw() {
        for (int i = 0; i < arenaHeight; i++) {
            printRowOfElements(!isEven(i));
        }
    }

    private void printRowOfElements(boolean isStartByWhite) {
        int positionOfElement;
        for (int i = 0; i < elementHeight; i++) {
            positionOfElement = 0;
            for (int j = 0; j < arenaWidth; j++) {
                if (isEven(positionOfElement)) {
                    printElement(blackElement, whiteElement, isStartByWhite);
                } else {
                    printElement(whiteElement, blackElement, isStartByWhite);
                }
                positionOfElement++;
            }
            System.out.println();
        }
    }

    private void printElement(String firstSign, String secondSign, boolean isStartByWhite) {
        for (int i = 0; i < elementWidth; i++) {
            System.out.print((isStartByWhite ? firstSign : secondSign));
        }
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }



    private void setAllValues() {
        setArenaHeight();
        setArenaWidth();
        setElementHeight();
        setElementWidth();
        setWhiteElement();
        setBlackElement();

    }

    private void setArenaWidth() {
        try {
            this.arenaWidth = Integer.valueOf(arguments[AREA_WIDTH]);
        } catch (NumberFormatException e) {
            exitProgram();
        }
        if (!isValueCorrect(arenaWidth)) {
            exitProgram();
        }

    }

    private void setArenaHeight() {
        try {
            this.arenaHeight = Integer.valueOf(arguments[AREA_HEIGHT]);
        } catch (NumberFormatException e) {
            exitProgram();
        }
        if (!isValueCorrect(arenaHeight)) {
            exitProgram();
        }

    }

    private void setElementWidth() {
        try {
            this.elementWidth = Integer.valueOf(arguments[WIDTH_OF_ELEMENT]);
        } catch (NumberFormatException e) {
            exitProgram();
        }
        if (!isValueCorrect(elementWidth)) {
            exitProgram();
        }

    }

    private void setElementHeight() {
        try {
            this.elementHeight = Integer.valueOf(arguments[HEIGHT_OF_ELEMENT]);
        } catch (NumberFormatException e) {
            exitProgram();
        }
        if (!isValueCorrect(elementHeight)) {
            exitProgram();
        }

    }

    private void setWhiteElement() {
        this.whiteElement = arguments[SIGN_OF_WHITE_ELEMENT];
    }

    private void setBlackElement() {
        this.blackElement = arguments[SIGN_OF_BLACK_ELEMENT];

    }

    private boolean isValueCorrect(int value) {
        return value >= MINIMUM_VALUE && value < MAXIMUM_VALUE;
    }

    private void exitProgram() {
        System.exit(0);
    }


}