package homework_2.app.controllers;


import homework_2.app.models.OrderB;
import homework_2.app.utils.Rounder;
import homework_2.app.views.OrderBView;

public class OrderBController {

    public void handleData() {

        OrderBView view = new OrderBView();

        String[] data = view.getData();

        OrderB product = new OrderB(data[0],
                Double.parseDouble(data[3]));

        String cost = Rounder.roundValue(
                product.getOrderCost(Integer.parseInt(data[1]),
                        Double.parseDouble(data[2])));

        String delivery = Rounder.roundValue(
                Double.parseDouble(data[3]));

        String output = "\nOrder " + data[0] + " is USD " +
                cost + "\nIncluding fixed delivery cost USD " + delivery;

        view.getOutput(output);
    }
}
