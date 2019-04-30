module JavaCalc {
	requires transitive javafx.controls;
	requires transitive javafx.fxml; 
	requires jdk.jshell;
	requires transitive javafx.graphics;
	requires javafx.base; 
	opens JavaCalc to javafx.fxml; 
	exports JavaCalc ;
}
