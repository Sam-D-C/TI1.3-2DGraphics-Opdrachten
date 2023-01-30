import java.awt.*;
import java.awt.geom.*;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;
import org.jfree.fx.FXGraphics2D;

public class Graph extends Application {
    private Canvas canvas;

    @Override
    public void start(Stage primaryStage) throws Exception {

        this.canvas = new Canvas(800, 500);
        draw(new FXGraphics2D(canvas.getGraphicsContext2D()));
        primaryStage.setScene(new Scene(new Group(canvas)));
        primaryStage.setTitle("Graph");
        primaryStage.show();
    }


    public void draw(FXGraphics2D graphics) {
        graphics.translate(800/2, 500/2);
        graphics.scale( 1, -1);

//        graphics.translate(this.canvas.getWidth()/2.7, this.canvas.getWidth()/2.7);
        // nu komt het assenstelsel mooier uit
        graphics.setColor(Color.red);
        graphics.draw(new Line2D.Double(0, 0, 370 , 0));
        graphics.setColor(Color.green);
        graphics.draw(new Line2D.Double(0, 0, 0 , 270));
        graphics.setColor(Color.black);
        // assenstelsel

//        double resolution = 0.1;
//        double lastY = 0;
//
//        for(double x = -10; x < 10; x += resolution)
//        {
//            float y = (float)Math.pow(x, 3);
//            graphics.draw(new Line2D.Double(x, y, x-resolution, lastY));
//            lastY = y;
//        }
        double resolution = 0.1;
        double scale = 150;
        for(double x1 = -10; x1 < 10; x1 += resolution)
        {
            double x2 = x1 + resolution;
            double y1 = formule(x1);
            double y2 = formule(x2);
            graphics.drawLine((int)(x1*scale), (int)(y1*scale), (int)(x2*scale), (int)(y2*scale));
        }
    }

    private double formule(double x) {
        return (float) (Math.pow(x, 3));
    }




    public static void main(String[] args) {
        launch(Graph.class);
    }

}
