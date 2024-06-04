package week3.day1;

public class Elements extends Button {
	public static void main(String[] args) {
		Button button=new Button();
		TextField text=new TextField();
		CheckBoxButton box=new CheckBoxButton();
		RadioButton radio=new RadioButton();
		button.click();
		button.setText("Submit");
		button.submit();
		text.click();
		text.getText();
		text.setText("hello");
		box.click();
		box.clickCheckButton();
		box.submit();
		radio.click();
		radio.submit();
		radio.selectRadioButton();
	}
}
