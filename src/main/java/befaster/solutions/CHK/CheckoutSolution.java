package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        Integer total = 0, discount = 0;
        List<String> customerProducts = new ArrayList<String>();
        List<Integer> items = new ArrayList<Integer>();
        Integer[] prices = {50,30,20,15,40,10,20,10,35,60,80,90,15,40,10,50,30,50,30,20,40,50,20,90,10,50};
        String[] products = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        for(int i = 0; i < skus.length(); i++){
            char product = skus.charAt(i);
            if(!customerProducts.contains(Character.toString(product))){
                customerProducts.add(Character.toString(product));
            }
        }
        for(String product : customerProducts){
            Integer qtdItems = 0;
            for(int i = 0; i < skus.length(); i++){
                char currentProduct = skus.charAt(i);
                if(Character.toString(currentProduct).equals(product)){
                    qtdItems+=1;
                }
            }
            items.add(qtdItems);
        }
        //discount rules
        //if(bItems >= eItems/2) bItems = bItems-eItems/2;
        //if(fItems >= 3) fItems -= fItems/3;
        //total = aItems*50 + bItems*30 + cItems*20 + dItems*15 + eItems*40 - (bItems/2)*15 + fItems*10;



        //calculate the total price with no discount
        int index = 0;
        for(Integer item : items){
            Integer price = prices[index];
            total += item*price;
            index++;
        }

        //calculate the total price with no discount
        for(int i = 0; i < products.length; i++){
            if(products[i].equals("A")){
                discount = items.get(i)/5*50 + ((items.get(i)-((items.get(i)/5)*5))/3)*20;
            }else if(products[i].equals("B")){
                discount = items.get(i)/3*20 + ((items.get(i)-((items.get(i)/3)*3))/2)*10;
            }else if(products[i].equals("H")){
                discount = items.get(i)/10*20 + ((items.get(i)-((items.get(i)/10)*10))/5)*5;
            }else if(products[i].equals("V")){
                discount = items.get(i)/3*20 + ((items.get(i)-((items.get(i)/3)*3))/2)*10;
            }
        }

        total -= discount;
        return total;
    }
}

