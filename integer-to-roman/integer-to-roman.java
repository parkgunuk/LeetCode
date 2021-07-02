class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        
        while(num >= 1000){
            sb.append('M');
            num -= 1000;
        }
        
        if(num >= 900){
            sb.append("CM");
            num -= 900;
        } 
        
        if(num >= 500){
            sb.append('D');
            num -= 500;
        }  
        
        if(num >= 400){
            sb.append("CD");
            num -= 400;
        }  
        
        while(num > 0){
            if(num >= 100){
                sb.append("C");
                num -= 100;
                continue;
            }  
            
            if(num >= 90) {
                sb.append("XC");
                num -= 90;
                continue;
            }  
            
            if(num >= 50){
                sb.append("L");
                num -= 50;
                continue;
            }  
            
            if(num >= 40){
                sb.append("XL");
                num -= 40;
                continue;
            }  
            
            if(num >= 10){
                sb.append("X");
                num -= 10;
                continue;
            }  
            
            if(num > 0){
                switch (num){
                    case 1:
                        sb.append("I");
                        break;
                    case 2:
                        sb.append("II");
                        break;
                    case 3:
                        sb.append("III");
                        break;
                    case 4:
                        sb.append("IV");
                        break;
                    case 5:
                        sb.append("V");
                        break;
                    case 6:
                        sb.append("VI");
                        break;
                    case 7:
                        sb.append("VII");
                        break;
                    case 8:
                        sb.append("VIII");
                        break;
                    case 9:
                        sb.append("IX");
                        break;
                }
                num -= num;
                continue;
            }
        }
        return sb.toString();
    }
}