package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        Integer total = 0, discount = 0;
        List<String> products = new ArrayList<String>();
        List<Integer> items = new ArrayList<Integer>();
        List<Integer> productPrices = new ArrayList<Integer>();
        for(int i = 0; i < skus.length(); i++){
            char product = skus.charAt(i);
            if(!products.contains(Character.toString(product))){
                products.add(Character.toString(product));
            }
        }
        for(String product : products){
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
        //discount = aItems/5*50 + ((aItems-((aItems/5)*5))/3)*20;

        total -= discount;
        return total;
    }
}



