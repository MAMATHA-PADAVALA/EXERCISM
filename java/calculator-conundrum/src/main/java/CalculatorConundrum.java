class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) throws IllegalOperationException {

        String string="";


        if(operation==null) throw new IllegalArgumentException("Operation cannot be null");
        if(operation.isEmpty()) throw new IllegalArgumentException("Operation cannot be empty");
        if(!operation.equals("+") && !operation.equals("*") && !operation.equals("/")){

            String s1="Operation '"+operation+"' does not exist";
            throw new IllegalOperationException(s1);
        }

        try {
            if (operation.equals("+"))
                string = operand1 + " " + operation +" "+ operand2+" = " + (operand1 + operand2);
            else if (operation.equals("*"))
                string = operand1 + " " + operation + " "+operand2+" = " + operand1 * operand2;
            else if (operation.equals("/"))
                string = operand1 + " " + operation +" "+ operand2+ " = " + operand1 / operand2;
        }
        catch (ArithmeticException e){
            throw new IllegalOperationException("Division by zero is not allowed",e);
        }
        return string;
    }
}
