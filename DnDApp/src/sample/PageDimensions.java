// #description constructor class for page dimensions. Uses iPhone 10X dimensions.
package sample;

public class PageDimensions {
    private double screenWidth = 375;
    private double screenHeight = 812;
    private double padding = 25;
    private double bottomPadding = 50;
    private double buttonSize = 200;

    public double getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(double screenWidth) {
        this.screenWidth = screenWidth;
    }

    public double getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(double screenHeight) {
        this.screenHeight = screenHeight;
    }

    public double getPadding() {
        return padding;
    }

    public void setPadding(double padding) {
        this.padding = padding;
    }

    public double getBottomPadding() {
        return bottomPadding;
    }

    public void setBottomPadding(double bottomPadding) {
        this.bottomPadding = bottomPadding;
    }

    public double getButtonSize() {
        return buttonSize;
    }

    public void setButtonSize(double buttonSize) {
        this.buttonSize = buttonSize;
    }
}
