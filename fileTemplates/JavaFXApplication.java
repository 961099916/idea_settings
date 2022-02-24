#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
/**
 * @className: ${NAME}
 * @description: TODO 类描述 
 * @author: 张家豪
 * @date:  ${DATE}
 **/
import javafx.application.Application;
import javafx.stage.Stage;

public class ${NAME} extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        
    }
}
