import controller.Controller;
import model.Model;

import view.View;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Model model = new Model();
        View view = new View();
        Controller c = new Controller(model, view);
        c.processUser();

    }
}
