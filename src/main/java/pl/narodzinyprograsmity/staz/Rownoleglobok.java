package pl.narodzinyprograsmity.staz;

/**
 * This program draw parallelogram.
 * <p>
 * Input:
 * On single line:
 * - width
 * - height
 * - step (can be negative)
 * <p>
 * to separate this information use empty sign (space " ")
 */

public class Rownoleglobok {
    private static final int MINIMAL_STEP = -100;
    private static final int MAXIMAL_STEP = 100;
    private static final int MAX_VALUE = 100;
    private static final int MIN_VALUE = 0;


    private static final int WIDTH_INDEX = 0;
    private static final int HEIGHT_INDEX = 1;
    private static final int STEP_INDEX = 2;


    private static final String SIGN_OF_PARALLELOGRAM_BODY = "*";


    private int height;
    private int width;
    private int step;

    private String[] arguments;


    public Rownoleglobok(String[] arguments) {
        this.arguments = arguments;
        setAllValues();
        if (!isValuesCorrect()) {
            exitProgram();
        }
    }

    public static void main(String[] args) {
        Rownoleglobok rownoleglobok = new Rownoleglobok(args);
        rownoleglobok.draw();
    }

    public void draw() {
        if (step >= 0) {
            drawRightParallelogram();
        } else {
            drawLeftParallelogram();
        }
    }

    private void drawRightParallelogram() {
        for (int i = 1; i <= height; i++) {
            drawRow();
            goToNextLine();
            drawStep(i);
        }
    }

    private void drawLeftParallelogram() {
        for (int i = 1; i <= height; i++) {
            drawStep(height - i);
            drawRow();
            goToNextLine();
        }
    }

    private void drawRow() {
        for (int j = 0; j < width; j++) {
            System.out.print(SIGN_OF_PARALLELOGRAM_BODY);
        }
    }

    private void drawStep(int i) {
        int absStep = Math.abs(step);
        for (int k = i * absStep; k > 0; k--) {
            System.out.print(" ");
        }
    }

    private void goToNextLine() {
        System.out.println();
    }


    private void setAllValues() {
        setHeight();
        setWidth();
        setStep();

    }

    private void setHeight() {
        this.height = takeValue(HEIGHT_INDEX);
    }

    private void setWidth() {
        this.width = takeValue(WIDTH_INDEX);
    }

    private void setStep() {
        this.step = takeValue(STEP_INDEX);
    }

    private int takeValue(int element) {
        int value = Integer.MIN_VALUE;

        try {
            value = Integer.valueOf(arguments[element]);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            exitProgram();
        }
        return value;
    }


    private boolean isValuesCorrect() {
        return isSizeCorrect(height) && isSizeCorrect(width) && isStepCorrect(step);
    }

    private boolean isStepCorrect(int step) {
        return step >= MINIMAL_STEP && step <= MAXIMAL_STEP;
    }

    private boolean isSizeCorrect(int size) {
        return size > MIN_VALUE && size <= MAX_VALUE;
    }


    private void exitProgram() {
        System.exit(0);
    }
}
