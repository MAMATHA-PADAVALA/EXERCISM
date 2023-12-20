class PrimeCalculator {

    int nth(int nth) {
    int final_n=0;
        if(nth==0)
            throw new IllegalArgumentException();
        int count=0;
        int number=2;
        while(true){
            int c=0;
            for(int i=1;i<=number;i++){
                if(number%i==0)
                    c++;
            }
            if(c==2)
                count++;
            if(count==nth)
                break;
            number++;

        }
        return number;
    }

}
