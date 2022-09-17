package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        Integer total = 0, aItems = 0, bItems = 0, cItems = 0, dItems = 0;
        for(int i = 0; i < skus.length(); i++){
            char product = skus.charAt(i);
            if(product == 'A'){
                aItems+=1;
            }else if(product == 'B'){
                bItems+=1;
            }else if(product == 'C'){
                cItems+=1;
            }else if(product == 'D'){
                dItems+=1;
            }else{
                return -1;
            }
        }
        total = aItems*50 + bItems*30 + cItems*20 + dItems*15 - ((aItems/3)*20 + (bItems/2)*15);
        return total;
    }
}



