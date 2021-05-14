package com.company;


class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Cannot add 8 and 9";
    }

    @Override
    public String getMessage() {
        String message = super.getMessage();
        return message;
    }
}
class DivideByZeroException extends Exception{
    @Override
    public String toString() {
        return "Cannot divide by zero";
    }

    @Override
    public String getMessage() {
        String message = super.getMessage();
        return message;
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Numbers should not be greater than 100000";
    }

    @Override
    public String getMessage() {
        String message = super.getMessage();
        return message;
    }
}
class MaxMultiplyInputException extends Exception{
    @Override
    public String toString() {
        return "Numbers which are being multiplied should not be greater than 7000";
    }

    @Override
    public String getMessage() {
        String message = super.getMessage();
        return message;
    }
}

class CustomCalculator {
              double add(double a, double b) throws InvalidInputException,MaxInputException {
                  if(a>100000 || b>100000){
                      throw new MaxInputException();
                  }
        if (a == 8 || b ==9 ){
            throw new InvalidInputException();
        }
                  return  a + b;
              }

            double subtract(double a, double b) throws MaxInputException {
                if(a>100000 || b>100000){
                    throw new MaxInputException();
                }
            return a - b;
        }

        double multiply (double a, double b) throws MaxInputException,MaxMultiplyInputException{
            if(a>100000 || b>100000){
                throw new MaxInputException();
            } else if(a>7000 || b>7000){
                throw new MaxMultiplyInputException();
            }
                return a * b;
            }

                double divide (double a, double b) throws DivideByZeroException,MaxInputException{
                    if(a>100000 || b>100000){
                        throw new MaxInputException();
                    }

                  if (b==0){
                      throw new DivideByZeroException();
                  }
                    return a / b;
                }


}
public class JavaCalculator {
    public static void main(String[] args) throws InvalidInputException, DivideByZeroException, MaxInputException, MaxMultiplyInputException {
        CustomCalculator c = new CustomCalculator();
        //   c.add(8,95265888);
        //   c.divide(9,0);
        //   c.multiply(20,9565);
        System.out.println(c.multiply(10,8000));
        System.out.println(c.subtract(85,3));
    }

   /*   Constraints of the design of the Calculator :
         1. + -> Addition
         2. - -> Subtraction
         3. * -> Multiplication
         4. / -> Division
         which throws the following exceptions:
         1. Invalid input Exception ex: 8 & 9
         2. Cannot divide by 0 Exception
         3. Max Input Exception if any of the inputs is greater than 100000
         4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */
}